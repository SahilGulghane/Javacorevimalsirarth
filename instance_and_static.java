
//instance block
//Instance Initializer block is used to initialize the instance data member.
// It run each time when object of the class is created
//what is invoked first, instance initializer block or constructor? ->instance initializer block invoked


//static block
//static block used to intialize static data memebers
//We can say static block can be used for static initialization of a class, this is because
// it is an option for initializing or setting up the class during run-time and also the code inside
// the static block is executed only once: the first time when the class is loaded into memory.
//The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
package com.company;
class Demo{
    int speed =10;
    {   int speed = 102;

        System.out.println("hello my spped is "+speed);
    }
    Demo(){
        System.out.println(" parent constructor");
    }

}
class Demo2 extends Demo{
    Demo2(){
    1    super();
    3    System.out.println("child constructor");
    }
    {
    2    System.out.println("instance block");
    }

}
public class Main {
    static int z;
    static {
        z =3;
        System.out.println(z+"static block used to intialize static data memebers ");
        System.out.println("hello i static inkoved before main methode");
    }
    public static void main(String[] args) {
	// write your code here
        //Demo obj = new Demo();
        //Demo obj2 = new Demo();
        //System.out.println(obj.speed);
        Demo2 obj3 = new Demo2();
    }
}
