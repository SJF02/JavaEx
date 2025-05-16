package com.$02abstract;

public class RegularEmployee extends Employee{
    protected int yearSalary;       // 연봉
    protected int bonus;            // 보너스

    public RegularEmployee(String empNo, String empName, int yearSalary, int bonus){
        super(empNo, empName);
        this.yearSalary = yearSalary;
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return super.toString() +
               "yearSalary : " + this.yearSalary + "\n" +
               "bonus : " + this.bonus + "\n" + 
               String.format("monthPay : %.2f\n", getMonthPay()); 
    }  
    @Override
    public double getMonthPay() {
        double mPay = (double)(yearSalary+bonus)/12;
        return mPay;
    }

}
