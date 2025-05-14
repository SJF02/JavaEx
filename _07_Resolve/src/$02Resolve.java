// 2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
public class $02Resolve {
    public static void main(String[] args) {
        String[] names = {"Albert", "Paul", "James", "Kelly", "Smith",
                          "아이유", "수지", "제니", "트와이스", "문채원"};
        for(int i=names.length-1;i>=0;i--)
            System.out.println(names[i]);
    }
}
