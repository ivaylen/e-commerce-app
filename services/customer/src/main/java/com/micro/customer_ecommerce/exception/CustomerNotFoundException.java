package com.micro.customer_ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundException extends RuntimeException {
    /*public CustomerNotFoundException(String message){
        super(message);
    }*/
    private final String msg;
}
