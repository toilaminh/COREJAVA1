package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr_large;
        while (true){
            try{
                System.out.print("Your array length: ");
                Scanner input = new Scanner(System.in);
                arr_large = input.nextInt();
                if(arr_large > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        int[] arr = new int[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    arr[i] = input.nextInt();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        int length_flag = 1;
        int longest = 1;
        for (int i = 0;i < arr_large - 1;i++){
            if(arr[i] < arr[i+1]){
                length_flag += 1;
            }
            else {
                // Reset lai bien co` do do dai cua subsequence
                if(longest < length_flag)
                {
                    longest = length_flag;
                }
                length_flag = 1;
            }
        }
        System.out.println("The longest subsequence has: " + longest + " length!");
    }
}