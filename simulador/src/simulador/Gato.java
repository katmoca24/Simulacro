package simulador;

/**
 *
 * En esta clase nombran el sonido y nombre de un animal especifico.
 *
 * @version 0.02
 * @since 0.1
 *
 */
public class Gato {

    private String SONIDO = "Miau, miau";
    public String nombreGato;

    /**
     *
     * En este metodo se inicializa el dato en especifico.
     *
     * @version 0.02
     * @since 0.1
     *
     */

    public Gato() {
        this.nombreGato = "Gato";
    }

    /**
     *
     * En este metodo esta hecho para retornar.
     *
     * @version 0.02
     * @since 0.1
     * @return el dato sonido.
     */

    public String maullar() {
        return this.SONIDO;
    }
}
