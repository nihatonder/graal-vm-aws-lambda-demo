package com.nonder.graal_vm_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ReadOrders readOrders() {
        return new ReadOrders();
    }

    @Bean
    public SendOrder sendOrder() {
        return new SendOrder();
    }
}
