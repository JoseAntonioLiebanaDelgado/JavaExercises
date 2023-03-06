/*
Consultar tota la biblioteca i que imprimeixi tots els títols per consola.
Consultar si existeix un títol en concret especificat per l'usuari.
Inserir nous llibres.
Eliminar un llibre (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Modificar el títol d'un llibre actual (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Eliminar tots els llibres (reiniciar l'ArrayList)
Sortir.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    final static String MENU_PRINCIPAL = "\n\t1. Consultar Biblioteca\n\t2. Consultar títol\n\t3. Inserir llibre\n\t4. Eliminar llibre\n\t5. Modificar llibre\n\t6. Reiniciar Biblioteca\n\t7. Sortir";

    public static void main (String[] args){
        ArrayList<String> llibres;
        llibres = bibliotecaInit();

        int opcioMenuPrincipal = 0;

        do {
            System.out.println("Benvingut/da al programa");
            opcioMenuPrincipal = llegirEnter(MENU_PRINCIPAL, 1, 7);

            switch (opcioMenuPrincipal) {
                case 1:
                    imprimirBiblioteca(llibres);
                    break;
                case 2:
                    //TODO: consultarLlibre(llibres);
                    break;
                case 3:
                    //TODO: llibres = inserirLlibre(llibres);
                    break;
                case 4:
                    //TODO: llibres = eliminarLlibre(llibres);
                    break;
                case 5:
                    //TODO: llibres = modificarLlibre(llibres);
                    break;
                case 6:
                    llibres = reiniciarBiblioteca(llibres);
                    break;
                case 7:
                    llibres = reiniciarBiblioteca(llibres);
                    System.out.println("Adéu");
                    break;
            }
        }while(opcioMenuPrincipal != 7);
    }

    /**
     * Mètode per inserir alguns llibres dins de la Biblio
     * @return Biblioteca inicialitzada
     */
    private static ArrayList<String> bibliotecaInit() {
        ArrayList<String> biblioteca = new ArrayList<>();
        biblioteca.add("Tirant Lo Blanc");
        biblioteca.add("Solitud");
        biblioteca.add("El Quixot");
        biblioteca.add("Sapiens");
        biblioteca.add("Teo va a l'escola");
        biblioteca.add("Jumanji");
        biblioteca.add("Spiderman: No way home");
        biblioteca.add("Harry Potter i el calze de foc");

        return biblioteca;
    }

    /**
     * Reiniciar biblioteca
     * @param llibres
     * @return
     */
    private static ArrayList<String> reiniciarBiblioteca(ArrayList<String> llibres) {
        llibres.clear();
        return llibres;
    }

    /**
     * Mètode per a imprimir tots els títols dels llibres per pantalla
     * @param llibres
     */
    private static void imprimirBiblioteca(ArrayList<String> llibres) {
        for (String llibre : llibres) {
            System.out.println(llibre);
        }
    }








    /**
     * Aquest mètode serveix per llegir un enter de teclat amb control d'errors.
     * @param menuPrincipal: Serveix per passar-li el text a mostrar del menú.
     * @param min: Valor mínim acceptat
     * @param max: Valor màxim acceptat
     * @return : retorna un enter dins del domini de valors
     */
    public static int llegirEnter(String menuPrincipal, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int opcio = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(menuPrincipal);

            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: No has introduït un enter");
                llegir.nextLine();
            }else{
                opcio = llegir.nextInt();
                llegir.nextLine();

                if (opcio < min || opcio > max){
                    System.out.println("ERROR: Opció no correcte");
                    valorCorrecte = false;
                }
            }

        }while(!valorCorrecte);

        return opcio;
    }
}
