package com.$03lambda;

@FunctionalInterface
interface Calculator{
    // 인터페이스의 메서드는 자동으로 public
    int sum(int a, int b);
    //int mul(int a, int b);
}


public class Sample {
    public static void main(String[] args) {
        // 람다식으로 익명 객체 생성
        Calculator mc = (int a, int b) -> a+b;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
