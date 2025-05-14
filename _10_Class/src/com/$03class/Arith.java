package com.$03class;

/*
 * 메서드에 static 키워드를 붙이면
 * 객체를 만들지 않아도 바로 메모리에 올라간다.
 * 클래스를 통해 바로 사용가능하다.
 * static키워드를 사용하는 메서드는 범용성을 가진 기능(유틸리티)의
 * 메서드/어디서나 바로 호출하는 메서드인 경우는 종종 static으로 
 * 생성한다.
 * 
 * static을 붙이지 않으면 반드시 객체를 만들어야 
 * 객체를 통해 사용할 수 있다.
 */

public class Arith {
    public static int add(int num0, int num1) {
        return num0 + num1;
    }

    public static int sub(int num0, int num1) {
        return num0 - num1;
    }

    public static int mul(int num0, int num1) {
        return num0 * num1;
    }

    public static int div(int num0, int num1) {
        return num0 / num1;
    }
}
