package com.example.demo.maxikiosco;

public class Golosina {
    private double precio;
    private String tipo;
    private String nombre;

    public Golosina(double precio, String tipo, String nombre) {
        this.precio = precio;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Golosina() {
    }

    @Override
    public String toString() {
        return "Golosina{" +
                "precio=" + precio +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

