package com.micro.customer_ecommerce.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstname,
        @NotNull(message = "Customer lastname is required")
        String lastname,
        @NotNull(message = "Email is required")
        @Email(message = "Customer email is not a valid email address")
        String email,
        Address address
) {
    
}
