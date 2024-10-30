package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<String[]> splitString(String[] arr, int n_split){
        List<String[]> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int flag = 0;
        for (int i = 0;i < arr.length;i++){
            if(flag < n_split){
                temp.add(arr[i]);
                flag += 1;
            }
            else{
                String[] t = temp.toArray(new String[0]);
                result.add(t);
                temp.clear();
                temp.add(arr[i]);
                flag = 1;
            }
        }
        if(!temp.isEmpty()){
            String[] t = temp.toArray(new String[0]);
            result.add(t);
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
        int request;
        while (true)
        {
            try{
                System.out.print("Your split large: ");
                Scanner input = new Scanner(System.in);
                request = input.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        List<String[]> result = splitString(str_arr,request);
        for(String[] str_split : result){
            System.out.print("[ ");
            for (String i : str_split){
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }
}