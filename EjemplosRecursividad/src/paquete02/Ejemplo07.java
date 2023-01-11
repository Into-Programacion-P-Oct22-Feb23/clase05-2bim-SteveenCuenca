/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo07 {

    public static void main(String[] args) {
        int[] valores = {2,3,4,5,6,7,8};
        int[] potencias = {2, 3};
        // Por cada posición del arreglo valores
        // obtener su potencia, en función de los valores
        // del arreglo potencias
        // Ejemplo:
        // posición 0 de valores es 2
        // se debería presentar el resultado de
        // 2 elevado a la potencia 2 (cuadrado)
        // 2 elevado a la potencia 3 (cubo)
        for (int f = 0; f < valores.length; f++) {
            for (int c = 0; c < potencias.length; c++) {
                int base = valores[f];
                int exponente = potencias[c];
                System.out.printf("El valor %d elevado a la potencia %d es:"
                        + " %d\n", base, exponente, 
                        obtenerPotencia(base, exponente));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            
        }
        
    }

    public static int obtenerPotencia(int base, int exponente) {
        
        if (exponente == 1) {
            return base;
        } else{
            
            return base * obtenerPotencia(base, exponente - 1);
        }
    }

}
