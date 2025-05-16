package com.$02abstract;

import java.util.Scanner;

public class EmployeeManager {
    private final int EMP_NUM = 100;

    private Employee[] empArr = new Employee[EMP_NUM];
    private int numOfEmp = 0;   // 저장된 사원수/다음 사원 저장된 index
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
        System.out.println("정규직 사원정보 입력 완료~");
        return null;
    }
    private TempEmployee creatTempEmployee(){
        System.out.println("임시직 사원정보 입력 완료~");
        return null;
    }
    private PartTimeEmployee creatPartTimeEmployee(){
        System.out.println("파트타임직 사원정보 입력 완료~");
        return null;
    }
    private void viewAllEmployeeInfo(){
        System.out.println("전체 정보 조회 완료~");
    }

    public void run(){
        boolean isRun = true;
        while(isRun){
            int sel = viewMenu();

            switch(sel){
                case EmployeeMenu.REG_EMP:
                    creatRegularEmployee();
                    break;
                case EmployeeMenu.TEMP_EMP:
                    creatTempEmployee();
                    break;
                case EmployeeMenu.PART_EMP:
                    creatPartTimeEmployee();
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

            System.out.println();
            sc.nextLine();      // \n(개행문자)입력시 리턴
            sc.nextLine();
        }
    }
}
