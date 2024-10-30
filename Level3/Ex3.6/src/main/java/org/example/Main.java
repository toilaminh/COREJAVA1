package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr_large1, arr_large2;
        while (true)
        {
            try {
                System.out.print("Your first array large: ");
                Scanner input = new Scanner(System.in);
                arr_large1 = input.nextInt();
                if (arr_large1 > 0)
                {
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        float[] num_arr1 = new float[arr_large1];
        for (int i = 0; i < arr_large1; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    num_arr1[i] = input.nextFloat();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        while (true)
        {
            try {
                System.out.print("Your second array large: ");
                Scanner input = new Scanner(System.in);
                arr_large2 = input.nextInt();
                if (arr_large2 > 0)
                {
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        float[] num_arr2 = new float[arr_large2];
        for (int i = 0; i < arr_large2; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    num_arr2[i] = input.nextFloat();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        float[] num_arr = new float[arr_large1+arr_large2];
        System.arraycopy(num_arr1,0,num_arr,0,arr_large1);
        System.arraycopy(num_arr2,0,num_arr,arr_large1,arr_large2);
        Arrays.sort(num_arr);
        if(num_arr.length % 2 == 1){
            System.out.println("Median number of your list is: " + num_arr[(num_arr.length + 1)/2 - 1]);
        }
        else {
            float median_num = (num_arr[(num_arr.length - 1)/2] + num_arr[(num_arr.length + 1)/2])/2;
            System.out.println("Median number of your list is: " + median_num);
        }
    }
}