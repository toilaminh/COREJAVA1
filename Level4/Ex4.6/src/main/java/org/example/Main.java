package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void printSubsets(int[] set, int length)
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        int arr_large;
        while (true){
            try{
                System.out.print("Your array length: ");
                Scanner input = new Scanner(System.in);
                arr_large = input.nextInt();
                if(arr_large > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        int[] arr = new int[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    arr[i] = input.nextInt();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        List<Integer> mul = new ArrayList<>();
        for (int i = 0; i < (1<<arr_large); i++)
        {
            List<Integer> temp = new ArrayList<>();
            int flag = 0;
            for (int j = 0; j < arr_large; j++) {
                if ((i & (1 << j)) > 0) {
                    flag += 1;
                    temp.add(arr[j]);
                }
            }
            if(flag == 3){
                int t_mul = 1;
                for (int t : temp){
                    t_mul *= t;
                }
                mul.add(t_mul);
            }
            temp.clear();
        }
        int biggest = mul.getFirst();
        for(int i : mul){
            if (i > biggest){
                biggest = i;
            }
        }
        System.out.println("The maximum product: " + biggest);
    }
}