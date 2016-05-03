package GUI;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by 2469 on 5/3/2016.
 */
public class CommandBar extends TextField {

    public CommandBar(){
        Label label = new Label(">");
        getChildren().addAll(label);
        setStyle("-fx-text-box-border: none;");
        setStyle("-fx-focus-color: none;");
    }
}
