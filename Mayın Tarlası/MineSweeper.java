import java.util.Scanner;

public class MineSweeper {
    private int[][] minefield;
    private boolean[][] revealed;
    private int rows;
    private int cols;
    private int mines;
    private boolean gameOver;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.minefield = new int[rows][cols];
        this.revealed = new boolean[rows][cols];
        this.mines = rows * cols / 4; // 1/4 of total cells will be mines
        this.gameOver = false;
        initializeMinefield();
    }

    private void initializeMinefield() {
        // Place mines randomly
        int placedMines = 0;
        while (placedMines < mines) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);
            if (minefield[row][col] != -1) {
                minefield[row][col] = -1;
                placedMines++;
            }
        }

        // Fill numbers
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (minefield[r][c] != -1) {
                    int count = countAdjacentMines(r, c);
                    minefield[r][c] = count;
                }
            }
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                int nr = row + dr;
                int nc = col + dc;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    if (minefield[nr][nc] == -1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void revealCell(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols && !revealed[row][col]) {
            revealed[row][col] = true;
            if (minefield[row][col] == 0) {
                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {
                        revealCell(row + dr, col + dc);
                    }
                }
            }
        }
    }

    private void printBoard() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (revealed[r][c]) {
                    if (minefield[r][c] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(minefield[r][c] + " ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mine Sweeper Oyuna Hoş Geldiniz!");
        while (!gameOver) {
            printBoard();
            System.out.print("Satır Giriniz: ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int col = scanner.nextInt();

            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                if (minefield[row][col] == -1) {
                    gameOver = true;
                    System.out.println("Game Over!!");
                    printBoard();
                } else {
                    revealCell(row, col);
                    if (checkWin()) {
                        gameOver = true;
                        System.out.println("Oyunu Kazandınız!");
                        printBoard();
                    }
                }
            } else {
                System.out.println("Geçersiz bir nokta girdiniz. Tekrar deneyin.");
            }
        }
        scanner.close();
    }

    private boolean checkWin() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (!revealed[r][c] && minefield[r][c] != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int cols = scanner.nextInt();

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}
