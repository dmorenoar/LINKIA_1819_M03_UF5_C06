/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf5_c06;

import java.io.Serializable;

/**
 *
 * @author dmorenoar
 */
public class Videojuego implements Serializable{
    private String titulo;
    private int precio;
    private String tipo;

    public Videojuego() {} //Creo el constructor vacío para el XMLEncoder/XMLDecoder
    
    public Videojuego(String titulo, int precio, String tipo) {
        this.titulo = titulo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
    
}
