package com.$07hasa;

public class NursePolice extends Police {
    private int thermometer;

    public NursePolice(int clothes, int thermometer){
        super(clothes);
        this.thermometer = thermometer;
    }

    public void calcThermometer(){
        if(this.thermometer > 0){
            System.out.println("Check 36.5 Temp");
            this.thermometer--;
        }else{
            System.out.println("No Check Temp");
        }
    }
}
