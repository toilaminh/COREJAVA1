package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float num_input;
        while (true)
        {
            try{
                System.out.print("Your number: ");
                Scanner input = new Scanner(System.in);
                num_input = input.nextFloat();
                break;
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }

        System.out.println("Square of number: " + num_input * num_input);
    }
}