package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int INDEX;
    public static void switchOrder(Object[] objects,int id, int index) {
        for(int i = 0;i < INDEX; i++){
            if(objects[i].getId() == id){
                Object temp = objects[i];
                objects[i] = objects[index];
                objects[index] = temp;
                break;
            }
        }
    }

    public static void main(String[] args) {
        int obj_n;
        while (true) {
            try {
                System.out.println("Your obj num: ");
                Scanner s = new Scanner(System.in);
                obj_n = s.nextInt();
                if (obj_n > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input! Please try again!");
            }
        }
        INDEX = obj_n;

        //New obj
        Object[] o = new Object[obj_n];
        for (int i = 0; i < obj_n; i++) {
            System.out.println("Your " + i + " obj:");
            o[i] = new Object();
            o[i].newObj();
        }

        int id, index;
        while (true){
            try{
                System.out.print("Id need to switch: ");
                Scanner s = new Scanner(System.in);
                id = s.nextInt();
                if(id >= 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        while (true){
            try{
                System.out.print("Index: ");
                Scanner s = new Scanner(System.in);
                index = s.nextInt();
                if(index < INDEX){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }

        // Dao vi tri
        switchOrder(o,id,index);
        System.out.println("Your new order map:");
        System.out.print("{ ");
        for (int i = 0; i < INDEX;i++) {
            System.out.print(o[i].getId() + " - " + i);
        }
        System.out.println(" }");
    }
}