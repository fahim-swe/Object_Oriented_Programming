package Inheritance.multilevel;

public class main {
    public static void main(String arg[])
    {
        area area = new area();


        System.out.println("10 + 23 : "  + area.sum(10, 23));
        System.out.println("10 - 5 :" +area.subtraction(10, 5));
        System.out.println("10 / 2: " + area.div(10, 2));
        System.out.println("10 % 5 : " + area.mod(10, 5));
        System.out.println("Area of rectangle- 10*20 : " +  area.rectangle(10, 20));
        System.out.println("Area of circle- 10 : " + area.circle(10));
    }
}
