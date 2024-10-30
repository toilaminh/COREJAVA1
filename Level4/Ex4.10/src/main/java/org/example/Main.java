package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String searchLongestSub(String[] k){
        int arr_counter = 0;
        String shortest_string = k[0];
        String sub_string = "";
        for(String test_string : k)
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
                for(String test_string : k)
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
        return sub_string;
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

        System.out.println("Longest substring is: " + searchLongestSub(str_arr) + " with " + searchLongestSub(str_arr).length() + " characters long!");
    }
}