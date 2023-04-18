package com.company;
// final blank var is only initilize by constructor
//final var -> make var  constant
//final methode-> this methode can not be overloaded or override
//final class ->no class can be inherited from 
class Main{
    final int v;

    Main(){
        v = 3;
        System.out.println(v);
    }

    public void a(){

        System.out.println("helolo");
    }
    public static void main(String[] args) {
         new Main().a();

    }
}
