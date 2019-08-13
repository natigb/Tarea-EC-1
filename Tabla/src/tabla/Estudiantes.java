
package tabla;
/**
 * Es la clase padre para crear los objetos que se muestran en la tabla, tiene como clases hijas 
 * typeA y typeB que tienen un atributo diferente dependiendo del tipo de estudiante
 * 
 * Se aplican los conceptos:
 * Abstracción: Se ven las características principales de los estudiantes y al crear el objeto se 
 * hace la representación de las notas del estudiante.
 * Atributos: Cada estudiante tiene características que puede cambiar entre ellos como la cédula, el nombre, 
 * el carnet, notas, etc.
 * Métodos: Existe el método calcularNotaFinal que recibe 2 argumentos y saca el promedio entre ellos
 * Herencia: Comparte sus atributos y métodos con las clases hijas typeA y typeB
 * 
 * @author Natalia Gonzalez
 */
public class Estudiantes {
    
    public String carnet;
    public String nombre;
    public String correo;
    public String telefono;
    public String nickname;
    public String tipo;
    public String examenes;
    public String quices;
    public String tareas;
    public String proyecto1;
    public String proyecto2;
    public String proyecto3;
    public String notafinal;
    
    public Estudiantes(){
        this.carnet = "";
        this.correo = "";
        this.examenes = "";
        this.nickname = "";
        this.nombre = "";
        this.proyecto1 = "";
        this.proyecto2 = "";
        this.proyecto3 = "";
        this.quices = "";
        this.tareas = "";
        this.telefono =  "";
        this.tipo = "";
        this.notafinal = "";
        
    }
    public void Informacion(String carnet, String nombre, String correo, 
    String telefono, String nickname, String tipo, String examenes,
    String quices, String tareas, String proyecto1,String proyecto2,
    String proyecto3){
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
    public int calcularNotaFinal(double promedioA,double promedioB){
        return (int)((promedioA+promedioB)/2);
    
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

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    public String getQuices() {
        return quices;
    }

    public void setQuices(String quices) {
        this.quices = quices;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public String getProyecto1() {
        return proyecto1;
    }

    public void setProyecto1(String proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public String getProyecto2() {
        return proyecto2;
    }

    public void setProyecto2(String proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public String getProyecto3() {
        return proyecto3;
    }

    public void setProyecto3(String proyecto3) {
        this.proyecto3 = proyecto3;
    }

    public String getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(String notafinal) {
        this.notafinal = notafinal;
    }
       
        }
    
