
package tabla;

/**
 * Clase para estudiantes de tipo A, se les agrega el atributo de promedio de examenes, quices y tareas
 * Se aplican los conceptos:
 * Herencia: Clase hija que hereda todos los atributos de la clase Estudiantes
 * Instancia: A partir de esta clase es donde se crean los objetos cuando el estudiante es tipo A
 * Sobre-escritura: El método de calcularNotaFinal sobreescribe el de la clase Estudiantes
 * Sobrecarga: Si no se le ponen parámetros al método calcularNotaFinal se le asigna un 30 por default
 * Polimorfismo: En las clases hijas el método calcularNotaFinal varía dependiendo del tipo de estudiante
 * Métodos: Los de calcular la nota final
 * 
 * @author Nati Gonzalez
 */
public class typeA extends Estudiantes {
    public String promExamenes;
    
    //Aplicación de sobre-escritura y polimorfismo
    @Override
    public int calcularNotaFinal(double promedioA, double promedioB){
        return (int)(promedioA*0.75+promedioB*0.25);
    
    }
    //Aplicación de sobrecarga
    public int calcularNotaFinal(){
        return 30;
    }
    public String getPromExamenes() {
        return promExamenes;
    }

    public void setPromExamenes(String promExamenes) {
        this.promExamenes = promExamenes;
    }    
}
