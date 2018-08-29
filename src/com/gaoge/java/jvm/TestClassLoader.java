package com.gaoge.java.jvm;

public class TestClassLoader {
    
    public static void main(String[] args) {
        debug();
    }
    
    static TestClassLoader t = new TestClassLoader();
    
    static{
        System.out.println("1");
    }
    
    {
        System.out.println("2");
    }
    
    TestClassLoader(){
        System.out.println("3");
        System.out.println("a="+a+" b="+b);
    }
    
    public static void debug(){
        System.out.println("4");
    }
    
    int a = 10;
    static int b = 20;
}
