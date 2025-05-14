// 3. int result = total(10, 100);
//   위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//   total메서드를 작성하고 사용해보세요.
public class $03Resolve {
    public static int total(int num0, int num1){
        int sum = 0;
        for(int i=num0;i<=num1;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = total(1, 10);
        System.out.println(result);
        result = total(1, 100);
        System.out.println(result);
    }
}
