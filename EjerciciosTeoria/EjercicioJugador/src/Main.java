import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        j1.setNombre("Ramon");
        j1.setApellido("Rodriguez");
        j1.setPosicion("Arquero");
        j1.setNumero(1);

        j2.setNombre("Ignacio");
        j2.setApellido("Perez");
        j2.setPosicion("Defensa");
        j2.setNumero(25);

        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(j1);
        jugadores.add(j2);

        Equipo equipo = new Equipo();

        equipo.setJugadores(jugadores);

        for (Jugador aux : equipo.getJugadores()) {

            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Apellido: " + aux.getApellido());
            System.out.println("Posición: " + aux.getPosicion());
            System.out.println("Número: " + aux.getNumero());

        }

    }

}
