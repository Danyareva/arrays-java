import java.util.Scanner;

public class OperacionesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int opcion;
        
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Posición " + i + ": ");
            array[i] = scanner.nextInt();
        }
        
        do {
            System.out.println("\n----- MENÚ DE OPERACIONES -----");
            System.out.println("1. Mostrar el array original");
            System.out.println("2. Calcular la suma de los elementos");
            System.out.println("3. Buscar el número máximo y el número mínimo");
            System.out.println("4. Invertir el array");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    mostrarArray(array);
                    break;
                    
                case 2:
                    int suma = calcularSuma(array);
                    System.out.println("La suma de todos los elementos es: " + suma);
                    break;
                    
                case 3:
                    buscarMaxMin(array);
                    break;
                    
                case 4:
                    invertirArray(array);
                    System.out.println("Array invertido:");
                    mostrarArray(array);
                    break;
                    
                case 5:
                    System.out.println("¡Gracias por usar el programa!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
            }
            
        } while (opcion != 5);
        
        scanner.close();
    }
    
    public static void mostrarArray(int[] array) {
        System.out.println("Elementos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
    
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int elemento : array) {
            suma += elemento;
        }
        return suma;
    }
    
    public static void buscarMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
    }
    
    public static void invertirArray(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        
        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
        
            inicio++;
            fin--;
        }
    }
}