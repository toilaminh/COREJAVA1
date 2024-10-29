package org.example;

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
        int sum_tf = 0;
        int[] str_arr = new int[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextInt();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        int sub_sum = 0;
        for (int i = 0; i < arr_large-1; i++){
            for (int j = i+1; j < arr_large; j++){
                int sum = 0;
                for (int k = i; k <= j; k++){
                    sum += str_arr[k];
                }
                if(sum > sub_sum){
                    sub_sum = sum;
                }
            }
        }
        System.out.println("The maximum sum of all contiguous sub-array is: " + sub_sum);
    }
}