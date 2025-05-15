package com.$07class;

import java.util.Scanner;

/*
 * 클래스 설계의 접근제한 원칙
 * 1) 필드 : private, getter/setter
 * 2) 메서드 : public
 */

public class Restaurant {
    // 필드
    private Scanner sc;
    private String name;
    private String[] foods;

    public Scanner getSc() {
        return this.sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFoods() {
        return this.foods;
    }

    public void setFoods(String[] foods) {
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
