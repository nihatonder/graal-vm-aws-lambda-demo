package com.nonder.graal_vm_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private Long orderId;
    private String name;
    private int quantity;
}
