/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import javax.swing.JOptionPane;
/**
 *
 * @author thand
 */

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int option = 0;

        // Prompt user for two numbers
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        int num1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        int num2 = Integer.parseInt(input2);

        // Make use of a while loop to keep the loop running  until the user chooses to exit
        while (option != 5) {
            // Display a menu and get the user's choice
            String menu = "Select an operation:\n" +
                          "1. Add\n" +
                          "2. Subtract\n" +
                          "3. Multiply\n" +
                          "4. Divide\n" +
                          "5. Exit";
            String choice = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(choice);

            int result = 0;
            switch (option) {
                //Addition case
                case 1 -> {
                    result = calculator.add( num1,  num2);
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                }
                //Subtraction case
                case 2 -> {
                    result = calculator.subtract(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                }
                //Mutliplication case
                case 3 -> {
                    result = calculator.multiply(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                }
                //Division case 
                case 4 -> {
                    result = calculator.divide(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                }
                //Exit case
                case 5 -> JOptionPane.showMessageDialog(null, "Exiting the calculator.");
                default -> JOptionPane.showMessageDialog(null, "Invalid choice. Please select again.");
            }
        }
    }
}
