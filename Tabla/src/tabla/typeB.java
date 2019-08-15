
package tabla;

/**
 * Clase para estudiantes de tipo B, se les agrega el atributo de promedio de proyecto1, proyecto2 y proyecto3
 * Se aplican los conceptos:
 * Herencia: Clase hija que hereda todos los atributos de la clase Estudiantes
 * Instancia: A partir de esta clase es donde se crean los objetos cuando el estudiante es tipo B
 * Sobre-escritura: El método de calcularNotaFinal sobreescribe el de la clase Estudiantes
 * Sobrecarga: Si no se le ponen parámetros al método calcularNotaFinal se le asigna un 30 por default
 * Polimorfismo: En las clases hijas el método calcularNotaFinal varía dependiendo del tipo de estudiante 
 * Métodos: Los de calcular la nota final
 * 
 * @author Natalia Gonzalez
 */
public class typeB extends Estudiantes{
    public String promProyectos;
    
    //Aplicación de sobre-escritura y polimorfismo
    @Override
    public int calcularNotaFinal(double promedioA, double promedioB){
        return (int)(promedioA*0.25+promedioB*0.75);
    }
    //Aplicación de sobrecarga
    public int calcularNotaFinal(){
        return 30;
    }
    public String getPromProyectos() {
        return promProyectos;
    }

    public void setPromProyectos(String promProyectos) {
        this.promProyectos = promProyectos;
    }
    
    
}
