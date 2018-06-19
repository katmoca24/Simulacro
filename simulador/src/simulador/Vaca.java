package simulador;

/**
 *
 * En esta clase nombran el sonido y nombre de un animal especifico.
 *
 * @version 0.02
 * @since 0.1
 *
 */
public class Vaca {

    private final String SONIDO = "Muuu";
    public String nombreVaca;

    /**
     *
     * En este metodo se inicializa el dato en especifico.
     *
     * @version 0.02
     * @since 0.1
     *
     */

    public Vaca() {
        this.nombreVaca = "Vaca";
    }

    /**
     *
     * En este metodo esta hecho para retornar.
     *
     * @version 0.02
     * @since 0.1
     * @return el dato sonido.
     */
    public String mujir() {
        return this.SONIDO;
    }
}
