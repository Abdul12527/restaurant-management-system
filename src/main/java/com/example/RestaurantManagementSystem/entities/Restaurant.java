package com.example.RestaurantManagementSystem.entities;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Restaurant {
    @NotNull
    Integer id;
    @NotBlank
    String name;
    @NotBlank
    String address;
    @Pattern(regexp ="\\+\\d{1,3}\\s?\\d{1,14}")
    String contactNumber;

    String speciality;
    @Min(1)
    Integer totalStaff;
    @Pattern(regexp ="^(1[0-2]|0?[1-9]):[0-5][0-9][ap]m$")
    String openingTime;
    @Pattern(regexp ="^(1[0-2]|0?[1-9]):[0-5][0-9][ap]m$")
    String closingTime;
}
