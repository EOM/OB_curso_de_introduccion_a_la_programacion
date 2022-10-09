public class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Credito: %s %n",this.getCredito());
    }
}
