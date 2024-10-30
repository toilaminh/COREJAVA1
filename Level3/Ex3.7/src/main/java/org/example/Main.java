package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str_arr;
        System.out.print("Your string: ");
        Scanner input = new Scanner(System.in);
        str_arr = input.nextLine();
        String regex = "[,\\.\\s]";
        String[] word = str_arr.split(regex);
        StringBuilder sb = new StringBuilder();
        for(int i = str_arr.length() - 1; i >= 0; i--){
            if (str_arr.charAt(i) != ' '){
                sb.append(str_arr.charAt(i));
            }
        }
        String rev_str = sb.toString();
        String result = "";
        for(int i = 0;i < word.length;i++){
            for(int j = i; j < word.length;j++){
                String sub_str = "";
                for (int k = i; k <= j;k++){
                    sub_str = sub_str.concat(word[k]);
                    if(rev_str.indexOf(sub_str) >= 0){
                        if(result.length() < sub_str.length()){
                            result = sub_str;
                        }
                    }
                }
            }
        }
        System.out.println("The length of the longest palindrome(" + result + "): " + result.length());
    }
}