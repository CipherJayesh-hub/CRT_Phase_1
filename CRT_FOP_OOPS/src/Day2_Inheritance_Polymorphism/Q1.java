package Day2_Inheritance_Polymorphism;

class Vehicle {
    String name;
    String color;
    int capacity;
    String fuelType;

    void setData(String name,String color,int capacity,String fuelType){
        this.name = name;
        this.color = color;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }
    void display(){
        System.out.println("Vehicle Name " + name );
        System.out.println("Vehicle Color  " + color );
        System.out.println("Vehicle Capacity " + capacity );
        System.out.println("Vehicle FuelType " + fuelType );
    }
}
    class car extends Vehicle{
        void carType(String type){
            System.out.println("Car Type is: " + type);
        }
}
class engine extends car{
    void genration(String genType){
           System.out.println("Engine Genration is : " + genType);
       }
}

    class bike extends Vehicle{
    void bikeType(String type){
        System.out.println("Bike Type is : " + type);
        }
    }

public class Q1 {
    public static void main(String[] args) {
        car c = new car();
        c.setData("alto","white",5,"CNG");
        c.display();
        engine e = new engine();
        e.genration("BS6");

        System.out.println();
        bike b = new bike();
        b.setData("shine","black",2,"Petrol");
        b.display();
        e.genration("BS4");
    }
}
