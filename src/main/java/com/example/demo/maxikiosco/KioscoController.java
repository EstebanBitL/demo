package com.example.demo.maxikiosco;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KioscoController {
    private KioscoService service;
    public KioscoController() {
        this.service = new KioscoService();
        service.loadCreate();
    }

    @RequestMapping("/cobrar")
    String cobrar(@PathVariable List<String> idProducto){

    }
}
