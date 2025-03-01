package Lec05_TernaryOperators;

public class Lab01_Java01 {
    public static void main(String[] args) {
        //result condition? expression1: expression2
        int age = 1;
        String amIAbleToVote =  age>=18? "Yes you are able to Vote":"No, you can not vote";
        System.out.println(amIAbleToVote);
    }
}
