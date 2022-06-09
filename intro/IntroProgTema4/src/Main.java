public class Main {
    public static void main(String[] args) {
        // Determinacion de numero positivo, negativo o cero.

        int numeroIf = 0;

        if (numeroIf > 0){
            System.out.println("Mi numero es positivo");
        } else if (numeroIf == 0) {
            System.out.println("Mi numero es cero");
        }
        else System.out.println("Mi numero es negativo");

        //Bucle while

        int numeroWhile = -1;
        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println("la variable numeroWhile es = " + numeroWhile);
        }

        //Do while

        do {
            numeroWhile ++;
            System.out.println("la variable numeroWhile es = " + numeroWhile);
        }
        while (numeroWhile < 3);

        //For

        for(int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("la variable numeroFor es = " + numeroFor);
        }

        //Switch

        var estacion = "verano";

        switch (estacion){
            case "verano" :
                System.out.println("Es verano");
                break;

            case "invierno" :
                System.out.println("Es invierno");
                break;

            case "primavera" :
                System.out.println("Es primavera");
                break;

            case "otoño" :
                System.out.println("Es otroño");
                break;

            default:
                System.out.println("No ingresaste una estacion valida");
                break;


            }
        }

  }

