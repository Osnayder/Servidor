package edu.cecar.Modelo;

import java.io.Serializable;

/** Clase: Album
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

public class Album implements Serializable{
    int id;
    int user_id;
    String title;
    String[] todos;
    
    public Album(){}

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
    
    public String[] getExtraerTodo(){
        todos = new String[3];
            todos[0] = ""+this.getId();
            todos[1] = ""+this.getUser_id();
            todos[2] = this.getTitle();
        return todos;
    }
}
