package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		   Parent root = FXMLLoader.load(getClass().getResource("KHJSON.fxml"));
	       TextArea textArea = (TextArea)root.lookup("#ID_TEXTAREA_JSON_CONTENT");
	       TextArea textAreaHexFrameContent = (TextArea)root.lookup("#ID_TEXTAREA_HEX_FRAME");
	        Button button = (Button)root.lookup("#ID_BUTTON_GENERATE_FRAME");
	        
	        button.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					String JSONcontent = textArea.getText();
					textAreaHexFrameContent.setText(JSONcontent);
				}
			});
	        
	       Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	       primaryStage.setScene(new Scene(root, dimension.getWidth()/2, dimension.getHeight()/4*3));
	       primaryStage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
