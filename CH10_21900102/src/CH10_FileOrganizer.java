import javafx.application.Application;
import java.util.Scanner;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.*;
import javafx.event.*;
import java.io.*;

public class CH10_FileOrganizer extends Application{
	private TextField fileNameField = null;
	private TextField multiplyField = null;
	private PrintWriter outputStream = null;
	Scanner keyboard = new Scanner(System.in);
	Scanner inputStream = null;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int WIDTH = 400;
		final int HEIGHT = 300;
		final int NUMBER_OF_PIXELS = 330;
		
			FlowPane root = new FlowPane();
			
			fileNameField = new TextField("Enter output filename here.");
			fileNameField.setPrefWidth(NUMBER_OF_PIXELS);
			root.getChildren().add(fileNameField);
			
			multiplyField = new TextField("Enter Integer Number");
			multiplyField.setPrefWidth(NUMBER_OF_PIXELS);
			root.getChildren().add(multiplyField);
			
			Button multButton = new Button("Multiply");
			root.getChildren().add(multButton);
			multButton.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent event)
				{
					multiply();
			
				}
				
			}
			);
			
			Button resetButton = new Button("Reset");
			root.getChildren().add(resetButton);
			resetButton.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent event)
				{
					reset();
			
				}		
			}
			);
			Scene scene = new Scene(root, WIDTH, HEIGHT);
			primaryStage.setTitle("File Organizer");
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	private void multiply() {
		this.connectToInputFile();
		this.connectToOutputFile();
		this.times();
		this.closeFiles();
		
		fileNameField.setText("output file :"+ fileNameField.getText());
		multiplyField.setText("completed");
	}
	
	private void connectToOutputFile() {
		String outputFileName = fileNameField.getText();
		try
		{
			outputStream = new PrintWriter(new FileOutputStream(outputFileName));
		}
		catch(IOException e)
		{
			//nothing
		}
	}

	private void connectToInputFile() {
		try
		{
			inputStream = new Scanner(new File("input.txt"));
		}
		catch(FileNotFoundException e) {
			//nothing
		}
	}
	
	public void times()
	{
		String [] next = new String[9];
		int mul = Integer.parseInt(multiplyField.getText());
		int i=0;
		while(inputStream.hasNextLine())
		{
			next[i] = inputStream.nextLine();
			outputStream.println(mul*Integer.parseInt(next[i]));
			i++;
		}
		
	}
	
	public void closeFiles()
	{
		inputStream.close();
		outputStream.close();
		
	}
		
	private void reset() 
	{
		fileNameField.setText("Enter output filename here");
		multiplyField.setText("Enter Integer Number");
	}
}
