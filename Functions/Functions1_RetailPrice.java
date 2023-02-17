//Desenvolupeu un programa java usant mètodes en programació modular que llegeixi un valor float (preu de cost) per
//teclat i que en retorni el preu de venda al públic incrementant el cost llegit en un +21%.
//
//        Feu com a mínim els següents mètodes:
//
//        -Un mètode per llegir un float de teclat amb control d'errors
//        -Un mètode per demanar el cost del producte a l'usuari
//        -Un mètode per calcular el preu de venda amb l'increment d'IVA +21%.

package FunctionsParaMirarEnExamen;

import java.util.Scanner;

public class Functions1_RetailPrice {
    public static void main(String[] args) {

        float nuserNumber = controlFloat("Datos incorrectos");
        System.out.println("El precio que ha introducido mas el IVA haria un total de: " + calculoPVP(nuserNumber) + " €");
    }

    private static float controlFloat(String mensaje) {
        Scanner input = new Scanner(System.in);

        float numDadoUser = 0;
        boolean correctTyping = false;

        do {
            //Iniciamos la funcion "pedirPrecio();" que simplemente nos imprime un texto pidiendo el precio al usuario.
            pedirprecio();
            correctTyping = input.hasNextFloat();
            if (!correctTyping) {
                System.out.println(mensaje);
            } else {
                numDadoUser = input.nextFloat();
                if (numDadoUser < 0) {
                    System.out.println("Error. Escribe un numero positivo");
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);
        input.close();
        return numDadoUser;
    }

    private static void pedirprecio() {
        System.out.println("Introduce un precio por favor");
    }

    private static float calculoPVP(float numero) {
        float precioPVP = numero * 1.21f;
        return precioPVP;
    }
}
