package GUI;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Arale on 4/17/2016.
 */
public class TextScrollPane extends Pane {


    double width;
    double height;

    public TextScrollPane(double width, double height){

        this.width = width;
        this.height = height;
        Rectangle borderLine = new Rectangle(10, 10, this.width, this.height);
        borderLine.setFill(Color.TRANSPARENT);
        borderLine.setStroke(Color.GREEN);
        getChildren().addAll(borderLine);
    }
}
