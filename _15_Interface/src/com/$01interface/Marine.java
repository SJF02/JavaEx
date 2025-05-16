package com.$01interface;

/* 구현/추상 클래스는 상속시 extends 키워드 사용
 * 인터페이스는 implements를 사용
 */
public class Marine implements StarUnit{

    @Override
    public void walk() {
        System.out.println("아장아장~");
    }

    @Override
    public void attack() {
        System.out.println("두두두두~");
    }

    @Override
    public void die() {
        System.out.println("으악~");
    }
}
