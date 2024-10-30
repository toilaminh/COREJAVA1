package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr_large, target = 0;
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
        while (true){
            try{
                System.out.print("Your target int: ");
                Scanner input = new Scanner(System.in);
                target = input.nextInt();
                if(target > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        int counter = 0;
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
            if(currentSum == target){
                counter += 1;
            }
        }
        System.out.println("Number of distinct subsequences of the list that sum up to a target value: " + counter);
    }
}