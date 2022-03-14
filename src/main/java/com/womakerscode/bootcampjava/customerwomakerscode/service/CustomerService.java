package com.womakerscode.bootcampjava.customerwomakerscode.service;


import com.womakerscode.bootcampjava.customerwomakerscode.model.Customer;
import com.womakerscode.bootcampjava.customerwomakerscode.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class CustomerService {

    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        log.info("cadastrando uma nova cliente com as informacoes [{}]", customer);
        return customerRepository.save(customer);
    }

    public List<Customer> listAllCustomers() {
        log.info("Listando todas as clientes cadastradas na base");
        return customerRepository.findAll();
    }

    public ResponseEntity<Customer> findById(Long id) {
        log.info("Buscando uma cliente  pelo id [{}]", id);
        return customerRepository.findById(id)
                .map(task -> ResponseEntity.ok().body(task))
                .orElse(ResponseEntity.notFound().build());
    }
}
