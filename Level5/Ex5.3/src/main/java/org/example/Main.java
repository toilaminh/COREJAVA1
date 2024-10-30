package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<String> uniq(String[] arr){
        List<String> result = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            boolean flag = false;
            for (String str : result){
                if(str.equals(arr[i])){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr_large;
        while (true)
        {
            try{
                System.out.print("Your string large: ");
                Scanner input = new Scanner(System.in);
                arr_large = input.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        String[] str_arr = new String[arr_large];
        for (int i = 0; i < arr_large; i++){
            String top = "";
            while (true)
            {
                try{
                    System.out.print("Your string " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextLine();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        System.out.println("String after:");
        for (String i : uniq(str_arr)){
            System.out.print(i + " ");
        }
    }
}