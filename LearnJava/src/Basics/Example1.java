package Basics;

import java.util.Arrays;

public class Example1 {
    static void process(String... v){
        v[1]= "the name is";
    }

    public static void main(String[] args) {
        String [] names ={"hey","hi","hello"};
        process(names);
        System.out.println(Arrays.toString(names));
    }
}
