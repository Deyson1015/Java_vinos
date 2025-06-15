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
package uniandes.cupi2.cupiCava.mundo;

/**
 * Clase que representa un vino almacenado en la Cupi-Cava.<br>
 * <b>inv: </b> <br>
 */
public class Vino
{
    // -------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------

    /**
     * Constante que representa la presentación barril.
     */
    public final static String BARRIL = "Barril";

    /**
     * Constante que representa la presentación botella.
     */
    public final static String BOTELLA = "Botella";

    /**
     * Constante que representa el color tinto.
     */
    public final static String TINTO = "Tinto";

    /**
     * Constante que representa el color rosado.
     */
    public final static String ROSADO = "Rosado";

    /**
     * Constante que representa el color blanco.
     */
    public final static String BLANCO = "Blanco";

    /**
     * Constante que representa el tipo de vino seco.
     */
    public final static String SECO = "Seco";

    /**
     * Constante que representa el tipo de vino abocado.
     */
    public static final String ABOCADO = "Abocado";

    /**
     * Constante que representa el tipo de vino semi-seco.
     */
    public static final String SEMI_SECO = "Semi-seco";

    /**
     * Constante que representa el tipo de vino semi-dulce.
     */
    public static final String SEMI_DULCE = "Semi-dulce";

    /**
     * Constante que representa el tipo de vino dulce.
     */
    public static final String DULCE = "Dulce";

    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * Nombre del vino.
     */
    private String nombre;

    /**
     * Presentación del vino.
     */
    private String presentacion;

    /**
     * Año de elaboración del vino.
     */
    private int anhoElaboracion;

    /**
     * Contenido en azúcar del vino (gramos/litro).
     */
    private double contenidoAzucar;

    /**
     * Tipo del vino.
     */
    private String tipo;

    /**
     * Color del vino.
     */
    private String color;

    /**
     * Lugar de origen del vino.
     */
    private String lugarOrigen;

    /**
     * Ruta donde se encuentra la imagen del vino.
     */
    private String imagen;

    // -------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------

    /**
     * Inicializa el vino con la información dada por parámetro. <br>
     * <b>post: </b> El vino se inicializó con los valores de nombre, presentación, año elaboración, contenido en azúcar, tipo, color, lugar de origen e imagen dados por
     * parámetro.
     * @param pNombre Nombre del vino. pNombre != null && pNombre != "".
     * @param pPresentacion Presentación del vino. pPresentacion != null && pPresentacion != "" && (pPresentacion == BOTELLA || pPresentacion == BARRIL).
     * @param pAnhoElaboracion Año de elaboración del vino. pAnhoElaboracion > 0.
     * @param pContenidoAzucar Contenido en azúcar del vino. pContenidoAzucar >= 0
     * @param pTipo Tipo de vino de acuerdo a su contenido en azúcar. pTipo != null && pTipo != "" && (pTipo == SECO || pTipo == ABOCADO || pTipo == SEMI_SECO || pTipo ==
     *        SEMI_DULCE || pTipo == DULCE).
     * @param pColor Color del vino. pColor != null && pColor != "" && (pColor == TINTO || pColor == ROSADO || pColor == BLANCO).
     * @param pLugarOrigen Lugar de origen del vino. lugarElaboracion != null y lugarElaboracion != "".
     * @param pImagen Imagen del vino. pImagen != null && pImagen != "".
     */
    public Vino( String pNombre, String pPresentacion, int pAnhoElaboracion, double pContenidoAzucar, String pTipo, String pColor, String pLugarOrigen, String pImagen )
    {
    	this.nombre = pNombre;
        this.presentacion = pPresentacion;
        this.anhoElaboracion = pAnhoElaboracion;
        this.contenidoAzucar = pContenidoAzucar;
        this.tipo = pTipo;
        this.color = pColor;
        this.lugarOrigen = pLugarOrigen;
        this.imagen = pImagen;
        
        verificarInvariante();

    }

    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Retorna el nombre del vino.
     * @return Nombre del vino.
     */
    public String darNombre( )
    {
        return this.nombre;
    }

    /**
     * Retorna la presentación del vino.
     * @return Presentación del vino.
     */
    public String darPresentacion( )
    {
        return this.presentacion;
    }

    /**
     * Retorna el año de elaboración del vino.
     * @return Año de elaboración del vino.
     */
    public int darAnhoElaboracion( )
    {
        return this.anhoElaboracion;
    }

    /**
     * Retorna el contenido en azúcar del vino.
     * @return Contenido en azúcar del vino.
     */
    public double darContenidoAzucar( )
    {
        return this.contenidoAzucar;
    }

    /**
     * Retorna el tipo del vino.
     * @return Tipo del vino.
     */
    public String darTipo( )
    {
        return this.tipo;
    }

    /**
     * Retorna el color del vino.
     * @return Color del vino.
     */
    public String darColor( )
    {
        return this.color;
    }

    /**
     * Retorna el lugar de origen del vino.
     * @return Lugar de origen del vino.
     */
    public String darLugarOrigen( )
    {
        return this.lugarOrigen;
    }

    /**
     * Retorna la imagen del vino.
     * @return Imagen del vino.
     */
    public String darImagen( )
    {
        return this.imagen;
    }
    
    // Metodo que centraliza la logica de comparaci�n de cadenas
    private int compararString(String actual, String otro) {
    	int comparacion = actual.compareTo(otro);
    	return comparacion == 0 ? 0 : (comparacion < 0 ? -1 : 1);
    }
    
    // Metodo que centraliza la logica de comparaci�n de n�meros decimales
    private int compararDecimales(double actual, double otro) {
    	return actual == otro ? 0 : (actual < otro ? -1 : 1);
    }
    
    // Metodo que centraliza la logica de comparaci�n de n�meros eneteros
    private int compararEnteros(int actual, int otro) {
    	return actual == otro ? 0 : (actual < otro ? -1 : 1);
    }

    /**
     * Compara dos vinos según el nombre. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo nombre. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el nombre. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el nombre. <br>
     */
    public int compararPorNombre( Vino pVino )
    {
    	assert pVino != null : "El vino no puede ser nulo.";
    	return compararString(this.nombre, pVino.darNombre());
   
    }

    /**
     * Compara dos vinos según la presentación. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen la misma presentación. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para la presentación. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para la presentación. <br>
     */
    public int compararPorPresentacion( Vino pVino )
    {
    	assert pVino != null : "El vino no puede ser nulo.";
    	return compararString(this.presentacion, pVino.darPresentacion());
   	 
   }

    /**
     * Compara dos vinos según el año de elaboración. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo año de elaboración. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el año de elaboración. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el año de elaboración. <br>
     */
    public int compararPorAnhoElaboracion( Vino pVino )
    {
    	assert pVino != null : "El vino no puede ser nulo.";
    	return compararEnteros(this.anhoElaboracion, pVino.darAnhoElaboracion());
    }

    /**
     * Compara dos vinos según el contenido en azúcar. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo contenido en azúcar. <br>
     *         Retorna -1 si el vino pVino tiene un mayor contenido en azúcar. <br>
     *         Retorna 1 si el vino pVino tiene un menor contenido en azúcar. <br>
     */
    public int compararPorContenidoAzucar( Vino pVino )
    {
    	assert pVino != null : "El vino no puede ser nulo.";
    	return compararDecimales(this.contenidoAzucar, pVino.darContenidoAzucar());
   }

    /**
     * Compara dos vinos según el tipo de vino. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo tipo. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el tipo. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el tipo. <br>
     */
    public int compararPorTipo( Vino pVino )
    {
    	assert pVino != null : "El vino no puede ser nulo.";
    	return compararString(this.tipo, pVino.darTipo());
   }

    /**
     * Compara dos vinos según el color. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo color. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el color. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el color. <br>
     */
    public int compararPorColor( Vino pVino )
    {
    	assert pVino != null : "El vino no puede ser nulo.";
    	return compararString(this.color, pVino.darColor());
    }

    /**
     * Compara dos vinos según el lugar de origen. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo lugar de origen. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el lugar de origen. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el lugar de origen. <br>
     */
    public int compararPorLugarOrigen( Vino pVino )
    {
    	assert pVino != null : "El vino no puede ser nulo.";
    	return compararString(this.lugarOrigen, pVino.darLugarOrigen());
   }

    /**
     * Retorna una cadena con el nombre del vino.
     * @return Representación del vino en una cadena de caracteres.
     */
    public String toString( )
    {
        return this.nombre;
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    private void verificarInvariante() {
    	assert nombre != null && !presentacion.trim().isEmpty() : "La presentacion no puede estar vacia o ser nula.";
    	assert anhoElaboracion > 0 : "El año de elaboracion debe ser mayor que 0.";
    	assert contenidoAzucar >= 0 : "El contenido de azucar debe ser mayor o igual a 0.";
    	assert tipo != null && !tipo.trim().isEmpty() : "El tipo de vino no puede estar vacio o ser nulo.";
    	assert color != null && !color.trim().isEmpty() : "El color del vino no puede estar vacio o ser nulo.";
    	assert lugarOrigen != null && !lugarOrigen.trim().isEmpty() : "El lugar de origen no puede estar vacio o ser nulo.";
    	assert imagen != null && !imagen.trim().isEmpty() : "La imagen del vino no puede estar vacia o ser nula.";
    }
   
}