package com.example.RestaurantManagementSystem.repository;

import com.example.RestaurantManagementSystem.entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DBMManagement {
    @Autowired
    private HashMap<Integer,Restaurant> restaurantDb;

    public HashMap<Integer, Restaurant> getRestaurantDb() {
        return restaurantDb;
    }
}
