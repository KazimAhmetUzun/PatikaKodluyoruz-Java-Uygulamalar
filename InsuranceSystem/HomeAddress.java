package InsuranceSystem;

class HomeAddress implements Address {
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressType() {
        return "Ev Adresi";
    }

    @Override
    public String getAddressDetails() {
        return address;
    }
}