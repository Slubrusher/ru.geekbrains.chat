package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
        primaryStage.setTitle("Slubrusher's chat");
        primaryStage.setScene(new Scene(root, 500, 750));
        try {
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/Chat icon.jpeg")));
        } catch (Exception e) {
            System.out.println("Не удалось найти иконку");
        }
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
