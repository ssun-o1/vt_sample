package com.sun.improve.reflict;

public class Son extends Father {
    public static int b = 2;

    static {
        a = 3;
        System.out.println(b);
    }

    static {
        b = 4;
        System.out.println(a);

    }

    public static void main(String[] args) {
        System.out.println(Son.b);
    }
}
