import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductoAdyacenteTest {

    int[] arreglo;
    int[] arreglo2;
    int[] arreglo3;
    int[] arreglo4;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arreglo = new int[]{1, -4, 2, 2, 5, -1};
        arreglo2 = new int[]{-34, 4, 13, 32, 1000, 1000, 3, 6, 2};
        arreglo3 = new int[]{-2, 4, -7, 91, -3, 4, -1};
        arreglo4 = new int[]{-1, -43, -131, -313, -234, -1000, -1000, -324, -154, -523, -987, -412, -523, -567, -987, -654, -123, -74, -76, -98};
    }

    @Test
    void ProductoAdyacente(){
        assertEquals(10, ProductoAdyacente.productoAdyacente(arreglo));
        assertEquals(1000000, ProductoAdyacente.productoAdyacente(arreglo2));
        assertEquals(-4, ProductoAdyacente.productoAdyacente(arreglo3));
        assertEquals(1000000, ProductoAdyacente.productoAdyacente(arreglo4));
    }
}