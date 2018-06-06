package com.company;

public class Main {
    /**
     * calculating areas and perimeter of figures
     */
    public static void main(String[] args) {
	// write your code here

        Square sq1 = new Square(5);
        System.out.println("Square ---------------");
        System.out.println("area of the figure is "+sq1.getSq());
        System.out.println("perimeter of the figure is "+sq1.getPer());

        Circle cr1 = new Circle(10);
        System.out.println("Circle ---------------");
        System.out.println("area of the figure is "+cr1.getSq());
        System.out.println("perimeter of the figure is "+cr1.getPer());

        Rectangle rs1 = new Rectangle(9,5);
        System.out.println("Rectangle ---------------");
        System.out.println("area of the figure is "+rs1.getSq());
        System.out.println("perimeter of the figure is "+rs1.getPer());



    }
}
