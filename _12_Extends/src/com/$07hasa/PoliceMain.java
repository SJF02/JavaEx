package com.$07hasa;

/*  경찰이 총을 사용하는 관계 == 즉, 포함관계가 더 알맞다.
    필요한 클래스 단계에서 해당 클래스의 객체를 포함해서  사용하는 것이 부담이 적다.
              Police
                |
    ForcePolice    NursePolice
       | Gun |
 *     
 */
public class PoliceMain {
    public static void main(String[] args) {
        ForcePolice fp = new ForcePolice(3, 5, 5);
        fp.run();
        fp.fight();
        fp.shot();
        fp.putOnHandCuffs();

        NursePolice np = new NursePolice(5, 7);
        np.calcThermometer();
    }
}
