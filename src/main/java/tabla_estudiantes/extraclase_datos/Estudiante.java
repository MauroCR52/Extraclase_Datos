package tabla_estudiantes.extraclase_datos;

public class Estudiante {
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

    public Estudiante(String carne, String nombre, String correo, String telefono, String nickname, String tipo,
                      int promedio_exam, int promedio_quiz, int promedio_tarea, int proyecto_1, int proyecto_2, int proyecto_3) {
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
    }

    public String getCarne() {
        return carne;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPromedio_exam() {
        return promedio_exam;
    }

    public int getPromedio_quiz() {
        return promedio_quiz;
    }

    public int getPromedio_tarea() {
        return promedio_tarea;
    }

    public int getProyecto_1() {
        return proyecto_1;
    }

    public int getProyecto_2() {
        return proyecto_2;
    }

    public int getProyecto_3() {
        return proyecto_3;
    }



}
