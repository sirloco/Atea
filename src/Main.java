
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Vista/Login.fxml"));
        primaryStage.setTitle("aTEA - Iniciar sesión");
        primaryStage.setScene(new Scene(rootr));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
