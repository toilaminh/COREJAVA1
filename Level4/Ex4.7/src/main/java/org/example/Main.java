package org.example;

import java.util.Collection;
import java.util.Collections;
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
        String[] str_arr = new String[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextLine();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        for (int i = 0;i < arr_large;i++){
            for (int j = i;j < arr_large;j++){
                if (str_arr[i].length() < str_arr[j].length() && i!=j){
                    String t = str_arr[i];
                    str_arr[i] = str_arr[j];
                    str_arr[j] = t;
                }
                else if(str_arr[i].length() == str_arr[j].length() && i!=j){
                    if(str_arr[i].compareTo(str_arr[j]) < 0) {
                        String t = str_arr[i];
                        str_arr[i] = str_arr[j];
                        str_arr[j] = t;
                    }
                }
            }
        }
        for (String i : str_arr){
            System.out.print(i + " ");
        }
    }
}