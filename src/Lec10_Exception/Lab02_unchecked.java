package Lec10_Exception;

public class Lab02_unchecked {
    public static void main(String[] args) {
//JVM primary responsibilities is checked for semantic errors
        int a =0;
        int b = 10;
        int c = b/a;
        System.out.println(c); //ArithmeticException: / by zero
        //JVM does not know about this exception - this is unchecked exception

        String name = null;
        name.trim(); //NullPointerException: Cannot invoke "String.trim()" because "name" is null

    }
}
