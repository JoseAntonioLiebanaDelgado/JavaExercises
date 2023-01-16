package MethodsAndFunctions;

import java.util.Scanner;

public class methodsAndFunctionOne {
    public static void main(String[] args) {


        //Llamada de la funcion
        holaMundo();

        //Llamada de la funcion
        int res = sumaNumeros(5, 5);
        System.out.println(res);

        //Llamada de la funcion
        int num = 0;
        if (mayorQueCero(num)) {
            System.out.println("El numero " + num + " es mayor que cero");
        } else {
            System.out.println("El numero " + num + " es menor o igual que cero");
        }

        //Llamada de la funcion
        int min = 0;
        int max = 10;
        int aleatorio = generarNumeroAleatorio(min, max);
        System.out.println(aleatorio);
    }


    //Declaracion de la funcion
    public static void holaMundo() {
        //Implementacion de la funcion
        System.out.println("Hola Mundo");
    }

    //Declaracion de la funcion
    public static int sumaNumeros(int a, int b) {
        //Implementacion de la funcion
        int resultado = a + b;
        return resultado;
    }

    //Declaracion de la funcion
    public static boolean mayorQueCero(int num) {
        //Implementacion de la funcion
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    //Declaracion de la funcion
    public static <userAnswer> int generarNumeroAleatorio(int min, int max) {
        //Implementacion de la funcion
        return (int) Math.round(Math.random() * 10);
    }
}