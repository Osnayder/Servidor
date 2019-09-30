package edu.cecar.Modelo;

import java.io.Serializable;

/** Clase: Foto
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
public class Foto implements Serializable{
    private int id;
    private int album_id;
    private String title;
    private String url;
    private String thumbnail;
    private String[]  todos;
    
    public Foto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    
    public String[] getExtraerTodo(){
        todos = new String[5];
            todos[0] = ""+this.getId();
            todos[1] = ""+this.getAlbum_id();
            todos[2] = this.getTitle();
            todos[3] = this.getUrl();
            todos[4] = this.getThumbnail();
        return todos;
    }
}
