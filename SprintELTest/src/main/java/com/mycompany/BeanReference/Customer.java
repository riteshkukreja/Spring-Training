/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.BeanReference;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component("customerBeanReference")
public class Customer {
    @Value("#{'Ritesh'.toUpperCase()}")
    private String name;
    
    @Value("#{priceBeanReference.getAmount()}")
    private double amount;
    
    @Value("#{priceBeanReference}")
    private Price price;

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
        return "Customer [ name=" + name + ", amount=" + amount + ", price=" + price + "]";
    }
    
}
