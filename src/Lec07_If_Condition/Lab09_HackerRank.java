package Lec07_If_Condition;

import java.util.Scanner;

public class Lab09_HackerRank {
    public static void main(String[] args) {

        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // Logic Building - Java (Copyright by Pramod Sir :D )


        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) | data type -> int
        // Output | grade -> data type -> char


        // Step 2. Basic Logic |  Rough Logic
        // if ( score >=90 && score <=100 -> return or print grade  - A
        // else if ( score <=89 && score >=80-> return or print grade  - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,
        //  // else -> grade -> F

        // 3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your marks here to get the Grade!");
        int marks = sc.nextInt();
        char grade ='F';

        if(marks>=90 && marks<=100){
            //System.out.println("Your Grade is A!");
            grade='A';
        }
        else if (marks>=80 && marks<=89){
            //System.out.println("Your Grade is B!");
            grade='B';
        }
        else if (marks>=70 && marks<=79){
            //System.out.println("Your Grade is C!");
            grade = 'C';
        }
        else if (marks>=60 && marks<=69){
            //System.out.println("Your Grade is D!");
            grade = 'D';
        }
        else if (marks<=0 || marks>100){
            grade = 'O';
        }
        else{
            //System.out.println("Your Grade is F!");
            grade ='F';
        }
        System.out.println("Your Grade is " + grade);


        // Step 4: edge cases

    }
}
