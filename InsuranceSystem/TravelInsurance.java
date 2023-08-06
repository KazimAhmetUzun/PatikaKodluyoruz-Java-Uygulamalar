package InsuranceSystem;

import java.util.Date;

class TravelInsurance extends Insurance {
    private int days;
    private String destinationCountry;

    public TravelInsurance(String name, double price, Date startDate, Date endDate, int days, String destinationCountry) {
        super(name, price, startDate, endDate);
        this.days = days;
        this.destinationCountry = destinationCountry;
    }

    @Override
    public double calculate() {
        // Custom calculation logic for travel insurance price
        double basePricePerDay = 50.0;
        double destinationFactor = destinationCountry.equals("Turkey") ? 0.8 : 1.2;
        return basePricePerDay * days * destinationFactor;
    }
}