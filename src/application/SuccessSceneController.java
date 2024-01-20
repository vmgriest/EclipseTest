package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SuccessSceneController {
	@FXML
	Label nameLabel;
	@FXML
	Label passLabel;

	

	public void displayName(String username) {

		nameLabel.setText("Welcome: " + username);

	}
	public void displayPass(String password) {

		passLabel.setText("Your password is: " + password);

	}
	
	@FXML
	private Button logoutButton;
	@FXML
	private AnchorPane scenePane;
	
	Stage stage;
	
	public void logout(ActionEvent event) {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("Do you want to save before exiting?: ");
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) scenePane.getScene().getWindow();
			System.out.println("You sucessfully logged out!");
			stage.close();
			
		}
	}
}