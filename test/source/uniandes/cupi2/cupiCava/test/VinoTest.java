/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_cupiCava
 * Autor: Equipo Cupi2 2020
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.cupiCava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import uniandes.cupi2.cupiCava.mundo.Vino;

/**
 * Clase usada para verificar que los métodos de la clase Vino estén correctamente implementados.
 */
public class VinoTest
{
    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * Clase donde se harán las pruebas.
     */
    private Vino vino1;

    /**
     * Clase donde se harán las pruebas.
     */
    private Vino vino2;

    /**
     * Clase donde se harán las pruebas.
     */
    private Vino vino3;

    /**
     * Clase donde se harán las pruebas.
     */
    private Vino vino4;

    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Escenario 1: Construye dos vinos
     */
    @Before
    public void setupEscenario1( )
    {
        vino1 = new Vino( "nombre1", Vino.BARRIL, 1991, 10, Vino.ABOCADO, Vino.BLANCO, "lugar1", "imagen1" );
        vino2 = new Vino( "nombre2", Vino.BOTELLA, 1992, 51, Vino.DULCE, Vino.ROSADO, "lugar2", "imagen2" );
        vino3 = new Vino( "nombre3", Vino.BOTELLA, 1993, 30, Vino.SEMI_DULCE, Vino.TINTO, "lugar3", "imagen3" );
        vino4 = new Vino( "nombre1", Vino.BARRIL, 1991, 10, Vino.ABOCADO, Vino.BLANCO, "lugar1", "imagen1" );
    }

    /**
     * Prueba 1: Se encarga de verificar el método constructor de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * Vino<br>
     * darNombre<br>
     * darPresentacion<br>
     * darAnhoElaboracion<br>
     * darContenidoAzucar<br>
     * darTipo<br>
     * darColor<br>
     * darImagen<br>
     * <b> Caso de prueba 1:</b><br>
     * Construye correctamente el vino, cada uno de los valores corresponde al esperado.<br>
     */
    @Test
    public void testVino( )
    {
        assertNotNull( "El nombre del vino no fue inicializado.", vino1.darNombre( ) );
        assertEquals( "El nombre del vino no corresponde.", "nombre1", vino1.darNombre( ) );

        assertNotNull( "La presentación del vino no fue inicializada.", vino1.darPresentacion( ) );
        assertEquals( "La presentación del vino no corresponde.", Vino.BARRIL, vino1.darPresentacion( ) );

        assertNotNull( "El año de elaboración del vino no fue inicializado.", vino1.darAnhoElaboracion( ) );
        assertEquals( "El año de elaboración del vino no corresponde.", 1991, vino1.darAnhoElaboracion( ) );

        assertNotNull( "El contenido en azúcar del vino no fue inicializado.", vino1.darContenidoAzucar( ) );
        assertEquals( "El contenido en azúcar del vino no corresponde.", 10.0, vino1.darContenidoAzucar( ), 0.01 );

        assertNotNull( "El tipo del vino no fue inicializado.", vino1.darTipo( ) );
        assertEquals( "El tipo del vino no corresponde.", Vino.ABOCADO, vino1.darTipo( ) );

        assertNotNull( "El color del vino no fue inicializado.", vino1.darColor( ) );
        assertEquals( "El color del vino no corresponde.", Vino.BLANCO, vino1.darColor( ) );

        assertNotNull( "El lugar de origen del vino no fue inicializado.", vino1.darLugarOrigen( ) );
        assertEquals( "El lugar de origen del vino no corresponde.", "lugar1", vino1.darLugarOrigen( ) );

        assertNotNull( "La imagen del vino no fue inicializado.", vino1.darImagen( ) );
        assertEquals( "La imagen del vino no corresponde.", "imagen1", vino1.darImagen( ) );
    }

    /**
     * Prueba 2: Se encarga de verificar el método compararPorNombre de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * compararPorNombre<br>
     * <b> Casos de prueba:</b><br>
     * 1. El vino1 es igual al vino4 con respecto al nombre.<br>
     * 2. El vino1 es menor al vino2 con respecto al nombre.<br>
     * 3. El vino3 es mayor al vino2 con respecto al nombre.
     */
    @Test
    public void testCompararPorNombre( )
    {

        assertEquals( "La comparación debería tener como resultado 0 porque los nombres son iguales.", 0, vino1.compararPorNombre( vino4 ) );
        assertEquals( "La comparación debería tener como resultado -1 porque el vino1 es menor a vino2.", -1, vino1.compararPorNombre( vino2 ) );
        assertEquals( "La comparación debería tener como resultado 1 porque el vino3 es mayor a vino2.", 1, vino3.compararPorNombre( vino2 ) );
    }

    /**
     * Prueba 3: Se encarga de verificar el método compararPorPresentacion de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * compararPorPresentacion<br>
     * <b> Casos de prueba:</b><br>
     * 1. El vino1 es igual al vino4 con respecto a la presentación.<br>
     * 2. El vino1 es menor al vino2 con respecto a la presentación.<br>
     * 3. El vino3 es igual al vino1 con respecto a la presentación.
     */
    public void testCompararPorPresentacion( )
    {

        assertEquals( "La comparación debería tener como resultado 0 porque las presentaciones son iguales.", 0, vino1.compararPorPresentacion( vino4 ) );
        assertEquals( "La comparación debería tener como resultado -1 porque el vino1 es menor a vino2.", -1, vino1.compararPorPresentacion( vino2 ) );
        assertEquals( "La comparación debería tener como resultado 1 porque el vino3 es mayor a vino1.", 1, vino3.compararPorPresentacion( vino1 ) );
    }

    /**
     * Prueba 4: Se encarga de verificar el método compararPorAnhoElaboracion de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * compararPorAnhoElaboracion<br>
     * <b> Casos de prueba:</b><br>
     * 1. El vino1 es igual al vino4 con respecto al año de elaboración.<br>
     * 2. El vino1 es menor al vino2 con respecto al año de elaboración.<br>
     * 3. El vino3 es igual al vino1 con respecto al año de elaboración.
     */
    public void testCompararPorAnhoElaboracion( )
    {

        assertEquals( "La comparación debería tener como resultado 0 porque los años de elaboración son iguales.", 0, vino1.compararPorAnhoElaboracion( vino4 ) );
        assertEquals( "La comparación debería tener como resultado -1 porque el vino1 es menor a vino2.", -1, vino1.compararPorAnhoElaboracion( vino2 ) );
        assertEquals( "La comparación debería tener como resultado 1 porque el vino3 es mayor a vino1.", 1, vino3.compararPorAnhoElaboracion( vino1 ) );
    }

    /**
     * Prueba 5: Se encarga de verificar el método compararPorContenidoAzucar de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * compararPorContenidoAzucar<br>
     * <b> Casos de prueba:</b><br>
     * 1. El vino1 es igual al vino4 con respecto al contenido en azúcar.<br>
     * 2. El vino1 es menor al vino2 con respecto al contenido en azúcar.<br>
     * 3. El vino3 es igual al vino1 con respecto al contenido en azúcar.
     */
    public void testCompararPorContenidoAzucar( )
    {

        assertEquals( "La comparación debería tener como resultado 0 porque los contenidos en azúcar son iguales.", 0, vino1.compararPorContenidoAzucar( vino4 ) );
        assertEquals( "La comparación debería tener como resultado -1 porque el vino1 es menor a vino2.", -1, vino1.compararPorContenidoAzucar( vino2 ) );
        assertEquals( "La comparación debería tener como resultado 1 porque el vino3 es mayor a vino1.", 1, vino3.compararPorContenidoAzucar( vino1 ) );
    }

    /**
     * Prueba 6: Se encarga de verificar el método compararPorTipo de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * compararPorTipo<br>
     * <b> Casos de prueba:</b><br>
     * 1. El vino1 es igual al vino4 con respecto al tipo.<br>
     * 2. El vino1 es menor al vino2 con respecto al tipo.<br>
     * 3. El vino3 es igual al vino1 con respecto al tipo.
     */
    public void testCompararPorTipo( )
    {

        assertEquals( "La comparación debería tener como resultado 0 porque los tipos son iguales.", 0, vino1.compararPorTipo( vino4 ) );
        assertEquals( "La comparación debería tener como resultado -1 porque el vino1 es menor a vino2.", -1, vino1.compararPorTipo( vino2 ) );
        assertEquals( "La comparación debería tener como resultado 1 porque el vino3 es mayor a vino1.", 1, vino3.compararPorTipo( vino1 ) );
    }

    /**
     * Prueba 7: Se encarga de verificar el método compararPorColor de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * compararPorColor<br>
     * <b> Casos de prueba:</b><br>
     * 1. El vino1 es igual al vino4 con respecto al color.<br>
     * 2. El vino1 es menor al vino2 con respecto al color.<br>
     * 3. El vino3 es igual al vino1 con respecto al color.
     */
    public void testCompararPorColor( )
    {
    	 // Caso 1: vino1 es igual a vino4 en color
        assertEquals("Los colores deberian ser iguales", 0, vino1.compararPorColor(vino4));

        // Caso 2: vino1 es menor que vino2 en color
        assertTrue("vino1 debe ser menor que vino2 por color", vino1.compararPorColor(vino2) < 0);

        // Caso 3: vino3 es igual a vino1 en color
        assertEquals("vino3 y vino1 deben tener el mismo color", 0, vino3.compararPorColor(vino1));
   }

    /**
     * Prueba 8: Se encarga de verificar el método compararPorLugarOrigen de la clase.<br>
     * <b> Métodos a probar: </b> <br>
     * compararPorLugarOrigen<br>
     * <b> Casos de prueba:</b><br>
     * 1. El vino1 es igual al vino4 con respecto al lugar de origen.<br>
     * 2. El vino1 es menor al vino2 con respecto al lugar de origen.<br>
     * 3. El vino3 es igual al vino1 con respecto al lugar de origen.
     */
    public void testCompararPorLugarOrigen( )
    {
    	  // Caso 1: vino1 es igual a vino4 por lugar de origen
        assertEquals("Los lugares de origen deberian ser iguales", 0, vino1.compararPorLugarOrigen(vino4));

        // Caso 2: vino1 es menor que vino2 por lugar de origen
        assertTrue("vino1 debe ser menor que vino2 por lugar de origen", vino1.compararPorLugarOrigen(vino2) < 0);

        // Caso 3: vino3 es igual a vino1 por lugar de origen
        assertEquals("vino3 y vino1 deben tener el mismo lugar de origen", 0, vino3.compararPorLugarOrigen(vino1));
   }
   
}