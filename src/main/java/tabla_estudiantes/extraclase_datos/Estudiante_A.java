package tabla_estudiantes.extraclase_datos;

public class Estudiante_A extends Estudiante {
    private double promedio_eqt;

    public void setPromedio_eqt(double promedio_eqt) {
        this.promedio_eqt = promedio_eqt;
    }

    public double getPromedio_eqt() {
        return promedio_eqt;
    }



    public Estudiante_A(String carne, String nombre, String correo, String telefono, String nickname, String tipo, int promedio_exam, int promedio_quiz,
                        int promedio_tarea, int proyecto_1, int proyecto_2, int proyecto_3, double promedio_eqt, int nota_final){

        super(carne, nombre, correo, telefono, nickname, tipo, promedio_exam, promedio_quiz,
                promedio_tarea, proyecto_1, proyecto_2, proyecto_3, nota_final);

        this.promedio_eqt = promedio_eqt;
    }

    @Override
    public double obtener_nota() {
        double promedio_A;
        promedio_A = (getPromedio_exam() + getPromedio_quiz() + getPromedio_tarea()) / 3;
        return promedio_A;
    }
}
