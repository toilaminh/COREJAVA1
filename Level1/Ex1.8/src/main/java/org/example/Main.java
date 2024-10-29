package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr_large;
        while (true)
        {
            try {
                System.out.print("Your array large: ");
                Scanner input = new Scanner(System.in);
                arr_large = input.nextInt();
                if (arr_large > 0)
                {
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        float[] num_arr = new float[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    num_arr[i] = input.nextFloat();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        Arrays.sort(num_arr);
        if(arr_large % 2 == 1){
            System.out.println("Median number of your list is: " + num_arr[(arr_large + 1)/2 - 1]);
        }
        else {
            float median_num = (num_arr[(arr_large - 1)/2] + num_arr[(arr_large + 1)/2])/2;
            System.out.println("Median number of your list is: " + median_num);
        }
    }
}