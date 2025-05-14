// 7. do~while문을 이용해서 1부터 10까지 합을 출력하세요
public class $07Resolve {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        do{
            sum += num;
            num++;
        }while(num <= 10);
        System.out.println("합은 " + sum);  
        
        int total = 1+2+3+4+5+6+7+8+9+10;
        System.out.println(total);
    }
}
