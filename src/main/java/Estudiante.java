public class Estudiante {
    private String Matricula;
    private String Nombre;
    private String Carrera;
    private String Correo;

    public Estudiante(){

    }

    public Estudiante(String matricula, String nombre, String carrera, String correo) {
        Matricula = matricula;
        Nombre = nombre;
        Carrera = carrera;
        Correo = correo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
