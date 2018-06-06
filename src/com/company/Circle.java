package com.company;

public class Circle extends Figure {
    public int radial;

    public Circle (int radial) {
        this.radial = radial;
    }

    @Override
    public double sqFigure() {
        double sqFig;
        sqFig = (this.radial*this.radial)*3.14;
        return sqFig;
    }

    @Override
    public double perFigure() {
        double perFig;
        perFig = 2*this.radial*3.14;
        return perFig;
    }
}
