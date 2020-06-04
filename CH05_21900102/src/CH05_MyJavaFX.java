import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.shape.ArcType;
//import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.effect.*;

public class CH05_MyJavaFX extends Application{
	public static void main(String[] args) 
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		Group root = new Group();
		Scene scene = new Scene(root);
		
		Image img = new Image("hgulogo.png");
		Canvas canvas = new Canvas(img.getWidth(),img.getHeight()*7);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(img,  1,  1);
		gc.setEffect(new Reflection());
		gc.drawImage(img,1, img.getHeight());
		gc.setEffect(new ColorAdjust());
		gc.drawImage(img,1, img.getHeight()*3);
		gc.setEffect(new BoxBlur());
		gc.drawImage(img,1, img.getHeight()*4);
		gc.setEffect(new GaussianBlur());
		gc.drawImage(img,1, img.getHeight()*5);
		
		
		
		root.getChildren().add(canvas);
		primaryStage.setTitle("Drawing Images in JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
