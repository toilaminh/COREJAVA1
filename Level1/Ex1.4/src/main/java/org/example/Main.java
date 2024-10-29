package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int list_large;
        while (true)
        {
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Your list large: ");
                list_large = input.nextInt();
                if(list_large > 0)
                {
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong list large! Please try again!");
            }
        }
        float largest = 0;
        float[] f_arr = new float[list_large];
        for(int i = 0;i < list_large; i++)
        {
            while (true)
            {
                try{
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter your number " + i + ": ");
                    f_arr[i] = input.nextFloat();
                    if(largest < f_arr[i]){
                        largest = f_arr[i];
                    }
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        System.out.println("Largest number of the list: " + largest);
    }
}