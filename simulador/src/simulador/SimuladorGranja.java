package simulador;

/**
 * <p>
 * Este codigo tiene lo necesario para manejar el simulador granja</p>
 *
 * @author Katherine Montano
 * @since 18/06/2018
 * @version 1.0
 */
public class SimuladorGranja {

    public static void main(String[] args) {

        Granja miGranja = new Granja();
        do {
            miGranja.corralVacas();
            miGranja.corralPerros();
            miGranja.corralGatos();
            miGranja.corralPatos();
            miGranja.corralOvejas();
        } while (true);
    }
}
