/// HeatWaterCalculator.java
// Brian Preston
// CSD 402 Module 1.2
// This program calculates the energy needed to heat water from an initial temperature to a final temperature.

package com.mycompany.heatwatercalculator;

import java.util.Scanner;

/**
 * Brian Preston
 * CSD 402 Module 1.2
 * This program calculates the energy needed to heat water from an initial temperature to a final temperature.
 */
public class HeatWaterCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Friendly introduction
        System.out.println("Hi there, it's Brian! Let's calculate the energy needed to heat some water.");

        // Prompt the user to enter the mass of water
        System.out.print("First, how much water do you have (in kilograms)? ");
        double waterMass = input.nextDouble();

        // Prompt the user to enter the initial temperature
        System.out.print("Great! What is the initial temperature of the water (in Celsius)? ");
        double initialTemperature = input.nextDouble();

        // Prompt the user to enter the final temperature
        System.out.print("Almost done! What is the final temperature you want the water to reach (in Celsius)? ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed using the formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("\nThanks for providing the details! Here's the result:");
        System.out.printf("The energy needed to heat %.2f kg of water from %.2f°C to %.2f°C is %.2f joules.\n", 
                waterMass, initialTemperature, finalTemperature, energy);

        // Friendly sign-off
        System.out.println("\nI hope this calculation was helpful. Have a great day! - Brian");
    }
}

