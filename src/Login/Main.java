/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package Login;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Login.*;

/**
 *
 * @author hp
 */
public class Main extends Application {
    
    @Override

public void start(Stage primaryStage) throws IOException {
		AnchorPane mainPane = (AnchorPane) FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("EMS | Employee | Login");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

    public static void main(String[] args) {
        launch(args);
    }
    
}


 