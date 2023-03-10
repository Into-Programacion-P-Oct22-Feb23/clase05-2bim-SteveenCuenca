/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo06 {

    public static void main(String[] args) {

        int[] valor1 = {100, 1000, 200, 2000, 3000};
        int[] valor2 = {1, 2, 3, 4, 5};
        
        /*for (int f = 0; f < 10; f++) {
            System.out.printf("%d\n", obtenerSuma(valor1[f], valor2[f]));
        }*/
        
        /*for (int f = 0; f < 10; f++) {
            int num1 = valor1[f];
            int num2 = valor2[f];
            System.out.printf("El valor es: %d\n", obtenerSuma(num1, num2));
        }*/
        
        for (int f = 0; f < 10; f++) {
            int num1 = valor1[f];
            int num2 = valor2[f];
            int suma = obtenerSuma(num1, num2);
            System.out.printf("El valor es: %d\n", suma);
        }
        //System.out.printf("%d\n", obtenerSuma(valor1, valor2));
        // Encontrar la suma de las posiciones
        // [0][0]
        // [1][1]
        // hasta el final

    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
