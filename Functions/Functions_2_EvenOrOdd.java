//Usant mètodes de la programació modular, desenvolupeu un programa en Java capaç de comprovar si donat un número enter, aquest és parell o senar.
//
//        Feu com a mínim els següents mètodes:
//
//        Un mètode per obtenir un int amb control d'errors
//        Un mètode que comprovi si el número introduït és parell (retorna True) o senar (retorna False)
//        El mètode del Main principal que crida i usa als dos mètodes anteriors

package Functions;

import java.util.Scanner;

public class Functions_2_EvenOrOdd {

    public static void main(String[] args) {

        //CUANDO CREAS UNA FUNCION SIEMPRE TIENEN EL CONTAINER VACIO! Y SE LE DA VALOR CUANDO SE LA LLAMA!

        // Aquí estamos diciendo que la variable "userNumber" es igual a la función que hace el control de errores (Que devuelve el valor correcto).
        // Osea que el número correcto que esta en "llegirInt", lo igualamos a "userNumber".
        // E a ser que "userNumber" es igual al número correcto que ha dado el usuario.
        int userNumber = llegirInt("Introduce un numero entero por favor", "Eso no es un numero entero");
        //Aqui decimos que la variable "resultadoFinal" es igual a la funcion boleana (parOInpar) que nos devuelve true o false.
        //Para que esta funcion nos devuelva true o false, debemos de darle un valor, y ese  valor es "userNumber".
        boolean resultadoFinal = parOInpar(userNumber);
        System.out.println(resultadoFinal);
    }

    /**
     * ÉSTA FUNCIÓN DICE: SI EN LA BOLSA (NúMERO) HAY UN NÚMERO PAR DE "LO QUE SEA" DEVUELVE TRUE, Y SINO DEVUELVE FALSE.
     * LA VARIABLE "NÚMERO" ESTA VACÍA, SE LE DARÁ VALOR CUANDO LLAMEMOS A LA FUNCIÓN. SOLO SIRVE DE CONTENEDOR EN ESTA FUNCIÓN.
     *
     * @param numero
     * @return Nos devuelve un true o un false.
     */
    private static boolean parOInpar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Éste método hace un control de errores de tipo entero.
     *
     * @param mensajeParaPedirDatosAlUser
     * @param mensajeDeErrorDeTipo
     * @return
     */
    private static int llegirInt(String mensajeParaPedirDatosAlUser, String mensajeDeErrorDeTipo) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.println(mensajeParaPedirDatosAlUser);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte) {
                System.out.println(mensajeDeErrorDeTipo);
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
//                if (x < min || x > max) {
//                    System.out.println(opcion_invalida);
                valorCorrecte = false;
            }
//            }
        } while (!valorCorrecte);
        return x;
    }
}
