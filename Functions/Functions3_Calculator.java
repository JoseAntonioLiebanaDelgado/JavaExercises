//Desenvolupa un codi java usant programació modular amb mètodes que simuli una calculadora. Trobaràs l'esquelet del programa adjunt en aquesta tasca.
//  Crea un mètode per cada opció del menú principal i també pel control d'errors.

package FunctionsParaMirarEnExamen;

import java.util.Scanner;

public class Functions3_Calculator {
    public static void main(String[] args) {
        float valor1, valor2, resultat;
        final String MISSATGE_2 = "Escriu el segon valor: ";
        final String MENU_PRINCIPAL = "Les opcions del menú són:\n1- Suma\n2- Resta\n3- Multplicació\n4- Divisió\n5- Exponencial\n6- Sortir";
        int opcioMenu = 0;

        System.out.println("Benvingut al programa de calculadora.");

        do {

            valor1 = llegirFloat("Escriu el primer valor:  ");
            valor2 = llegirFloat(MISSATGE_2);
            opcioMenu = llegirEnter(MENU_PRINCIPAL, 1, 6);
            switch (opcioMenu) {
                case 1:
                    resultat = suma(valor1, valor2);
                    System.out.println("El resultat de la suma és: " + resultat);
                    break;
                case 2:
                    resultat = resta(valor1, valor2);
                    System.out.println("El resultat de la resta és: " + resultat);
                    break;
                case 3:
                    resultat = multiplicacio(valor1, valor2);
                    System.out.println("El resultat de la multiplicacio és: " + resultat);
                    break;
                case 4:
                    resultat = divisio(valor1, valor2);
                    System.out.println("El resultat de la divisio és: " + resultat);
                    break;
                case 5:
                    resultat = exponencial(valor1, valor2);
                    System.out.println("El resultat de l'exponencial és: " + resultat);
                    break;
                case 6:
                    System.out.println("Sortint... ");
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (opcioMenu != 6);

    }


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

    public static float llegirFloat(String missatge) {
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no float.");
                llegir.nextLine();
            } else {
                x = llegir.nextFloat();
                llegir.nextLine();
            }

        } while (!valorCorrecte);

        return x;
    }

    public static float suma(float x, float y) {
        float suma = x + y;
        return suma;
    }

    public static float resta(float a, float b) {
        float resta = a + b;
        return resta;
    }

    private static float multiplicacio(float num1, float num2) {
        float multiplicacio = num1 * num2;
        return multiplicacio;
    }

    private static float divisio(float numero1, float numero2) {
        float divisio = numero1 / numero2;
        return divisio;
    }

    private static float exponencial(float firstNumber, float secondNumber) {
        float exponencial = (float) Math.pow(firstNumber, secondNumber);
        return exponencial;
    }
}