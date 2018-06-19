package simulador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * En este clase se inicializan las variables las cuales vamos a utilizar en
 * todo el codigo.
 *
 * @since 1.01
 *
 */
public class Granja {

    private Vaca miVaca;
    private Perro miPerro;
    private Gato miGato;
    private Pato miPato;
    private Oveja miOveja;

    /**
     * En este metodo se inicializan las variables que se van a utilizar durante
     * todo el codigo.
     *
     * @since 0.1
     *
     */
    public Granja() {

        this.miVaca = new Vaca();
        this.miPerro = new Perro();
        this.miGato = new Gato();
        this.miPato = new Pato();
        this.miOveja = new Oveja();
    }

    /**
     *
     * En este metodo se reliza un random para que salga un dato aleatorio.
     *
     * @return una cantidad de datos.
     * @since 0.1
     *
     */
    public List<Vaca> corralVacas() {

        int ClaseAnimal = 0;
        Random aleatorio = new Random();
        int N = aleatorio.nextInt(1000000);
        List<Vaca> listaVacas = new ArrayList();
        listaVacas.add(miVaca);
        System.out.println(listaVacas.get(ClaseAnimal).nombreVaca + " "
                + listaVacas.get(ClaseAnimal).mujir() + N);

        return listaVacas;
    }

    /**
     *
     * En este metodo se reliza un random para que salga un dato aleatorio.
     *
     * @return una cantidad de datos.
     * @since 0.1
     *
     */
    public List<Perro> corralPerros() {

        int ClaseAnimal = 0;
        Random aleatorio = new Random();
        int N = aleatorio.nextInt(1000000);
        List<Perro> listaPerros = new ArrayList();
        listaPerros.add(miPerro);
        System.out.println(listaPerros.get(ClaseAnimal).nombrePerro + " "
                + listaPerros.get(ClaseAnimal).ladrar() + N);

        return listaPerros;
    }

    /**
     *
     * En este metodo se reliza un random para que salga un dato aleatorio.
     *
     * @return una cantidad de datos.
     * @since 0.1
     *
     */
    public List<Gato> corralGatos() {

        int ClaseAnimal = 0;
        Random aleatorio = new Random();
        int N = aleatorio.nextInt(1000000);
        List<Gato> listaGatos = new ArrayList();
        listaGatos.add(miGato);
        System.out.println(listaGatos.get(ClaseAnimal).nombreGato + " "
                + listaGatos.get(ClaseAnimal).maullar() + N);

        return listaGatos;
    }

    /**
     *
     * En este metodo se reliza un random para que salga un dato aleatorio.
     *
     * @return una cantidad de datos.
     * @since 0.1
     *
     */
    public List<Pato> corralPatos() {

        int ClaseAnimal = 0;
        Random aleatorio = new Random();
        int N = aleatorio.nextInt(1000000);
        List<Pato> listaPatos = new ArrayList();
        listaPatos.add(miPato);
        System.out.println(listaPatos.get(ClaseAnimal).nombrePato + " "
                + listaPatos.get(ClaseAnimal).grasnar() + N);

        return listaPatos;
    }

    /**
     *
     * En este metodo se reliza un random para que salga un dato aleatorio.
     *
     * @return una cantidad de datos.
     * @since 0.1
     *
     */
    public List<Oveja> corralOvejas() {

        int ClaseAnimal = 0;
        Random aleatorio = new Random();
        int N = aleatorio.nextInt(1000000);
        List<Oveja> listaOvejas = new ArrayList();
        listaOvejas.add(miOveja);
        System.out.println(listaOvejas.get(ClaseAnimal).nombreOveja + " "
                + listaOvejas.get(ClaseAnimal).balar() + N);

        return listaOvejas;
    }

}
