package com.$03interface.factory;

// 다른 패키지의 선언을 접근할 때
import com.$03interface.order.ICar;

public class FordCar implements ICar{

    @Override
    public void turnOn() {
    }

    @Override
    public void turnOff() {
    }

    @Override
    public void accel() {
    }
    
    @Override
    public void footBreak() {
    }

}
