package This;
//Using ‘this’ keyword to refer to current class instance variables
public class Program1 {
    int a;
    int b;
    Program1(int a, int b ){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("a = " +a + "b = "+b);
    }

    public static void main(String[] args) {
        Program1 obj = new Program1(10,20);
        obj.display();
    }

}
