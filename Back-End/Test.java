package SemesterProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Test extends Application {



    public static void main(String[] args) {



launch(args);
    }



    @Override
    public void start(Stage stage) throws Exception {

        Parent root=FXMLLoader.load(getClass().getResource("FxmlForScreen1.fxml"));
        stage.setScene(new Scene(root));
        stage.setFullScreen(false);
        stage.setTitle("Law Enforcement System");
        stage.setResizable(false);
        stage.show();


    }
}



