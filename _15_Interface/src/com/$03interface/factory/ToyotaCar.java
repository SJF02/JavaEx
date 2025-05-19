package com.$03interface.factory;

import com.$03interface.order.ParentCar;

public class ToyotaCar extends ParentCar{
    
    @Override
    public void turnOn() {
        System.out.println(this.getClass() + " - 起動が安定している");
        delay();
    }

    @Override
    public void turnOff() {
        System.out.println(this.getClass() + " - 起動が安定してオフになる");
        delay();
    }

    @Override
    public void accel() {
        System.out.println(this.getClass() + " - Excelのパフォーマンスは安定しています");
        delay();
    }
    
    @Override
    public void footBreak() {
        System.out.println(this.getClass() + " - ブレーキが安定して動作する");
        delay();
    }
}
