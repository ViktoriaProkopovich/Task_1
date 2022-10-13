package com.example.task1;

import com.example.task1.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    public Canvas pic;
    public ColorPicker picker;
    public TextField myText;
    public Shope a = new Rectangle(Color.PINK,100,120);
    private GraphicsContext gc;

    @FXML
    public Shope getShape(String val) {
        if (val.equals("Квадрат")){
            return new Kvadrat(Color.PINK, 100, 100);
        } else if (val.equals("Линия")) {
            return new Line(Color.PINK, 120.0, 75, 210, 500);
        } else if (val.equals("Треугольник")) {
            return new Triangle(Color.PINK, 100,150, 50, 150, 160, 200);
        }
          else if (val.equals("Прямоугольник")) {
            return new Rectangle(Color.PINK, 150, 100);
        }
        return new Kvadrat(Color.ORANGE, 100, 50);
    }
    public void makeDrawing(MouseEvent mouseEvent) {

        gc.clearRect(0, 0, pic.getWidth(), pic.getHeight()); // очистка холста

        if(!myText.getText().equals("") ){
            a = getShape(myText.getText());

            a.setColor(picker.getValue());

            a.draw(gc);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        gc = pic.getGraphicsContext2D();
    }

}

 