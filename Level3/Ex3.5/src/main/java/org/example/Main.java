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
        List<Integer> sum = new ArrayList<>();
        int totalSubsets = 1 << arr_large;
        for (int subsetMask = 0; subsetMask < totalSubsets; subsetMask++) {
            int currentSum = 0;
            for (int i = 0; i < arr_large; i++) {
                if ((subsetMask & (1 << i)) != 0) {
                    currentSum += arr[i];
                }
            }
            sum.add(currentSum);
        }
        int num = 1;
        boolean flag = true;
        while(flag == true){
            boolean in_f = true;
            for(int i : arr){
                if(num == i){
                    num += 1;
                    in_f = true;
                    break;
                }
                else {
                    in_f = false;
                }
            }
            for (int i : sum){
                if(num == i){
                    num += 1;
                    in_f = true;
                    break;
                }
                else {
                    in_f = false;
                }
            }
            if(in_f == false){
                flag = false;
            }
        }
        System.out.println("The smallest number: " + num);
    }
}