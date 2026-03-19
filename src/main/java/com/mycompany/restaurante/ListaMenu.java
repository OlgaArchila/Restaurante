
package com.mycompany.restaurante;

public class ListaMenu {
    
    Nodo cabeza; // Primer nodo

    // Agregar plato
    public void agregarPlato(String plato) {

        Nodo nuevo = new Nodo(plato); // Crear nodo

        if (cabeza == null) { // Si está vacía
            cabeza = nuevo; // Nuevo es la cabeza
        } else {
            Nodo aux = cabeza; // Auxiliar

            while (aux.siguiente != null) { // Recorrer
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo; // Insertar al final
        }
    }

    // Mostrar menú
    public void mostrarMenu() {

        Nodo aux = cabeza; // Empezar desde cabeza

        while (aux != null) { // Recorrer lista
            System.out.println(aux.dato); // Imprimir
            aux = aux.siguiente; // Avanzar
        }
    }
}

