package DAY1_Class;
/*
student management system
store and display a student details
name
roll no
email id
mob no
batch
crt class no
 */
class StudentData{
    String name;
    int roll_no;
    String email_id;
    String mob_no;
    int batch;
    String crt_class_no;

    StudentData(){
        this.batch = 2027;
        this.crt_class_no = "14E";

    }
    StudentData(String name,int roll_no,String email_id,String mob_no){
        this.name = name;
        this.roll_no = roll_no;
        this.email_id = email_id;
        this.mob_no = mob_no;
    }
    void display(){
        System.out.println("Your Student Data is-:");
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(email_id);
        System.out.println(mob_no);
    }
    void show(){
        System.out.println(batch);
        System.out.println(crt_class_no);
    }
}
public class Q5 {
    public static void main(String[] args) {

        StudentData sdd = new StudentData("Jayesh",101,"J1644@gmail.com","9999999999");
        sdd.display();





    }

}
