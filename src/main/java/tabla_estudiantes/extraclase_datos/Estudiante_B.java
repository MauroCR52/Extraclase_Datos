package tabla_estudiantes.extraclase_datos;

/**
 * Estudiante_B representa al estudiante adicionando el atributo del promedio (proyectos) propio de un
 * estudiante de tipo A además de los atributos y metodos heredados de su clase padre (Estudiante). (Herencia, Sobrecarga)
 */
public class Estudiante_B extends Estudiante {

    private double promedio_proyecto;

    /**
     * Cambio el valor de atributo del promedio de proyectos por uno nuevo
     * @param promedio_proyecto nuevo valor atributo
     */
    public void setPromedio_proyecto(double promedio_proyecto) {
        this.promedio_proyecto = promedio_proyecto;
    }

    /**
     * Devuelve el valor del promedio (proyectos)
     * @return valor de promedio_proyecto
     */
    public double getPromedio_proyecto() {
        return promedio_proyecto;
    }

    // Objeto de Estudiante_B adicionando un atributo para promedio (proyectos), aplicando sobrecarga
    public Estudiante_B(String carne, String nombre, String correo, String telefono, String nickname, String tipo, int promedio_exam, int promedio_quiz,
                        int promedio_tarea, int proyecto_1, int proyecto_2, int proyecto_3, double promedio_proyecto, int nota_final) {

        super(carne, nombre, correo, telefono, nickname, tipo, promedio_exam, promedio_quiz,
                promedio_tarea, proyecto_1, proyecto_2, proyecto_3, nota_final);

        this.promedio_proyecto = promedio_proyecto;
    }

    /**
     * Método heredado que calcula la nota del promedio de proyectos del estudiante
     * este método actúa de manera diferente en caso del Estudiante_A, por lo que se realiza una sobreescritura
     * y aplicando polimorfismo
     * @return valor de la nota promedio_proyectos.
     */
    @Override
    public double obtener_nota() {
        double promedio_B;
        promedio_B = (getProyecto_1() + getProyecto_2() + getProyecto_3()) / 3;
        return promedio_B;
    }

}
