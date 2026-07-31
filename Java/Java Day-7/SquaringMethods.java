//Q3. Create a class Square with a method to initialize its side, and methods for calculating area, perimeter, etc.//
import java.util.Scanner;
class Square{
    int side;
    public int Side(int s){
        return  side=s;
    }
    public int Area(){
        return side*side ;
    }
    public int Perimeter(){
        return side*4 ;
    }

}

public class SquaringMethods {
    public static void main(String[] args) {
        Square side1= new Square();
         side1.Side(100);
        System.out.println("The area is:"+side1.Area());
        System.out.println("The perimeter is "+side1.Perimeter());
    }

}
