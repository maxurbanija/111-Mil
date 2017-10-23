/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp;
import java.util.*;
/**
 *
 * @author usuario
 */
public class Hora {
    private int hora;
    private int minutos;
    private int segundos;
    
    public Hora(int h, int m, int s){
        this.hora=h;
        this.minutos=m;
        this.segundos=s;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    
    public Hora(){
        this(00,00,00);
    }
    
    public void print(){
        System.out.println("La hora es "+hora+":"+minutos+":"+segundos);
    }
    
    public int aSegundos(){
        return (this.hora*3600+this.minutos*60+this.segundos);
    }
    
    public void deSegundos(int s){
        this.hora=s / 3600;
        this.minutos=(s % 3600) / 60;
        this.segundos=(s % 3600) % 60;
    }
    
    public int segundosDesde(Hora h){
        return Math.abs(aSegundos()-h.aSegundos());
    }
    
    public void siguiente(){
        this.segundos++;
        if (this.segundos>=60) {
            this.segundos=0;
            this.minutos++;
            if (this.minutos>=60){
                this.hora++;
                this.minutos=00;
            }
        }
    }
    
    public void anterior(){
        this.segundos--;
        if (this.segundos<0){
            this.segundos=59;
            this.minutos--;
            if (this.minutos<0){
                this.hora--;
                this.minutos=59;
            }
        }
    }
    
    public Hora copia(){
        return (new Hora(this.hora,this.minutos,this.segundos));
    }
    
    public boolean igualQue(Hora h){
        if ((this.hora==h.hora)&(this.minutos==h.minutos)&(this.segundos==h.segundos)){
            return true;
        }
        return false;
    }
    
    public boolean menorQue(Hora h){
        if(this.hora<h.hora){
            return true;
        }
        else{
            if ((this.minutos<h.minutos)&&(this.hora==h.hora)){
                return true;
            }else{
                if((this.segundos<h.segundos)&&((this.minutos==h.minutos)&&(this.hora==h.hora))){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean mayorQue(Hora h){
        if(this.hora>h.hora){
            return true;
        }
        else{
            if ((this.minutos>h.minutos)&&(this.hora==h.hora)){
                return true;
            }else{
                if ((this.segundos>h.segundos)&&((this.minutos==h.minutos)&&(this.hora==h.hora))){
                    return true;
                }
            }
        }
        return false;
    }
            
    public void leer(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la hora:");
        this.hora=entrada.nextInt();
        System.out.println("Ingrese los minutos:");
        this.minutos=entrada.nextInt();
        System.out.println("Ingrese los Segundos");
        this.segundos=entrada.nextInt();
    }
}


