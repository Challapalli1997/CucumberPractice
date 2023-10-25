package Basics;

public class MethodCalling {
    public static int i =0;
    MethodCalling(){
        i++;
    }
    public static int get(){
        return i;
    }
    public int m1(){
        System.out.println("Inside the method m1 by object of GFG class");
        this.m2();
        return 1;
    }
    public void m2(){
        System.out.println("in method m2 came from method m1");
    }

    public static void main(String[] args) {
        MethodCalling obj = new MethodCalling();
        int i = obj.m1();
        System.out.println("control returned after method m1 "+ i);
        int no_of_objects = MethodCalling.get();
        System.out.println("No of instances created till now : " + no_of_objects);

    }
}
