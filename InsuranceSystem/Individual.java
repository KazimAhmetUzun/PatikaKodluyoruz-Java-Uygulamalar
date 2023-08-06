package InsuranceSystem;

class Individual extends Account {
    private static final double INDIVIDUAL_INSURANCE_PROFIT_MARGIN = 1.2;

    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {
        double totalPrice = insurance.calculate();
        insurance.setPrice(totalPrice * INDIVIDUAL_INSURANCE_PROFIT_MARGIN);
        addInsurance(insurance);
    }
}
