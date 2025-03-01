package Lec03_Operators;

public class Lab08_Concatenation_01 {
    public static void main(String[] args) {
        String first_name = "Priya";
        String last_name = "Tyagi";
        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // PriyaTyagi1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // First + math -> 20PriyaTyagi


        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub



    }
}
