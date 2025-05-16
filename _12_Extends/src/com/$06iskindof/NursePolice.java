package com.$06iskindof;

public class NursePolice extends Police{
    private int thermometers;       // 체온계 개수

    public NursePolice(int bullet, int handCuffs, int thermometers){
        super(bullet, handCuffs);
        this.thermometers = thermometers;
    }

    public void calcThermometer(){
        if(this.thermometers > 0){
            System.out.println("Check 36.5 Temp");
            this.thermometers--;
        }else{
            System.out.println("No Check Temp");
        }
    }
}
