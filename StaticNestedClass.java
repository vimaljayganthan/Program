import java.util.Scanner;
class Outer{
    // class Inner{
  static class Inner{
        void m1(){
            System.out.println("hii");
        }
         
    }
// }
}
public class StaticNestedClass{
    public static void main(String[] args) {
        // Outer ob1 = new Outer();
        // Outer.Inner ob2 = ob1.new Inner();
        Outer.Inner ob2 = new Outer.Inner();
        ob2.m1();
    }
}