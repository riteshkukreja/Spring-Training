/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.HelloWorld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component("customerBean")
public class Customer {
    @Value("#{'Ritesh'.toUpperCase()}")
    private String name;
    
    @Value("#{priceBean.getAmount()}")
    private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Customer [ name=" + name + ", amount=" + amount + "]";
    }
    
}
