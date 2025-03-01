package Lec05_TernaryOperators;

public class Lab03_Interview01 {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int num = 15;
        String result = (num>10)? (num>20? "G>20":"between 10 & 20"):"B";
        System.out.println(result);

    }
}
