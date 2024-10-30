package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int bubbleSortCounter(int arr[], int n){
        int counter = 0;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    counter += 1;
                }
            }
            if (swapped == false)
                break;
        }
        return counter;
    }
    public static void main(String[] args) {
        int large;
        while (true){
            try{
                System.out.println("Your arr large: ");
                Scanner s = new Scanner(System.in);
                large = s.nextInt();
                if(large > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        int[] arr = new int[large];
        for(int i = 0;i < large;i++){
            Scanner s = new Scanner(System.in);
            System.out.print("Your " + i + ": ");
            arr[i] = s.nextInt();
        }
        System.out.println("Bubble sort counter: " + bubbleSortCounter(arr, large));
    }
}