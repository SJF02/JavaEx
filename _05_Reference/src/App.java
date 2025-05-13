public class App {
    public static void main(String[] args) throws Exception {
        // Primitive Type(기본 자료형)
        // 스택 메모리에 위치, 일정 크기
        byte b = 10;                    // 1byte 정수
        char ch = 'A';                  // 2byte 문자
        short s = 10000;                // 2byte 정수
        int i = 99999999;               // 4byte 정수
        long l = 9999999999999999L;     // 8byte 정수
        float f = 3.14f;                // 4byte 실수
        double d = 3.14;                // 8byte 실수

        System.out.printf("byte size: %d bit\n", Byte.SIZE);
        System.out.printf("char size: %d bit\n", Character.SIZE);
        System.out.printf("short size: %d bit\n", Short.SIZE);
        System.out.printf("int size: %d bit\n", Integer.SIZE);
        System.out.printf("long size: %d bit\n", Long.SIZE);
        System.out.printf("float size: %d bit\n", Float.SIZE);
        System.out.printf("double size: %d bit\n", Double.SIZE);
    }
}
