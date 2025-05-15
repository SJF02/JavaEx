package com.$02ext;

public class ExtendsMain {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.handsome();
        ch.wealth();
        ch.play();

        // 필드도 역시 메서드처럼 상속이 된다.
        System.out.println("잘생김 점수 : " + ch.handsomeScore);
        System.out.println("돈 : " + ch.money);
        System.out.println("즐거운 날 : " + ch.day);
    }
}
