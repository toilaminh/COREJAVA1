package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr_large;
        while (true) {
            try {
                System.out.print("Your array length: ");
                Scanner input = new Scanner(System.in);
                arr_large = input.nextInt();
                if (arr_large > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input! Please try again!");
            }
        }
        float[] str_arr = new float[arr_large];
        for (int i = 0; i < arr_large; i++) {
            while (true) {
                try {
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextFloat();
                    break;
                } catch (Exception e) {
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        int counter = 1;
        for (int i = 0; i < arr_large - 1; i++) {
            int sub_counter = 1;
            float temp = str_arr[i];
            for (int j = i + 1; j < arr_large; j++) {
                if (temp < str_arr[j]) {
                    temp = str_arr[j];
                    sub_counter += 1;
                }
            }
            if (sub_counter > counter) {
                counter = sub_counter;
            }
        }
        if (counter > 1) {
            System.out.println("Longest increasing subsequence: " + counter);
        }
    }
}