package Lec03_Operators;

public class Lab13_Interview {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 15 || balaji_salary <75);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false

    }
}
