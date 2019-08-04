package pl.sda.windows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.windows.controller.Button1Controller;
import pl.sda.windows.controller.RootController;

import java.io.IOException;

public class App extends Application
{
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/rootView.fxml"));
        fxmlLoader.load();
        RootController controller = fxmlLoader.getController();
        controller.setApp(this);

        Parent parent = fxmlLoader.getRoot();
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }
    public void loadOneView(){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/button1view.fxml"));

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent parent = fxmlLoader.getRoot();
        stage.setScene(new Scene(parent));
        stage.show();
    }
    public void loadTwoView(){

    }
    public void loadView(String fileName){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/"+fileName));

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent parent = fxmlLoader.getRoot();
        stage.setScene(new Scene(parent));
        stage.show();
    }
}
