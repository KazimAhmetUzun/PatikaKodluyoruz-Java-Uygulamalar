package InsuranceSystem;

class Enterprise extends Account {
    private static final double ENTERPRISE_INSURANCE_PROFIT_MARGIN = 1.5;

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {
        double totalPrice = insurance.calculate();
        insurance.setPrice(totalPrice * ENTERPRISE_INSURANCE_PROFIT_MARGIN);
        addInsurance(insurance);
    }
}