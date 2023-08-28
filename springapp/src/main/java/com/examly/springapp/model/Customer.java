package com.examly.springapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;





@Entity
public class Customer {
    
    @Id
    private int customerId;
    private String customerName;
    private int age;
    private long mobile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billId")
    private Bill bill;




    public Customer() {
    }
    public Customer(int customerId, String customerName, int age, long mobile, Bill bill) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.age = age;
        this.mobile = mobile;
        this.bill = bill;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }


    
   

}
