

//Constructor Chaining
//Within the same class: If the constructors belong to the same class, we use this
//From the base class: If the constructor belongs to different classes (parent and child classes),
//we use the super keyword to call the constructor from the base class.
//We use this() keyword if we want to call the current class constructor within the same class.
//The use of this() is mandatory because JVM never put it automatically like the super() keyword.
//Note that this() must be the first line of the constructor.
//There must exist at least one constructor without this() keyword.
package com.company;
class Demo{
    Demo(){
        this(4);
        System.out.println("hello no arg constructor from demo");
    }
    Demo(int a){
       // this(); recursive constructor invocation
        System.out.println("hello arg constructor call from no-arg from demo");
    }

}
class Demo2 extends Demo{
    Demo2(){
        super(4);
        System.out.println("no arg from demo2");
    }
    Demo2(String s,String a){
        System.out.println("arg from demo2");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Demo obj = new Demo();
        Demo2 obj2 = new Demo2();

    }
}
