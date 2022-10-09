public class Main {

    public static void main(String[] args) {

        System.out.println("---===={ Ejercicio Tema 8 }====---");
        ejercio();
        System.out.println("     ---===={ Fin }====---");
    }

    protected static void ejercio() {

        Persona persona = new Persona();

        // Seters
        persona.setNombre("Sergio");
        persona.setEdad(41);
        persona.setTelefono("+541111111111");

        // Get datos
        persona.mostrarDatos();

    }

}