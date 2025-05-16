package com.$04ext;

public class GrandFather {
    // 접근제한자를 설정하지 않으면 default권한이 부여된다.
    // default권한은 동일 package내에서는 접근이 가능하다.
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
