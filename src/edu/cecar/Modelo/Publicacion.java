package edu.cecar.Modelo;

import java.io.Serializable;

/** Clase: Publicacion
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
public class Publicacion implements Serializable{
    private int id;
    private int user_id;
    private String title;
    private String body;
    private String[] todos;
        
    public Publicacion(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    public String[] getExtraerTodo(){
        todos = new String[4];
            todos[0] = ""+this.getId();
            todos[1] = ""+this.getUser_id();
            todos[2] = this.getTitle();
            todos[3] = this.getBody();
        return todos;
    }
    
}
