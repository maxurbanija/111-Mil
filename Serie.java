/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author usuario
 */
public class Serie implements Entregable{
    private String titulo;
    private String genero="";
    private int numDeTemporadas=3;
    private boolean prestado=false;
    private String creador;
    
    public Serie(String tittle,String creator){
        this.titulo=tittle;
        this.creador=creator;
    }
    
    public Serie(String t,String g,int n,String c){
        this.titulo=t;
        this.genero=g;
        this.numDeTemporadas=n;
        this.creador=c;
    }
    
    public Serie(){
        this("","",3,"");
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumDeTemporadas() {
        return numDeTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEntregado() {
        return prestado;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumDeTemporadas(int numDeTemporadas) {
        this.numDeTemporadas = numDeTemporadas;
    }

    @Override
    public String toString() {
        return "Informacion de la serie:\n"
        + "Titulo: " + titulo + "\n"
        + "Género: " + genero + "\n"
        + "Número de temporadas: " + numDeTemporadas + "\n"
        + "Entregado: " + prestado + "\n"
        + "Creador: " + creador + "\n";   
    }

    @Override
    public void devolver() {
        this.prestado=false;
    }

    @Override
    public void entregar() {
        this.prestado=true;
    }
    
    
    
    
    }
    
    
    
    
    
        

