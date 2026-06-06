
/*Create a class Student having id, name, fee as a instance
variable. two constructor one for default value and another
for parameterized value and two methods, first will display
student id ,and name, and antoher will display fee inforamation.*/
public class Student{
    private long id;
    private String name;
    private double fee;

    Student(){
        id=01;
        name="Suvlove";
        fee=34323;
    }

    Student (long id, String name,double fee){
        this.id=id;
        this.name=name;
        this.fee=fee;
    }

    void displayStudentInfo(){
        System.out.println("Id ="+ id + " And Name = "+name);
    }

    void feeInfo(){
        System.out.println("Fee is = "+ fee);
    }


    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudentInfo();
        s.feeInfo();

        Student ravi= new Student(1,"Janak",23424);
        ravi.displayStudentInfo();
        ravi.feeInfo();

    }
}