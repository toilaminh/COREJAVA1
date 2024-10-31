package org.example;

import java.util.Scanner;

public class Object {
    private int a;
    private int b;
    private int c;
    public void newObj(){
        Scanner s = new Scanner(System.in);
        System.out.println("Your a:");
        this.a = s.nextInt();
        System.out.println("Your B:");
        this.b = s.nextInt();
        System.out.println("Your c:");
        this.c = s.nextInt();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

}
