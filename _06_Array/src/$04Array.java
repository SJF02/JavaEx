import java.util.Scanner;

public class $04Array {
    public static void main(String[] args) throws Exception {
        final int ST_NUM = 7;       // 변수->상수(변경불가)

        Scanner sc = new Scanner(System.in);

        int[] kor = new int[ST_NUM];
        for(int i=0;i<kor.length;i++){
            System.out.print((i+1) + "번째 학생 국어점수 입력 >> ");
            kor[i] = sc.nextInt();            
        }

        int total = 0;
        for(int i=0;i<kor.length;i++){
            total += kor[i];
        }
        double avg = (double)total/kor.length;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        System.out.printf("평균: %.2f\n", avg);

        sc.close();
    }   
}
