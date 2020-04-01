package zum;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String homeState;
    private String zipCode;
    private String referralCode;
    private String fullName;
    private String currentCompany;
    private String linkedInURL;
    private String portfolioURL;
    private String additionalInformation;


    public User(String firstName, String lastName, String email, String phoneNumber, String homeState, String zipCode,
                String referralCode, String fullName, String currentCompany, String linkedInURL, String portfolioURL,
                String additionalInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.homeState = homeState;
        this.zipCode = zipCode;
        this.referralCode = referralCode;
        this.fullName = fullName;
        this.currentCompany = currentCompany;
        this.linkedInURL = linkedInURL;
        this.portfolioURL = portfolioURL;
        this.additionalInformation = additionalInformation;
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

    public String getFullName() {
        return fullName;
    }
     public String getCurrentCompany() {
        return currentCompany;
     }

    public String getLinkedInURL() {
        return linkedInURL;
    }

    public String getPortfolioURL() {
        return portfolioURL;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }
}
