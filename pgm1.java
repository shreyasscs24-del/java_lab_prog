

import java.util.*;

class pgm1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 150;

        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > c && b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}