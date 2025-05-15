package com.$01ext;

public class ExtendsMain {
    public static void main(String[] args) {
        Father fa = new Father();
        fa.handsome();
        fa.wealth();

        Child ch = new Child();
        ch.handsome();
        ch.wealth();
        ch.play();
    }
}
