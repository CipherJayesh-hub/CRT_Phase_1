package Day3_Encapuslation_Abstraction;
// q is encapsulation perform
class signUp{
    private String username;
    private int pin;

//    public int getPin() {
//        return pin;
//    }
    public void setPin(int pin) {
        this.pin = pin;
    }
//    public String getUsername() {
//        return username;
//    }
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "signUp{" +
                "pin=" + pin +
                ", username='" + username + '\'' +
                '}';
    }
}
public class Q2 {
    public static void main(String[] args) {
        signUp s = new signUp();
        s.setUsername("Jayesh@1111");
        s.setPin(569874);
        System.out.println(s.toString());



    }
}
