package PatikaStore;

class Notebook extends Product {
    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stock, String name, Brand brand, int ram, int storage, double screenSize) {
        super(id, unitPrice, discountRate, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String getDetails() {
        return String.format("| %-4d GB| %-9d GB| %-6.1f inch|", ram, storage, screenSize);
    }

    @Override
    public String toString() {
        return super.toString() + getDetails();
    }
}