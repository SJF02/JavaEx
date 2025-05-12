public class $10continue {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            System.out.println("3*" + i + "=" + (3*i));
        }
        System.out.println();

        for(int i=1;i<=9;i++){
            if(i%2==0)      // 짝수일때
                continue;   // 반복문을 돌아가라
            System.out.println("5*" + i + "=" + (5*i));
        }
    }
}
