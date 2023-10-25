package This;
//Using ‘this’ keyword to return the current class instance
public class Program3 {
    int a;
    int b;
    Program3() {
        a = 10;
        b = 20;
    }
         Program3 get() {return this; }
    void display(){
        System.out.println("a = "+a  + "b=  "+b);
    }

    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.get().display();
    }
    }

