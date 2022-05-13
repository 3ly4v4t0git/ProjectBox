
public class Caja {

    int profundo;
    int alto;
    int ancho;

    public Caja(int profundo, int alto, int ancho) {
        this.profundo = profundo;
        this.alto = alto;
        this.ancho = ancho;

        System.out.println("Ejecutando constructor con 3 argumentos");
    }

    public int CalcularVolumen() {
        return this.profundo * this.alto * this.ancho;
    }

}
