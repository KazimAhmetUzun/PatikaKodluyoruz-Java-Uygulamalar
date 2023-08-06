package InsuranceSystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Test the system with some sample data
        User user1 = new User("John", "Doe", "john.doe@example.com", "password", "Engineer", 30);
        User user2 = new User("Jane", "Smith", "jane.smith@example.com", "password", "Teacher", 25);

        Address homeAddress1 = new HomeAddress("123 Main St, Anytown, USA");
        Address businessAddress1 = new BusinessAddress("456 Business Rd, Business City, USA");
        Address homeAddress2 = new HomeAddress("789 Residence Ave, Somewhere, USA");

        AddressManager.addAddress(user1, homeAddress1);
        AddressManager.addAddress(user1, businessAddress1);
        AddressManager.addAddress(user2, homeAddress2);

        Account individualAccount = new Individual(user1);
        Account enterpriseAccount = new Enterprise(user2);

        HealthInsurance healthInsurance1 = new HealthInsurance("Health Policy 1", 0.0,
                new Date(), new Date(), 35, false);
        TravelInsurance travelInsurance1 = new TravelInsurance("Travel Policy 1", 0.0,
                new Date(), new Date(), 7, "Turkey");
        ResidenceInsurance residenceInsurance1 = new ResidenceInsurance("Residence Policy 1", 0.0,
                new Date(), new Date(), 500000, true);
        CarInsurance carInsurance1 = new CarInsurance("Car Policy 1", 0.0,
                new Date(), new Date(), 3, 25000);

        individualAccount.addInsurancePolicy(healthInsurance1);
        individualAccount.addInsurancePolicy(travelInsurance1);

        enterpriseAccount.addInsurancePolicy(residenceInsurance1);
        enterpriseAccount.addInsurancePolicy(carInsurance1);

        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        try {
            Account loggedInAccount = accountManager.login("john.doe@example.com", "password");
            System.out.println("Giriş Başarılı!");
            loggedInAccount.showUserInfo();
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }
}