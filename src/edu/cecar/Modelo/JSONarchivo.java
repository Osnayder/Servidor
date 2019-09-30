package edu.cecar.Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/** Clase: JSONarchivo
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
public class JSONarchivo implements Serializable{

    private ArrayList<Usuario>  listaUsuarios = new ArrayList<Usuario>();
    private ArrayList<Publicacion> listaPublicaciones = new ArrayList<Publicacion>();
    private ArrayList<Comentario> listaComentarios = new ArrayList<Comentario>();
    private ArrayList<Foto> listaFotos = new ArrayList<Foto>();
    private ArrayList<Album> listaAlbums = new ArrayList<Album>();
    
    public JSONarchivo(){}

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public ArrayList<Comentario> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<Comentario> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public ArrayList<Foto> getListaFotos() {
        return listaFotos;
    }

    public void setListaFotos(ArrayList<Foto> listaFotos) {
        this.listaFotos = listaFotos;
    }

    public ArrayList<Album> getListaAlbums() {
        return listaAlbums;
    }

    public void setListaAlbums(ArrayList<Album> listaAlbums) {
        this.listaAlbums = listaAlbums;
    }
}
