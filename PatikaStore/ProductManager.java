package PatikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProductManager {
    private List<Brand> brands;
    private List<Product> products;

    public ProductManager() {
        brands = new ArrayList<>();
        products = new ArrayList<>();
        addBrands();
    }

    private void addBrands() {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
        Collections.sort(brands, Comparator.comparing(Brand::getName));
    }

    public void listBrands() {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand);
        }
    }

    public void listProductsByCategory(String category) {
        String categoryName = category.equals("C") ? "Cep Telefonu" : "Notebook";
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof CellPhone && category.equals("C")) {
                productsByCategory.add(product);
            } else if (product instanceof Notebook && category.equals("N")) {
                productsByCategory.add(product);
            }
        }

        System.out.println(categoryName + " Listesi");
        printProductTableHeader(category);
        for (Product product : productsByCategory) {
            System.out.println(product);
        }
    }

    private void printProductTableHeader(String category) {
        String header = "";
        if (category.equals("C")) {
            header = String.format("%n--------------------------------------------------------------------------------------------------------------------------------------%n" +
                    "| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      | %n" +
                    "--------------------------------------------------------------------------------------------------------------------------------------");
        } else if (category.equals("N")) {
            header = String.format("%n----------------------------------------------------------------------------------------------------%n" +
                    "| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         | %n" +
                    "----------------------------------------------------------------------------------------------------");
        }
        System.out.println(header);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public void listProductsByBrand(int brandId) {
        Brand selectedBrand = brands.stream().filter(brand -> brand.getId() == brandId).findFirst().orElse(null);
        if (selectedBrand == null) {
            System.out.println("Geçersiz marka numarası!");
            return;
        }

        System.out.println(selectedBrand.getName() + " Markasına Ait Ürünler");
        printProductTableHeader("C");
        for (Product product : products) {
            if (product.getBrand().equals(selectedBrand) && product instanceof CellPhone) {
                System.out.println(product);
            }
        }

        printProductTableHeader("N");
        for (Product product : products) {
            if (product.getBrand().equals(selectedBrand) && product instanceof Notebook) {
                System.out.println(product);
            }
        }
    }
}
