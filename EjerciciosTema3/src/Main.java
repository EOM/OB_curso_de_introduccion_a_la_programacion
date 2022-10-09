public class Main {

    public static void main(String[] args) {

        System.out.println("---===={ Ejercicio Tema 3 }====---");
        parte1();
        parte2();
        System.out.println("     ---===={ Fin }====---");
    }

    /**
     * Suma los tres numeros enteros pasados por parametros.
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    protected static int sumarTresNumeros(int num1, int num2, int num3) {
        return (num2 + num2 + num3);
    }

    /**
     * Sumar tres numeros y mostrar el resultado de la suma por pantalla.
     */
    protected static void parte1() {
        int resultadoDeLaSumaDeTresNumeros = sumarTresNumeros(2, 3, 5);
        System.out.printf("Resultado de la suma de (2+3+5) = %d  %n", resultadoDeLaSumaDeTresNumeros);
    }

    /**
     * Definir la cantidad de puertas del coche y mostrar por pantalla
     * la cantidad de puertas definidas anteriormente.
     */
    protected static void parte2() {
        Coche miCoche = new Coche();
        miCoche.setCantidadDePuerta(4);
        miCoche.saberCantidadDePuertas();
    }
}