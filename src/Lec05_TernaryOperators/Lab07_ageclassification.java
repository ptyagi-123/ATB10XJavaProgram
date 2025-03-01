package Lec05_TernaryOperators;

public class Lab07_ageclassification {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);
     //int age = 45;

     String result = age>=18?(age>65?"senior":"adult"):"minor";
        System.out.println(result);


    }
}
