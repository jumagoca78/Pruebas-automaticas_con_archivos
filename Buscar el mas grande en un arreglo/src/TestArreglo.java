import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Estas librerias son para el majejo de archivos
//import java.io.*;
//Libreria para el maejo de arreglos dinámicos
import java.util.ArrayList;
//Libreria para el manejo de textos o STring
import java.util.StringTokenizer;

import org.junit.Test;

public class TestArreglo {

    @Test
    public void testBuscarMaximoArchivoDatos() throws Exception {
        String line;
        BufferedReader rdr = new BufferedReader(new FileReader("testdata.txt"));
        
        while ((line=rdr.readLine()) != null){
            if (line.startsWith("#")){
                continue;
            }
            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreTokens()){
                continue;
            }
            String val = st.nextToken();
            int esperado = Integer.parseInt(val);

            ArrayList<Integer> arreglo = new ArrayList<Integer>();
            while (st.hasMoreTokens()){
                val = st.nextToken();
                arreglo.add(Integer.parseInt(val));
            }

            //aqui empiezan las pruebas
            int[] arregloPruebas = new int[arreglo.size()];
            for (int i=0; i<=arreglo.size()-1; i++){
                arregloPruebas[i] = arreglo.get(i);
            }
            int resultado = Arreglos.buscarMaximo(arregloPruebas);
            assertEquals(esperado, resultado);    
        }
    }
     
    @Test
    public void testBuscarMaximoalInicioDelArreglo() {
        int[] arreglo = {9,8,7};
        int resultado = Arreglos.buscarMaximo(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMaximoAlenmedioDelArreglo() {
        int[] arreglo = {8,9,7};
        int resultado = Arreglos.buscarMaximo(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMaximoAlFinalDelArreglo() {
        int[] arreglo = {8,7,9};
        int resultado = Arreglos.buscarMaximo(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMaximoNegativosArreglo() {
        int[] arreglo = {-8,-7,-9};
        int resultado = Arreglos.buscarMaximo(arreglo);
        int esperado = -7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMaximoUnValorEnElArreglo() {
        int[] arreglo = {14212};
        int resultado = Arreglos.buscarMaximo(arreglo);
        int esperado = 14212;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMaximoArregloVacio() {
        int[] arreglo = {};
        try {
            Arreglos.buscarMaximo(arreglo);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        
    }

    @Test
    public void testBuscarMinimoalInicioDelArreglo() {
        int[] arreglo = {7,8,9};
        int resultado = Arreglos.buscarMinimo(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testBuscarMinimoAlenmedioDelArreglo() {
        int[] arreglo = {8,7,9};
        int resultado = Arreglos.buscarMinimo(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMinimoAlFinalDelArreglo() {
        int[] arreglo = {9,8,7};
        int resultado = Arreglos.buscarMinimo(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testBuscarMinimoNegativosArreglo() {
        int[] arreglo = {-8,-7,-9};
        int resultado = Arreglos.buscarMinimo(arreglo);
        int esperado = -9;
        assertEquals(esperado, resultado);
    }
}
