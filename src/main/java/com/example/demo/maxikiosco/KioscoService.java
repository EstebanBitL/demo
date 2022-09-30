package com.example.demo.maxikiosco;

import java.util.ArrayList;
import java.util.List;

public class KioscoService {
    private ArrayList<Golosina> listadoGolosinas = new ArrayList<>();
    private Kiosco kiosco;
    public void loadCreate() {
        String nombre = "Carlitos";
        String direccion = "Bithouse 234";
        this.loadGolosinas();

        kiosco = new Kiosco(listadoGolosinas, nombre, direccion);
    }

    private void loadGolosinas (){
        Golosina golosina1 = new Golosina(150,"alfajor","aguila");
        Golosina golosina2 = new Golosina(75,"alfajor simple","tatin");
        Golosina golosina3 = new Golosina(35,"alfajor simple","fulbito");

        listadoGolosinas.add(golosina1);
        listadoGolosinas.add(golosina2);
        listadoGolosinas.add(golosina3);
    }
    public double calcularTotal (List<String>idProductos){
        double total = 0;

        for (String idProducto : idProductos){
            total += getPrecio(idProducto );
        }
        return total;
    }

    private double getPrecio(String idProducto) {
        for (Golosina golosina : kiosco.getListadoGolosinas()) {
            if (golosina.getId().equals( idProducto)) {
                return golosina.getPrecio();
            }
        }
    throw new RuntimeException("Precio no registrado del producto: " + idProducto);
    }
}
