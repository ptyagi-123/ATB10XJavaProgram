package Lec04_TypeCasting;

public class Lab03_typeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit
    }
}
