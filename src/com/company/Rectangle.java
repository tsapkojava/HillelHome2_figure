package com.company;

public class Rectangle extends Figure {
    private double side1,side2;

    public Rectangle(double side1,double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double sqFigure() {
        double sqFig;
        sqFig = this.side1*this.side2;
        return sqFig;
    }
    @Override
    public double perFigure() {
        double perFig;
        perFig = 2*(this.side1+this.side2);
        return perFig;
    }
}
