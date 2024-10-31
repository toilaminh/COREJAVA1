package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean compareObj(List<Object> a, List<Object> b){
        for(Object x : a){
            for(Object y : b){
                if(!x.equals(y)){
                    return false;
                }
            }
        }
        return true;
    }
    public static List<Object[]> groupBy(Object[] arr, char c){
        List<Object[]> result = new ArrayList<>();
        List<Object> temp = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            //Luc dau clear temp va them phan tu dau
            temp.clear();
            temp.add(arr[i]);
            if(c == 'a'){
                for(int j = 0; j <= i; j++){
                    // Kiem tra xem i dat toi arr.length chua. neu da den thi return ngay
                    if(i >= arr.length){
                        return result;
                    }
                    // Check tu phan tu dau tien toi phan tu i co bi trung lap khong, bi trung lap thi tang i len 1 va kiem tra lai
                    if(arr[j].geta() == arr[i].geta() & j != i){
                        temp.clear();
                        if(i != arr.length){
                            temp.add(arr[i]);
                            i++;
                            j = -1;
                        }
                    }

                }
                for(int j = i + 1;j < arr.length; j++){
                    if(arr[i].geta() == arr[j].geta()){
                        temp.add(arr[j]);
                    }
                }
            }
            else if(c == 'b'){
                for(int j = 0; j < i; j++){
                    // Check tu phan tu dau tien toi phan tu i co bi trung lap khong, bi trung lap thi tang i len 1 va kiem tra lai
                    if(arr[j].getb() == arr[i].getb()){
                        temp.clear();
                        i++;
                        j = -1;
                    }
                }
                for(int j = i + 1;j < arr.length; j++){
                    if(arr[i].getb() == arr[j].getb()){
                        temp.add(arr[j]);
                    }
                }
            }
            if(!temp.isEmpty()){
                result.add(temp.toArray(new Object[0]));
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
        List<Object[]> fi = groupBy(obj_arr,g_by);
        for (Object[] obj : fi){
            System.out.print("<{ ");
            for (Object i : obj){
                System.out.print("[ ");
                System.out.print(i.geta() + " - " + i.getb());
                System.out.print(" ] ");
            }
            System.out.println("}>");
        }
    }
}