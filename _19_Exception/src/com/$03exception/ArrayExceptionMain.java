package com.$03exception;

import java.util.Scanner;

public class ArrayExceptionMain {
    public static void main(String[] args) {
        int[] arr = {10, 99, 100, 100};

        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        while(isRun){
            System.out.println("숫자가 4개 있습니다.\n"
                + "(0, 1, 2, 3)을 입력하면 해당 순서 값을 출력합니다.\n"
                + "-1을 입력하면 종료합니다.");
            int idx = sc.nextInt();
            if(idx == -1)            
                isRun = false;
            else
                System.out.println(" => " + arr[idx]);
        }

        sc.close();
    }
}
