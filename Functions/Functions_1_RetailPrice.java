//Desenvolupeu un programa java usant mètodes en programació modular que llegeixi un valor float (preu de cost)
//per teclat i que en retorni el preu de venda al públic incrementant el cost llegit en un +21%.
//
//        Feu com a mínim els següents mètodes:
//
//        Un mètode per llegir un float de teclat amb control d'errors
//        Un mètode per demanar el cost del producte a l'usuari
//        Un mètode per calcular el preu de venda amb l'increment d'IVA +21%.
//        Mètode main

package Functions;

import java.util.Scanner;

public class Functions_1_RetailPrice {
    public static void main(String[] args) {

        demanarCost();
        mostrarPrecioPVP();
    }

    /**
     * Ésta función se encarga de pedir al usuario un número.
     *
     * @return Nos retorna el número introducido por el usuario una vez ha pasado por el control de errores.
     */
    private static float demanarCost() {
        float numeroDelUsuarioParaPasarElControlDeErrores = llegirFloat("Introduce un precio en formato decimal, por favor", "Error, tipo de datos no correctos");
        return numeroDelUsuarioParaPasarElControlDeErrores; //Ya a pasado el control de errores
    }

    /**
     * Función control de errores float. Al crear la funcion debemos de darle mediante los parametros los datos que necesita.
     * En este caso necesita 2 contenedores (variables del tipo que le corresponda) que estan vacios.
     * Y estos contenedores se llenarán cuándo introduzcamos su valor (int, String, float, etc...) al llamar a la función!
     *
     * @param mensajeParaPedirDatosAlUsuario
     * @param mensajeDeErrorTipoDeDatoIncorrecto
     * @return Nos devuelve el valor correcto
     */
    private static float llegirFloat(String mensajeParaPedirDatosAlUsuario, String mensajeDeErrorTipoDeDatoIncorrecto) {
        Scanner llegir = new Scanner(System.in);
        float numeroQuePidoAlUsuario = 0;
        boolean valorCorrecte = false;
        do {
            System.out.print(mensajeParaPedirDatosAlUsuario);
            valorCorrecte = llegir.hasNextFloat();
            if (!valorCorrecte) {
                System.out.println(mensajeDeErrorTipoDeDatoIncorrecto);
                llegir.nextLine();
            } else {
                numeroQuePidoAlUsuario = llegir.nextFloat();
                llegir.nextLine();
            }
        } while (!valorCorrecte);
        return numeroQuePidoAlUsuario;//Que ha pasado el control de errores
    }

    /**
     * Ésta función hace el cálculo requerido. En éste caso añadir I.V.A al precio inrtoducido por el usuario.
     *
     * @return Devuelve el precio introducido por el usuario multiplicado por 1.21 (PVP).
     */
    private static float mostrarPrecioPVP() {
        float numeroMasLuegoElIVA = 0; //variable vacia
        numeroMasLuegoElIVA = demanarCost(); //llamamos a la funcion que pide un numero por lo tanto ahora numeroMasLuegoElIVA
        // es el numero del usuario que a pasado el control de errores
        numeroMasLuegoElIVA = (float) (numeroMasLuegoElIVA * 1.21); //ahora multiplicamos este numero por 1.21
        return numeroMasLuegoElIVA; //Devolvemos el numero multiplicado por 1.21, e a ser el resultado.
    }
}
