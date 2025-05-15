package com.$03ext;

public class ExtendsMain {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.handsome();
        ch.wealth();
        ch.play();

        System.out.println("잘생김 점수 : " + ch.handsomeScore);
        System.out.println("돈 : " + ch.money);
        System.out.println("즐거운 날 : " + ch.day);
    }
}
