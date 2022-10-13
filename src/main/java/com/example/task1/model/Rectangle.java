package com.example.task1.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shope {
    double length;
    double width;
    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;  }


    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillRect(50,10,100,150);
    }
}
