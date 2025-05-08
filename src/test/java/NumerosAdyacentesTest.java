import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosAdyacentesTest {
    @Test
    public void funcionamiento(){
        int[] array ={1, -4, 2, 2, 5, -1};
        assertEquals(10,NumerosAdyacentes.productoAdyacentes(array));
    }
    @Test
    public void Intercalados(){
        int[] array={1,-2,3,-4,5,-6};
        assertEquals(-2,NumerosAdyacentes.productoAdyacentes(array));
    }
    @Test
    public void SoloNegativos(){
        int[] array={-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        assertEquals(90,NumerosAdyacentes.productoAdyacentes(array));
    }
    @Test
    public void PrimeraSeaMayor(){
        int[] array={1000,999,3,4,-6,5};
        assertEquals(999000,NumerosAdyacentes.productoAdyacentes(array));
    }
    @Test
    public void SoloCeros(){
        int[] array={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(0,NumerosAdyacentes.productoAdyacentes(array));
    }
    @Test
    public void ArrayUnDigito(){
        int[] array={1};
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            NumerosAdyacentes.validarArray(array);
        });
        assertEquals("el array debe tener 2 elementos como minimo",ex.getMessage());
    }
    @Test
    public void ArrayVacio(){
        int[] array={};
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            NumerosAdyacentes.validarArray(array);
        });
        assertEquals("el array debe tener 2 elementos como minimo",ex.getMessage());
    }
}
