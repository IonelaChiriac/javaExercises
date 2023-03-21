package playground;

public class Tests {

////it will compile but it will not run
//    public static void main(String arg) {
//        int $123 = 99;
//        System.out.println($123 / 0);
//    }
//}


////java: incompatible types: possible lossy conversion from int to byte
////byte can store 127 max
//    public static void main(String[] args) {
//        byte b = 128;
//        System.out.println(b);
//    }
//}


////    output
////    88
////    88
////    88
//    public static void main(String[] args) {
//        int b, c;
//        int a = b = c = 88;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//}


// //output 10
//    public static void main(String[] args) {
//        int a= a = a = 10;
//        System.out.println(a);
//    }
//}

////compile time error
//    public static void main(String[] args) {
//        char ch;
//        System.out.println(ch == 0);
//
//    }
//}


////output A
//    public static void main(String as[]){
//        char CHAR='A';
//        System.out.println(CHAR);
//    }
//}


////output 99
//    public static void main(String as[]) {
//        int _123 = 99;
//        System.out.println(_123);
//    }
//}


////compile time error -> true or false , java is case sensitive
//    public static void main(String as[]) {
//        boolean valid = TRUE;
//        System.out.println(valid);
//    }
//}


////compile time error
//    public static void main(String as[]){
//        int a=b=c=999;
//        System.out.println(c);
//    }
//}

}