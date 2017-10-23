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
public class VideoJuego implements Entregable {

    private String titulo;
    private String genero="";
    private int horasEstimadas=10;
    private boolean prestado=false;
    private String compañia;
    
    public VideoJuego(String tittle,int n){
        this.titulo=tittle;
        this.horasEstimadas=n;
    }
    
    public VideoJuego(String t,String g,int n,String c){
        this.titulo=t;
        this.genero=g;
        this.horasEstimadas=n;
        this.compañia=c;
    }
    
    public VideoJuego(){
        this("","",10,"");
    }

    public String getCompañia() {
        return compañia;
    }

    public String getGenero() {
        return genero;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEntregado() {
        return prestado;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return "Informacion del VideoJuego:\n"
        + "Titulo: " + titulo + "\n"
        + "Género: " + genero + "\n"
        + "Número de horas estimadas: " + horasEstimadas + "\n"
        + "Entregado: " + prestado + "\n"
        + "Compañia: " + compañia + "\n"; 
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

