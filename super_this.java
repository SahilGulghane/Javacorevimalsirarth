//this keyword -> is used to refer current class object
//this () methode is used to invoked current class methode as well as constructor 
//super keyword -> this is used to refer base class object
//super() methode is used to invoked base class methode as well as constructor


package com.company;
class Demo{
    void parentclassmethode(){
        System.out.println("parent class methode");
    }
}

class Main extends Demo{
   void parentclassmethode(){
        System.out.println("child class methode overloaded");
    }
    void message(){
       // parent class methode
       super.parentclassmethode();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        //child class methode which is overloaded
        obj.parentclassmethode();
        obj.message();


    }
}
