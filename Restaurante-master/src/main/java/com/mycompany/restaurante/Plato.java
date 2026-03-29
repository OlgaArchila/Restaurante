package com.mycompany.restaurante;

public class Plato {
    private String nombre; //atributo para el nombre del plato
    double precio; //atributo con el precio del plato
    
    public Plato(){ //constructor vacio
    }
    public Plato (String nombre, double precio){//constructor
        this.nombre = nombre; //aqui se asigna el nombre al plato
        this.precio= precio;//asignar precio
    }
    public String mostrar(){
        return nombre + "$"+ precio; //retorna texto con el nombre y precio del plato
    }
}
