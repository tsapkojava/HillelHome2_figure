package com.company;

public class Square extends Figure {
 private double side;

 public Square (double side){
     this.side = side;

 }

    @Override
    public double sqFigure() {
     double sqFig;
     sqFig = this.side * this.side;
     return sqFig;
    }

    @Override
    public double perFigure() {
     double perFig;
     perFig = this.side*4;
     return perFig;
    }
}
