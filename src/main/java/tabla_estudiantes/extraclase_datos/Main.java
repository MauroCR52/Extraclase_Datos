package tabla_estudiantes.extraclase_datos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage tabla) throws Exception{
        Parent csv = FXMLLoader.load(getClass().getResource("Tabla.fxml"));
        tabla.setTitle("Tabla");
        tabla.setScene(new Scene(csv));
        tabla.show();
    }

    public static void main(String[] args) {
        // LectorCSV.leerCSV();
        launch();
    }

}
