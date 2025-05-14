package com.$01class;

public class RestaurantMain {
    public static void main(String[] args) {
        // 클래스도 자료형
        // 클래스를 사용하려면 변수를 선언해야 한다.
        // 클래스의 변수 == 객체(변수)
        // 클래스를 객체로 생성한 것 == 인스턴스화 했다.(메모리에 올렸다.)
        // 클래스는 Heap메모리에 실체가 올라간다.
        // Stack 변수에는 hashcode값이 저장된다.
        Restaurant rest = new Restaurant();
        rest.viewMenu();
        rest.selectFood();
        rest.deliveryFood();
        rest.closeRestaurant();
    }
}
