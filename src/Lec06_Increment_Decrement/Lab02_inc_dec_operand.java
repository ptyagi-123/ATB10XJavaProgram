package Lec06_Increment_Decrement;

public class Lab02_inc_dec_operand {
    public static void main(String[] args) {

        // pre - increment - ++operand.
        // value is incremented first and then stored in the result.
       int a =24;
       int b = ++a;
        System.out.println(a);
        System.out.println(b);


        //  Exp and Result Table
        // Line No | a | Result b
        //   8 | 10 | NA
        // 9   | 11 | 11
        // 10   | NA | 11
        // 11   | 11 | NA
    }
}
