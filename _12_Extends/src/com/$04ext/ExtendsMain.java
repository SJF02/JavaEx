package com.$04ext;

public class ExtendsMain {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.handsome();
        ch.wealth();
        ch.play();

        System.out.println("잘생김 점수 : " + ch.handsomeScore);
        System.out.println("돈 : " + ch.money);
        System.out.println("즐거운 날 : " + ch.day);

        Child ch1 = new Child(7, 9999999L, 72);
        ch1.handsome();
        ch1.wealth();
        ch1.play();

        System.out.println("잘생김 점수 : " + ch1.handsomeScore);
        System.out.println("돈 : " + ch1.money);
        System.out.println("즐거운 날 : " + ch1.day);
    }
}
