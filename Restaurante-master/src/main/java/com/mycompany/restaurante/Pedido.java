package com.mycompany.restaurante;

public class Pedido {
    String cliente; //guarda el nombre del cliente
    String plato; //guarda el nombre del plato
    
    public Pedido(){ //constructor vacio
    }
    public Pedido(String cliente, String plato){ //constructor con parametros
        this.cliente= cliente; //asignar nombre del cliente
        this.plato=plato; //asignar el nombre del plato
    }
}
