package DAY1_Class;
// copy constructor
class Cricketers{
    int runs;
   String name;
    Cricketers(int roll , String name){
        this.runs = roll;
        this.name = name;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Runs: "+runs);
    }
    Cricketers(Cricketers c ){
        this.runs = c.runs + 10;
        this.name = c.name;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Cricketers s3 = new Cricketers(34,"Jayesh");
            s3.display();
            Cricketers c = new Cricketers(s3);
            c.display();


    }
}
