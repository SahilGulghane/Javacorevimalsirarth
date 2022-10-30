package com.company;



//command line input
//it takes input while running main function

//C:\Users\sahil\javaex>javac new.java
//
//        C:\Users\sahil\javaex>java Main sahil kunal dewa
//        sahil
//        kunal
//        dewa
//
//        C:\Users\sahil\javaex>javac new.java
//
//        C:\Users\sahil\javaex>java Main sahil kunal dewa
//        sahil
//        kunal
//        dewa
class Main {

    public static void main(String args[]) {


        for(int i = 0 ; i<args.length ; i++)

            System.out.println(args[i]);



    }
}


