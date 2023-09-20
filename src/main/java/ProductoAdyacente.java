import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProductoAdyacente {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String [] args) {
        int [] array = generarArray();
        llenarArray(array);
        System.out.println(productoAdyacente(array));
    }

    public static int[] generarArray() {
        int largo;
        do {
            System.out.print("Ingrese el largo de la lista (2-20): ");
            largo = leer.nextInt();
            if (validarLenght(largo)){
                System.out.println("Arreglo generado correctamente");
            }else {
                System.out.println("\nLargo fuera de los limites, intente de nuevo");
            }
        } while (!validarLenght(largo));
        return new int[largo];
    }

    public static void llenarArray(int [] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(-1000, 1000);
        }
        System.out.print("Array generada: ");
        System.out.println(Arrays.toString(array));
    }
    public static int productoAdyacente (int[] array){

        int ProductoMayor = 0;
        for (int indice = 0; indice < (array.length-1); indice++){
            if ((array[indice]*array[indice+1])>ProductoMayor || indice == 0){
                ProductoMayor = (array[indice]*array[indice+1]);
            }

        }
        return ProductoMayor;
    }
    public static boolean validarLenght(int largo){
        if (largo < 2 || largo > 20) {
            return false;
        }
        return true;
    }
}
