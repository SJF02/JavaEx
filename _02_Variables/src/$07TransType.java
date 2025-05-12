public class $07TransType {
    //실수 표현범위 > 정수 표현범위
    public static void main(String[] args) {
        int total = 297;        // 총점
        int stNum = 4;          // 학생수
        double avg = 0.;        // 평균
        System.out.println("총점은 " + total + "입니다.");
        // java의 int연산끼리의 결과는 int가 나온다.
        // 실수가 나오지 않는다.
        avg = total/stNum;
        System.out.println("평균은 " + avg + "입니다.");
        // 둘중에 1개값을 double형으로 변환하면 결과가 double형으로 나온다.
        avg = (double)total/stNum;      //total/(double)stNum;
        System.out.println("평균은 " + avg + "입니다.");
    }
}
