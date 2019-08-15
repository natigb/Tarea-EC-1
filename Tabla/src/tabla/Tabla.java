
package tabla;
/**
 * El programa Tabla es una aplicacion que a partir de un archivo CSV toma datos de estudiantes y los 
 * muestra en una tabla y muestra 3 columnas adicionales que muestran promedios de examenes, quices y tareas o
 * de proyectos dependiendo del tipo de estudiante y la nota final
 * 
 * Se aplican los conceptos:
 * Clase: Está la clase Tabla que muestra la tabla con los datos del archivo CSV la clase Estudiantes que tiene algunos 
 * atributos respecto a las notas de los estudiantes y sus clases hijas typeA y typeB que tiene atributos dependiendo 
 * del tipo de estudiante
 * Instancia: En el método getInformacion donde se crea la lista de los datos para la tabla se crean objetos a partir de la clase
 * typeA o typeB correspondiente al tipo de estudiante
 * Encapsulación: La variable ventana es privada porque no es necesario editarla desde otras clases 
 
 * 
 * @author Natalia González
 * @version 1.0
 * 
 */

import java.io.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Tabla extends Application {
    //Aplicación de a encapsulación
    private Stage ventana;
    TableView<Estudiantes> latabla;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        ventana = primaryStage;
        ventana.setTitle("Tabla de estudiantes");
        
        //Columnas
        TableColumn<Estudiantes, String> columcarnet= new TableColumn<>("Carnet");
        columcarnet.setMinWidth(100);
        columcarnet.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("carnet"));
        
        TableColumn<Estudiantes, String> columnombre= new TableColumn<>("Nombre Completo");
        columnombre.setMinWidth(100);
        columnombre.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("nombre"));
        
        TableColumn<Estudiantes, String> columcorreo= new TableColumn<>("Correo");
        columcorreo.setMinWidth(100);
        columcorreo.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("correo"));
        
        TableColumn<Estudiantes, String> columtelefono= new TableColumn<>("Telefono");
        columtelefono.setMinWidth(100);
        columtelefono.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("telefono"));
        
        TableColumn<Estudiantes, String> columnickname= new TableColumn<>("Nickname");
        columnickname.setMinWidth(100);
        columnickname.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("nickname"));
        
        TableColumn<Estudiantes, String> columtipo= new TableColumn<>("Tipo");
        columtipo.setMinWidth(50);
        columtipo.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("tipo"));
        
        TableColumn<Estudiantes, String> columexamenes= new TableColumn<>("Promedio de los examenes");
        columexamenes.setMinWidth(50);
        columexamenes.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("examenes"));
        
        TableColumn<Estudiantes, String> columquices= new TableColumn<>("Promedio de los quices");
        columquices.setMinWidth(50);
        columquices.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("quices"));
        
        TableColumn<Estudiantes, String> columtareas= new TableColumn<>("Promedio de las tareas");
        columtareas.setMinWidth(50);
        columtareas.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("tareas"));
        
        TableColumn<Estudiantes, String> columproyecto1= new TableColumn<>("Nota del Proyecto 1");
        columproyecto1.setMinWidth(50);
        columproyecto1.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("proyecto1"));
        
        TableColumn<Estudiantes, String> columproyecto2= new TableColumn<>("Nota del Proyecto 2");
        columproyecto2.setMinWidth(50);
        columproyecto2.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("proyecto2"));
        
        TableColumn<Estudiantes, String> columproyecto3= new TableColumn<>("Nota del Proyecto 3");
        columproyecto3.setMinWidth(50);
        columproyecto3.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("proyecto3"));
        
        TableColumn<Estudiantes, String> columpromex= new TableColumn<>("Nota Promedio (examenes,quices,tareas");
        columpromex.setMinWidth(50);
        columpromex.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("promExamenes"));
        
        TableColumn<Estudiantes, String> columprompro= new TableColumn<>("Nota Promedio (examenes,quices,tareas");
        columprompro.setMinWidth(50);
        columprompro.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("promProyectos"));
        
        TableColumn<Estudiantes, String> columnotafinal= new TableColumn<>("Nota Final");
        columnotafinal.setMinWidth(50);
        columnotafinal.setCellValueFactory(new PropertyValueFactory<Estudiantes, String>("notafinal"));
        
        latabla= new TableView<>();
        latabla.setItems(getInformacion());
        latabla.getColumns().addAll(columcarnet,columnombre,columcorreo,columtelefono, columnickname, columtipo,
                columexamenes,columquices,columtareas,columproyecto1,columproyecto2,columproyecto3,columpromex,
                columprompro,columnotafinal);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(latabla);
        
        Scene escena = new Scene(vbox);
        ventana.setScene(escena);
        ventana.show();    
    }
    
    
    
    
    public ObservableList<Estudiantes> getInformacion() throws FileNotFoundException, IOException{
        FileChooser file = new FileChooser();
        File selectedFile= file.showOpenDialog(null);
        File direccion = null;
        
        if (selectedFile != null){
            direccion=selectedFile.getAbsoluteFile();
           }
        
        ObservableList<Estudiantes> info = FXCollections.observableArrayList();
        String linea;
        double promedioA;
        double promedioB;
   
        BufferedReader archivo=new BufferedReader(new FileReader(direccion));
        archivo.readLine();
        while ((linea=archivo.readLine()) != null) {
            String[] dato = linea.split(",", -1);       
            promedioA=(Double.parseDouble(dato[6])+Double.parseDouble(dato[7])+Double.parseDouble(dato[8]))/3;
            promedioB=(Double.parseDouble(dato[9])+Double.parseDouble(dato[10])+Double.parseDouble(dato[11]))/3;
        
            if ("A".equals(dato[5]) || "a".equals(dato[5])){
                //Creación de una instancia
                typeA estudiante=new typeA();
                estudiante.Informacion(dato[0], dato[1], dato[2],dato[3], dato[4], dato[5],dato[6],dato[7],dato[8],dato[9],dato[10],dato[11]);
                estudiante.promExamenes=Double.toString(promedioA);
                estudiante.notafinal=Double.toString(estudiante.calcularNotaFinal(promedioA, promedioB));
                
                info.add(estudiante);
            }
            else{
                //Creación de una instancia
                typeB estudiante=new typeB();
                estudiante.Informacion(dato[0], dato[1], dato[2],dato[3], dato[4], dato[5],dato[6],dato[7],dato[8],dato[9],dato[10],dato[11]);
                estudiante.promProyectos=Double.toString(promedioB);
                estudiante.notafinal=Double.toString(estudiante.calcularNotaFinal(promedioA, promedioB));
                info.add(estudiante);
            }
        }     
        return info;
    }
    
}

