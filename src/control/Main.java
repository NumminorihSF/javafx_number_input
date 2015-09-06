package control;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        NumberInput numberInput = new NumberInput();
        stage.setScene(new Scene(numberInput));
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
