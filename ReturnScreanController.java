package sample;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ReturnScreanController {
    public Stage sceneKeeper;

    @FXML
    private Button retuenToTiltleButton;

    @FXML
    private Label serviseLabel;


    @FXML
    void returnToTitle(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/sample.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Controller controller;
        Parent root = loader.getRoot();

        controller = loader.getController();
        controller.sceneKeeper = sceneKeeper;
        sceneKeeper.show();

        //загрузить контролер
        //controller.init

        Platform.runLater(() -> sceneKeeper.setScene(new Scene(root)));
    }

}
