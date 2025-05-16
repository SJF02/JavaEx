package com.$02interface;

public class Zealot implements StarUnit{

    @Override
    public void walk() {
        System.out.println("성큼성큼***");
    }

    @Override
    public void attack() {
        System.out.println("휙휙***");
    }

    @Override
    public void die() {
        System.out.println("쿠으윽***");
    }

}
