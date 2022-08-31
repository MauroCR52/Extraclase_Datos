package tabla_estudiantes.extraclase_datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LectorCSV {
    public static void leerCSV() {
        String archivoCSV = "src/main/java/tabla_estudiantes/extraclase_datos/Estudiantes.csv";
        String delimitador = ",";

        BufferedReader lector;

        try {
            lector = new BufferedReader(new FileReader(archivoCSV));

            String line;
            line = lector.readLine();
            while ((line = lector.readLine()) != null) {
                String[] celda = line.split(delimitador, -1);

                Estudiante estudiante = new Estudiante(celda[0], celda[1], celda[2], celda[3], celda[4], celda[5], Integer.parseInt(celda[6]),
                        Integer.parseInt(celda[7]), Integer.parseInt(celda[8]), Integer.parseInt(celda[9]), Integer.parseInt(celda[10]), Integer.parseInt(celda[11]));
                Tabla.lista.add(estudiante);


            }
        System.out.println(Tabla.lista);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}