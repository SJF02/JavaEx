
// 14. 369게임을 작성합니다.
//    1~99까지의 정수를 입력받고
//    3,6,9중 하나가 있으면 "박수짝"을 출력하고
//    2개가 있으면 "박수짝짝"을 출력하세요
//    예를 들어 13은 "박수짝"
//    36인 경우는 "박수짝짝"을 출력하면 됩니다.

import java.util.Scanner;

public class $14Resolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 6, 9};
        String clap = "박수";

        System.out.print("1~99 정수 입력 >> ");
        int num = sc.nextInt();
        int first = num / 10;
        int second = num % 10;

        for(int i=0;i<arr.length;i++){
            if(first == arr[i])
                clap += "짝";
            if(second == arr[i])
                clap += "짝";
        }

        System.out.println(clap);

        sc.close();
    }
}
