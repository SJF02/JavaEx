package com.$06iskindof;

public class Police extends Gun{
    private int handCuffs;

    public Police(int bullet, int handCuffs){
        super(bullet);
        this.handCuffs = handCuffs;
    }

    public void putHandCuffs(){
        if(this.handCuffs > 0){
            System.out.println("SNAP!");
            this.handCuffs--;
        }else{
            System.out.println("Miss...");
        }
    }
}
