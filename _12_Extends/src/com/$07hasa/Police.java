package com.$07hasa;

public class Police {
    private int clothes;

    public Police(int clothes){
        this.clothes = clothes;
    }

    public void putOnClothes(){
        if(clothes > 0){
            System.out.println("Smile!");
            clothes--;
        }else{
            System.out.println("Shame...");
        }
    }
}
