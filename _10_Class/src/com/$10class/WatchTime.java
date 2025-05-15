package com.$10class;

/* [메서드 오버로딩]
 * java의 메서드는 매개변수가 다를 경우 동일한 이름을 가질 수 있다.
 * 컴파일러는 매개변수 값에 따라 호출하는 메서드를 결정할 수 있다.
 */
public class WatchTime {
    private int hour, min, sec;
    private String strHour, strMin, strSec;
    private boolean isNum = true;

    public WatchTime(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.isNum = true;
    }
    public WatchTime(String strHour, String strMin, String strSec){
        this.strHour = strHour;
        this.strMin = strMin;
        this.strSec = strSec;
        this.isNum = false;
    }
    @Override
    public String toString() {
        if(isNum)
            return String.format("[%02d:%02d:%02d]", hour, min, sec);
        else
            return String.format("[%s %s %s]", strHour, strMin, strSec);
    }

    public static void main(String[] args) {
        WatchTime wtNum = new WatchTime(12, 13, 33);
        System.out.println(wtNum);

        WatchTime wtStr = new WatchTime("열두시", "이십분", "오십초");
        System.out.println(wtStr);
    }
}
