package Class;

import com.sun.org.apache.xpath.internal.operations.Or;

public class main {
    public static void main(String[] args)
    {
        Fruit Strawberry = new Fruit("Strawberry", "RED");
        Fruit Orange = new Fruit("Orange", "Orange");

        Fruit Banana = new Fruit();
        Banana.setName("Banana");  // set Name of Banana Object
        Banana.setColors("YELLOW"); // set colors of banana Object


        // print Info about Srawberry'
        System.out.println("Print Info about Strawberry");
        Strawberry.info();
        System.out.println();
        System.out.println();

        // print Info about Orange
        System.out.println("Print Info about Orange");
        Orange.info();
        System.out.println();
        System.out.println();

        // Print Info about Banana
        System.out.println("Print Info about Banana");
        Banana.info();

    }
}



/*
OUTPUT:
Print Info about Strawberry
Fruit Name: Strawberry
Fruit Color: RED


Print Info about Orange
Fruit Name: Orange
Fruit Color: Orange


Print Info about Banana
Fruit Name: Banana
Fruit Color: YELLOW

 */
