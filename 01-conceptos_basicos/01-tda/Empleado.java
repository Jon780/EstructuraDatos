public class Empleado {

    // Variables de instancia
    private String numeroNomina;
    private String nombre;
    private String sexo;
    private double sueldo;
    private boolean activo;
    private static int contarObjetos;

    // Sobrecarga de constructores
    public Empleado (){
        contarObjetos++;
    }

    public Empleado (String numeroNomina,
                     String nombre,
                     String sexo, double sueldo,
                     boolean activo){
        this.numeroNomina = numeroNomina;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;
        this.nombre = nombre;
        contarObjetos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static int getContarObjetos (){
        return Empleado.contarObjetos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroNomina='" + numeroNomina + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", sueldo=" + sueldo +
                ", activo=" + (activo?"Activo":"Inactivo") +
                '}';
    }
}