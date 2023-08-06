package InsuranceSystem;

import java.util.Date;

class CarInsurance extends Insurance {
    private int carAge;
    private double carValue;

    public CarInsurance(String name, double price, Date startDate, Date endDate, int carAge, double carValue) {
        super(name, price, startDate, endDate);
        this.carAge = carAge;
        this.carValue = carValue;
    }

    @Override
    public double calculate() {
        // Custom calculation logic for car insurance price
        double basePrice = 600.0;
        double ageFactor = carAge < 5 ? 1.2 : 1.0;
        double carValueFactor = carValue / 50000;
        return basePrice * ageFactor * carValueFactor;
    }
}