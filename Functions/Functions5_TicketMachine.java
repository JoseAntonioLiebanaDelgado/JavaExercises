//        Demanar tipus de bitllet
//        Demanar zona
//        Calcular preu
//        Cobrar

import java.util.Scanner;

public class MaquinaBilletes_11_2_23 {
    public static void main(String[] args) {

        final String MENU = "Introdueix una de les seguents opcions: \n" +
                " 1. Bitllet senzill\n" +
                " 2. TCasual\n" +
                " 3. TUsual\n" +
                " 4. TFamiliar\n" +
                " 5. TJove";

        float[] preuBitllets = {2.40f, 11.35f, 40.00f, 10.00f, 80.00f};
        System.out.println();
        int numeroBitllets = opcioBitllet(MENU);
        int numeroZonas = opcioZones();
        float preuBitlletsEscollits = calculaPreu(preuBitllets, numeroBitllets, numeroZonas);
        System.out.println("El preu del bitllet es de: " + preuBitlletsEscollits);

        System.out.println(cobrament(preuBitlletsEscollits));
    }


    public static int controlInputInt(String missatge, int min, int max) {
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

    private static int opcioBitllet(String text) {
        int numero = controlInputInt(text, 1, 5);
        return numero;
    }

    private static int opcioZones() {
        int numero = controlInputInt("Selecciona zona si us plau: \n 1 Zona \n 2 Zones \n 3 Zones", 1, 3);
        return numero;
    }

    private static float calculaPreu(float preuBitllet[], int numDelBitllet, int numDeLaZona) {
        int opcioCalcul = 0;
        float preuPer2Zones = 1.3125f;
        float preuPer3Zones = 1.8443f;

        float precioResultado = 0;

        switch (numDelBitllet) {
            case 1:
                if (numDeLaZona == 1) {
                    precioResultado = preuBitllet[0];
                } else if (numDeLaZona == 2) {
                    precioResultado = preuBitllet[0] * preuPer2Zones;
                } else if (numDeLaZona == 3) {
                    precioResultado = preuBitllet[0] * preuPer3Zones;
                } else {
                    System.out.println("Entra else de bitllet Sencill");
                }
                return precioResultado;

            case 2:
                if (numDeLaZona == 1) {
                    precioResultado = preuBitllet[1];
                } else if (numDeLaZona == 2) {
                    precioResultado = preuBitllet[1] * preuPer2Zones;
                } else if (numDeLaZona == 3) {
                    precioResultado = preuBitllet[1] * preuPer3Zones;
                } else {
                    System.out.println("Entra else de bitllet TCasual");
                }
                return precioResultado;

            case 3:
                if (numDeLaZona == 1) {
                    precioResultado = preuBitllet[2];
                } else if (numDeLaZona == 2) {
                    precioResultado = preuBitllet[2] * preuPer2Zones;
                } else if (numDeLaZona == 3) {
                    precioResultado = preuBitllet[2] * preuPer3Zones;
                } else {
                    System.out.println("Entra else de bitllet TUsual");
                }
                return precioResultado;

            case 4:
                if (numDeLaZona == 1) {
                    precioResultado = preuBitllet[3];
                } else if (numDeLaZona == 2) {
                    precioResultado = preuBitllet[3] * preuPer2Zones;
                } else if (numDeLaZona == 3) {
                    precioResultado = preuBitllet[3] * preuPer3Zones;
                } else {
                    System.out.println("Entra else de bitllet TFamiliar");
                }
                return precioResultado;

            case 5:
                if (numDeLaZona == 1) {
                    precioResultado = preuBitllet[4];
                } else if (numDeLaZona == 2) {
                    precioResultado = preuBitllet[4] * preuPer2Zones;
                } else if (numDeLaZona == 3) {
                    precioResultado = preuBitllet[4] * preuPer3Zones;
                } else {
                    System.out.println("Entra else de bitllet TJove");
                }
                return precioResultado;

        }
        return precioResultado;
    }

    private static float cobrament(float preuTiquet) {

        float valorIntroducidoUserParaPagar = controlInputFloat("Introduzca efectivo por favor", 0, 200);
        boolean comprovacion = comprovarMoneda(valorIntroducidoUserParaPagar);
        float resultadoFinal = 0;
        do {
            if (comprovacion == true) {
                resultadoFinal = preuTiquet - valorIntroducidoUserParaPagar;
            } else {
                System.out.println("Entra else");
            }
            return resultadoFinal;
        } while (resultadoFinal >= 0);
    }

    private static float controlInputFloat(String missatge, float min, float max) {
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no float.");
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextFloat();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println("Valor fora de rang");
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        return x;
    }

    private static boolean comprovarMoneda(float moneda) {

        final float[] monedaValida = {0.01f, 0.02f, 0.05f, 0.10f, 0.20f, 0.50f, 1.00f, 2.00f, 5.00f, 10.00f, 20.00f, 50.00f, 100.00f, 200.00f};
        //boolean monedaCorrecte = false;
        for (int i = 0; i < monedaValida.length; i++) {
            if (monedaValida[i] == moneda) {
                return true;
            }
        }
        return false;
    }
}