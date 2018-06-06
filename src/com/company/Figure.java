package com.company;
/**
 * abstract class description for different shapes
 */
public abstract class Figure {
    public abstract double  sqFigure();
    public abstract double perFigure();

    private double sqFig, perFig;

    public double getSq(){
        sqFig = sqFigure();
    return sqFig;
    }

    public double getPer(){
        perFig = perFigure();
        return perFig;
    }

}
