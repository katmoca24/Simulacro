package simulador;

/**
 *
 * En esta clase nombran el sonido y nombre de un animal especifico.
 *
 * @version 0.02
 * @since 0.1
 *
 */

public class Oveja {

    private final String SONIDO = "Beeeee";
    public String nombreOveja;

    /**
     *
     * En este metodo se inicializa el dato en especifico.
     *
     * @version 0.02
     * @since 0.1
     *
     */

    public Oveja() {
        this.nombreOveja = "Oveja";
    }

    /**
     *
     * En este metodo esta hecho para retornar.
     *
     * @version 0.02
     * @since 0.1
     * @return el dato sonido.
     */
    public String balar() {
        return this.SONIDO;
    }
}
