import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaProductos = new ArrayList<>();
        int opcion;
        
        do {
            System.out.println("\n----- LISTA DE COMPRAS -----");
            System.out.println("1. Agregar un producto a la lista");
            System.out.println("2. Mostrar la lista de compras");
            System.out.println("3. Eliminar un producto de la lista");
            System.out.println("4. Buscar un producto en la lista");
            System.out.println("5. Ordenar la lista de productos alfabéticamente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    agregarProducto(scanner, listaProductos);
                    break;
                    
                case 2:
                    mostrarLista(listaProductos);
                    break;
                    
                case 3:
                    eliminarProducto(scanner, listaProductos);
                    break;
                    
                case 4:
                    buscarProducto(scanner, listaProductos);
                    break;
                    
                case 5:
                    ordenarLista(listaProductos);
                    break;
                    
                case 6:
                    System.out.println("¡Gracias por usar la lista de compras!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.");
            }
            
        } while (opcion != 6);
        
        scanner.close();
    }
    
    public static void agregarProducto(Scanner scanner, ArrayList<String> lista) {
        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        lista.add(producto);
        System.out.println("¡Producto \"" + producto + "\" agregado con éxito!");
    }
    
    public static void mostrarLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de compras está vacía.");
        } else {
            System.out.println("Lista de compras:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i));
            }
        }
    }
    
    public static void eliminarProducto(Scanner scanner, ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de compras está vacía. No hay productos para eliminar.");
            return;
        }
        
        System.out.print("Ingrese el nombre del producto que desea eliminar: ");
        String producto = scanner.nextLine();
        
        boolean eliminado = lista.remove(producto);
        if (eliminado) {
            System.out.println("¡Producto \"" + producto + "\" eliminado con éxito!");
        } else {
            System.out.println("El producto \"" + producto + "\" no se encuentra en la lista.");
        }
    }
    

    public static void buscarProducto(Scanner scanner, ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de compras está vacía. No hay productos para buscar.");
            return;
        }
        
        System.out.print("Ingrese el nombre del producto que desea buscar: ");
        String producto = scanner.nextLine();
        
        int indice = lista.indexOf(producto);
        if (indice != -1) {
            System.out.println("El producto \"" + producto + "\" se encuentra en la posición " + (indice + 1) + " de la lista.");
        } else {
            System.out.println("El producto \"" + producto + "\" no se encuentra en la lista.");
        }
    }
    
    public static void ordenarLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de compras está vacía. No hay productos para ordenar.");
            return;
        }
        
        Collections.sort(lista);
        System.out.println("¡Lista ordenada alfabéticamente!");
        mostrarLista(lista);
    }
}