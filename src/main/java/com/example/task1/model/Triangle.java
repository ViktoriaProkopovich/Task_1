package com.example.task1.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shope{
    double x1, x2, x3;

    double y1, y2, y3;

    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillPolygon(new double[]{x1, x2, x3}, new double[]{y1, y2, y3}, 3);
    }
    //SQUARE OF TRIANGLE

    public String toString() {
        return "Фигура цвета -" + super.color + " и  площади равной " ;
    }
    public Triangle(Color color, double x1, double y1, double x2, double y2, double x3, double y3 ) {
        // calling Shape constructor
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
}
