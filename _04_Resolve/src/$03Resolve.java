// 3. while문을 이용해서 1부터 10까지 합을 출력하세요
public class $03Resolve {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        while(num <= 10){
            sum += num;
            num++;
        }
        System.out.println("합은 " + sum);
    }
}
