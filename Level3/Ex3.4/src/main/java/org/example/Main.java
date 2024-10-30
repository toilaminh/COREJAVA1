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
        int o1 = 0, o2 = 0, i1 = 0, i2 = 0;
        for(int i = 0;i < arr_large-1;i++){
            int ot = 0;
            for(int j = i+1; j < arr_large;j++){
                if(str_arr[i].equals(str_arr[j])){
                    ot += 1;
                }
            }
            if(ot > o2){
                o2 = ot;
                i2 = i;
            }
            if(o2 > o1){
                ot = o1;
                o1 = o2;
                o2 = ot;
                int it = i2;
                i1 = i2;
                i2 = i1;
            }
        }
        if(str_arr[i1].equals(str_arr[i2]))
        {
            System.out.println("This is only 1 string with overlaps: " + str_arr[i1]);
        }
        else {
            System.out.println("2 longest string with overlap: " + str_arr[i1] + " " + str_arr[i2]);
        }
    }
}