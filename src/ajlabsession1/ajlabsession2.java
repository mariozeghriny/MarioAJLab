/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ajlabsession1;

import javafx.application.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
/**
 *
 * @author User
 */
public class ajlabsession2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane=new GridPane();
pane.setAlignment( Pos.CENTER);
pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
pane.setHgap(5.5);
pane.setVgap(5.5);

Image image = new Image(new FileInputStream("https://picsum.photos/200"));
ImageView imageView=new ImageView(image);
imageView.setFitHeight(75);
imageView.setFitWeight(75);
imageView.setPreserveRatio(true);
pane.getChildren().add(imageView);
pane.add(new Label("User Name:"), 0, 0);
pane.add(new TextField(), 1, 0);
pane.add(new Label("Password:"), 0, 1);
pane.add(new TextField(), 1, 1);
Button btAdd=new Button("Sign in");
pane.add(btAdd, 1, 2);
GridPane.setAlignment(btAdd,HPos.RIGHT);
Scene scene=new Scene(pane, 500, 500);
primaryStage.setTitle("Java FX Welcome!");
primaryStage.setScene(scene);
primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
