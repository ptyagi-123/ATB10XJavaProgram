package Lec05_TernaryOperators;

public class Lab02_Java02 {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int number = -5;
        String result  = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
