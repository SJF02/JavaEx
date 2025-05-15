package com.$06class;

/* private은 같은 Human내에서만 접근 가능
 * 외부(HumanMain) 클래스에서는 접근 불가
 * 만약 접근하고 싶다면 getter/setter를 통해 접근해야 한다.
 */
public class Human {
    private String name;
    private int age;
    private double score;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age <= 0)
            return;     // 메서드 여기서 종료

        this.age = age;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        if(score <= 0.)
            return;
            
        this.score = score;
    }

}
