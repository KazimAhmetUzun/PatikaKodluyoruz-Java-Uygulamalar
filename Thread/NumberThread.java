package Thread;

import java.util.ArrayList;

class NumberThread extends Thread {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> evenNumbersList;
    private ArrayList<Integer> oddNumbersList;

    public NumberThread(ArrayList<Integer> numbers, ArrayList<Integer> evenNumbersList, ArrayList<Integer> oddNumbersList) {
        this.numbers = numbers;
        this.evenNumbersList = evenNumbersList;
        this.oddNumbersList = oddNumbersList;
    }

    @Override
    public void run() {
        // Sayıları kontrol edip çift ve tek listelerine ekliyoruz
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbersList.add(number);
            } else {
                oddNumbersList.add(number);
            }
        }
    }
}