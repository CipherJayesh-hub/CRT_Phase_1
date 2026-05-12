package Day2_Inheritance_Polymorphism;
/*
 many forms = polymorphism
create a college name,age
management system in that a single parent class collage extend with a
student  name,roll,mob,email,batch,course
and
teacher class name,age,dept,subject,salary


add run time to showing their belong class
 */
//
class College{
    String name;
    int age;
    void display(){
        System.out.println("College Member");
    }

}
class Student extends College{
    String name;
    int roll_no;
    String mob;
    String email;
    int batch;
    String course;

    void setStudentData(String name,int roll_no,String mob,String email,int batch,String course){
        this.name = name;
        this.roll_no = roll_no;
        this.mob = mob;
        this.email = email;
        this.batch = batch;
        this.course = course;
    }

    @Override
    void display() {

        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll_no);
        System.out.println("Mobile no : "+mob);
        System.out.println("Email : "+email);
        System.out.println("Batch : "+batch);
        System.out.println("Course : "+course);
    }
}
class Teacher extends College{
    String name;
    int age;
    String dept;
    String subject;
    String salary;

    void setTeacherData(String name,int age,String dept,String subject,String salary){
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void display() {

        System.out.println("Name  :" + name );
        System.out.println("Age :"+ age );
        System.out.println("Department :" + dept );
        System.out.println("Subject :"+ subject );
        System.out.println("Salary :"+salary );
    }
}
public class Q4 {
    public static void main(String[] args) {
        // Runtime Polymorphism
        College c;

        Student s = new Student();
        s.setStudentData(
                "Jayesh",
                101,
                "98547852365",
                "test@gmail.c",
                2027,
                "CSE"
        );

        Teacher t = new Teacher();
        t.setTeacherData(
                "Ramesh Sir",
                40,
                "Computer Science",
                "Java",
                "50000"
        );

        c = s;
        c.display();

        System.out.println();

        c = t;
        c.display();

    }

}















/*
Here:

c = parent class reference
s = child class object

At runtime Java decides which display() method to call:

Student display
Teacher display

That is called Runtime Polymorphism (Method Overriding).
 */