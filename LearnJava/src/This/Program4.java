package This;
// Using ‘this’ keyword as a method parameter
public class Program4 {
    int a;
    int b;
   Program4(){
       a=10;
       b=20;
   }
    void display(Program4 obj){
        System.out.println("a = " +obj.a + "b =" +obj.b);
    }
    void get(){display(this);}

    public static void main(String[] args) {
        Program4 object = new Program4();
        object.get();

    }
}
