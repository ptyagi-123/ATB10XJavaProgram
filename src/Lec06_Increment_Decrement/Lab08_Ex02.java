package Lec06_Increment_Decrement;

public class Lab08_Ex02 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A - ExpA  -> 11 , a -> 11 - U1
        // +
        // ++a -> B -> ExpB -> 12 ,  a -> 12 - U2
        // ExpA + ExpB -> 23
    }
}
