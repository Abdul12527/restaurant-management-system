package com.example.RestaurantManagementSystem.controller;

import com.example.RestaurantManagementSystem.entities.Restaurant;
import com.example.RestaurantManagementSystem.services.RestaurantManagementServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CurdAPIs {

    RestaurantManagementServices restaurantManagementServices;

    @PostMapping("/restaurant")
    public String addRestaurant(@RequestBody @Valid Restaurant restaurant){
        if (restaurantManagementServices.addRestaurant(restaurant)) return "200 added successfully";
        return "Restaurant already exist with same ID";
    }

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurant(){
        return restaurantManagementServices.getAllRestaurant();
    }
    @GetMapping("/restaurant/id/{id}")
    public Restaurant getRestaurantById(@PathVariable Integer id){
        return restaurantManagementServices.getRestaurantById(id);
    }

    @PutMapping("/restaurant/info")
    public String  updateRestaurantInfo(@RequestParam Integer restaurantId,@RequestParam(required = false) String name,@RequestParam(required = false) String address,@RequestParam(required = false) String contactNumber,@RequestParam(required = false) String speciality,@RequestParam(required = false) Integer totalStaff,@RequestParam(required = false) String openingTime,@RequestParam(required = false) String closingTime ){
        if(restaurantManagementServices.updateRestaurantInfo(restaurantId,name,address,contactNumber,speciality,totalStaff,openingTime,closingTime))return "200 updated successfully";
        return "restaurant id doesn't exist";
    }
    @DeleteMapping("/restaurant/id/{id}")
    public String deleteRestaurantById(@PathVariable Integer id){
        if(restaurantManagementServices.deleteRestaurantById(id))return "200 deleted successfully";
        return "restaurant with given id doesn't exist";
    }

}
