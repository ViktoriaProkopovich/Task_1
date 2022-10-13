package com.example.task1.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shope {
    Color color;
    public abstract void draw( GraphicsContext gr);
    public Shope(Color color) {
        this.color = color;
    }
    public void setColor(Color color) {
        this.color=color;     }

}