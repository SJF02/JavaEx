package com.$06iskindof;

public class Gun {
    private int bullet;

    public Gun(int bullet){
        this.bullet = bullet;
    }

    public void shot(){
        if(bullet > 0){
            System.out.println("BBANG!");
            bullet--;
        }else{
            System.out.println("Chulkuk...");
        }
    }

}
