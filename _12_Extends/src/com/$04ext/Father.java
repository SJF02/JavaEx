package com.$04ext;

public class Father extends GrandFather {
    long money = 1000000000000000000L;

    public Father(){
        System.out.println("Father 생성자");
    }

    public Father(int score, long money){
        super(score);       // 부모생성자 호출을 통해 초기화
        this.money = money;
        System.out.println("Father 매개변수 생성자");
    }

    void wealth(){
        System.out.println("돈을 많이 벌었다.");
    }
}
