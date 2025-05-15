package com.$06class;

public class HumanMain {
    public static void viewInfo(Human human){
        System.out.println("이름 : " + human.getName());
        System.out.println("나이 : " + human.getAge());
        System.out.println("학점 : " + human.getScore());
    }
    public static void main(String[] args) {
        Human human = new Human();
        /*
        human.name = "Albert";
        human.age = 24;
        human.score = 4.5;
        */
        human.setName("Albert");
        human.setAge(24);
        human.setScore(4.5);
        viewInfo(human);

        // 잘못된 값이 입력되는 것을 막아야 할 필요성
        /*
        human.age = -10;
        human.score = -20.9;
        */
        human.setAge(-10);
        human.setScore(-20.9);
        viewInfo(human);
    }
}
