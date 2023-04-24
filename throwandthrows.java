//The throw and throws is the concept of exception handling where the throw keyword throw the exception explicitly 
// from a method or a block of code whereas the throws keyword is used in signature of the method.

package com.company;

class Main{
    static int throww(int n) {
        if (n < 1) {
            throw new ArithmeticException("enter postive no");

        }
        else{
            System.out.println("great");
        }
        return 0;
    }
static float throwss(int n , int m)throws ArithmeticException{
    float div = n/m;
    return div;
}
    public static void main(String[] args) {
        throww(3);
       // throww(-3);
        try{
            System.out.println("doing...."+throwss(4,2));
           // System.out.println("doing...."+throwss(4,0));
        }
        catch (ArithmeticException e){
            System.out.println("can not divide by 0");
        }
        System.out.println("next statement ");
    }
}
