// 4. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
//    while문내에 조건문을 넣어주면 됨
//    짝수 조건 if(num % 2 == 0)
public class $04Resolve {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 10){
            if(num % 2 == 0)
                System.out.println(num);
            num++;
        }
    }
}
