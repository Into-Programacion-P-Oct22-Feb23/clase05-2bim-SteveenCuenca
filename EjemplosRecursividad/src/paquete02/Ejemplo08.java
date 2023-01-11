/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el limite que desea para su arreglo");
        int tamanio = entrada.nextInt();
        int[] arreglo = new int[tamanio];

        for (int f = 0; f < arreglo.length; f++) {
            System.out.println("-------------------------------------");
            System.out.println("Ingrese los valores para su arreglo");
            arreglo[f] = entrada.nextInt();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("La suma de los valores es: %d\n", misterio(arreglo, tamanio));

    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
