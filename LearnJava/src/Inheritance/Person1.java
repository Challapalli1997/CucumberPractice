package Inheritance;

public class Person1 {
    int id;
    String name;
    void set_Person(int id, String name){
        try {
            this.id =id;
            this.name = name;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    void disp_Persion(){
        System.out.println(id +"\t" +name +"\t");
    }
}
class Employee1 extends Person1{
    int sal;
    String desgn;
    void set_Emp(int id,String name, String desgn,int sal){
        try{
            set_Person(id,name);
            this.desgn = desgn;
            this.sal=sal;
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    void disp_Emp(){
        disp_Persion();
        System.out.println(desgn +"\t"+sal);
    }

    public static void main(String[] args) {
        Employee1 e1= new Employee1();
        e1.set_Emp(007,"James Bond","British",20000000);
        e1.disp_Emp();
    }
}