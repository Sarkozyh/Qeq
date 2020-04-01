package sample;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    ClientCosen controller;
    public Stage sceneKeeper;
    @FXML
    private Button clientLog;


    @FXML
    void clientLog(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/clientCosen.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();

        controller = loader.getController();
        controller.sceneKeeper = sceneKeeper;
        controller.init();
        sceneKeeper.show();

        Platform.runLater(() -> sceneKeeper.setScene(new Scene(root)));
    }

}
