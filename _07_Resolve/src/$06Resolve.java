// 6. 5명의 학생의 이름과 점수를 입력받고
//    해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//   A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만

import java.util.Scanner;

public class $06Resolve {
    public static void main(String[] args) {
        final int ST_NUM = 5;
        String[] names = new String[ST_NUM];
        int[] scores = new int[ST_NUM];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<ST_NUM;i++){
            System.out.print((i+1) + "번째 학생 이름 입력 >> ");
            names[i] = sc.next();
            System.out.print((i+1) + "번째 학생 점수 입력 >> ");
            scores[i] = sc.nextInt();
        }

        for(int i=0;i<ST_NUM;i++){
            System.out.println("학생 이름 : " + names[i]);
            if(scores[i] >= 90)
                System.out.println("A학점");
            else if(scores[i] >= 80)
                System.out.println("B학점");
            else if(scores[i] >= 70)
                System.out.println("C학점");
            else if(scores[i] >= 60)
                System.out.println("D학점");
            else
                System.out.println("F학점");
        }

        sc.close();
    }
}
