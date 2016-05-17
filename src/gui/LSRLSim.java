package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LSRLSim extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        primaryStage.setTitle("Least Square Simulator");
        primaryStage.setScene(new Scene(root, 1000, 1000));
        primaryStage.show();

        LSRLGraph graph = new LSRLGraph(root, null, null);
//        root.getChildren().add(graph);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
