package simulador;

/**
 *
 * En esta clase nombran el sonido y nombre de un animal especifico.
 *
 * @version 0.02
 * @since 0.1
 *
 */
public class Perro {

    private final String SONIDO = "Guau gua";
    public String nombrePerro;

    /**
     *
     * En este metodo se inicializa el dato en especifico.
     *
     * @version 0.02
     * @since 0.1
     *
     */

    public Perro() {
        this.nombrePerro = "Perro";
    }

    /**
     *
     * En este metodo esta hecho para retornar.
     *
     * @version 0.02
     * @since 0.1
     * @return el dato sonido.
     */
    public String ladrar() {
        return this.SONIDO;
    }
}
