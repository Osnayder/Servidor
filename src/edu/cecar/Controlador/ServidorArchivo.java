package edu.cecar.Controlador;

import edu.cecar.Modelo.Archivo;
import java.io.IOException;
import javax.swing.JOptionPane;

/** Clase: ServidorArchivo
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

public class ServidorArchivo {
        private String ruta = "ArchivosCompartidos/";
	
	public ServidorArchivo(int puerto) {
		new GuardarJSON("ArchivosCompartidos/ArchivosJSON.dat");	
		System.out.println("Servidor de Archivos Montado");
                
                
                
		ServerSocketObjeto serverSocket = new ServerSocketObjeto(puerto); 
		boolean sw = true;
		
                JOptionPane.showMessageDialog(null," Servidor de Archivos Montado",
                                              "Servidor",JOptionPane.INFORMATION_MESSAGE);
		while (sw) {
			try {
                            
                            Object object = serverSocket.getEntrada().readObject();		
                            Archivo archivo = (Archivo)object;
					
                            if (archivo.getOperacion().equals("Subida")) { 
				Utilidades.escribirAchivo(ruta + archivo.getNombre(), archivo.getBytes());		
                            } else {			
				byte[] bytes = Utilidades.getBytes(ruta + archivo.getNombre());
				archivo.setBytes(bytes);
				serverSocket.getSalida().writeObject(archivo);
                            }
						
			} catch (IOException e) {		
                            System.out.println("Conexión cerrada de manera inesperada. " + e);
                            sw = false;
					
			} catch (ClassNotFoundException e) {
                            e.printStackTrace();		
			} catch (Exception e) {
					
                            e.printStackTrace();
			}
			
		}
			
	}
}
