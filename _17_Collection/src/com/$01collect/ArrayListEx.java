package com.$01collect;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        // python의 리스트와 동일
        // ArrayList : 동적 배열, 꽉차면 크기가 자동 증가
        // 배열리스트 : 순서보장, 삽입/삭제
        // List<Integer> list = new ArrayList<>();

        // 링크드리스트 : 순서보장, 삽입/삭제

        /* int : Primitive Type(기본 타입)
         * Integer : Collection/Generic에서는 반드시 Reference Type만 요구
         *           int -> Integer를 사용해야 한다.
         */

        List<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        while(isRun){
            System.out.print("정수 입력 (0 입력시 종료)>> ");
            int num = sc.nextInt();
            if(num == 0)
                isRun = false;
            list.add(num);
        }

        for(int a : list)
            System.out.print(a + " ");
        System.out.println();

        sc.close();
    }
}
