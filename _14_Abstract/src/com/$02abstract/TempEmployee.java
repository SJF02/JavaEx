package com.$02abstract;

public class TempEmployee extends Employee{
    protected int yearSalary;           // 연봉
    protected int hireYear;             // 계약기간

    public TempEmployee(String empNo, String empName, int yearSalary, int hireYear){
        super(empNo, empName);
        this.yearSalary = yearSalary;
        this.hireYear = hireYear;
    }
    @Override
    public String toString() {
        return super.toString() +
               "yearSalary : " + this.yearSalary + "\n" +
               "hireYear : " + this.hireYear + "\n" + 
               String.format("monthPay : %.2f\n", getMonthPay()); 
    }     

    @Override
    public double getMonthPay() {
        double mPay = (double)yearSalary/12;
        return mPay;
    }

}
