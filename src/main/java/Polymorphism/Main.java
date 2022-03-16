package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Container> containers = new ArrayList<>();
        containers.add(new Box("wine", 13, 14, 15));
        containers.add(new Cylinder("beer", 8, 10));
        containers.add(new Sphere("milk", 8));
        for (Container c : containers) {
            System.out.println(c);
        }

    }
}
