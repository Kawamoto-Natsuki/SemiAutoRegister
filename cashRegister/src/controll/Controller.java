package controll;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField1;

    @FXML
    private Button button1;

    @FXML
    void onButton1Action(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Title!");
    	alert.setHeaderText("Header!");
    	alert.setContentText("You entered: " + textField1.getText());
    	Optional<ButtonType> result = alert.showAndWait();
    	if (result.isPresent() && result.get() == ButtonType.OK) {
    		System.out.println("You clicked OK");
    	}
    }

    @FXML
    void initialize() {
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'Test1.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'Test1.fxml'.";
    }
}