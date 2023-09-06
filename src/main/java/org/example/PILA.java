package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class PILA {
    private int tamanio;
    private int ultimo;
    private ArrayList <Integer> cuerpo;
    private boolean activo = false;

    public PILA() {
    }

    public PILA(int tamanio, int ultimo, ArrayList<Integer> cuerpo) {
        this.tamanio = tamanio;
        this.ultimo = ultimo;
        this.cuerpo = cuerpo;
    }


    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public ArrayList<Integer> getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(ArrayList<Integer> cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "PILA{" +
                "tamanio=" + tamanio +
                ", ultimo=" + ultimo +
                ", cuerpo=" + cuerpo +
                ", activo=" + activo +
                '}';
    }

    public void push (int a){
        if (cuerpo.size()>=tamanio){
            System.out.println("No es posible agregar mas elementos la pila se encuentra llena");
        }
        else {
            cuerpo.add(a);
            activo = true;
        }
    }
    public boolean seUtilizoMetodo(){
        return activo;
    }


    public int pop () {
        int ultimoElemento = cuerpo.get(cuerpo.size()-1);
        cuerpo.remove(cuerpo.size()-1);

        return ultimoElemento;
    }

    public int ultimoElemento (){

        int ultimoNuevo = ultimo;
        if (activo==true){
        ultimoNuevo = cuerpo.get(cuerpo.size()-1);
        }
        return ultimoNuevo ;
    }

    public boolean llena (){
        boolean llena = false;
        if (cuerpo.size()>=tamanio){
            llena= true;
            System.out.println("La pila se encuentra llena");
        }
        else {
            System.out.println("La pila aun tiene espacio");
        }
        return llena;
    }

}
