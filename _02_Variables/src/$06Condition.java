public class $06Condition {
    public static void main(String[] args) {
        int score = 90;

        if(score >= 85)
            System.out.println("상위권입니다.");
        else
            System.out.println("상위권이 아닙니다.");

        System.out.println("--------------------------");

        // 조건연산자(삼항연산자)
        // A ? B : C;
        String result;
        result = score >= 85 ? "상위권입니다." : "상위권이 아닙니다";
        System.out.println(result);
    }
}
