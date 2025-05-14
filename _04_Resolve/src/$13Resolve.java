// 13. 돈의 액수를 입금하세요
//    입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//    출력 개수는 단위가 큰 것 순서로 계산합니다
//    예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.

import java.util.Scanner;

public class $13Resolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("돈을 입금하세요 >> ");
        int money = sc.nextInt();
        int $50000 = money / 50000;     // 5만원 몇장인지
        money = money % 50000;           // 5만원을 제외한 나머지 금액
        int $10000 = money / 10000;
        money = money % 10000;
        int $5000 = money / 5000;
        money = money % 5000;
        int $1000 = money / 1000;
        money = money % 1000;
        int $500 = money / 500;
        money = money % 500;
        int $100 = money / 100;
        money = money % 100;
        int $50 = money / 50;
        money = money % 50;
        int $10 = money / 10;
        money = money % 10;
        int $1 = money;

        System.out.println("50000원은 " + $50000 + "개");
        System.out.println("10000원은 " + $10000 + "개");
        System.out.println("5000원은 " + $5000 + "개");
        System.out.println("1000원은 " + $1000 + "개");
        System.out.println("500원은 " + $500 + "개");
        System.out.println("100원은 " + $100 + "개");
        System.out.println("50원은 " + $50 + "개");
        System.out.println("10원은 " + $10 + "개");
        System.out.println("1원은 " + $1 + "개");

        sc.close();
    }
}
