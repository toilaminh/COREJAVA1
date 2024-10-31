package org.example;

import java.util.Scanner;

public class Object {
    private int id;
    public void newObj(){
        System.out.print("ID: ");
        Scanner s = new Scanner(System.in);
        this.id = s.nextInt();
    }
    public int getId(){
        return this.id;
    }
}
