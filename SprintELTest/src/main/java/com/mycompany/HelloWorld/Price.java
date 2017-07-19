/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.HelloWorld;

import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component("priceBean")
public class Price {
  
    public double getAmount() {
        return 347.75;
    }
    
}
