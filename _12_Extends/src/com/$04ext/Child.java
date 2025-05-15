package com.$04ext;

public class Child extends Father{
    float day = 365 + 1.0f/4;

    public Child(){
        System.out.println("Child 생성자");
    }

    public Child(int score, long money, float day){
        super(score, money);    // 부모생성자(Father(score, money))
        this.day = day;
        System.out.println("Child 매개변수 생성자");
    }

    void play(){
        System.out.println("인생이 즐겁다~");
    }
}
