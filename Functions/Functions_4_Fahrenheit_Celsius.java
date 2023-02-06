//Usant programació modular en java, desenvolupa un programa amb mètodes que permeti convertir les temperatures
//        expressades en graus Fahrenheit a Celsius i viceversa. Usarem valors enters positius i negatius!
//
//        El transformador de mesures ha de tenir un menú principal que permeti escollir el tipus de conversió
//        (de Fahrenheit a Celsius o de Celsius a Fahrenheit. El programa no acaba fins que no s'escull l'opció de sortir.
//
//        Les fórmules de conversió són les següents:
//
//        fahrenheit = (9.0 / 5) * celsius + 32
//        celsius = (5.0 /9) * (fahrenheit - 32)
//        El programa ha de tenir com a mínim els següents mètodes:
//
//        Menú principal
//        Control d'errors per a valors enters
//        Càlcul de F a C
//        Càlcul de C a F


package Functions;

import java.util.Scanner;

public class Functions_4_Fahrenheit_Celsius {
    public static void main(String[] args) {

        float temperatura = 0;
        int opcio = 0;
        String MENU = "1.Pasar de Fahrenheit a Celsius \n" +
                "2.Pasar de Celsius a Fahrenheit \n" +
                "3.Sortir";

        System.out.println();
        System.out.println("Benvingut, les opcions del menu son les seguents: ");
        System.out.println();

        do {
            opcio = llegirEnter(MENU, 1, 3);
            switch (opcio) {
                case 1:
                    temperatura = pasarDeFahrenheitACelsius();
                    System.out.println("El resultat es: " + temperatura + " Celsius");
                    break;
                case 2:
                    temperatura = pasarDeCelsiusAFahrenheit();
                    System.out.println("El resultat es: " + temperatura + " Fahrenheit");
                    break;
                case 3:
                    System.out.println("Sortim");
                    break;
                default:
                    System.out.println("Valor fora de rang");
                    break;
            }
        } while (opcio != 3);
    }

    /**
     * Funció que fa el càlcul per pasar de Celsius a Fahrenheit
     *
     * @return Resultat del càlcul
     */
    private static float pasarDeCelsiusAFahrenheit() {
        float x = llegirFloat("Introdueix la temperatura en Celsius per convertir-la en Fahrenheit: ", "ERROR: Tipatge incorrecte");
        float y = (float) ((9.0 / 5) * x + 32);
        return y;
    }

    /**
     * Funció que fa el càlcul per pasar de Fahrenheit a Celsius
     *
     * @return Resultat del càlcul
     */
    private static float pasarDeFahrenheitACelsius() {
        float x = llegirFloat("Introdueix la temperatura en Fahrenheit per convertir-la en Celsius: ", "ERROR: Tipatge incorrecte");
        float y = (float) ((5.0 / 9) * (x - 32));
        return y;
    }

    /**
     * Funció per fer un control de errors de tipus float
     *
     * @param missatge
     * @param mensaje
     * @return Retorna un número correcte de tipus float que ha introduit l'usuari
     */
    public static float llegirFloat(String missatge, String mensaje) {
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();
            if (!valorCorrecte) {
                System.out.println(mensaje);
                llegir.nextLine();
            } else {
                x = llegir.nextFloat();
                llegir.nextLine();
            }
        } while (!valorCorrecte);
        return x;
    }

    /**
     * Funció per fer un control de error de tipus int
     *
     * @param missatge
     * @param min
     * @param max
     * @return Retorna un número correcte pel menú (Switch Case) de tipus int introduit per l'usuari
     */
    public static int llegirEnter(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);

        return x;
    }
}
