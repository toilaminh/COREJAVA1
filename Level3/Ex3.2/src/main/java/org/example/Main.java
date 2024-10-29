package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
        int l1 = ThreadLocalRandom.current().nextInt(0,arr_large);
        int l2 = ThreadLocalRandom.current().nextInt(0,arr_large);
        while (l1 == l2){
            l2 = ThreadLocalRandom.current().nextInt(0,arr_large);
        }
        System.out.println((Math.abs(str_arr[l1] - str_arr[l2])) + " ( ket qua cua " + str_arr[l1] + " & " + str_arr[l2] + " )");
    }
}