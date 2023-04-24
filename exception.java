//according to oracle there are three types of exception 
//checked -> exception thrown at compile time ex IO exception
//unchecked -> exception thrown at runtime ex arrayoutofbound
//error ->irreversible  ex outofmemory error

package com.company;

class Main{
     
    public static void main(String[] args) {
        try{
            int a =2 ;
            int b = 0 ;
            int div = a/b;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("cant divide");
        }
        finally {
            System.out.println("next statements......");
        }
    }
}
