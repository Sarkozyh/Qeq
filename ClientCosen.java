package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientCosen {

    private int prise;
    public Stage sceneKeeper;
    public ComboBox serv;
    @FXML
    private ComboBox<String> servType;

    @FXML
    private Label priseLabel;

    @FXML
    private TableView<?> timeTable;

    @FXML
    private Button reserve;

    @FXML
    private ComboBox<String> timeChoise;

    @FXML
    private Button signButton;



    @FXML

    void init(){
        ObservableList<String> types = FXCollections.observableArrayList("Шиномонтаж", "Диагностика",
                "Рулевое управление", "Трансмиссия и сцепление", "Двигатель");
        servType.setItems(types);
    }

    @FXML
    void typeChoise(ActionEvent event) {

        serv.setVisible(true);
        if(servType.getValue() == "Шиномонтаж"){


            ObservableList<String> servises = FXCollections.observableArrayList("Замена шин");
            serv.setItems(servises);

        }else if(servType.getValue() == "Диагностика"){

            ObservableList<String> servises = FXCollections.observableArrayList("Компьютерная диагностика", "Полный осмотр",
                    "Диагностика двигателя", "Диагностика перед покупкой");
            serv.setItems(servises);

        }else if(servType.getValue() == "Рулевое управление"){

            ObservableList<String> servises = FXCollections.observableArrayList("Замена рулевой рейки",
                    "Замена рулевого наконечника", "Замена рулевой тяги");
            serv.setItems(servises);

        }else if(servType.getValue() == "Трансмиссия и сцепление"){

            ObservableList<String> servises = FXCollections.observableArrayList("Компьютерная диагностика АКПП",
                    "Замена масла АКПП", "Слив / залив", "Снятие / установка АКПП", "Замена масла МКПП", "Замена главного цилиндра сцепления");
            serv.setItems(servises);

        }else if(servType.getValue() == "Двигатель"){

            ObservableList<String> servises = FXCollections.observableArrayList("Замена ремня ГРМ",
                    "Замена приводного ремня", "ЗЗамена прокладки", "Замена водяного насоса", "Замена прокладки клапанной крышки", "Замена свечей зажигания");
            serv.setItems(servises);

        }

    }

    public void servChoise(ActionEvent actionEvent) {
//        timeTable.setVisible(true);
        if (serv.getValue().equals("Замена шин")) {
            prise = 500;
            priseLabel.setText("Стоимость - " + prise);
            Serv server = new Serv();
            server.id = "Замена шин";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);

            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Компьютерная диагностика")) {
            Serv server = new Serv();
            server.id = "Компьютерная диагностика";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 950;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Полный осмотр")) {
            Serv server = new Serv();
            server.id = "Полный осмотр";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 500;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Диагностика двигателя")) {
            Serv server = new Serv();
            server.id = "Диагностика двигателя";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 950;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Диагностика перед покупкой")) {
            Serv server = new Serv();
            server.id = "Диагностика перед покупкой";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 1500;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена рулевой рейки")) {
            Serv server = new Serv();
            server.id = "Замена рулевой рейки";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 4500;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена рулевого наконечника")) {
            Serv server = new Serv();
            server.id = "Замена рулевого наконечника";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 650;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена рулевой тяги")) {
            Serv server = new Serv();
            server.id = "Замена рулевой тяги";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 850;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Компьютерная диагностика АКПП")) {
            Serv server = new Serv();
            server.id = "Компьютерная диагностика АКПП";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 950;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена масла АКПП")) {
            Serv server = new Serv();
            server.id = "Замена масла АКПП";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 1500;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Снятие / установка АКПП")) {
            Serv server = new Serv();
            server.id = "Снятие / установка АКПП";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 9000;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена масла МКПП")) {
            Serv server = new Serv();
            server.id = "Замена масла МКПП";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 600;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена главного цилиндра сцепления")) {
            Serv server = new Serv();
            server.id = "Замена главного цилиндра сцепления";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 700;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена ремня ГРМ")) {
            Serv server = new Serv();
            server.id = "Замена ремня ГРМ";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 750;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена приводного ремня")) {
            Serv server = new Serv();
            server.id = "Замена приводного ремня";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 800;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена прокладки")) {
            Serv server = new Serv();
            server.id = "Замена прокладки";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 10000;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена водяного насоса")) {
            Serv server = new Serv();
            server.id = "Замена водяного насоса";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 800;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена прокладки клапанной крышки")) {
            Serv server = new Serv();
            server.id = "Замена прокладки клапанной крышки";
            server.run(); //Костыль?
            String str = server.setGiver();
            //  System.out.println(str);
            String[] time = str.split("\\s");
            //System.out.println(words.length);
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 800;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }else if (serv.getValue().equals("Замена свечей зажигания")) {
            Serv server = new Serv();
            server.id = "Замена свечей зажигания";
            server.run(); //Костыль?
            String str = server.setGiver();
            String[] time = str.split("\\s");
            ObservableList<String> add = FXCollections.observableArrayList(time);
            timeChoise.setItems(add);
            prise = 800;
            priseLabel.setText("Стоимость - " + prise);
            timeChoise.setVisible(true);
        }

    }

    @FXML
    void timeChoise(ActionEvent event) {
        signButton.setVisible(true);
    }

    @FXML
    void sign(ActionEvent event) {
        Serv server = new Serv();
        server.id = timeChoise.getValue() + " " + serv.getValue();
        server.run(); //Костыль?
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/returnScrean.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReturnScreanController controller;
        Parent root = loader.getRoot();

        controller = loader.getController();
        controller.sceneKeeper = sceneKeeper;
        sceneKeeper.show();

        //загрузить контролер
        //controller.init

        Platform.runLater(() -> sceneKeeper.setScene(new Scene(root)));
    }





}
