package org.example;

import java.util.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<Map<String,Integer>> mapKey(Object[] objects, String[] key){
        List<Map<String,Integer>> result = new ArrayList<>();
        int[] k_map = new int[3];
        int ind = 0;
        for (int k = 0;k < 3;k++){
            if(key[k].equals("a")){
                k_map[ind] = 1;
                ind += 1;
            }
            else if(key[k].equals("b")){
                k_map[ind] = 2;
                ind += 1;
            }
            else {
                k_map[ind] = 3;
                ind +=1;
            }
        }
        for(Object o : objects){
            ind = 0;
            LinkedHashMap<String,Integer> temp = new LinkedHashMap<>();
            for(int k : k_map){
                if(k == 1){
                    temp.put("a", o.getA());
                }
                else if (k == 2){
                    temp.put("b", o.getB());
                }
                else {
                    temp.put("c", o.getC());
                }
            }
            result.add(temp);
        }
        return result;
    }
    public static void main(String[] args) {
        int obj_n, key_large = 3;
        while (true){
            try{
                System.out.println("Your obj num: ");
                Scanner s = new Scanner(System.in);
                obj_n = s.nextInt();
                if(obj_n > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }

        String[] key = new String[key_large];
        System.out.println("Your key: ");
        for (int i = 0;i < key_large;i++){
            Scanner s = new Scanner(System.in);
            key[i] = s.nextLine();
        }

        Object[] o = new Object[obj_n];
        for (int i = 0;i < obj_n;i++){
            System.out.println("Your " + i + " obj:");
            o[i] = new Object();
            o[i].newObj();
        }
        List<Map<String,Integer>> newCollection = mapKey(o,key);
        int index = 1;
        for(Map<String,Integer> m : newCollection){
            System.out.println("Your " + index + " map:");
            for(Map.Entry<String,Integer> mm : m.entrySet()){
                System.out.println(mm.getKey() + " - " + mm.getValue());
            }
            index += 1;
        }
    }
}