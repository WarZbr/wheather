# Weather Station

A simple Java implementation of a weather station that notifies multiple display devices when the temperature changes, demonstrating the Observer design pattern.

## Overview

This project simulates a weather station that can register multiple display devices (observers) and notify them whenever the temperature changes. It's a practical example of the Observer design pattern, where the weather station (subject) maintains a list of observers and notifies them of state changes.

## Project Structure

- [Main.java](cci:7://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Main.java:0:0-0:0) - Contains the main method to demonstrate the weather station functionality
- [WeatherStation.java](cci:7://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/WeatherStation.java:0:0-0:0) - Implements the Subject interface and manages observers
- [Subject.java](cci:7://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Subject.java:0:0-0:0) - Defines the contract for subjects in the Observer pattern
- [Observer.java](cci:7://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Observer.java:0:0-0:0) - Defines the contract for observers
- [PhoneDisplay.java](cci:7://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/PhoneDisplay.java:0:0-0:0) - A display that shows temperature in Celsius
- [TVDisplay.java](cci:7://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/TVDisplay.java:0:0-0:0) - A display that shows temperature in Fahrenheit

## How It Works

1. The [WeatherStation](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/WeatherStation.java:3:0-32:1) class implements the [Subject](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Subject.java:0:0-4:1) interface and maintains a list of [Observer](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Observer.java:0:0-2:1) objects.
2. Display devices ([PhoneDisplay](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/PhoneDisplay.java:0:0-8:1) and [TVDisplay](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/TVDisplay.java:0:0-9:1)) implement the [Observer](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Observer.java:0:0-2:1) interface.
3. When the temperature changes in the [WeatherStation](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/WeatherStation.java:3:0-32:1), it notifies all registered observers.
4. Each observer updates its display with the new temperature.

## Features

- Multiple display types (Phone and TV) can subscribe to temperature updates
- Displays can be dynamically added or removed during runtime
- Different display types can show the temperature in different formats (Celsius/Fahrenheit)

## Running the Example

To run the example, simply execute the [Main](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Main.java:0:0-20:1) class. The program will:
1. Create a weather station
2. Register a phone display and a TV display
3. Update the temperature multiple times
4. Remove the TV display and update the temperature again

## Design Pattern

This project demonstrates the **Observer** design pattern, where:
- The [Subject](cci:2://file:///home/bruno/%C3%81rea%20de%20Trabalho/Dev/wheather/src/main/java/Subject.java:0:0-4:1) (WeatherStation) maintains a list of observers
- Observers (PhoneDisplay, TVDisplay) register themselves with the subject
- When the subject's state changes, it notifies all registered observers
- Observers can be added or removed at runtime

## Requirements

- Java 8 or higher
- No external dependencies required

## Author

Bruno Gabriel Alves Silva

## License

This project is open source and available under the [MIT License](LICENSE).**