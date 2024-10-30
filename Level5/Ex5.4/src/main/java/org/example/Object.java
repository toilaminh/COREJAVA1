package org.example;

import java.util.Scanner;

public class Object {
    private int x;
    private int y;
    public Object(){
        System.out.print("Your x: ");
        Scanner input = new Scanner(System.in);
        this.x = input.nextInt();
        System.out.print("Your y: ");
        this.y = input.nextInt();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
