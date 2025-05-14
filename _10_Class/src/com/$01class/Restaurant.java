package com.$01class;

import java.util.Scanner;

/*
 * 클래스는 영역이 있다.(캡슐화)
 * 클래스 = 변수(필드) + 함수(메서드)
 * => 메서드가 필요한 변수는 클래스 내부에 있어야
 *    독립성에 유리
 * => 독립성이 있어야 조립/설계가 유리하다.
 * 
 * 식당 클래스
 * 필드 = 변수 = 명사
 * 메서드 = 함수 = 동사
 */

public class Restaurant {
    // 필드
    private String[] foods = {"냉면", "떡볶이", "쌀국수",
                              "칼국수", "순대", "튀김", "라면"};
    private int selectMenuNum;
    private Scanner sc = new Scanner(System.in);

    // 메서드
    public void viewMenu(){
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
    public void closeRestaurant(){
        sc.close();
    }
}
