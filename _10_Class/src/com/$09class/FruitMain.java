package com.$09class;
/*
 * <class와 class간의 상호작용>
 * 1) 요구사항 : "과일구매자는 과일판매자한테 사과 2개를 구매했다."
 *               이것을 객체지향 프로그램으로 묘사하라.
 * 2) 명사/동사 분류법
 *    명사 : App/Solution/System
 *           클래스(상위개념)
 *           필드(하위개념)
 *    동사 : 메서드
 *           클래스와 클래스를 이어주는 관계클래스(컨트롤러)로 만들어진다.
 * 3) MVC(역할) 패턴
 *    1979 : 제록스 팔로알토 연구소
 *    Model : 데이터베이스(제어) 
 *    View : 화면/입출력
 *    Controller : 중간 연결, Business Layer, 통신
 * 
 *    Vo : 필드를 묶어서 저장하는 용도의 객체(클래스)
 *    Dto : MVC간에 데이터를 송/수신할 때 묶어서 전송
 */
/*
 * 클래스 : 사용자 정의 자료형, 설계도
 * 객체 : 설계도를 기반으로 생성된 실체(object, instance)
 */
public class FruitMain {
    public static void main(String[] args) {
        FruitSeller seller = new FruitSeller(20);
        FruitBuyer buyer = new FruitBuyer(10000);

        seller.showSaleResult();
        buyer.showBuyResult();

        buyer.buyApple(seller, 2000);

        seller.showSaleResult();
        buyer.showBuyResult();
    }
}
