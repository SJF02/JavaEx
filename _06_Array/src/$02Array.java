import java.util.Scanner;

public class $02Array {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] kor = new int[3];
        for(int i=0;i<3;i++){
            System.out.print((i+1) + "번째 학생 국어점수 입력 >> ");
            kor[i] = sc.nextInt();            
        }

        int total = 0;
        for(int i=0;i<3;i++){
            total += kor[i];
        }
        double avg = (double)total/3;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        System.out.printf("평균: %.2f\n", avg);

        sc.close();
    }   
}

