package com.$01abstract;

/* 추상클래스
 ; 추상메서드를 1개이상 포함한 클래스

   추상메서드
 ; 현재 클래스에서는 구현정의를 하지 않고
  상속을 통해서 자식 클래스에서 구현하도록 선언부만 정의한 것

   추상 클래스는 객체를 만들 수 없다.
   상속을 하기 위한 클래스이다.
 * 
 */
/*
 * 캡슐화 : public, private
 * 상속성 : public, protected, private
 * 
 * protected : 다른 클래스한테는 private처럼
 *             자식 클래스한테는 public처럼
 */

public abstract class Calc {
    protected int a, b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }

    // 추상메서드
    public abstract int calculate();
}
