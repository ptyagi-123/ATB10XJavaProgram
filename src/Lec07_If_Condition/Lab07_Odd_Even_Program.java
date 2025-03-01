package Lec07_If_Condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab07_Odd_Even_Program {
    public static void main(String[] args) {


        // Create a Program - Take user input
        // Check weather the input is even or odd number

        // Step 1 - Figure out inputs and outputs
        // number  (int) -> i/o -> Scanner Class can be used to take input
        // string -> odd or even -> o/p , println

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your number here!");
        int number = sc.nextInt();

        // Step 2 - Logic Rough
        // num%2 ==0 ->  even  - modulus - R == 0 -> even
        // num%2 !=0 -> odd ->


        // Step 3 :  Logic write
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close(); // stop taking input now.

        // Step 4 :  edge cases
        // large int, -ve handle, zero, other input - G


    }
}
