package Polymorphism2;

public class Address {
    private String recipient;
    private String houseNumber;
    private String streetName;
    private String apartmentNumber;
    private String stateAbbreviation;
    private String city;
    private String postalCode;
    private String country;

    public Address(String recipient, String houseNumber, String streetName, String apartmentNumber, String stateAbbreviation, String city, String postalCode, String country) {
        this.recipient = recipient;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.stateAbbreviation = stateAbbreviation;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }
}
