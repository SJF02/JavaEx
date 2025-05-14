// 12. for문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
//    for문내에 조건문을 넣어주면 됨
//    짝수 조건 if(num % 2 == 0)
public class $12Resolve {
    public static void main(String[] args) {
        for(int num = 1;num <= 10;num++){
            if(num % 2 == 0)
                System.out.println(num);
        }
    }
}
