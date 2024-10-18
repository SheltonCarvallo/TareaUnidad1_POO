package Estudiante;

public class Estudiante {
    private String nombre;
    private double promedio;
    private int edad;

    public Estudiante(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = 0;
    }

    // getter - setter

    //nombre
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    // edad
    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    // promedio
    public double getPromedio()
    {
        return promedio;
    }
    public boolean setPromedio(double promedio)
    {
        if (promedio > 10 || promedio < 0)
        {
            System.out.println("Promedio ingresado no valido, el promedio debe ser una nota entre 0 y 10");
            return false;
        }
        this.promedio = promedio;
        return true;
    }

    public void mostrarInfoEstudiante()
    {
        System.out.println("Información del estudiante:");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad:" + edad);
        System.out.println(promedio > 0 ? "\tPromedio " + promedio : "\tPor favor ingrese el promedio del estudiante");
        System.out.println();
    }

    public void apruebaPromedio()
    {
        if(promedio >= 7){
            System.out.println("Estudiante aprobado!!");
        } else if (promedio >= 5) {
            System.out.println("Estudiante debe que rendir superior");
        } else {
            System.out.println("Estudiante reprobo el curso");
        }
    }

    public void atualizarInfo(String nuevoNombre, int nuevaEdad, double nuevoPromedio)
    {
        if (setPromedio(nuevoPromedio)){
            setNombre(nuevoNombre);
            setEdad(nuevaEdad);
            System.out.println("Información del estudiante actualizada.");
            mostrarInfoEstudiante();
        }
        else {
            System.out.println("La información no se pudo actualizar");
            mostrarInfoEstudiante();
        }
    }


    public void nivelEstudiante()
    {
        if(edad > 30){
            System.out.println("Nivel del estudiante: Maestría");
        }else if (edad > 18){
            System.out.println("Nivel del estudiante: Universitario");
        } else if (edad > 12) {
            System.out.println("Nivel del estudiante: Colegio");
        } else {
            System.out.println("Nivel del estudiante: Escuela");
        }

    }

}
