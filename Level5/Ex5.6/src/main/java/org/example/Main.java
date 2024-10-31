package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String blankCleaner(String arr){
        String result = arr;
        // Xoa blank tai diem dau & diem cuoi truoc
        while (result.charAt(0) == ' '){
            result = result.substring(1, result.length());
        }
        while (result.charAt(result.length() - 1) == ' '){
            result = result.substring(0, result.length() - 1);
        }
        // Tim blank trong string
        for (int i = 0;i < result.length();i++){
            if(result.charAt(i) == ' ' && result.charAt(i+1) == ' '){
                result = result.substring(0,i) + result.substring(i+1,result.length());
                i -= 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Your string: ");
        str = input.nextLine();
        str = blankCleaner(str);
        System.out.println("Your string after: " + str);
    }
}