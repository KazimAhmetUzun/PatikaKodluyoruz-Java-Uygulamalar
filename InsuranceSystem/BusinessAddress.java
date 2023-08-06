package InsuranceSystem;

class BusinessAddress implements Address {
    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressType() {
        return "İş Adresi";
    }

    @Override
    public String getAddressDetails() {
        return address;
    }
}