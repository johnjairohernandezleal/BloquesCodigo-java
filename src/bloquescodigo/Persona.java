/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquescodigo;

/**
 *
 * @author john hernandez
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    /**
     * bloque de inicializacion estatico
     */
    static{
        /**
         * inicializamos el idPersonas desde el valor de 10
         */
        contadorPersonas=10;
        /**
         * aqui no se pueden usar variables no estaticas
         * idPersona = 1;
         */
        System.out.println("Ejecuta el Bloque estatico");
        
    }
    {
        /**
         * bloque de codigo para inicializar atributos de la clase
         * el bloque se copia a cada constructor de la clase
         */
        
        System.out.println("Ejecuta el Bloque Inicializador");
        idPersona = ++contadorPersonas;
    }
    
    Persona(){
        System.out.println("Ejecuta el constructor");
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
}
