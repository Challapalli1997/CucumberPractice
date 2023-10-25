package Basics;

public class Date {
    public int day;
    public int month;
    public int year;

    public Date(int day,int month, int year){
        if(isValid(day,month,year)){
            this.day=day;
            this.month= month;
            this.year =year;
        }
        else throw new IllegalArgumentException("bad values are not accepted as date");
    }
    public static boolean isValid(int day, int month, int year){
        return day>=1 && day<=31 && month >=1 && month <=12;
    }

    public static void main(String[] args) {
        Date obj= new Date(11,9,2023);
        System.out.println(obj.year);

    }
}
