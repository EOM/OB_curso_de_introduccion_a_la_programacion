public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.printf("Nombre: %s %n",this.getNombre());
        System.out.printf("Edad: %s %n",this.getEdad());
        System.out.printf("Telefono: %s %n",this.getTelefono());
    }
}
