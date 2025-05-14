package com.$02class;

import java.util.Scanner;


public class Restaurant {
    // 필드
    public Scanner sc;
    public String name;
    public String[] foods;
    
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
