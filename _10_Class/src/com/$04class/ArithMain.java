package com.$04class;

public class ArithMain {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int result = 0;

        Arith arith = new Arith();

        result = arith.add(a, b);
        System.out.println("덧셈은 " + result);
        result = arith.sub(a, b);
        System.out.println("뺄셈은 " + result);
        result = arith.mul(a, b);
        System.out.println("곱셈은 " + result);
        result = arith.div(a, b);
        System.out.println("나눗셈은 " + result);
    }
}
