package Lec08_Switch;

public class Lab04_Interview {
    public static void main(String[] args) {

        char ch = 'A'; // 65
        switch (ch) {
            case 65:
                System.out.println("A");
        }

//        boolean b = true; boolean is not valid
//        switch (b) {
//        }

        long a11 = 30l;
        switch ((int) a11) {
        }

        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");

                //two same cases are not allowed
//          case 98:
//                System.out.println("98");
        }


    }
}
