/*
 *  UCF COP3330 Summer 2021 Assignment 31 Solution
 *  Copyright 2021 RAYME PERSAD
 */

/*
When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
Generate a table with the results as shown in the example output.
The formula is:
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
 */


package org.example;
import java.util.Scanner;

public class kardovenHeartRatePrinter {
public static void main (String[] args) throws java.lang.Exception
        {
        // your code goes here
        int restingHR,age;
        Scanner sc=new Scanner(System.in);
        restingHR = sc.nextInt();
        age = sc.nextInt();

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96){
        int Target = (((220 - age) - restingHR) * intensity) + restingHR;
        System.out.println(intensity+"% | "+Target +"bpm");
        intensity+=5;
        }

}

        public void readHeartRate() {
        }

        public void printHeartRate() {
        }

