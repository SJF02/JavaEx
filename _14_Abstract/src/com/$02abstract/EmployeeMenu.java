package com.$02abstract;

public interface EmployeeMenu {
    // interface내에서 아래 처럼 변수를 선언하면
    // 자동으로 컴파일러에 의해 public static final int REG_EMP = 1;
    // 처럼 바뀐다.
    // 즉, 각각 변경할 수 없는 상수가 된다.
    public int REG_EMP = 1;
    public int TEMP_EMP = 2;
    public int PART_EMP = 3;
    public int ALL_INFO = 4;
    public int EXIT = 5;    
}
