// 5. star(5);
//    을 입력하면 
//    *
//    **
//    ***
//    ****
//    *****
//    위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.

import java.util.Scanner;

public class $05Resolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 >> ");
        int num = sc.nextInt();
        String star = "";

        for(int i=0;i<num;i++){

            // 각 row마다 *이 별 몇개 찍어야 하는지 
            for(int j=0;j<(i+1);j++)
                star += "*";
            System.out.println(star);
            star = "";
        }


        sc.close();
    }
}
