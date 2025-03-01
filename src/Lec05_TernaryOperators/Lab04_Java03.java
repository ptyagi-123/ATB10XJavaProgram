package Lec05_TernaryOperators;

public class Lab04_Java03 {
    public static void main(String[] args) {

        // Find the maximum number between two numbers.
        // X and Y -> Max X, y -> Ternary Op.
        int a = 15;
        int b = 56;
        String max = a>b? "a is max": "b is max";
        int max1 = a>b? a: b;
        System.out.println(max);
        System.out.println(max1);
    }
}
