package com.example.demo.maxikiosco;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KioscoController {

    @RequestMapping("/cobrar")
    String cobrar(){
        String nombre = "Carlitos";
        String direccion = "Bithouse 234";
        Golosina golosina1 = new Golosina(150,"alfajor","aguila");
        Golosina golosina2 = new Golosina(75,"alfajor simple","tatin");
        Golosina golosina3 = new Golosina(35,"alfajor simple","fulbito");

        List<Golosina> listadoGolosinas = new ArrayList<>();
        listadoGolosinas.add(golosina1);
        listadoGolosinas.add(golosina2);
        listadoGolosinas.add(golosina3);

        Kiosco kiosco = new Kiosco( listadoGolosinas, nombre, direccion);

        kiosco.cobrar(200);

        return kiosco.toString();


    }
}
