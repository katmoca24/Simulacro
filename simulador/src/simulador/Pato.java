package simulador;

/**
 *
 * En esta clase nombran el sonido y nombre de un animal especifico.
 *
 * @version 0.02
 * @since 0.1
 *
 */
public class Pato {

    private final String SONIDO = "CuaCua";
    public String nombrePato;

    /**
     *
     * En este metodo se inicializa el dato en especifico.
     *
     * @version 0.02
     * @since 0.1
     *
     */
    public Pato() {
        this.nombrePato = "Pato";
    }

    /**
     *
     * En este metodo esta hecho para retornar.
     *
     * @version 0.02
     * @since 0.1
     * @return el dato sonido.
     */
    public String grasnar() {
        return this.SONIDO;
    }
}
