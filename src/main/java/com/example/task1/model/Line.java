package com.example.task1.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shope{
 //CHORDS FOR DRAWING LINE
        double x1;
        double y1;
        double x2;
        double y2;

        public void draw(GraphicsContext gc) {
            gc.setStroke(color);
            gc.strokeLine(x1, y1, x2, y2);}

        public String toString() {
            return "Линия цвета - " + super.color + " и  длина линии равна: ";
        }

        public Line(Color color, double x1, double y1, double x2, double y2) {
// calling Shape constructor
            super(color);
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
