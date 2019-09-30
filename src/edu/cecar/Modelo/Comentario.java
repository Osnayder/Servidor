package edu.cecar.Modelo;

import java.io.Serializable;

/** Clase: Comentario
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
public class Comentario implements Serializable{
    private int id;
    private int post_id;
    private String name;
    private String email;
    private String body;
    String[] todos;
    
    public Comentario(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    
     public String[] getExtraerTodo(){
        todos = new String[5];
            todos[0] = ""+this.getId();
            todos[1] = ""+this.getPost_id();
            todos[2] = this.getName();
            todos[3] = this.getEmail();
            todos[4] = this.getBody();
        return todos;
    }
}
