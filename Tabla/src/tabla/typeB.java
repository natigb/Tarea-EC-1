
package tabla;

/**
 *Clase para estudiantes de tipo B, se les agrega el atributo de promedio de proyecto1, proyecto2 y proyecto3
 * Se aplican los conceptos:
 * Herencia: Clase hija que hereda todos los atributos de la clase Estudiantes
 * Instancia: A partir de esta clase es donde se crean los objetos cuando el estudiante es tipo B
 * @author Natalia Gonzalez
 */
public class typeB extends Estudiantes{
    public String promProyectos;

    public String getPromProyectos() {
        return promProyectos;
    }

    public void setPromProyectos(String promProyectos) {
        this.promProyectos = promProyectos;
    }
    
    
}
