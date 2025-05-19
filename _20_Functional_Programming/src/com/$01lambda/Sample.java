package com.$01lambda;

interface Calculator{
    // 인터페이스의 메서드는 자동으로 public
    int sum(int a, int b);
}

class MyCalculator implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}

public class Sample {
    public static void main(String[] args) {
        Calculator mc = new MyCalculator();
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
