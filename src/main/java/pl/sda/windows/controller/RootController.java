package pl.sda.windows.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pl.sda.windows.App;

import java.io.IOException;

public class RootController {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    private App app;

    public void openWindow1(ActionEvent actionEvent) {
        app.loadOneView();
    }
    public void openWindow2(ActionEvent actionEvent){
        app.loadView("button2view.fxml");
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
