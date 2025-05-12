public class App {
    public static void main(String[] args) throws Exception {
        // java는 변수의 자료형을 명확하게 규정해야 한다.
        int num = 100;              // 정수
        double dnum = 3.14;         // 실수 (double float)
        char ch = 'a';              // 문자 1글자(작은따옴표)
        String name = "Albert";     // 문자열(큰따옴표)
        boolean isRun = true;       // 논리형, true/false

        // java는 자료형을 엄격히 규정한다.
        //num = "Paul";

        //num = 2147483648;   //2147483647;

        System.out.println(num);
        System.out.println(dnum);
        System.out.println(ch);
        System.out.println(name);
        System.out.println(isRun);
    }
}
