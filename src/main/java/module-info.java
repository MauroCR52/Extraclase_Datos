module tabla_estudiantes.extraclase_datos {
    requires javafx.controls;
    requires javafx.fxml;


    opens tabla_estudiantes.extraclase_datos to javafx.fxml;
    exports tabla_estudiantes.extraclase_datos;
}