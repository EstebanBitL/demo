package com.example.demo.customer;

import com.example.demo.customer.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CustomerController {



    @RequestMapping("/algo")
    String home() {
        LocalDate date = LocalDate.of(2010,9,12);
        Customer customer = new Customer("Fran","Apellido",true,date);

        //return customer.getName() + " "  + customer.getLastName();
        //return customer.getLastName();
        return customer.toString();
    }
}
