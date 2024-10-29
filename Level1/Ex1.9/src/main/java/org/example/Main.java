package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str;
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Your string: ");
                str = input.nextLine();
                if(!str.isBlank()){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Input can't be empty! Please try again!");
            }
        }

        int word_num = 0;
        if(str.charAt(0) != ' ')
        {
            word_num += 1;
        }
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                if(str.charAt(i+1) != ' '){
                    word_num += 1;
                }
            }
        }

        System.out.print("Number of words in your string: " + word_num);
    }
}