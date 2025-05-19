package com.$04interface.factory;

import com.$04interface.order.ParentCar;

public class FordCar extends ParentCar{

    @Override
    public void turnOn() {
        System.out.println(this.getClass() + " - The engine starts well~");
        delay();
    }

    @Override
    public void turnOff() {
        System.out.println(this.getClass() + " - The start-off works well~");
        delay();
    }

    @Override
    public void accel() {
        System.out.println(this.getClass() + " - The accelerator accelerates well~");
        delay();
    }
    
    @Override
    public void footBreak() {
        System.out.println(this.getClass() + " - Have a good brake stop well~");
        delay();
    }

}
