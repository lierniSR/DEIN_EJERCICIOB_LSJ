package es.liernisarraoa.gestiondepersonas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gestionDePersona.fxml"));
        scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setTitle("Gestion de Personas");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static Scene getScene(){
        return scene;
    }
}