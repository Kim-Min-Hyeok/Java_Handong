import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class AdditionalControlsDemo extends Application{
	public static void main(String[] args) {
		launch(args);
	}
@Override
public void start(Stage primaryStage)throws Exception
{
	VBox root = new VBox();
	
	root.getChildren().add(new Label("Select First Day.Radio Buttons"));
	RadioButton Mon1 = new RadioButton("Mon1");
	ToggleGroup toggleCrust = new ToggleGroup();
	Mon1.setToggleGroup(toggleCrust);
	Mon1.setSelected(true);
	RadioButton Tue1 = new RadioButton("Tue1");
	Tue1.setToggleGroup(toggleCrust);
	RadioButton Wed1 = new RadioButton("Wed1");
	Wed1.setToggleGroup(toggleCrust);
	RadioButton Thu1 = new RadioButton("Thu1");
	Thu1.setToggleGroup(toggleCrust);
	root.getChildren().add(Mon1);
	root.getChildren().add(Tue1);
	root.getChildren().add(Wed1);
	root.getChildren().add(Thu1);
	// Demonstrate checkboxes
	root.getChildren().add(new Label("Select Second Day - Checkbox"));
	CheckBox Mon2 = new CheckBox("Mon2");
	CheckBox Tue2 = new CheckBox("Tue2");
	CheckBox Wed2 = new CheckBox("Wed2");
	CheckBox Thu2 = new CheckBox("Thu2");
	root.getChildren().add(Mon2);
	root.getChildren().add(Tue2);
	root.getChildren().add(Wed2);
	root.getChildren().add(Thu2);
	// Demonstrate Spinner with integer values from 1-10
	root.getChildren().add(new Label("Select Third Day-Spinner with Integer(1~4)"));
	Spinner<Integer> spinnerThirdDay = new Spinner<Integer>();
	final int defaultValue = 1;
	// Value factory.
	SpinnerValueFactory<Integer> ThirdDayFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory
	(1, 4, defaultValue);
	spinnerThirdDay.setValueFactory(ThirdDayFactory);
	root.getChildren().add(spinnerThirdDay);
	// Demonstrate ChoiceBox with FourthDay options
	root.getChildren().add(new Label("Select Fourth Day-ChoiceBox"));
	ChoiceBox<String> FourthDay = new ChoiceBox<String>(
	FXCollections.observableArrayList("Mon4", "Tue4", "Wed4", "Thu4"));
	root.getChildren().add(FourthDay);
	// Button to display selections
	Button btnSelections = new Button("Get Selections");
	// Set the event handler when the button is clicked
	btnSelections.setOnAction(new EventHandler<ActionEvent>()
	{
	@Override
	public void handle(ActionEvent event)
	{
	System.out.println("First Day-Radio Buttons");
	System.out.println("Mon1: " + Mon1.isSelected());
	System.out.println("Tue1: " + Tue1.isSelected());
	System.out.println("Wed1: " + Wed1.isSelected());
	System.out.println("Thu1: " + Thu1.isSelected());
	
	System.out.println("\nSecond Day-Checkbox");
	System.out.println("Mon2: " + Mon2.isSelected());
	System.out.println("Tue2: " + Tue2.isSelected());
	System.out.println("Wed2: " + Wed2.isSelected());
	System.out.println("Thu2: " + Thu2.isSelected());
	
	System.out.println("\nThird Day-Spinner with Integer");
	System.out.println("Third Day: " + spinnerThirdDay.getValue());
	
	System.out.println("\nFourth Day-ChoiceBox");
	System.out.println("Mode: " + FourthDay.getValue());
	}
	}
	);
	root.getChildren().add(btnSelections);
	Scene scene = new Scene(root, 400, 370);
	primaryStage.setTitle("Additional Controls Demo");
	primaryStage.setScene(scene);
	primaryStage.show();
	
}
}
