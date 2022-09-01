package tabla_estudiantes.extraclase_datos;

public class Estudiante_B extends Estudiante {

    private double promedio_proyecto;

    public void setPromedio_proyecto(double promedio_proyecto) {
        this.promedio_proyecto = promedio_proyecto;
    }

    public double getPromedio_proyecto() {
        return promedio_proyecto;
    }


    public Estudiante_B(String carne, String nombre, String correo, String telefono, String nickname, String tipo, int promedio_exam, int promedio_quiz,
                        int promedio_tarea, int proyecto_1, int proyecto_2, int proyecto_3, double promedio_proyecto, int nota_final){

        super(carne, nombre, correo, telefono, nickname, tipo, promedio_exam, promedio_quiz,
                promedio_tarea, proyecto_1, proyecto_2, proyecto_3, nota_final);

        this.promedio_proyecto = promedio_proyecto;
    }

    @Override
    public double obtener_nota() {
        double promedio_B;
        promedio_B = (getProyecto_1() + getProyecto_2() + getProyecto_3()) / 3;
        return promedio_B;
    }
}
