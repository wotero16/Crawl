package GUI;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by 2469 on 5/3/2016.
 *
 * The CommandBar sole purpose is to set the correct style and functionality for the TextField.
 *
 */
public class CommandBar extends TextField {

    public CommandBar(){
        setText(">");
        setStyle("-fx-text-box-border: none; -fx-focus-color: none; -fx-display-caret: false; -fx-text-fill:green; -fx-font-size: 14px; -fx-background-color: #2f2d2f; -fx-background-radius:0;");

    }
}
