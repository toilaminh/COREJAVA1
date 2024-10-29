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
        String longest = "";
        String[] top_word = new String[arr_large];
        String[] str_arr = new String[arr_large];
        for (int i = 0; i < arr_large; i++){
            String top = "";
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
            String regex = "[,\\.\\s]";
            String[] word = str_arr[i].split(regex);
            for(String s : word){
                if(s.length() > top.length()){
                    top = s;
                }
            }
            top_word[i] = top;
        }
        for(String s : top_word){
            System.out.println("Top word: " + s);
            if(s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println("The longest word is: " + longest);
    }
}