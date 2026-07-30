//Q2. Create a class Cellphone with methods to print:
//
//"Ringing..."
//"Vibrating..."
class Cellphone {
    public void Ringing() {
        System.out.println("Ringing...");
    }

    public void Calling() {
        System.out.println("Calling...");
    }

    public void Vibrating() {
        System.out.println("Zzzzz");
    }

}
public class CellPhoneMethods {
    public  static void main(String[] args) {
     Cellphone Samsung = new Cellphone();
     Samsung.Calling();
     Samsung.Ringing();
     Samsung.Vibrating();
    }
}
