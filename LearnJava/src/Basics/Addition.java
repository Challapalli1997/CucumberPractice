package Basics;

public class Addition {
    int sum = 0;
    public int addtwonumbers(int i, int j){
        sum = i+j;
        return sum;
    }

    public static void main(String[] args) {
        Addition s = new Addition();
       int b= s.addtwonumbers(5,5);
        System.out.println("sum of two numbers is " + b);
    }
}
