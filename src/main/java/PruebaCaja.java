
/**
 *
 * @author raulf
 */
public class PruebaCaja {

    public static void main(String[] args) {
        int valorA = 6;
        int valorB = 2;
        int valorC = 3;

        //Crear objeto
        Caja caja1 = new Caja(valorA, valorB, valorC);

        System.out.println("El volumen es: " + caja1.CalcularVolumen());

    }
}
