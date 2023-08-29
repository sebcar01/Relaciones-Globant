import Entities.Persona;
import Entities.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Perro m1 = new Perro("Firulais", "Chandoso", 2, "Mediano");
        Perro m2 = new Perro("Tobias", "Beagle", 5, "Pequeño");
        Persona p1 = new Persona("Juan", "Perez", 24, 12345, m1);
        Persona p2 = new Persona("Ramon", "Gonzalez", 34, 1241, m2);

        System.out.println(p1);
        System.out.println(p2);

    }

}
