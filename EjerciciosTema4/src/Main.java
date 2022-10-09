public class Main {

    public static void main(String[] args) {

        System.out.println("---===={ Ejercicio Tema 4 }====---");
        System.out.println(" INICIO PUNTO 1 ::");
        punto1(6);
        punto1(0);
        punto1(-6);
        System.out.println(" INICIO PUNTO 2 ::");
        punto2(-2);
        System.out.println(" INICIO PUNTO 3 ::");
        punto3();
        System.out.println(" INICIO PUNTO 4 ::");
        punto4();
        System.out.println(" INICIO PUNTO 5 ::");
        punto5("VERANO");
        punto5("no existe la estación");
        System.out.println("     ---===={ Fin }====---");
    }

    protected static void punto1(int numeroIf) {
        String resultado = "";
        if (numeroIf > 0) {
            resultado = "POSITIVO";
        } else if (numeroIf < 0) {
            resultado = "NEGATIVO";
        } else {
            resultado = "CERO";
        }
        System.out.printf("El numero '%d' es %s %n", numeroIf, resultado);
    }

    protected static void punto2(int numeroWhile) {
        if (numeroWhile > 3) {
            System.out.printf("El numeroWhile '%d' no puede ser superior a 3 %n", numeroWhile);
            return;
        }

        while (numeroWhile <= 3) {
            System.out.printf("El numeroWhile es '%d' %n", numeroWhile);
            numeroWhile++;
        }
    }

    protected static void punto3() {

        int numeroDoWhile = 1;
        do {
            System.out.printf("El DoWhile se ejecuto una vez %n");
        }while (numeroDoWhile < 1);
    }

    protected static void punto4() {
        for (int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.printf("El numeroFor es '%d' %n", numeroFor);
        }
    }

    protected static void punto5(String estacion) {

        String msj = "La estacion del año es ";

        switch (estacion){
            case "VERANO":
            case "OTONIO":
            case "INVIERNO":
            case "PRIMAVERA":
                msj += estacion;
                break;
            default:
                msj = "El parametro estación no es valido";
                break;

        }
        System.out.printf("El resultado es '%s' %n", msj);
    }

}