package org.example;

import java.util.Arrays;
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
                    System.out.print("Your string " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextLine();
                    if(!str_arr[i].isBlank()){
                        break;
                    }
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        Arrays.sort(str_arr);
        for( String inspect : str_arr){
            System.out.print(inspect + " ");
        }
    }
}