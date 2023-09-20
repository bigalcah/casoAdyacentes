public class ProductoAdyacente {
    public static int productoAdyacente (int[] array){
        int ProductoMayor = -1000;
        for (int indice = 0; indice < (array.length-1); indice++){
            if ((array[indice]*array[indice+1])>ProductoMayor){
                ProductoMayor = (array[indice]*array[indice+1]);
            }
        }
        return ProductoMayor;
    }
    //LIsto para merge
}
