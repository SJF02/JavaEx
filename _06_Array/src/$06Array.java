public class $06Array {
    public static void main(String[] args) {
        int[] scores = {95, 87, 89, 72, 33};
        int sum = 0;

        for(int i=0;i<scores.length;i++)
            sum += scores[i];

        System.out.println("총합: " + sum);

        //foreach문
        sum = 0;
        for(int score : scores)
            sum += score;

        System.out.println("총합: " + sum);
    }
}
