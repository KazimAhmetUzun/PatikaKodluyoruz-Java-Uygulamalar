package PatikaStore; 


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.listBrands();

        // Örnek ürünler
        CellPhone phone1 = new CellPhone(1, 3199.0, 0.0, 100, "SAMSUNG GALAXY A51", productManager.brands.get(0), "128 GB", 6.5, 4000, 6, "Siyah");
        CellPhone phone2 = new CellPhone(2, 7379.0, 0.0, 50, "iPhone 11 64 GB", productManager.brands.get(2), "64 GB", 6.1, 3046, 6, "Mavi");
        CellPhone phone3 = new CellPhone(3, 4012.0, 0.0, 75, "Redmi Note 10 Pro 8GB", productManager.brands.get(7), "128 GB", 6.5, 4000, 12, "Beyaz");
        Notebook notebook1 = new Notebook(1, 7000.0, 0.0, 30, "HUAWEI Matebook 14", productManager.brands.get(3), 16, 512, 14.0);
        Notebook notebook2 = new Notebook(2, 3699.0, 0.0, 20, "LENOVO V14 IGL", productManager.brands.get(1), 8, 1024, 14.0);
        Notebook notebook3 = new Notebook(3, 8199.0, 0.0, 10, "ASUS Tuf Gaming", productManager.brands.get(5), 32, 2048, 15.6);

        productManager.addProduct(phone1);
        productManager.addProduct(phone2);
        productManager.addProduct(phone3);
        productManager.addProduct(notebook1);
        productManager.addProduct(notebook2);
        productManager.addProduct(notebook3);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPatikaStore Ürün Yönetim Paneli !\n1 - Notebook İşlemleri\n2 - Cep Telefonu İşlemleri\n3 - Marka Listele\n0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else if (choice == 1) {
                System.out.println("\nNotebook Listesi");
                productManager.listProductsByCategory("N");
            } else if (choice == 2) {
                System.out.println("\nCep Telefonu Listesi");
                productManager.listProductsByCategory("C");
            } else if (choice == 3) {
                productManager.listBrands();
            } else {
                System.out.println("Geçersiz seçim!");
            }
        }
    }
}