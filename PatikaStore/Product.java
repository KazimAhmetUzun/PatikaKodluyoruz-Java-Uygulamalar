package PatikaStore;

abstract class Product {
    private int id;
    private double unitPrice;
    private double discountRate;
    private int stock;
    private String name;
    private Brand brand;

    public Product(int id, double unitPrice, double discountRate, int stock, String name, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return String.format("| %-3d| %-28s| %-10.2f TL| %-9s|", id, name, unitPrice, brand.getName());
    }
}
