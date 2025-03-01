package Lec07_If_Condition;

import java.util.Scanner;

public class Lab03_If_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Your age her! (only integer)");
        int age = sc.nextInt();   //java.util.InputMismatchException

        if(age>18){
            System.out.println("Yeah! You are allowed to Vote");
        }
        else{
            System.out.println("You are not allowed to vote");
        }
    }
}
