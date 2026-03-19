
import com.murcia.utils.Nodo;

package com.mycompany.restaurante;

public class Nodo {
    // Clase Nodo: base de todas las estructuras
    String dato; // Guarda información del nodo
    Nodo siguiente; // Apunta al siguiente nodo

    // Constructor
    public Nodo(String dato) {
        this.dato = dato; // Asigna el dato
        this.siguiente = null; // Inicialmente no apunta a nada
    }
}

