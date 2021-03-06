package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage sceneKeeper;
    FXMLLoader fxmlLoader;
    Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
        fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = fxmlLoader.load();
        controller = fxmlLoader.getController();
        sceneKeeper = primaryStage;
        controller.sceneKeeper = sceneKeeper;
        primaryStage.setTitle("АвтоБосс");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
