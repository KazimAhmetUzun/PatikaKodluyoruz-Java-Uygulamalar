package InsuranceSystem;

import java.util.ArrayList;

abstract class Account {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    public Account(User user) {
        this.user = user;
        authenticationStatus = AuthenticationStatus.FAIL;
        insurances = new ArrayList<>();
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }

    public void removeInsurance(Insurance insurance) {
        insurances.remove(insurance);
    }

    public abstract void addInsurancePolicy(Insurance insurance);

    public void showUserInfo() {
        System.out.println("Kullanıcı Adı: " + user.getName() + " " + user.getSurname());
        System.out.println("Yaş: " + user.getAge());
        System.out.println("Meslek: " + user.getProfession());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Son Giriş Tarihi: " + user.getLastLoginDate());
        System.out.println("Adresler:");
        for (Address address : user.getAddresses()) {
            System.out.println("- " + address.getAddressType() + ": " + address.getAddressDetails());
        }
    }
}