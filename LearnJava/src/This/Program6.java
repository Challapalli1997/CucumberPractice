package This;
//Using ‘this’ keyword as an argument in the constructor call
public class Program6 {
    Program7 obj;
    Program6(Program7 obj){
        this.obj = obj;
        obj.display();
    }
}
class Program7{
    int x = 5;
    Program7(){ Program6 obj = new Program6(this);}
    void display(){
        System.out.println("value of x in class program7 :"+x);
    }

    public static void main(String[] args) {
        Program7 obj = new Program7();
    }
}