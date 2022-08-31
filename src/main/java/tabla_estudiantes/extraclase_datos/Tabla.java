package tabla_estudiantes.extraclase_datos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Tabla implements Initializable {

    @FXML
    private TableColumn<Estudiante, String> carne;

    @FXML
    private TableColumn<Estudiante, String> correo;

    @FXML
    private TableColumn<Estudiante, String> nickname;

    @FXML
    private TableColumn<Estudiante, String> nombre;

    @FXML
    private TableColumn<Estudiante, Integer> nota_final;

    @FXML
    private TableColumn<Estudiante, Integer> prom_exam;

    @FXML
    private TableColumn<Estudiante, Integer> prom_exam_quiz_tarea;

    @FXML
    private TableColumn<Estudiante, Integer> prom_proyecto;

    @FXML
    private TableColumn<Estudiante, Integer> prom_quiz;

    @FXML
    private TableColumn<Estudiante, Integer> prom_tarea;

    @FXML
    private TableColumn<Estudiante, Integer> proyecto_1;

    @FXML
    private TableColumn<Estudiante, Integer> proyecto_2;

    @FXML
    private TableColumn<Estudiante, Integer> proyecto_3;

    @FXML
    private TableView<Estudiante> tabla;

    @FXML
    private TableColumn<Estudiante, String> telefono;

    @FXML
    private TableColumn<Estudiante, String> tipo;

    public static ObservableList<Estudiante> lista = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        carne.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("carne"));
        nombre.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
        correo.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("correo"));
        telefono.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("telefono"));
        nickname.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nickname"));
        tipo.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("tipo"));
        prom_exam.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("prom_exam"));
        prom_quiz.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("prom_quiz"));
        prom_tarea.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("prom_tarea"));
        proyecto_1.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("proyecto_1"));
        proyecto_2.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("proyecto_2"));
        proyecto_3.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("proyecto_3"));
        prom_proyecto.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("prom_proyecto"));
        prom_exam_quiz_tarea.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("prom_exam_quiz_tarea"));
        nota_final.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("nota_final"));
        tabla.setItems(lista);
    }
}
