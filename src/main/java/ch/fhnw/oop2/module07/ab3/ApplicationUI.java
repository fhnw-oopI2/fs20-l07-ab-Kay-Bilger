package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {

	//declare elements
	private Slider slider;
	private TextField textField;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		
		//initialize elements
		slider = new Slider();
		textField = new TextField();
		
		//Bind Content of textField to slider
		textField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
		
		//set slider properties
		slider.setMin(0);
		slider.setMax(10);
		slider.setValue(5);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setSnapToTicks(true);
		slider.setBlockIncrement(1);
		slider.setMajorTickUnit(1);
	}

	private void layoutControls() {
		
		//set layout of Vbox elements
		this.setPadding(new Insets(0,50,0,50));
		this.setSpacing(100);
		this.setAlignment(Pos.CENTER);
		
		//add elements to VBox
		this.getChildren().add(textField);
		this.getChildren().add(slider);
	}
}