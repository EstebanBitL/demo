package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {



    @RequestMapping("/algo")
    String home() {
        Customer customer = new Customer();
        customer.setName("Mario");
        customer.setLastName("apellido");
        return customer.getName() + " "  + customer.getLastName();
        //return customer.getLastName();
    }
}
