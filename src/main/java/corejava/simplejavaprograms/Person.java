/*
 * @Author : Ganesh
 * Version : 1.8
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */

package corejava.simplejavaprograms;


public class Person {

//    variable
//    method

    int myEyes = 2;
    int myLegs = 2;
    String name = "Ganesh";
//    Human name1;

    float height = 5.8f;
    double weight = 90;

//    public void iAmEating() {
//        System.out.println("I am eating");
//    }

   /* public void iAmSleeping() {
        System.out.println("I am sleeping");
    }*/


    public static void main(String[] args) {

        Person person = new Person();  // object creation
//        person.iAmEating();
//        person.iAmSleeping();
        System.out.println(person.myEyes);
        System.out.println(person.myLegs);
        System.out.println(person.name);
        System.out.println(person.height);
        System.out.println(person.weight);

    }


}
