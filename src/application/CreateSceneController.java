package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateSceneController {

	@FXML

	TextField nameTextField;
	
	@FXML
	TextField passTextField;

	

	private Stage stage;

	private Scene scene;

	private Parent root;

	

	public void create(ActionEvent event) throws IOException {

		

		String username = nameTextField.getText();
		String password = passTextField.getText();

		

		FXMLLoader loader = new FXMLLoader(getClass().getResource("SuccessScene.fxml"));	

		root = loader.load();	

		

		SuccessSceneController successSceneController = loader.getController();

		successSceneController.displayName(username);
		successSceneController.displayPass(password);

		

		//root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));	

		stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		scene = new Scene(root);

		stage.setScene(scene);

		stage.show();
}
}
