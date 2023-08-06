package PatikaStore;

class CellPhone extends Product {
    private String memory;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public CellPhone(int id, double unitPrice, double discountRate, int stock, String name, Brand brand, String memory, double screenSize, int batteryPower, int ram, String color) {
        super(id, unitPrice, discountRate, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getDetails() {
        return String.format("| %-8s| %-6.1f inch| %-6d mAh| %-4d GB| %-9s|", memory, screenSize, batteryPower, ram, color);
    }

    @Override
    public String toString() {
        return super.toString() + getDetails();
    }
}