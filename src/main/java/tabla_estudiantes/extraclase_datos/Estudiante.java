package tabla_estudiantes.extraclase_datos;

/**
 * Estudiante representa una entidad que guarde los datos de un estudiante real (Abstracción).
 * Estudiante guarda los atributos generales de un estudiante para después ser divididos dependiendo
 * del tipo de estudiante (Atributos).
 */
public abstract class Estudiante { //Superclase abstracta que contiene los atributos generales.
    private String carne;
    private String nombre;
    private String correo;
    private String telefono;
    private String nickname;
    private String tipo;
    private int promedio_exam;
    private int promedio_quiz;
    private int promedio_tarea;
    private int proyecto_1;
    private int proyecto_2;
    private int proyecto_3;
    private int nota_final;

    /**
     * Método constructor de la super clase
     */
    public Estudiante(String carne, String nombre, String correo, String telefono, String nickname, String tipo, int promedio_exam, int promedio_quiz,
                      int promedio_tarea, int proyecto_1, int proyecto_2, int proyecto_3, int nota_final) {
        this.carne = carne;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.nickname = nickname;
        this.tipo = tipo;
        this.promedio_exam = promedio_exam;
        this.promedio_quiz = promedio_quiz;
        this.promedio_tarea = promedio_tarea;
        this.proyecto_1 = proyecto_1;
        this.proyecto_2 = proyecto_2;
        this.proyecto_3 = proyecto_3;
        this.nota_final = nota_final;

    }

    /**
     * Devuelve el string del carne
     * @return string de carne
     */
    public String getCarne() {
        return carne;
    }

    /**
     * Devuelve el string del nombre
     * @return string de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el string del correo
     * @return String de correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Devuelve el string del telefono
     * @return string de telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Devuelve el string del nombre de usuario
     * @return string de nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Devuelve el string del tipo de estudiante
     * @return String de tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Devuelve el entero del promedio de examen
     * @return Entero de promedio_exam
     */
    public int getPromedio_exam() {
        return promedio_exam;
    }

    /**
     * Devuelve el entero del promedio de quiz
     * @return Entero de promedio_quiz
     */
    public int getPromedio_quiz() {
        return promedio_quiz;
    }

    /**
     * Devuelve el entero del promedio de tarea
     * @return entero de promedio_tarea
     */
    public int getPromedio_tarea() {
        return promedio_tarea;
    }

    /**
     * Devuelve el entero de la nota del proyecto 1
     * @return Entero de proyecto_1
     */
    public int getProyecto_1() {
        return proyecto_1;
    }

    /**
     * Devuelve el entero de la nota del proyecto 2
     * @return Entero de proyecto_2
     */
    public int getProyecto_2() {
        return proyecto_2;
    }

    /**
     * Devuelve el entero de la nota del proyecto 3
     * @return Entero de proyecto_3
     */
    public int getProyecto_3() {
        return proyecto_3;
    }

    /**
     * Devuelve el entero de la nota final
     * @return Entero de nota_final
     */
    public int getNota_final() {
        return nota_final;
    }

    /**
     * Cambia el atributo de la nota final por otro valor
     * @param nota_final nuevo atributo a cambiar
     */
    public void setNota_final(int nota_final) {
        this.nota_final = nota_final;
    }

    /**
     * Método abstracto que calcula la nota del promedio de proyecto o promedio de examenes, quices, tareas
     * según el tipo de estudiante que lo use
     * @return valor de la nota promedio
     */
    abstract double obtener_nota();

    /**
     * Método que calcula la nota final del ambos tipos de estudiantes
     * @return nota final
     */
    public double obtener_final() {
        double nota;
        nota = (getProyecto_1() + getProyecto_2() + getProyecto_3() + getPromedio_exam() + getPromedio_quiz() + getPromedio_tarea()) / 6;
        return nota;
    }

}
