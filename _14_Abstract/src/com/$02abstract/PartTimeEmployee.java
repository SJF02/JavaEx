package com.$02abstract;

public class PartTimeEmployee extends Employee{
    protected int dailyPay;         // 일당
    protected int workDay;          // 일한 일수

    PartTimeEmployee(String empNo, String empName, int dailyPay, int workDay){
        super(empNo, empName);
        this.dailyPay = dailyPay;
        this.workDay = workDay;
    }
    @Override
    public String toString() {
        return super.toString() +
               "dailyPay : " + this.dailyPay + "\n" +
               "workDay : " + this.workDay + "\n" + 
               String.format("monthPay : %.2f\n", getMonthPay()); 
    }  
    @Override
    public double getMonthPay() {
        double mPay = dailyPay * workDay;
        return mPay;
    }
}
