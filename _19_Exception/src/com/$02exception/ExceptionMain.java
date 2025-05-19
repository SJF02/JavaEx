package com.$02exception;

public class ExceptionMain {
    public static void printLength(String data){
        // 시도하다
        try{
            int len = data.length();
            System.out.println("문자열의 길이는 " + len);            
        }
        // (예외 발생 시) 잡아서 처리하다
        catch(Exception e){
            e.printStackTrace();
        }
        // (정상 or 예외 발생) 무조건 마무리 작업 처리
        finally{
            System.out.println("[마무리 실행]");
        }

    }
    public static void main(String[] args) {
        printLength("Albert");
        printLength(null);      // 예외(Exception) 발생
    }
}
