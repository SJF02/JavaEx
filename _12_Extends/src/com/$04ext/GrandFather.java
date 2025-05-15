package com.$04ext;

public class GrandFather {
    int handsomeScore = 10;

    // 디폴트 생성자
    public GrandFather(){
        System.out.println("GrandFather 생성자");
    }

    public GrandFather(int score){
        this.handsomeScore = score;
        System.out.println("GrandFather 매개변수 생성자");
    }

    void handsome(){
        System.out.println("잘 생겼다~");
    }
}
