// 3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요

import java.util.Scanner;

public class $03Resolve {
    public static void main(String[] args) {
        final int ST_NUM = 7;
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double avg = 0.;
        int[] scores = new int[ST_NUM];

        for(int i=0;i<scores.length;i++){
            System.out.print((i+1) + "번째 학생 학점 입력 >> ");
            scores[i] = sc.nextInt();
        }
        for(int score : scores)
            total += score;

        avg = (double)total/scores.length;

        System.out.println("총점 : " + total);
        System.out.printf("평균: %.2f\n", avg);

        sc.close();
    }
}
