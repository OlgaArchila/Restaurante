package com.mycompany.restaurante;
//Lau Olga 19/03/26
import com.murcia.utils.Nodo;

/** Pila de historial de pedidos (LIFO) */
public class PilaHistorial {

    private Nodo cima; // Nodo superior

    /** Agrega un pedido a la pila */
    public void push(String pedido) {
        Nodo nuevo = new Nodo(pedido);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    /** Elimina y retorna el último pedido */
    public String pop() {
        if (cima == null) {
            return "Historial vacío";
        }

        String pedido = (String) cima.getDato();
        cima = cima.getSiguiente();
        return pedido;
    }

    /** Retorna todos los pedidos */
    public String mostrar() {
        String resultado = "";
        Nodo aux = cima;

        while (aux != null) {
            resultado += aux.getDato() + "\n";
            aux = aux.getSiguiente();
        }

        return resultado;
    }
}
