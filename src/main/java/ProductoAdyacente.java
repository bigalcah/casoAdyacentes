import java.util.Random;
import java.util.Scanner;

public class ProductoAdyacente {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String [] args) {}

    public static int[] generarArray() {

        int largo;

        do {

            System.out.print("Ingrese el largo de la lista: ");
            largo = leer.nextInt();

        } while (!validarLenght(largo));

        return new int[largo];
    }

    public static void llenarArray(int [] array){

        for(int i = 0; i < array.length; i++) {
            array[i] = new Random(). nextInt(-1000,1000);
    public static int productoAdyacente (int[] array){
        int ProductoMayor = -1000;
        for (int indice = 0; indice < (array.length-1); indice++){
            if ((array[indice]*array[indice+1])>ProductoMayor){
                ProductoMayor = (array[indice]*array[indice+1]);
            }

        }

    }

    public static boolean validarLenght(int largo){

        if (largo < 2 || largo > 20) {
            return false;
        }

        return true;
    }

}
