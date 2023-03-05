package ahora;

import java.util.Scanner;

public class LiebanaJoseAntonio_Calculadora {
    public static void main(String[] args) {

        float valor1 = 0.0f , valor2 = 0.0f, resultat = 0.0f;
        final String MISSATGE_2 = "Escriu el segon valor: ";
        final String MENU_PRINCIPAL = "Les opcions del menú són:\n" +
                "1- Suma\n" +
                "2- Resta\n" +
                "3- Multplicació\n" +
                "4- Divisió\n" +
                "5- Exponencial\n" +
                "6- Sortir";
        int opcioMenu = 0;
        System.out.println("Benvingut al programa de calculadora.");

        do {
            valor1 = llegirFloat("Escriu el primer valor: ");
            valor2 = llegirFloat(MISSATGE_2);

            opcioMenu = llegirEnter(MENU_PRINCIPAL, 1, 6,"ERROR: Valor no enter.","Opcion no valida.");

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
                    resultat = multiplicacion(valor1, valor2);
                    System.out.println("El resultat de la multiplicació és: " + resultat);
                    break;
                case 4:
                    resultat = division(valor1, valor2);
                    System.out.println("El resultat de la divisió és: " + resultat);
                    break;
                case 5:
                    resultat = exponencial(valor1, valor2);
                    System.out.println("El resultat de la exponencial és: " + resultat);
                    break;
                case 6:
                    System.out.println("Sortim");
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (opcioMenu != 6);

    }//Llave cierre main

    /**
     * Esta funcion sirve para leer un numero entero con control de errores (sin limites)
     */
    public static int llegirEnter(String missatge, int min, int max, String mensaje_error, String opcion_invalida) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte) {
                System.out.println(mensaje_error);
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println(opcion_invalida);
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        llegir.close();
        return x;
    }

    /**
     * Esta funcion sirve para leer un numero decimal de tipo float con control de errores (sin limites)
     */
    public static float llegirFloat(String missatge) {
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (valorCorrecte) {
                x = llegir.nextFloat();
                llegir.nextLine();
            } else {
                llegir.nextLine();
                System.out.println("ERROR: Valor no float.");
            }

        } while (!valorCorrecte);
        return x;
    }

    /**
     * suma
     *
     * @param primer_num
     * @param y
     * @return
     */
    public static float suma(float primer_num, float y) {
        float resultado_suma = primer_num + y;
        return resultado_suma;
    }

    /**
     * resta
     *
     * @param x
     * @param y
     * @return
     */
    public static float resta(float x, float y) {
        float resta = x - y;
        return resta;
    }

    /**
     * multiplicacio
     *
     * @param x
     * @param y
     * @return
     */
    public static float multiplicacion(float x, float y) {
        float multiplicacio = x * y;
        return multiplicacio;
    }

    /**
     * divisio
     *
     * @param x
     * @param y
     * @return
     */
    public static float division(float x, float y) {
        float divisio = x / y;
        return divisio;
    }

    /**
     * exponencial
     *
     * @param x
     * @param y
     * @return
     */
    public static float exponencial(float x, float y) {
        float exponencial = (float) Math.pow(x, y);
        return exponencial;
    }
}