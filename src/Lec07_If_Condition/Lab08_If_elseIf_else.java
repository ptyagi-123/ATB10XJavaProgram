package Lec07_If_Condition;

import java.util.Scanner;

public class Lab08_If_elseIf_else {
    public static void main(String[] args) {

        // num1 and num2
        // num1 >  num 2 - 1
        // num1 <  num 2 - 2
        // num1 ==  num 2 - 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("num1");
        } else if (num2 > num1) {
            System.out.println("num2");
        } else {
            System.out.println("Equal");
        }


    }
}
