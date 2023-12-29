package com.nonder.graal_vm_demo;

import com.nonder.graal_vm_demo.model.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Component
public class ReadOrders implements Supplier<List<Order>> {

    @Override
    public List<Order> get() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101L, "Book", 10));
        orders.add(new Order(102L, "Pencil", 2));
        return orders;
    }
}
