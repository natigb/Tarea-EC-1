
package tabla;

public class Informacion {
    private String carnet;
    private String nombre;
    private String correo;
    private String telefono;
    private String nickname;
    private String tipo;
    private double examenes;
    private double quices;
    private double tareas;
    private double proyecto1;
    private double proyecto2;
    private double proyecto3;
    
    
    public Informacion(String carnet, String nombre, String correo, 
    String telefono, String nickname, String tipo, double examenes,
    double quices, double tareas, double proyecto1,double proyecto2,
    double proyecto3){
        this.carnet = carnet;
        this.correo = correo;
        this.examenes = examenes;
        this.nickname = nickname;
        this.nombre = nombre;
        this.proyecto1 = proyecto1;
        this.proyecto2 = proyecto2;
        this.proyecto3 = proyecto3;
        this.quices = quices;
        this.tareas = tareas;
        this.telefono =  telefono;
        this.tipo = tipo;
 
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getExamenes() {
        return examenes;
    }

    public void setExamenes(double examenes) {
        this.examenes = examenes;
    }

    public double getQuices() {
        return quices;
    }

    public void setQuices(double quices) {
        this.quices = quices;
    }

    public double getTareas() {
        return tareas;
    }

    public void setTareas(double tareas) {
        this.tareas = tareas;
    }

    public double getProyecto1() {
        return proyecto1;
    }

    public void setProyecto1(double proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public double getProyecto2() {
        return proyecto2;
    }

    public void setProyecto2(double proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public double getProyecto3() {
        return proyecto3;
    }

    public void setProyecto3(double proyecto3) {
        this.proyecto3 = proyecto3;
    }
    
    
    
  
}
