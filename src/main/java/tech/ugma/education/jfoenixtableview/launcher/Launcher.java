package tech.ugma.education.jfoenixtableview.launcher;

import com.jfoenix.controls.JFXDecorator;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static HostServices hostServices;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setTitle("Hello World");

        JFXDecorator jfxDecorator = new JFXDecorator(primaryStage, root);

        primaryStage.setScene(new Scene(jfxDecorator));
        primaryStage.show();

        // Needed to open up the default browser
        hostServices = getHostServices();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
