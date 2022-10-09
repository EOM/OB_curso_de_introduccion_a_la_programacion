public class Main {

    public static void main(String[] args) {

        System.out.println("---===={ Ejercicio Tema 9 }====---");
        ejercio();
        System.out.println("     ---===={ Fin }====---");
    }

    protected static void ejercio() {

        System.out.println("CLIENTE: ");
        ejecutarCliente();

        System.out.println(" ");
        System.out.println("TRABAJANDO: ");
        ejecutarTrabajando();

    }

    protected static void ejecutarCliente() {

        Cliente objCliente = new Cliente();
        // Seters
        objCliente.setNombre("Sergio");
        objCliente.setEdad(41);
        objCliente.setTelefono("+541111111111");
        objCliente.setCredito(50000.89);
        // Get datos
        objCliente.mostrarDatos();
    }

    protected static void ejecutarTrabajando() {

        Trabajador objTrabajador = new Trabajador();
        // Seters
        objTrabajador.setNombre("Sergio");
        objTrabajador.setEdad(41);
        objTrabajador.setTelefono("+541111111111");
        objTrabajador.setSalario(250087.49);
        // Get datos
        objTrabajador.mostrarDatos();
    }

}