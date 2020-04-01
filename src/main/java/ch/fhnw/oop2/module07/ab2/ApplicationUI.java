package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ApplicationUI extends VBox {

	//declare elements
	private Slider slider;
	private Label label;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		
		//initialize elements
		slider = new Slider();
		label = new Label();
		
		//set label to slider value
		slider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
			label.setText(newValue.toString());
		});
		
		//set label font
		label.setFont(Font.font(50));
		
		//set slider properties
		slider.setMin(0);
		slider.setMax(10);
		slider.setValue(5);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setSnapToTicks(true);
		slider.setBlockIncrement(1);
		slider.setMajorTickUnit(1);
		slider.setPadding(new Insets(0,50,0,50));
	}

	private void layoutControls() {
		
		//set layout of Vbox elements
		this.setSpacing(100);
		this.setAlignment(Pos.CENTER);
		
		//add elements to VBox
		this.getChildren().add(label);
		this.getChildren().add(slider);
	}
}