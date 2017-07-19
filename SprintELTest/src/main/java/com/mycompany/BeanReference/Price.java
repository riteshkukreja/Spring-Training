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
@Component("priceBeanReference")
public class Price {
    
    @Value("#{0.44}")
    private double offset;
  
    public double getAmount() {
        return 347.75*offset;
    }
    
    @Override
    public String toString() {
        return "Price [ offset=" + offset + "]";
    }
    
}
