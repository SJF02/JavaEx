// 15. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//    삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)

import java.util.Scanner;

public class $15Resolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 정수 입력 >> ");
        int num0 = sc.nextInt();
        System.out.print("2번째 정수 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("3번째 정수 입력 >> ");
        int num2 = sc.nextInt();

        /* 
        if((num1+num2) > num0){
            if((num0+num2) > num1){
                if((num0+num1) > num2){
                    System.out.println("삼각형을 만들 수 있습니다.");
                }else{
                    System.out.println("삼각형을 만들지 못합니다.");
                }
            }else{
                System.out.println("삼각형을 만들지 못합니다.");
            }
        }else{
            System.out.println("삼각형을 만들지 못합니다.");
        }
        */

        /* 
        if(((num1+num2) > num0) && ((num0+num2) > num1) && ((num0+num1) > num2))
            System.out.println("삼각형을 만들 수 있습니다.");
        else
            System.out.println("삼각형을 만들지 못합니다.");
        */
        String result = (((num1+num2) > num0) && ((num0+num2) > num1) && ((num0+num1) > num2)) ?
        "삼각형을 만들 수 있습니다.":
        "삼각형을 만들지 못합니다.";

        System.out.println(result);

        sc.close();

    }
}
