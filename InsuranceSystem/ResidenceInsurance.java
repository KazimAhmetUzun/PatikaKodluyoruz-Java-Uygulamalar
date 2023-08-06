package InsuranceSystem;

import java.util.Date;

class ResidenceInsurance extends Insurance {
    private double residenceValue;
    private boolean hasSecuritySystem;

    public ResidenceInsurance(String name, double price, Date startDate, Date endDate, double residenceValue, boolean hasSecuritySystem) {
        super(name, price, startDate, endDate);
        this.residenceValue = residenceValue;
        this.hasSecuritySystem = hasSecuritySystem;
    }

    @Override
    public double calculate() {
        // Custom calculation logic for residence insurance price
        double basePrice = 1000.0;
        double residenceValueFactor = residenceValue / 1000000;
        double securitySystemFactor = hasSecuritySystem ? 0.8 : 1.0;
        return basePrice * residenceValueFactor * securitySystemFactor;
    }
}