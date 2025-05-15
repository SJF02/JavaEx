package com.$03ext;

public class Father extends GrandFather {
    long money = 1000000000000000000L;

    public Father(){
        System.out.println("Father 생성자");
    }

    void wealth(){
        System.out.println("돈을 많이 벌었다.");
    }
}
