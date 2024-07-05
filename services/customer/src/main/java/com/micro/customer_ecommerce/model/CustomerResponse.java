package com.micro.customer_ecommerce.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerResponse(String id,
                               String firstname,
                               String lastname,
                               String email,
                               Address address) {
}
