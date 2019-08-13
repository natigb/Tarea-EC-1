
package tabla;

/**
 *Clase para estudiantes de tipo A, se les agrega el atributo de promedio de examenes, quices y tareas
 * Se aplican los conceptos:
 * Herencia: Clase hija que hereda todos los atributos de la clase Estudiantes
 * Instancia: A partir de esta clase es donde se crean los objetos cuando el estudiante es tipo A
 * @author Nati Gonzalez
 */
public class typeA extends Estudiantes {
    public String promExamenes;
    
    public String getPromExamenes() {
        return promExamenes;
    }

    public void setPromExamenes(String promExamenes) {
        this.promExamenes = promExamenes;
    }    
}
