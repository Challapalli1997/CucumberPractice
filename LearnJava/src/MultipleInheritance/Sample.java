package MultipleInheritance;
// Java program to demonstrate that a class can
// implement multiple interfaces
public class Sample implements intfA, intfB {
    @Override public void m1(){
        System.out.println("welcome :inside method m1");
    }
    @Override public void m2(){
        System.out.println("welcome :inside method m2");
    }
}
class GFG{
    public static void main(String[] args){
        Sample ob1 = new Sample();
        ob1.m1();
        ob1.m2();
    }
}
