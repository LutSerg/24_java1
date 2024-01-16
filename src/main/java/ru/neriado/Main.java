package ru.neriado;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 25;

        byte y = 120;
        byte z = 115;
        byte x = (byte) (y + z);
        int d = Integer.MAX_VALUE + 2;

        double e = 12.3;
        int f = 257;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("++a   = " +  (++a));
        System.out.println("a--   = " +  (a--));
        System.out.println("--a   = " +  (--a));
        System.out.println(d);
        System.out.println("e + f = " + (e + f));
        System.out.println("x = " + (x));


    }
}