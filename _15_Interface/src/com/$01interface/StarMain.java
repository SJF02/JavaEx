package com.$01interface;
/*
 *          StarUnit
 *   |          |          |
 * Marine     Scv        Zealot
 */

public class StarMain {
    public static void allUnitWalk(StarUnit[] units){
        for(StarUnit unit : units)
            unit.walk();
    }
    public static void allUnitAttack(StarUnit[] units){
        for(StarUnit unit : units)
            unit.attack();
    }
    public static void allUnitDie(StarUnit[] units){
        for(StarUnit unit : units)
            unit.die();
    }
    public static void main(String[] args) {
        StarUnit[] units = new StarUnit[]{
            new Marine(),
            new Scv(),
            new Zealot()
        };

        allUnitWalk(units);
        System.out.println("---------------------------");
        allUnitAttack(units);
        System.out.println("---------------------------");
        allUnitDie(units);
    }    
}
