package com.$06iskindof;

/*
 * 객체지향 재사용 방법
 * 1) 상속(is a => is kind of)
 *    호랑이는 포유류이다. => 호랑이는 포유류의 종류이다.
 *    설계 바운더리의 정의가 전제
 *    장점 : Framework 개발 방법론의 근본
 *           상속을 통해 기능을 매우 쉽게 구현
 *           기하급수적인 기능의 증가 
 *    단점 : 잘못된 설계된 상속구조에서 계속 대물림된다.
 * 2) 포함(has a)
 *    필통은 지우개가 들어있다.
 *    장점 : 부담이 없다.
 *           필요하면 포함, 필요없으면 배제
 *           잘못 설계된 클래스가 있어도 상속에 비해 영향이 상대적으로 적다.
 *    단점 : 산술적인 기능의 증가
 * 
 *    * App 초기 설정은 Framework의 상속을 통해 설정하고
 *      일반적인 개발 전개는 포함을 더 많이 사용한다.
 */
/*
 *      Gun과 Police는 자연스러운 종속관계가 아닌데
 *     Gun의 기능을 사용하기 위해 상속을 사용하면
 *     내려가면 내려갈 수록 불필요하거나 이상기능을 포함하므로
 *     App에 좋지 않은 영향을 준다.
 *      이런 경우는 포함관계를 사용하는 것이 좋다.
 * 
 *        Gun
 *         |
 *       Police
 *   |            |
 * ForcePolice   NursePolice
 */
public class PoliceMain {
    public static void main(String[] args) {
        ForcePolice fp = new ForcePolice(10, 5);
        fp.run();
        fp.fight();
        fp.shot();
        fp.putHandCuffs();

        NursePolice np = new NursePolice(10, 5, 3);
        np.calcThermometer();
        np.putHandCuffs();
        np.shot();
        np.shot();
        np.shot();
    }
}
