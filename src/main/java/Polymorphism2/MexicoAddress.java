package Polymorphism2;

public class MexicoAddress extends Address {

    private String provinceAbbreviation;

    public MexicoAddress(String recipient, String houseNumber, String streetName, String apartmentNumber, String Village, String localityName, String provinceAbbreviation, String postalCode, String country) {
        super(recipient, houseNumber, streetName, apartmentNumber, localityName, Village, postalCode, country);
        this.provinceAbbreviation = provinceAbbreviation;
    }

    @Override
    public String toString() {

        return String.format("%s \n%s %s - %s \n%s \n%s %s, %s\n%s",
                super.getRecipient(), super.getStreetName(), super.getHouseNumber(), super.getApartmentNumber(),
                super.getCity(), super.getPostalCode(), super.getStateAbbreviation(), this.provinceAbbreviation, super.getCountry());
    }
}