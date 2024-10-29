package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float num1, num2;
        while (true)
        {
            try{
                System.out.print("First number  : ");
                Scanner input1 = new Scanner(System.in);
                num1 = input1.nextFloat();
                break;
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        while (true)
        {
            try{
                System.out.print("Second number : ");
                Scanner input2 = new Scanner(System.in);
                num2 = input2.nextFloat();
                break;
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        float sum = num1 + num2;
        System.out.println("Sum of 2 number: " + sum);
    }
}
