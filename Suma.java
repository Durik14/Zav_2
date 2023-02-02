package com.company;

public class Suma {
    int a;
    double b;
    double c;


    public Suma(int a,double b,double c ){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void dod(int a,double b,double c){
        double result = a + b + c;
        System.out.println("Suma: "+ result);
    }
    void dod(int a,double b){
        double result = a + b ;
        System.out.println("Suma: "+ result);
    }
    void dod(int a,int b,int c) {
        int result = a + b + c;
        System.out.println("Suma: " + result);
    }
}