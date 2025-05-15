package com.$08class;

import java.util.Scanner;

/*
 * 클래스 설계의 접근제한 원칙
 * 클래스의 시작시 초기화가 필요할 때 사용하는 메서드
 * => 생성자
 * 객체가 만들어지기 전에 생성자가 호출되고 객체가 메모리에 올라간다.
 */

public class Restaurant {
    // 필드
    private Scanner sc;
    private String name;
    private String[] foods;

    // 생성자(메서드)
    // 클래스 이름과 동일, 리턴형이 없다다
    // 객체가 생성될 때 자동호출
    public Restaurant(Scanner sc, String name, String[] foods){
        System.out.println("Restaurant 생성자 호출~");
        // this.sc는 필드의 sc를 가리킨다.
        // 대입연산자(=) 우측의 sc는 매개변수(메서드 소속)를 의미한다.
        this.sc = sc;
        this.name = name;
        this.foods = foods;
    }
    
    // 내부에서만 사용하므로 getter/setter가 필요없다.
    private int selectMenuNum;

    // 메서드
    public void viewMenu(){
        System.out.printf("*****[%s]*****\n", name);
        for(int i=0;i<foods.length;i++)
            System.out.println(i + "." + foods[i]);
    }
    public void selectFood(){
        System.out.print("어떤 음식을 선택하시겠습니까? >> ");
        selectMenuNum = sc.nextInt();
    }
    public void deliveryFood(){
        String food = foods[selectMenuNum];
        System.out.println(food + "이 나왔습니다.");
        System.out.println("맛있게 드세요~");
    }
}
