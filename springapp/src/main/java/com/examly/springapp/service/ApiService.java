package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.examly.springapp.model.Bill;
import com.examly.springapp.model.Customer;
import com.examly.springapp.repository.BillRepo;
import com.examly.springapp.repository.CustomerRepo;

@Service
public class ApiService {
    

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private BillRepo billRepo;

    public boolean addDetails(Customer customer)
    {
        return customerRepo.save(customer)!=null?true:false;
    }


    public Customer getById(int customerId)
    {
        return customerRepo.findById(customerId).get();
    }


    public List <Customer> GetAllCustomers()
    {
        return customerRepo.findAll();
    }


}
