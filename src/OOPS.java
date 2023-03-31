import java.sql.SQLOutput;
import java.util.*; // so that we can use scaner class
public class OOPS {
public static void main(String arg[]){
    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type= "gel";

    Pen pen2 = new Pen();
    pen2.color="black";
    pen2.type = "ball point";
    pen1.write();
    pen1.printColor();
    pen2.printColor();

    Student s1 = new Student(); // this is for the parameterised constactor
    s1.name = "chinmaya";
    s1.age = 22;
    s1.printInfo();

    // this is for the Non-parameterised constactor
//    Student s1 = new Student("chinmaya", 22);

//    s1.printInfo();

    //====> Copy constactor

    Student s2 = new Student(s1);
    s2.printInfo();
    //===> polymerphisim
    Polymerphisim st = new Polymerphisim();
    st.name = "puspak";
    st.age = 27;
    st.printInfo(st.name, st.age);

    //===> Inheritance
Triangle t1 = new Triangle();
t1.color = "red";

Horse h1 = new Horse();

h1.walk();
}


}
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    //===>Non-parametrised constactor;
    Student(){// this is the non-parametrised constactor;
        System.out.println("Constactor called");
    }

    //===>Parametrised constactor;
//Student(String name, int age){// this is a parametrised constactor;
//    this.name = name;
//    this.age = age;
//}
    //==>Copy constactor

    Student(Student s2){
      this.name = s2.name;
      this.age = s2.age;
    }
}


//=====> Polymerphishim
/** Poly-: Many, Merphisim:- forms
 * When we do  same work in many diffrent ways it is know as polymerphishim
 * There are two types of polymerphisim
 * 1st is function overloading(compile time polymerphishim)
 * 2nd is function overriding(Run time polymerphisim) */

//=====>Compile type Polymerphisim
    // Rules -:
    //1. The return type o every method should not be same If same The argument is diffrent.
    // or the number of argument is more.
class Polymerphisim{

    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);

    }
    public void printInfo(String name, int age ){
        System.out.println(name+","+age);

    }
}

// ====> Inheritense

// When a class is want to inherit the poperty of another class  we use inheritanse

class Shape{
   String color;
   public void area(){
       System.out.println("display area");

   }

}
//single level inheritance
class Triangle extends Shape{

    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}
// Multilevel in-heritance
class Equilateral extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}
// Hybrid inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//=====> Encapsulation
/** it is to encapsulate peoperties and methods.
 *We use acess modifiers to in encapsulation
 * Also We can Impliment data hiding using properties */


//====> Abstaction
/** To did not show the unnessecry things to the user it hide
 * Abstaction is impimented through Abstact keyword and Interference*/

abstract class Animal{
    abstract void walk();
    public void eats(){

    }
}

class Horse extends Animal{
    public void walk(){
System.out.println("Walk on 4 legs");
    }
}

class Chiken extends  Animal{
    public void walk() {
        System.out.println("walks on 2 legs");
    }
};

//===> Interface

/**To perform pure abstaction we use Interface*/

interface Birds{
    int eyes=2;
   public void fly();
};

interface Carnivorce{// This

}
// THIS IS MULTIPLE INHERITENCE USING INTERFACE
class Crow implements  Birds, Carnivorce {

    public void fly(){
        System.out.println("Flies on 2 wings");
    }






}


// ==> what is Stactic
/**
 * We can call any thing who is static
 * When we have common information and we have to save memory we use static keyword*/