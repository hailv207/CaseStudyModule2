package application.menu;

import application.login.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class MenuTest extends Application {
    public static URL getSource(String source){
        return Main.class.getResource(source);
    }
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage){
        try {
            System.out.println(getClass().getResource("menu.fxml"));
            Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}