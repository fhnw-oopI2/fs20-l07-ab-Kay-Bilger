package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class EventHandler extends FlowPane {

	private Button button;
	private int counter = 1;
	
	public EventHandler() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		this.button = new Button("Add Label");
		this.button.setOnAction(event -> {
			Label label = new Label("Label " + counter++);
			label.setPadding(new Insets(2,5,2,5));
			this.getChildren().add(label);
		});
	}

	private void layoutControls() {
		this.getChildren().add(button);
		this.setPadding(new Insets(5));
	}
}