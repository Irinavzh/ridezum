package zum;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String homeState;
    private String zipCode;
    private String referralCode;

    public User(String firstName, String lastName, String email, String phoneNumber, String homeState, String zipCode, String referralCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.homeState = homeState;
        this.zipCode = zipCode;
        this.referralCode = referralCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomeState() {
        return homeState;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getReferralCode() {
        return referralCode;
    }
}
