package This;
//Using this() to invoke current class constructor
public class Program2 {
    int a;
    int b;

    Program2() {
        this (10, 20);
        System.out.println("Inside the default constructor");
    }

    Program2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    public static void main(String[] args) {
        Program2 obj = new Program2();
    }
}