public class BoxMain {
    /*
     * Generic은 논리와 기능을 동일한데 자료형만 다른 경우
     * 1개 클래스를 만들어서 Type만 변경해서 사용하는 문법
     */

     public static void main(String[] args) {
        class Employee{
            private String empNo;
            private String empName;
            private int age;

            Employee(String empNo, String empName, int age){
                this.empNo = empNo;
                this.empName = empName;
                this.age = age;
            }
        }

        Box<Integer> intBox = new Box<>();
        intBox.content = 99;
        System.out.println(intBox.content);

        Box<String> strBox = new Box<>();
        strBox.content = "Albert";
        System.out.println(strBox.content);

        Box<Employee> empBox = new Box<>();
        empBox.content = new Employee("1111", "Albert", 34);
        System.out.println(empBox.content);
     }
}
