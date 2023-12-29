package com.nonder.graal_vm_demo;

import com.nonder.graal_vm_demo.model.Order;

import java.util.function.Function;

public class SendOrder implements Function<Order, String> {

    @Override
    public String apply(Order order) {
        return order.getQuantity() + " " + order.getName() + " ordered!";
    }
}
