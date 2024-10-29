package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Your string: ");
        str = input.nextLine();
        System.out.println(("Your string's length: " + str.length()));
    }
}