import java.util.regex.Pattern;

public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String city;
    private String postalCode;
    private int licenseNumber;
    private int yearOfIssue;
    private String licenseCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Pattern.compile("^.").matcher(name).replaceFirst(m -> m.group().toUpperCase());
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 1980) {
            this.yearOfIssue = yearOfIssue;
        }
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public String displayLicenseInfo() {
        return getName() + " " + getSurname() + " " + getAddress() + " " + getCity() + " " + getPostalCode() + " " + getLicenseNumber() + " " + getYearOfIssue() + " " + getLicenseCategory();
    }
}
