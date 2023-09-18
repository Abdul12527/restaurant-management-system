# Restaurant Management System
## Language and Framework

![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Description

Welcome to the Restaurant Management System repository! This open-source project is a Java-based application built using the Spring Boot framework. The Restaurant Management System allows users to manage restaurant information through a set of APIs. With these APIs, users can perform various operations such as adding a restaurant, retrieving all restaurants, retrieving a restaurant by its ID, updating restaurant information, and deleting a restaurant.

## Restaurant Entity

The `Restaurant` entity possesses the following properties, each with its validation constraints:

- `id` (Integer): A unique identifier for each restaurant (Not null).
- `name` (String): The name of the restaurant (Not null, Not blank).
- `address` (String): The address of the restaurant (Not null, Not blank).
- `contactNumber` (String): The contact number of the restaurant, following the pattern "\\+\\d{1,3}\\s?\\d{1,14}".
- `speciality` (String): The restaurant's specialty.
- `totalStaff` (Integer): The total number of staff members (Minimum value of 1).
- `openingTime` (String): The opening time of the restaurant, following the pattern "^(1[0-2]|0?[1-9]):[0-5][0-9][ap]m$".
- `closingTime` (String): The closing time of the restaurant, following the pattern "^(1[0-2]|0?[1-9]):[0-5][0-9][ap]m$".

## Endpoints

The project provides the following API endpoints for managing restaurant information:

### 1. Add Restaurant

- **HTTP Method**: POST
- **Endpoint**: `/restaurant`
- **Description**: Adds a new restaurant to the system. Accepts a `Restaurant` object in the request body with validation.

### 2. Get All Restaurants

- **HTTP Method**: GET
- **Endpoint**: `/restaurants`
- **Description**: Retrieves a list of all restaurants in the system.

### 3. Get Restaurant by ID

- **HTTP Method**: GET
- **Endpoint**: `/restaurant/id/{id}`
- **Description**: Retrieves restaurant information by its unique ID. Passes the restaurant ID as a path variable.

### 4. Update Restaurant Information

- **HTTP Method**: PUT
- **Endpoint**: `/restaurant/info`
- **Description**: Updates restaurant information. Accepts restaurant ID and optional parameters for name, address, contact number, specialty, total staff, opening time, and closing time as request parameters.

### 5. Delete Restaurant by ID

- **HTTP Method**: DELETE
- **Endpoint**: `/restaurant/id/{id}`
- **Description**: Deletes a restaurant by its unique ID. Passes the restaurant ID as a path variable.

## Project Structure

The project is organized into several parts, each serving a specific purpose:

### 1. Entities

This section contains the `Restaurant` class, representing the core entity of the system. The class includes properties that define a restaurant, including validation constraints.

### 2. Repository

The repository section includes methods for interacting with the simulated database (HashMap) and performing CRUD (Create, Read, Update, Delete) operations on restaurant data.

## Getting Started

To get started with the Restaurant Management System, follow the instructions in the [Installation](#installation) section below.

### Prerequisites

Make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven
- Spring Boot Dependency

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/Abdul12527/restaurant-management-system.git
2. Navigate to the project directory

    ```bash
    cd restaurant-management-system

## Usage

To use the User Management System, you can make HTTP requests to the provided API endpoints using your favorite API testing tool or framework.
