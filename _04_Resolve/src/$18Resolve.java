// 18. 입력받은 숫자의 구구단을 출력하세요
//    예를 들어 3을 입력하면 
//    3 x 1 = 3
//    3 x 2 = 6
//    ...
//    3 x 9 = 27

import java.util.Scanner;

public class $18Resolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 출력할 단의 숫자 입력 >> ");
        int num = sc.nextInt();
        for(int i=1;i<=9;i++){
            System.out.println(num + "*" + i + "=" + (num*i));
        }
        sc.close();
    }
}
