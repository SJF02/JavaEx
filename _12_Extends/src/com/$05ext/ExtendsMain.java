package com.$05ext;

public class ExtendsMain {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.handsome();
        ch.wealth();
        ch.play();

        System.out.println("잘생김 점수 : " + ch.getHandsomeScore());
        System.out.println("돈 : " + ch.getMoney());
        System.out.println("즐거운 날 : " + ch.getDay());

        Child ch1 = new Child(7, 9999999L, 72);
        ch1.handsome();
        ch1.wealth();
        ch1.play();

        System.out.println("잘생김 점수 : " + ch1.getHandsomeScore());
        System.out.println("돈 : " + ch1.getMoney());
        System.out.println("즐거운 날 : " + ch1.getDay());
    }
}
