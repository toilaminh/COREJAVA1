package org.example;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int str_large;
        while (true)
        {
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Your list large: ");
                str_large = input.nextInt();
                if(str_large > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        String shortest = "";
        String[] str_arr = new String[str_large];
        for (int i = 0; i < str_large; i++){
            while(true){
                try{
                    System.out.print("Your string " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextLine();
                    if (!str_arr[i].isBlank()){
                        break;
                    }
                }
                catch (Exception e){
                    System.out.println("String can't be empty! Please try again!");
                }
            }

            if(shortest.isEmpty())
            {
                shortest = str_arr[i];
            }
            else if(shortest.length() > str_arr[i].length()){
                shortest = str_arr[i];
            }
        }
        System.out.println("Shortest string: " + shortest);
    }
}