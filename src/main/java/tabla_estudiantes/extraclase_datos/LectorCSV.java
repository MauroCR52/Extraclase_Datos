package tabla_estudiantes.extraclase_datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * LectorCSV mantiene los atributos y métodos necesarios para leer un archivo .csv
 */
public class LectorCSV {
    /**
     * Método que lee el archivo .csv e identifique el tipo de estudiante (A o B) para crear sus respectivas
     * instancias y luego añadirlas a la lista utilizada en Tabla para generar la tabla de manera visual
     */
    public static void leerCSV() {
        String archivoCSV = "src/main/java/tabla_estudiantes/extraclase_datos/Estudiantes.csv";
        String delimitador = ",";

        BufferedReader lector;

        try {
            lector = new BufferedReader(new FileReader(archivoCSV));
            String line;
            line = lector.readLine(); //Evita leer la primera linea (encabezados)
            while ((line = lector.readLine()) != null) {
                String[] celda = line.split(delimitador, -1);
                if (celda[5].equals("A")) {
                    // Creación de una instancia para estudiante de tipo A
                    Estudiante_A estudiante_a = new Estudiante_A(celda[0], celda[1], celda[2], celda[3], celda[4], celda[5], Integer.parseInt(celda[6]),
                            Integer.parseInt(celda[7]), Integer.parseInt(celda[8]), Integer.parseInt(celda[9]), Integer.parseInt(celda[10]), Integer.parseInt(celda[11]), 0, 0);
                    estudiante_a.setPromedio_eqt(estudiante_a.obtener_nota()); // Agrega el valor del promedio (examenes, quices, tareas)
                    estudiante_a.setNota_final((int) estudiante_a.obtener_final()); // Agrega el valor de la nota final
                    Tabla.lista.add(estudiante_a);
                } else {
                    // Creacion de una instancia para estudiante de tipo B
                    Estudiante_B estudiante_b = new Estudiante_B(celda[0], celda[1], celda[2], celda[3], celda[4], celda[5], Integer.parseInt(celda[6]),
                            Integer.parseInt(celda[7]), Integer.parseInt(celda[8]), Integer.parseInt(celda[9]), Integer.parseInt(celda[10]), Integer.parseInt(celda[11]), 0, 0);
                    estudiante_b.setPromedio_proyecto(estudiante_b.obtener_nota()); // Agrega el valor del promedio (proyectos)
                    estudiante_b.setNota_final((int) estudiante_b.obtener_final()); // Agrega el valor de la nota final
                    Tabla.lista.add(estudiante_b);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
