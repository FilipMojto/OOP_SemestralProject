package graphical_interface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application_interface.main_package.DataManagement;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class BidderSceneController implements Initializable {
	private SceneSwitcher sceneSwitch;
	private DataManagement data;
	
	@FXML private Label logOutPanel;

    @FXML void logOut(MouseEvent event) throws IOException {
    	this.sceneSwitch.setRoot("/scenes/LoginScene.fxml");
    	
    	this.sceneSwitch.modifyController((controller) ->{
    		LoginSceneController loginController = (LoginSceneController)controller;
    		loginController.updateData(data);
    	});
    	
    	this.sceneSwitch.switchScene(event);
    }

    @FXML void startAuction(MouseEvent event) {

    }

    @FXML void toInfo(MouseEvent event) {

    }
    
    public void updateData(DataManagement data) {
    	this.data = data;
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.sceneSwitch = new SceneSwitcher();
		
	}
    
}
