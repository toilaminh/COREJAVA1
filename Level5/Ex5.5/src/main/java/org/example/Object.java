package org.example;

import java.util.Scanner;

public class Object {
    private int a;
    private int b;
    public Object(){
        System.out.print("Your a: ");
        Scanner input = new Scanner(System.in);
        this.a = input.nextInt();
        System.out.print("Your b: ");
        this.b = input.nextInt();
    }

    public int geta() {
        return a;
    }

    public int getb() {
        return b;
    }
}
