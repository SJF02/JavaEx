public class $09break {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);

            // break는 자신을 감싸는 첫번째 반복문 탈출
            if(i==5)
                break;
        }
        System.out.println("End~");
    }
}
