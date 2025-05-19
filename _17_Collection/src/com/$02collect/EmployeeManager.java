package com.$02collect;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    // private final int EMP_NUM = 100;
    // private Employee[] empArr = new Employee[EMP_NUM];
    // private int numOfEmp = 0;   // 저장된 사원수/다음 사원 저장된 index

    private List<Employee> empList = new LinkedList<>();
    
    private Scanner sc = new Scanner(System.in);

    private int viewMenu(){
        System.out.println("[사원 선택 입력]");
        System.out.println("1. 정규직");
        System.out.println("2. 임시직");
        System.out.println("3. 파트타임직");
        System.out.println("4. 전체정보보기");
        System.out.println("5. 종료");
        System.out.println();
        System.out.print("번호 입력 >> ");

        int sel = sc.nextInt();
        return sel;
    }
    private RegularEmployee creatRegularEmployee(){
        System.out.print("사번 >> ");
        String empNo = sc.next();
        System.out.print("이름 >> ");
        String empName = sc.next();
        System.out.print("연봉 >> ");
        int salary = sc.nextInt();
        System.out.print("보너스 >> ");
        int bonus = sc.nextInt();
        RegularEmployee re = new RegularEmployee(empNo, empName, salary, bonus);
        System.out.println("정규직 사원정보 입력 완료~");
        return re;
    }
    private TempEmployee creatTempEmployee(){
        System.out.print("사번 >> ");
        String empNo = sc.next();
        System.out.print("이름 >> ");
        String empName = sc.next();
        System.out.print("연봉 >> ");
        int salary = sc.nextInt();
        System.out.print("계약기간 >> ");
        int hireYear = sc.nextInt();
        TempEmployee te = new TempEmployee(empNo, empName, salary, hireYear);
        System.out.println("임시직 사원정보 입력 완료~");
        return te;
    }
    private PartTimeEmployee creatPartTimeEmployee(){
        System.out.print("사번 >> ");
        String empNo = sc.next();
        System.out.print("이름 >> ");
        String empName = sc.next();
        System.out.print("일당 >> ");
        int dailyPay = sc.nextInt();
        System.out.print("일한 일수 >> ");
        int workDay = sc.nextInt();
        PartTimeEmployee pe = new PartTimeEmployee(empNo, empName, dailyPay, workDay);
        System.out.println("파트타임직 사원정보 입력 완료~");
        return pe;
    }
    private void viewAllEmployeeInfo(){
        for(Employee emp : this.empList){
            System.out.println(emp);
        }
        System.out.println("전체 정보 조회 완료~");
    }
    private boolean saveEmployee(Employee emp){
        boolean isSave = true;

        isSave = this.empList.add(emp);

        return isSave;
    }

    public void run(){
        boolean isRun = true;
        while(isRun){
            int sel = viewMenu();

            Employee emp = null;
            switch(sel){
                case EmployeeMenu.REG_EMP:
                    emp = creatRegularEmployee();
                    break;
                case EmployeeMenu.TEMP_EMP:
                    emp = creatTempEmployee();
                    break;
                case EmployeeMenu.PART_EMP:
                    emp = creatPartTimeEmployee();
                    break;
                case EmployeeMenu.ALL_INFO:
                    viewAllEmployeeInfo();
                    break;
                case EmployeeMenu.EXIT:
                    isRun = false;
                    break;
                default:
                    System.out.println("해당 항목이 존재하지 않습니다!!!");
                    break;
            }

            // emp객체가 존재한다면
            if(emp != null){
                boolean isSave = saveEmployee(emp);
                if(!isSave)
                    System.out.println("더 이상 저장 공간이 없습니다.");
                else
                    System.out.println("잘 저장되었습니다~");
            }

            System.out.println();
            sc.nextLine();      // \n(개행문자)입력시 리턴
            sc.nextLine();
        }
    }
}
