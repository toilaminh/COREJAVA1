package org.example;

import java.util.Arrays;
import java.util.Comparator;
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
        Arrays.sort(str_arr, Comparator.comparing(String::length));
        int[] counter = new int[arr_large];
        int index = 0;
        for(String s : str_arr){
            int s_c = 1;
            for(int i = 0;i < s.length(); i++){
                for(int j = i;j < s.length(); j++){
                    if(s.charAt(i) == s.charAt(j) && j!=i){
                        s_c += 1;
                    }
                }
            }
            counter[index] = s_c;
            index += 1;
        }
        for(int i = 0;i < str_arr.length;i++){
            for (int j = i;j < str_arr.length;j++){
                if(i!=j && counter[i] > counter[j] && str_arr[i].length() == str_arr[j].length()){
                    String s_t = str_arr[i];
                    str_arr[i] = str_arr[j];
                    str_arr[j] = s_t;
                    int n_t = counter[i];
                    counter[i] = counter[j];
                    counter[j] = n_t;
                    break;
                }
            }
            System.out.println(str_arr[i] + " " + counter[i]);
        }

    }
}