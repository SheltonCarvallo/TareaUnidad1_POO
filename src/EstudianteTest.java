import Estudiante.*;

public class EstudianteTest {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Shelton", 27);
        estudiante.mostrarInfoEstudiante();
        estudiante.setPromedio(8.5);
        estudiante.mostrarInfoEstudiante();
        estudiante.atualizarInfo("Xavier", 27, -2);
        estudiante.atualizarInfo("Xavier", 27, 10);
        estudiante.nivelEstudiante();
        estudiante.apruebaPromedio();

    }
}
