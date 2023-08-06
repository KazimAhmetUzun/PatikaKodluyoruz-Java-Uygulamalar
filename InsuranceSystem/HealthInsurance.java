package InsuranceSystem;

import java.util.Date;

class HealthInsurance extends Insurance {
    private int age;
    private boolean isSmoker;

    public HealthInsurance(String name, double price, Date startDate, Date endDate, int age, boolean isSmoker) {
        super(name, price, startDate, endDate);
        this.age = age;
        this.isSmoker = isSmoker;
    }

    @Override
    public double calculate() {
        // Custom calculation logic for health insurance price
        double basePrice = 500.0;
        double ageFactor = age < 18 ? 0.5 : (age >= 18 && age < 50 ? 1.0 : 1.5);
        double smokerFactor = isSmoker ? 1.3 : 1.0;
        return basePrice * ageFactor * smokerFactor;
    }
}