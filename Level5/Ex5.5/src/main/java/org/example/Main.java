package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<Object[]> groupBy(Object[] arr, char c){
        List<Object[]> result = new ArrayList<>();
        for(int i = 0;i < arr.length - 1;i++){
            List<Object> temp = new ArrayList<>();
            temp.add(arr[i]);
            for (int j = i+1;j < arr.length;j++){
                if(c == 'a'){
                    if(arr[i].geta() == arr[j].geta()){
                        temp.add(arr[j]);
                    }
                }
            }
            for(Object[] x : result){
                if(!x.equals(temp)){
                    Object[] t = temp.toArray(new Object[0]);
                    result.add(t);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr_large;
        while (true)
        {
            try{
                System.out.print("Your collection large: ");
                Scanner input = new Scanner(System.in);
                arr_large = input.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        Object[] obj_arr = new Object[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    obj_arr[i] = new Object();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        char g_by;
        while (true)
        {
            try{
                System.out.print("Your group: ");
                Scanner input = new Scanner(System.in);
                g_by = input.next().charAt(0);
                break;
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        System.out.println("Collection after:");
        for (Object[] obj : groupBy(obj_arr,g_by)){
            System.out.print("{ ");
            for (Object i : obj){
                System.out.print("[ ");
                System.out.print(i.geta() + " - " + i.getb());
                System.out.print(" ] ");
            }
            System.out.println("}");
        }
    }
}