package edu.cecar.Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** Clase: Utilidades
 * 
 * @version: 0.1
 *  
 * @sincelejo: 20/09/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */
public class Utilidades {
    
        public static byte[] getBytes(String rutaNombre) throws Exception {		
		
            byte[] resultado;
		File archivo = new File(rutaNombre);
                resultado = new byte[(int)archivo.length()];
		FileInputStream fileInputStream = new FileInputStream(archivo);
		fileInputStream.read(resultado);
		fileInputStream.close();
		
		return resultado;
	}
	
	public static void escribirAchivo(String rutaNombre, byte[] bytes) throws IOException {
		
		File archivo = new File(rutaNombre);
		FileOutputStream fileOutputStream = new FileOutputStream(archivo);
		fileOutputStream.write(bytes);
		fileOutputStream.close();
		
	}
}
