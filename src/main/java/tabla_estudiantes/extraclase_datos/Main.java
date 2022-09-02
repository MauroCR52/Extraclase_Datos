package tabla_estudiantes.extraclase_datos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main contiene los métodos necesarios para iniciar la aplicación
 */
public class Main extends Application {
    /**
     * Método que lee archivo FXML de la tabla para iniciar la escena
     * @param tabla nombre de variable que tendrá la escena
     * @throws Exception
     */
    @Override
    public void start(Stage tabla) throws Exception {
        Parent csv = FXMLLoader.load(getClass().getResource("Tabla.fxml"));
        tabla.setTitle("Tabla");
        tabla.setScene(new Scene(csv));
        tabla.show();
    }

    /**
     * Método que inicia la aplicación
     * @param args
     */
    public static void main(String[] args) {
        LectorCSV.leerCSV();
        launch();
    }

}
