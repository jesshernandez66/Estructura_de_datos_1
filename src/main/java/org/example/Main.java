package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PILA pila = new PILA(3,5, new ArrayList<>(3));

        pila.push(6);
        System.out.println("El ultimo elemento de la pila es: "+pila.ultimoElemento());
        pila.push(9);
        System.out.println("El ultimo elemento de la pila es: "+pila.ultimoElemento());
        System.out.println(pila.llena());
        pila.push(10);
        System.out.println("El ultimo elemento de la pila es: "+pila.ultimoElemento());
        System.out.println(pila.llena());
        pila.push(1);


    }
}