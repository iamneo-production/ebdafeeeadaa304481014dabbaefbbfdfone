package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Bill;
import com.examly.springapp.model.Customer;
import com.examly.springapp.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/addDetails")
    public boolean addDetails(@RequestBody Customer customer)
    {
        return apiService.addDetails(customer);
    }
    
    @GetMapping("/{customerId}")
    public Customer getById(@PathVariable int customerId)
    {
        return apiService.getById(customerId);
    }


    @GetMapping("/")
    public List<Customer> getAllCustomers()
    {
        return apiService.GetAllCustomers();

    }

}
