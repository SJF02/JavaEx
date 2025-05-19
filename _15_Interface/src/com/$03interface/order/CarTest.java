package com.$03interface.order;

public class CarTest {
    private int test_num;
    private ICar car;

    public int getTest_num() {
        return this.test_num;
    }

    public void setTest_num(int test_num) {
        this.test_num = test_num;
    }

    public ICar getCar() {
        return this.car;
    }

    public void setCar(ICar car) {
        this.car = car;
    }

    public CarTest(){
        this.test_num = 3;
    }

    // ICar의 자식 객체가 생성자를 통해 주입된다(DI)
    public CarTest(ICar car, int test_num){
        this.car = car;
        this.test_num = test_num;
    }

    public void onOffTest(){
        for(int i=0;i<this.test_num;i++){
            car.turnOn();
            car.turnOff();
        }
    }
    public void speedTest(){
        for(int i=0;i<this.test_num;i++){
            car.accel();
            car.accel();
            car.accel();
        }
    }
    public void footBreakTest(){
        for(int i=0;i<this.test_num;i++){
            car.accel();
            car.footBreak();
            car.footBreak();
            car.footBreak();
        }
    }
    public void driveTest(){
        for(int i=0;i<this.test_num;i++){
            car.turnOn();
            car.accel();
            car.accel();
            car.footBreak();
            car.footBreak();
            car.turnOff();
        }
    }
}
