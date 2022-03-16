package Polymorphism2;

public class UnitedStatesAddress extends Address {

    public UnitedStatesAddress(String recipient, String houseNumber, String streetName, String apartmentNumber, String city, String stateAbbreviation,  String postalCode, String country) {
        super(recipient, houseNumber, streetName, apartmentNumber, stateAbbreviation, city, postalCode, country);
    }

    @Override
    public String toString() {

        return String.format("%s \n%s %s %s \n%s, %s %s \n%s",
                super.getRecipient(), super.getHouseNumber(), super.getStreetName(), super.getApartmentNumber(),
                super.getCity(), super.getStateAbbreviation(), super.getPostalCode(), super.getCountry());
    }
}
