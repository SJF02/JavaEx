package com.$04interface.carmain;

import com.$04interface.factory.FordCar;
import com.$04interface.factory.KiaCar;
import com.$04interface.factory.ToyotaCar;
import com.$04interface.order.CarTest;
import com.$04interface.order.ICar;

/*
 * [시나리오]
 * 1. 나의 회사는 자동차 산업에 진출하기 위해 OEM 주문생산요청을 하기로 결정했다.
 *    자동차의 Spec를 각 자동차 생산 회사에 요청하기 위해 ICar를 선언했다.
 *    선언된 ICar 인터페이스를 Ford, Kia, Toyota에 전달하여 구현해 줄 것을
 *    요청했다.
 * 
 * 2-1. 나의 회사는 ICar 인터페이스에 맞는 자동차의 성능을 비교해서 선택하기 위해
 *    CarTest 테스트 프로그램을 개발한다.
 * 
 * 2-2. 자동차 제조사
 *    ICar를 상속받아서 각각 고유한 기술력으로 FordCar, KiaCar, ToyotaCar를 
 *    구현한다.
 * 
 * 3. 자동차 제조사가 보내온 FordCar, KiaCar, ToyotaCar 클래스를 객체로 생성해서
 *    CarTest에 주입한다(DI)
 *    CarTest는 주입한 객체에 따라 성능을 테스트하게 된다.
 * 
 * 4. 점수를 조합해서 최상의 Car를 결정한다.
 */
public class CarMain {
    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        ICar[] carArr = {new FordCar(), new KiaCar(), new ToyotaCar()};
        int[] score = {0, 0, 0};

        for(int i=0;i<carArr.length;i++){
            carTest.setTest_num(1);
            carTest.setCar(carArr[i]);      // 의존성 주입(DI)

            score[i] += carTest.onOffTest();
            score[i] += carTest.speedTest();
            score[i] += carTest.footBreakTest();
            score[i] += carTest.driveTest();
            System.out.println("----------------------------------");
        }
        for(int i=0;i<carArr.length;i++){
            System.out.println("[ " + carArr[i].getClass().getName() + " ] : " + score[i]);
        }
        System.out.println();
        int idx = getMaxScoreIdx(score);
        System.out.println("선정된 차는 " + carArr[idx].getClass().getName()
                         + "이고, 점수는 " + score[idx] + "입니다.");
    }

    // 가장 높은 점수의 인덱스 반환하는 메서드
    private static int getMaxScoreIdx(int[] score){
        int idx = 0;
        int max = score[0];
        for(int i=0;i<score.length;i++){
            if(max < score[i]){
                idx = i;
                max = score[i];
            }
        }
        return idx;
    }
}
