package Basics;

public class Outer2 {
    String name;
    public Outer2(String n){
        this.name=n;
    }
    class Inner{
        void show(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Inner i1 = new Outer2("Srivastava").new Inner();
        Inner i2 = new Outer2("challapalli").new Inner();
        i1.show();
        i2.show();
    }
}
