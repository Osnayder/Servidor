package edu.cecar.Controlador;

import edu.cecar.Modelo.Album;
import edu.cecar.Modelo.Comentario;
import edu.cecar.Modelo.Foto;
import edu.cecar.Modelo.Publicacion;
import edu.cecar.Modelo.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
import us.monoid.web.Resty;

/** Clase: SingletonDescarga
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
public class SingletonDescarga {
    
    private JSONObject json = null;
    private JSONArray jsonArrayResultU = null;
    private JSONArray jsonArrayResultC = null;
    private JSONArray jsonArrayResultP = null;
    private JSONArray jsonArrayResultA = null;
    private JSONArray jsonArrayResultF = null;
    
    
    public SingletonDescarga(){ 
        System.out.println("Descargando JSON de la Nube...\n");
        if(jsonArrayResultU==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/users?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                JSONObject jsonMeta = json.getJSONObject("_meta");
                System.out.println("Descarga Usuario: "+jsonMeta.get("success"));
                jsonArrayResultU = json.getJSONArray("result");
            } catch (IOException | us.monoid.json.JSONException ex) {
                System.out.println("Error al Descargar el jSON de Usuarios: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultA==null){
            try {
                  json = new Resty().json("https://gorest.co.in/public-api/albums?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Album: "+jsonMeta.get("success"));
                  jsonArrayResultA = json.getJSONArray("result");
            } catch (IOException | us.monoid.json.JSONException ex) {
                System.out.println("Error al Descargar el jSON de Albumes: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultP==null){
            try {
                  json = new Resty().json("https://gorest.co.in/public-api/posts?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Publicaciones: "+jsonMeta.get("success"));
                  jsonArrayResultP = json.getJSONArray("result");
            } catch (IOException | us.monoid.json.JSONException ex) {
                System.out.println("Error al Descargar el jSON de Publicaciones: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultF==null){
            try {
                  json = new Resty().json("https://gorest.co.in/public-api/photos?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Foto: "+jsonMeta.get("success"));
                  jsonArrayResultF = json.getJSONArray("result");
            } catch (IOException | us.monoid.json.JSONException ex) {
                System.out.println("Error al Descargar el jSON de Fotos: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultC==null){
            try {
                  json = new Resty().json("https://gorest.co.in/public-api/comments?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Comentario: "+jsonMeta.get("success"));
                  jsonArrayResultC = json.getJSONArray("result");
            } catch (IOException | us.monoid.json.JSONException ex) {
                System.out.println("Error al Descargar el jSON de Comentarios: "+ex.getMessage());
            }
        }      
    }
    
    public  ArrayList<Usuario> getArrayUsuarios(){
        Usuario usuario;
        ArrayList<Usuario> resultado = new ArrayList<Usuario>();
        
        try {
            for(int i=0; i<jsonArrayResultU.length(); i++){
                usuario = new Usuario();
                usuario.setAddress((String)jsonArrayResultU.getJSONObject(i).get("address"));
                usuario.setDob((String)jsonArrayResultU.getJSONObject(i).get("dob"));
                usuario.setEmail((String)jsonArrayResultU.getJSONObject(i).get("email"));
                usuario.setFirt_name((String)jsonArrayResultU.getJSONObject(i).get("first_name"));
                usuario.setGender((String)jsonArrayResultU.getJSONObject(i).get("gender"));
                usuario.setId(Integer.parseInt((String)jsonArrayResultU.getJSONObject(i).get("id")));
                usuario.setLast_name((String)jsonArrayResultU.getJSONObject(i).get("last_name"));
                usuario.setPhone((String)jsonArrayResultU.getJSONObject(i).get("phone"));
                usuario.setStatus((String)jsonArrayResultU.getJSONObject(i).get("status"));
                usuario.setWebsite((String)jsonArrayResultU.getJSONObject(i).get("website"));
                resultado.add(usuario);
            }
        } catch (us.monoid.json.JSONException ex) {
            System.out.println("Error al Leer el jSON usuario: "+ex.getMessage());
        }
  
        return resultado;        
    }
    
    public  ArrayList<Album> getArrayAlbum(){        
        Album album;
        ArrayList<Album> resultado = new ArrayList<Album>();
        try {
            for(int i=0; i<jsonArrayResultA.length(); i++){
                album = new Album();
                album.setId(Integer.parseInt((String)jsonArrayResultA.getJSONObject(i).get("id")));
                album.setTitle((String)jsonArrayResultA.getJSONObject(i).get("title"));
                album.setUser_id(Integer.parseInt((String)jsonArrayResultA.getJSONObject(i).get("user_id")));
                resultado.add(album);
            }
        } catch (us.monoid.json.JSONException ex) {
            System.out.println("Error Al Leer el jSON album: "+ex.getMessage());            
        }
        return resultado; 
    }

    public ArrayList<Publicacion> getArrayPublicacion(){
        Publicacion publicacion;
        ArrayList<Publicacion> resultado = new ArrayList<Publicacion>();
        try {
            for(int i=0; i<jsonArrayResultP.length(); i++){
                publicacion = new Publicacion();
                publicacion.setBody((String)jsonArrayResultP.getJSONObject(i).get("body"));
                publicacion.setId(Integer.parseInt((String)jsonArrayResultP.getJSONObject(i).get("id")));
                publicacion.setTitle((String)jsonArrayResultP.getJSONObject(i).get("title"));
                publicacion.setUser_id(Integer.parseInt((String) jsonArrayResultP.getJSONObject(i).get("user_id")));
                resultado.add(publicacion);
            }
        } catch (us.monoid.json.JSONException ex) {
            System.out.println("Error al Leer jSON Publicaciones: "+ex.getMessage());
        }            
        return resultado; 
    }
    
    public ArrayList<Foto> getArrayFoto(){
        Foto foto;
        ArrayList<Foto> resultado = new ArrayList<Foto>();
        try {
            for(int i=0; i<jsonArrayResultF.length(); i++){
                foto = new Foto();
                foto.setId(Integer.parseInt((String)jsonArrayResultF.getJSONObject(i).get("id")));
                foto.setAlbum_id(Integer.parseInt((String)jsonArrayResultF.getJSONObject(i).get("album_id")));
                foto.setThumbnail((String)jsonArrayResultF.getJSONObject(i).get("thumbnail"));
                foto.setTitle((String)jsonArrayResultF.getJSONObject(i).get("title"));
                foto.setUrl((String)jsonArrayResultF.getJSONObject(i).get("url"));
                resultado.add(foto);
            }
        } catch (us.monoid.json.JSONException ex) {
            System.out.println("Error al Leer jSON Fotos: "+ex.getMessage());
        }           
        return resultado; 
    }
    
    public  ArrayList<Comentario> getArrayComentario(){
        Comentario comentario;        
        ArrayList<Comentario> resultado = new ArrayList<Comentario>();
            try {
                for(int i=0; i<jsonArrayResultC.length(); i++){
                    comentario = new Comentario();
                    comentario.setBody((String)jsonArrayResultC.getJSONObject(i).get("body"));
                    comentario.setEmail((String)jsonArrayResultC.getJSONObject(i).get("email"));
                    comentario.setId(Integer.parseInt((String)jsonArrayResultC.getJSONObject(i).get("id")));
                    comentario.setName((String)jsonArrayResultC.getJSONObject(i).get("name"));
                    comentario.setPost_id(Integer.parseInt((String)jsonArrayResultC.getJSONObject(i).get("post_id")));
                    resultado.add(comentario);
                }
            } catch (us.monoid.json.JSONException ex) {
                System.out.println("Error al Leer jSON Comentarios: "+ex.getMessage());
            }            
        return resultado; 
    }   
}