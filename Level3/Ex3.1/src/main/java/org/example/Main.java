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
        float[] str_arr = new float[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextFloat();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        float sec_number = 0;
        for (int i = 0; i < arr_large; i++)
        {
            int num_of_smaller = 0;
            for (int j = 0; j < arr_large; j++){
                if(str_arr[j] < str_arr[i]){
                    num_of_smaller += 1;
                }
            }
            if(num_of_smaller == 1)
            {
                sec_number = str_arr[i];
                break;
            }
        }
        System.out.println("The second smallest number: " + sec_number);
    }
}