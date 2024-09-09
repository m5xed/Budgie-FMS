package budgie.org.fms;

import eu.hansolo.tilesfx.Test;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu extends Application {
    @Override
    public void start(Stage stage) {

        // UI comp
        Label pageTitle = new Label("Budgie FMS");

        TextField user = new TextField();
        user.setPromptText("Enter Your E-mail");
        user.setMinWidth(200); // Set minimum width of the text field
        user.setMaxWidth(300); // Set maximum width of the text field

        TextField pass = new TextField();
        pass.setPromptText("Enter Your Password");
        pass.setMinWidth(200); // Set minimum width of the pass field
        pass.setMaxWidth(300); // Set maximum width of the pass field

        Button submit = new Button("Login");

        // Vbox setup
        VBox center = new VBox(10); // 10px spacing between elements
        center.getChildren().addAll(pageTitle, user, pass, submit);
        center.setAlignment(Pos.CENTER);

        // Create Layout
        BorderPane root = new BorderPane();
        root.setCenter(center);

        // Create Scene with layout
        Scene scene = new Scene(root, 1000, 563);

        // Final Properties
        stage.setTitle("Budgie");
        Image icon = new Image(getClass().getResource("/budgie/org/fms/budgieIcon.png").toExternalForm());
        stage.getIcons().add(icon);
        scene.getStylesheets().add(getClass().getResource("/budgie/org/fms/TextField.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}