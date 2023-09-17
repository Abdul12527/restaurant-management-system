package com.example.RestaurantManagementSystem.services;

import com.example.RestaurantManagementSystem.entities.Restaurant;
import com.example.RestaurantManagementSystem.repository.DBMManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

@Service
public class RestaurantManagementServices {
    @Autowired
    DBMManagement dbmManagement;
    public boolean addRestaurant(Restaurant restaurant){
        HashMap<Integer,Restaurant> restaurantDb=dbmManagement.getRestaurantDb();
        if(restaurantDb.containsKey(restaurant.getId()))return false;
        restaurantDb.put(restaurant.getId(),restaurant);
        return true;
    }
    public List<Restaurant> getAllRestaurant(){
        return dbmManagement.getRestaurantDb().values().stream().toList();
    }
    public Restaurant getRestaurantById(Integer id){
        return dbmManagement.getRestaurantDb().get(id);
    }


        private static void setIfNotNullAndNotEmpty (String value, Consumer < String > setter){
            if (value != null && !value.isEmpty()) {
                setter.accept(value);
            }
        }

        public boolean updateRestaurantInfo (Integer restaurantId, String name, String address, String
        contactNumber, String speciality, Integer totalStaff, String openingTime, String closingTime ){
        HashMap<Integer, Restaurant> restaurantDb = dbmManagement.getRestaurantDb();
        if (!restaurantDb.containsKey(restaurantId)) return false;
        Restaurant restaurant = restaurantDb.get(restaurantId);

        setIfNotNullAndNotEmpty(name, restaurant::setName);
        setIfNotNullAndNotEmpty(address, restaurant::setAddress);
        setIfNotNullAndNotEmpty(contactNumber, restaurant::setContactNumber);
        setIfNotNullAndNotEmpty(speciality, restaurant::setSpeciality);
        setIfNotNullAndNotEmpty(openingTime, restaurant::setOpeningTime);
        setIfNotNullAndNotEmpty(closingTime, restaurant::setClosingTime);

        if (totalStaff != null && totalStaff > 0) {
            restaurant.setTotalStaff(totalStaff);
        }
        return true;
    }


    public boolean deleteRestaurantById(Integer restaurantId){
        HashMap<Integer,Restaurant> restaurantDb=dbmManagement.getRestaurantDb();
        if(!restaurantDb.containsKey(restaurantId))return false;
        restaurantDb.remove(restaurantId);
        return true;
    }
}
