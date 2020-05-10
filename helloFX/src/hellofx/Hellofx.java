package hellofx;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ROBEG
 */
public class Hellofx extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      URL fxmlURL = getClass().getResource("hellofx.fxml");
      Parent root = FXMLLoader.load(fxmlURL);
      primaryStage.setTitle("Hello World");
      primaryStage.setScene(new Scene(root));
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
  
}

