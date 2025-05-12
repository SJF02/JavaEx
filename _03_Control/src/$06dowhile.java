public class $06dowhile {
    public static void main(String[] args) {
        int num = 1;            // 초기식
        do{
            System.out.println("나무를 " + num + "번 두드렸습니다");
            num++;              // 증감식
        }while(num <= 10);      // 조건식

        System.out.println("나무를 캐었습니다~~~");
    }
}
