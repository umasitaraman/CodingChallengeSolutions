package Polymorphism2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new CanadaAddress(
                "Richard Roe",
                "123", "First Ave", "Apt 4",
                "Somewhere", "NT", "H0H 0H0",
                "Canada"));

        addresses.add(new MexicoAddress(
                "Diego Ramirez",
                "123", "Blvd Flamingo", "4",
                "Coronado",
                "Everywhere", "Sonora", "99999",
                "Mexico"));

        addresses.add(new UnitedStatesAddress(
                "Jane Doe",
                "123", "Main St", "Apt 4",
                "Anywhere", "NY", "99999",
                "USA"));

        for (Address a : addresses) {
            System.out.println(a);
            System.out.println();
        }
    }
}
