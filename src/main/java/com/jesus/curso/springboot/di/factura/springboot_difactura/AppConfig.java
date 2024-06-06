package com.jesus.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        
        Product p1 = new Product("Camara Sony", 500);
        Product p2 = new Product("Lector Codigo Baras", 1750);

        List<Item> items = Arrays.asList(
            new Item(p1, 2),
            new Item(p2, 4)
        );

        return items;
    }
}
