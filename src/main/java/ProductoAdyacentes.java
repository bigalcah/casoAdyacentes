import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProductoAdyacentes {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String [] args) {

        int [] array = generarArray();
        llenarArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static int productoAdayacentes(){
        return 0;
    }

    public static int[] generarArray() {

        System.out.println("Ingrese el largo de la lista");
        int largo = leer.nextInt();
        return new int[largo];
    }

    public static void llenarArray(int [] array){

        for(int i = 0; i < array.length; i++) {
            array[i] = new Random(). nextInt(-1000,1000);
        }
    }

}
