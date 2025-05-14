package com.$03class;

public class ArithMain {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int result = 0;

        result = Arith.add(a, b);
        System.out.println("덧셈은 " + result);
        result = Arith.sub(a, b);
        System.out.println("뺄셈은 " + result);
        result = Arith.mul(a, b);
        System.out.println("곱셈은 " + result);
        result = Arith.div(a, b);
        System.out.println("나눗셈은 " + result);
    }
}
