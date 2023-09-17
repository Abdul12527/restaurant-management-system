package com.example.RestaurantManagementSystem.config;

import com.example.RestaurantManagementSystem.entities.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class DBConfig {
    @Bean
    HashMap<Integer, Restaurant> dbStart(){
        return new HashMap<Integer, Restaurant>();
    }
}
