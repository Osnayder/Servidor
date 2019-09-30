package edu.cecar.Controlador;

import edu.cecar.Modelo.JSONarchivo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Clase: GuardarJSON
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
public class GuardarJSON{

    public GuardarJSON(String ruta){
        ObjectOutputStream salida = null;
        JSONarchivo  archivo = new JSONarchivo();
        SingletonDescarga sd = new SingletonDescarga();

        archivo.setListaAlbums(sd.getArrayAlbum());
        archivo.setListaComentarios(sd.getArrayComentario());
        archivo.setListaFotos(sd.getArrayFoto());
        archivo.setListaPublicaciones(sd.getArrayPublicacion());
        archivo.setListaUsuarios(sd.getArrayUsuarios());
        
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            salida.writeObject(archivo);
            System.out.println("\nSe Guardaron los JSON en Disco!");
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardarJSON.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuardarJSON.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                salida.close();
            } catch (IOException ex) {
                Logger.getLogger(GuardarJSON.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
}