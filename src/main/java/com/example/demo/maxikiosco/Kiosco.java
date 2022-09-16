package com.example.demo.maxikiosco;

import java.util.List;

public class Kiosco {
    private List <Golosina> listadoGolosinas;
    private String nombre;
    private double fondo = 50.0;
    private String direccion;

    public Kiosco() {
    }

    public Kiosco(List<Golosina> listadoGolosinas, String nombre, String direccion) {
        this.listadoGolosinas = listadoGolosinas;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public List<Golosina> getListadoGolosinas() {
        return listadoGolosinas;
    }

    public void setListadoGolosinas(List<Golosina> listadoGolosinas) {
        this.listadoGolosinas = listadoGolosinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Kiosco{" +
                "listadoGolosinas=" + listadoGolosinas +
                ", nombre='" + nombre + '\'' +
                ", fondo=" + fondo +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void cobrar(double precio){

        double fondoNuevo = this.fondo + precio;

        setFondo(fondoNuevo);
    }


}

