package This;
//Using ‘this’ keyword to invoke the current class method
public class Program5 {
    void display(){
        this.show();
        System.out.println("Inside display function");
        }
        void show(){
            System.out.println("inside show function");
    }

    public static void main(String[] args) {
        Program5 obj = new Program5();
        obj.display();
    }
}
