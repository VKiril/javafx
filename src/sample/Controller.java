package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.awt.*;
import java.beans.EventHandler;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML
    private Button test1;
    @FXML
    private AnchorPane content;
    @FXML
    private Text actiontarget;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    protected void test(ActionEvent event)
    {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("stage.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Hello World");
            stage.setScene(new Scene(root, 500, 275));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void cancel(){

        System.out.println("cencel");
    }

    @FXML
    protected void login(){
        System.out.println("login");
    }
    @FXML
    protected void handleSubmitButtonAction(){}
}
