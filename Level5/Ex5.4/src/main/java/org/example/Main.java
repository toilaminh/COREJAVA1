package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<Object> uniq(Object[] arr){
        List<Object> result = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            boolean flag = false;
            for (Object object : result){
                if(object.getX() == arr[i].getX() && object.getY() == arr[i].getY()){
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
        System.out.println("String after:");
        for (Object i : uniq(obj_arr)){
            System.out.print("[ ");
            System.out.print(i.getX() + " - " + i.getY());
            System.out.println(" ]");
        }
    }
}