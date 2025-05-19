package com.$04interface.order;

public abstract class ParentCar implements ICar{

    private final int DELAY_TIME = 500;

    /*
     * Math.random() : 0.0 <= x < 1.0
     */
    public void delay(){
        // 500 ms ~ 999.999...ms 동안 멈춰라.
        // 0.5초 ~ 1초 사이를 중지

        try {
            Thread.sleep((long)(Math.random() * DELAY_TIME) + DELAY_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
