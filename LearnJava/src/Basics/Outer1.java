package Basics;

public class Outer1 {
    private String name = "An outer";
    class Inner{
        private String name = "An inner";
        void show(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
       // Basics.Outer1 outer1 = new Basics.Outer1();
        //Basics.Outer1.Inner inner = outer1.new Inner();
        Inner inner = new Outer1().new Inner();
        inner.show();


    }
}
