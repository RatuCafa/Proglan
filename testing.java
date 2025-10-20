package Modul_1;

public class testing {
    public static int findmin (int a, int b, int c ) {
        if (a <= b && b <= c){
            return a;
        } else if (b <= a && b <= c) {
            return b;
        }else {
            return c;
        }
    }
}

