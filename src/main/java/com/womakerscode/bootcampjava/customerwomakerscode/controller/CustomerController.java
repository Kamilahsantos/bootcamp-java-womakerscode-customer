package com.womakerscode.bootcampjava.customerwomakerscode.controller;

import com.womakerscode.bootcampjava.customerwomakerscode.model.Customer;
import com.womakerscode.bootcampjava.customerwomakerscode.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
@Slf4j
public class CustomerController {

    CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer  customer) {
        log.info("Criando uma nova cliente com as informações [{}]", customer);
        return customerService.createCustomer(customer);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAllCustomers() {
        log.info("Listando todas as clientes cadastradas");
        return customerService.listAllCustomers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") Long id) {
        log.info("Buscando cliente com o id [{}]", id);
        return customerService.findById(id);
    }
}
