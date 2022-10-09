public class Coche {

    protected int cantidadDePuerta = 0;

    public void saberCantidadDePuertas() {
        System.out.printf("Cantidad de puertas: %d %n", this.getCantidadDePuerta());
    }

    public int getCantidadDePuerta() {
        return cantidadDePuerta;
    }

    public void setCantidadDePuerta(int cantidadDePuerta) {
        this.cantidadDePuerta = cantidadDePuerta;
    }
}
