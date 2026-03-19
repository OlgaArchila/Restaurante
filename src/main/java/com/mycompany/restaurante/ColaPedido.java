import com.murcia.utils.ColaEnlazada;

package com.mycompany.restaurante;

public class ColaPedido {
     Nodo frente; // Primero
    Nodo fin; // Último

    // Agregar pedido
    public void encolar(String pedido) {

        Nodo nuevo = new Nodo(pedido); // Crear nodo

        if (frente == null) { // Si está vacía
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo; // Insertar al final
            fin = nuevo; // Actualizar fin
        }
    }

    // Atender pedido
    public String desencolar() {

        if (frente == null) { // Si no hay datos
            return "No hay pedidos";
        }

        String pedido = frente.dato; // Guardar dato
        frente = frente.siguiente; // Avanzar

        if (frente == null) { // Si quedó vacía
            fin = null;
        }

        return pedido; // Retornar pedido
    }
}

