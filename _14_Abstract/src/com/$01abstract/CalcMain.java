package com.$01abstract;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        // 1) 부모의 클래스 변수에 자식 객체를 저장할 수 있다.
        Calc[] calcs = {new Add(), new Sub(), new Mul(), new Div()};

        Scanner sc = new Scanner(System.in);

        boolean isRun = true;
        while(isRun){
            System.out.println("*** 2개의 숫자 입력 후 연산 ***");
            System.out.print("1번째 숫자 입력 >> ");
            int num0 = sc.nextInt();
            System.out.print("2번째 숫자 입력 >> ");
            int num1 = sc.nextInt();
            System.out.print("연산 선택-숫자입력(0 Add, 1 Sub, 2 Mul, 3 Div, 4 Exit) >> ");
            int sel = sc.nextInt();
            if(sel == 4)
                isRun = false;
            else{
                // 부모 클래스 변수에 저장된 자식 객체
                Calc calc = calcs[sel];
                calc.setValue(num0, num1);

                // 각각 자식 객체에 구현된 메서드가 호출
                /* 추상메서드는 클래스에 따른 호출이 아니라
                   객체에 따른 호출이 이루어진다.

                   묶어서 관리하기 편하게 하되,
                   사용은 각 구현대로 사용할 수 있도록 만든 문법
                */
                int result = calc.calculate();
                System.out.println("결과는 " + result);
            }
        }

        System.out.println("End~");

        sc.close();
    }
}
