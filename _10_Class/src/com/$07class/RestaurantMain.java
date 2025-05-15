package com.$07class;

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant rest = new Restaurant();
        rest.setSc(sc);
        rest.setName("새마을 식당");
        rest.setFoods(new String[]{"열탄불고기", "한돈생삼겹살", 
                                  "한돈수제양념구이", "제주생소시지"});
        rest.viewMenu();
        rest.selectFood();
        rest.deliveryFood();

        Restaurant rest1 = new Restaurant();
        rest1.setSc(sc);
        rest1.setName("낙원타코");
        rest1.setFoods(new String[]{"낙원 파히타", "치폴레 크림 파스타",
                                   "쉬림프 퀘사디아", "스테이크 부르또"});
        rest1.viewMenu();
        rest1.selectFood();
        rest1.deliveryFood();

        Restaurant rest2 = new Restaurant();
        rest2.setSc(sc);
        rest2.setName("소호정");
        rest2.setFoods(new String[]{"국시", "국밥", "수육", "전", 
                                    "참문어", "메밀묵"});
        rest2.viewMenu();
        rest2.selectFood();
        rest2.deliveryFood();  

        sc.close();
    }
}
