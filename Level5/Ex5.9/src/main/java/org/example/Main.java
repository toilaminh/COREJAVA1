package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static HashMap<String, Integer> sumElements(List<HashMap<String,Integer>> list){
        HashMap<String, Integer> result = new HashMap<>();
        for (HashMap<String, Integer> hm : list){
            for (String str : hm.keySet()){
                if(result.keySet().contains(str)){
                    result.replace(str, result.get(str) + hm.get(str));
                }
                else {
                    result.put(str, hm.get(str));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<HashMap<String,Integer>> list = new ArrayList<>();
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("a",1);
        hm1.put("b",2);
        hm1.put("c",3);
        list.add(hm1);
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("a",5);
        hm2.put("b",7);
        hm2.put("c",9);
        list.add(hm2);
        HashMap<String, Integer> hm3 = new HashMap<>();
        hm3.put("a",10);
        hm3.put("b",15);
        hm3.put("d",20);
        list.add(hm3);
        HashMap<String, Integer> hm4 = new HashMap<>();
        hm4.put("b",1);
        hm4.put("c",5);
        hm4.put("d",3);
        list.add(hm4);
        HashMap<String, Integer> final_hm = sumElements(list);
        System.out.println("= = = = RESULT = = = =");
        for (String key : final_hm.keySet()){
            System.out.println("Key: " + key + " | Value: " + final_hm.get(key));
        }
        System.out.println("= = = = = ** = = = = =");
    }
}