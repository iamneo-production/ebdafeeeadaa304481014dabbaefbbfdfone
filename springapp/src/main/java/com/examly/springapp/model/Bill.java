package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

@Id
private int billId;
private int total;


public int getBillId() {
    return billId;
}
public void setBillId(int billId) {
    this.billId = billId;
}
public int getTotal() {
    return total;
}
public void setTotal(int total) {
    this.total = total;
}



}
