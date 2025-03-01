package Lec06_Increment_Decrement;

public class Lab01_user_input {
    public static void main(String[] args) {
        String age_string = args[0]; // 99
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(args[1]); // 100
        System.out.println(args[2]); // 101
        System.out.println(args[3]); // 56
//        System.out.println(args[4]); // java.lang.ArrayIndexOutOfBoundsException
        // 99 100 101 56

        String result = age>=18?(age>65?"senior":"adult"):"minor";
        System.out.println(result);
    }
}
