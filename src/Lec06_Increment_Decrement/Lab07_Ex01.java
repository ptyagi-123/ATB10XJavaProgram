package Lec06_Increment_Decrement;

public class Lab07_Ex01 {
    public static void main(String[] args) {
   int a = 10;
        System.out.println(a++ + ++a);

        // a++ -> A -> ExpA -> 10, a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA + ExpB -> 10+12 -> 22

    }
}
