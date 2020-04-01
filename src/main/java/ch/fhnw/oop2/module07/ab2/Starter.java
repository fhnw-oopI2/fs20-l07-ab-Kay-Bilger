package ch.fhnw.oop2.module07.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends javafx.application.Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent rootPane = new ApplicationUI();
		Scene myScene = new Scene(rootPane);
		
		primaryStage.setTitle("AB2");
		primaryStage.setScene(myScene);
		primaryStage.setWidth(1000);
		primaryStage.setHeight(500);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
