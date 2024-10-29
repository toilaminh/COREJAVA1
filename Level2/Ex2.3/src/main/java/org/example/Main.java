package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] str_arr = new String[2];
        for (int i = 0; i < 2; i++){
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
        }
        int arr_counter = 0;
        String shortest_string = str_arr[0];
        String sub_string = "";
        for(String test_string : str_arr)
        {
            arr_counter += 1;
            if(shortest_string.length() > test_string.length())
            {
                shortest_string = test_string;
            }
        }
        for(int i = 0;i < shortest_string.length(); i++)
        {
            for(int j = i; j <= shortest_string.length(); j++)
            {
                String sub_string_t = shortest_string.substring(i,j);
                int sub_counter = 0;
                for(String test_string : str_arr)
                {
                    int sub_index = test_string.indexOf(sub_string_t);
                    if(sub_index >= 0)
                    {
                        sub_counter += 1;
                    }

                }
                if(sub_counter == arr_counter)
                {
                    if(sub_string_t.length() > sub_string.length())
                    {
                        sub_string = sub_string_t;
                    }
                }
            }
        }
        System.out.println("Longest substring is: " + sub_string);
    }
}