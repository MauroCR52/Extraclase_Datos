package tabla_estudiantes.extraclase_datos;

/**
 * Estudiante_A representa al estudiante adicionando el atributo del promedio (examenes, quices, tareas) propio de un
 * estudiante de tipo A además de los atributos y metodos heredados de su clase padre (Estudiante). (Herencia, Sobrecarga)
 */
public class Estudiante_A extends Estudiante {
    private double promedio_eqt;

    /**
     * Cambia el atributo del promedio (examenes, quices, tareas) por un nuevo valor
     * @param promedio_eqt nuevo valor de atributo
     */
    public void setPromedio_eqt(double promedio_eqt) {
        this.promedio_eqt = promedio_eqt;
    }

    /**
     * Devuelve el valor del promedio (examenes, quices, tareas)
     * @return valor de promedio_eqt
     */
    public double getPromedio_eqt() {
        return promedio_eqt;
    }
    // Objeto de Estudiante_A adicionando un atributo para promedio (examenes, quices, tareas), aplicando sobrecarga
    public Estudiante_A(String carne, String nombre, String correo, String telefono, String nickname, String tipo, int promedio_exam, int promedio_quiz,
                        int promedio_tarea, int proyecto_1, int proyecto_2, int proyecto_3, double promedio_eqt, int nota_final) {

        super(carne, nombre, correo, telefono, nickname, tipo, promedio_exam, promedio_quiz,
                promedio_tarea, proyecto_1, proyecto_2, proyecto_3, nota_final);

        this.promedio_eqt = promedio_eqt;
    }

    /**
     * Método heredado que calcula la nota del promedio de examenes, quices, tareas del estudiante
     * Este método actua de manera diferente en caso del Estudiante_B, por lo que se realiza una sobreescritura
     * y aplicando polimorfismo
     * @return valor de la nota promedio de examenes, quices, tareas.
     */
    @Override
    public double obtener_nota() {
        double promedio_A;
        promedio_A = (getPromedio_exam() + getPromedio_quiz() + getPromedio_tarea()) / 3;
        return promedio_A;
    }
}
