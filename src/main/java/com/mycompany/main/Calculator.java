/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JOptionPane;

/**
 *
 * @author thand
 */
public class Calculator {
    // Method for addition
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

   //multiplication method
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //Dision method
    public int divide(int  num1, int num2) {
        //Make use of if statement to set a condition in instance user inputs a 0
        if (num2 != 0) {
            return num1 / num2;
        } else {
            //Return and display a message to inform user not to divide by zero 
            JOptionPane.showMessageDialog(null, "Numbers can not be divides by zero.");
            return 0;
        }
    }
}
