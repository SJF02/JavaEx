package com.$04lambda;

@FunctionalInterface
interface Calculator{
    int sum(int a, int b);
}


public class Sample {
    public static void main(String[] args) {
        // 람다식으로 익명 객체 생성
        Calculator mc = (a, b) -> a+b;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
