public class Trabajador extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("Salario: %s %n",this.getSalario());
    }
}
