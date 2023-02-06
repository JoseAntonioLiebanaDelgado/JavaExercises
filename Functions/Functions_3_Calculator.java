//Desenvolupa un codi java usant programació modular amb mètodes que simuli una calculadora. Trobaràs l'esquelet del programa adjunt en aquesta tasca.
//
//        Crea un mètode per cada opció del menú principal i també pel control d'errors.

package Functions;

import java.util.Scanner;

public class Functions_3_Calculator {
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
                    System.out.println("El resultat de la multiplicació és: " + resultat);
                    break;
                case 4:
                    resultat = divisió(valor1, valor2);
                    System.out.println("El resultat de la divisió és: " + resultat);
                    break;
                case 5:
                    resultat = exponencial(valor1, valor2);
                    System.out.println("El resultat del exponencial és: " + resultat);
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

    /**
     * Aquesta funció serveix per fer un control de errors de tipus Int.
     *
     * @param missatge
     * @param min
     * @param max
     * @return
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

    /**
     * Aquesta funció serveix per fer un control de errors de tipus Float.
     *
     * @param missatge
     * @return
     */
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

    /**
     * Funció per fer una suma.
     *
     * @param x
     * @param y
     * @return
     */
    public static float suma(float x, float y) {
        float suma = x + y;
        return suma;
    }

    /**
     * Funció per fer una resta.
     *
     * @param a
     * @param b
     * @return
     */
    private static float resta(float a, float b) {
        float resta = a - b;
        return resta;
    }

    /**
     * Funció per fer una multiplicació.
     *
     * @param num1
     * @param num2
     * @return
     */
    private static float multiplicacio(float num1, float num2) {
        float mult = num1 * num2;
        return mult;
    }

    /**
     * Funció per fer una divisió.
     *
     * @param numero1
     * @param numero2
     * @return
     */
    private static float divisió(float numero1, float numero2) {
        float div = numero1 / numero2;
        return div;
    }

    /**
     * Funció per obtenir l'exponencial.
     *
     * @param abc
     * @param cba
     * @return
     */
    private static float exponencial(float abc, float cba) {
        float exponencial = (float) Math.pow(abc, cba);
        return exponencial;
    }
}





















