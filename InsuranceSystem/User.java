package InsuranceSystem;

import java.util.ArrayList;
import java.util.Date;

class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String profession;
    private int age;
    private ArrayList<Address> addresses;
    private Date lastLoginDate;

    public User(String name, String surname, String email, String password, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }
}
