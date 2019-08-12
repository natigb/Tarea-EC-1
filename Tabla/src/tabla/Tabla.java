
package tabla;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Tabla extends Application {
    Stage ventana;
    TableView<Informacion> latabla;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        ventana = primaryStage;
        ventana.setTitle("Tabla de estudiantes");
        
        //Columnas
        TableColumn<Informacion, String> columcarnet= new TableColumn<>("Carnet");
        columcarnet.setMinWidth(100);
        columcarnet.setCellValueFactory(new PropertyValueFactory<Informacion, String>("carnet"));
        
        TableColumn<Informacion, String> columnombre= new TableColumn<>("Nombre Completo");
        columnombre.setMinWidth(100);
        columnombre.setCellValueFactory(new PropertyValueFactory<Informacion, String>("nombre"));
        
        TableColumn<Informacion, String> columcorreo= new TableColumn<>("Correo");
        columcorreo.setMinWidth(100);
        columcorreo.setCellValueFactory(new PropertyValueFactory<Informacion, String>("correo"));
        
        TableColumn<Informacion, String> columtelefono= new TableColumn<>("Telefono");
        columtelefono.setMinWidth(100);
        columtelefono.setCellValueFactory(new PropertyValueFactory<Informacion, String>("telefono"));
        
        TableColumn<Informacion, String> columnickname= new TableColumn<>("Nickname");
        columnickname.setMinWidth(100);
        columnickname.setCellValueFactory(new PropertyValueFactory<Informacion, String>("nickname"));
        
        TableColumn<Informacion, String> columtipo= new TableColumn<>("Tipo");
        columtipo.setMinWidth(50);
        columtipo.setCellValueFactory(new PropertyValueFactory<Informacion, String>("tipo"));
        
        TableColumn<Informacion, String> columexamenes= new TableColumn<>("Promedio de los examenes");
        columexamenes.setMinWidth(50);
        columexamenes.setCellValueFactory(new PropertyValueFactory<Informacion, String>("examenes"));
        
        TableColumn<Informacion, String> columquices= new TableColumn<>("Promedio de los quices");
        columquices.setMinWidth(50);
        columquices.setCellValueFactory(new PropertyValueFactory<Informacion, String>("quices"));
        
        TableColumn<Informacion, String> columtareas= new TableColumn<>("Promedio de las tareas");
        columtareas.setMinWidth(50);
        columtareas.setCellValueFactory(new PropertyValueFactory<Informacion, String>("tareas"));
        
        TableColumn<Informacion, String> columproyecto1= new TableColumn<>("Nota del Proyecto 1");
        columproyecto1.setMinWidth(50);
        columproyecto1.setCellValueFactory(new PropertyValueFactory<Informacion, String>("proyecto1"));
        
        TableColumn<Informacion, String> columproyecto2= new TableColumn<>("Nota del Proyecto 2");
        columproyecto2.setMinWidth(50);
        columproyecto2.setCellValueFactory(new PropertyValueFactory<Informacion, String>("proyecto2"));
        
        TableColumn<Informacion, String> columproyecto3= new TableColumn<>("Nota del Proyecto 3");
        columproyecto3.setMinWidth(50);
        columproyecto3.setCellValueFactory(new PropertyValueFactory<Informacion, String>("proyecto3"));
        
        TableColumn<Informacion, String> columpromex= new TableColumn<>("Nota Promedio (examenes,quices,tareas");
        columpromex.setMinWidth(50);
        columpromex.setCellValueFactory(new PropertyValueFactory<Informacion, String>("promExamenes"));
        
        TableColumn<Informacion, String> columprompro= new TableColumn<>("Nota Promedio (examenes,quices,tareas");
        columprompro.setMinWidth(50);
        columprompro.setCellValueFactory(new PropertyValueFactory<Informacion, String>("promProyectos"));
        
        TableColumn<Informacion, String> columnotafinal= new TableColumn<>("Nota Final");
        columnotafinal.setMinWidth(50);
        columnotafinal.setCellValueFactory(new PropertyValueFactory<Informacion, String>("notafinal"));
        
        latabla= new TableView<>();
        latabla.setItems(getInformacion());
        latabla.getColumns().addAll(columcarnet,columnombre,columcorreo,columtelefono, columnickname, columtipo,
                columexamenes,columquices,columtareas,columproyecto1,columproyecto2,columproyecto3,columpromex,columprompro,columnotafinal);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(latabla);
        
        Scene escena = new Scene(vbox);
        ventana.setScene(escena);
        ventana.show();    
    }
    
public ObservableList<Informacion> getInformacion() throws FileNotFoundException, IOException{
   
    ObservableList<Informacion> info = FXCollections.observableArrayList();
    String linea;
    double promedioA;
    double promedioB;
    
             
          BufferedReader archivo=new BufferedReader(new FileReader("C:\\Users\\Nati Gonzalez\\Desktop\\Datos I\\Tarea EC 1\\Notas.csv"));
          System.out.println("");
         
          while ((linea=archivo.readLine()) != null) {
                String[] dato = linea.split(",", -1);
                promedioA=(Double.parseDouble(dato[6])+Double.parseDouble(dato[7])+Double.parseDouble(dato[8]))/3;
                promedioB=(Double.parseDouble(dato[9])+Double.parseDouble(dato[10])+Double.parseDouble(dato[11]))/3;
                if ("A".equals(dato[5]) || "a".equals(dato[5])){
                    typeA obj=new typeA();
                    obj.Informacion(dato[0], dato[1], dato[2],dato[3], dato[4], dato[5],dato[6],
                            dato[7],dato[8],dato[9],dato[10],dato[11]);
                    obj.promExamenes=Double.toString(promedioA);
                    obj.notafinal=Double.toString((promedioA+promedioB)/2);
                    info.add(obj);
                }
                else{
                    
                    typeB obj=new typeB();
                    obj.Informacion(dato[0], dato[1], dato[2],dato[3], dato[4], dato[5],dato[6],
                            dato[7],dato[8],dato[9],dato[10],dato[11]);
                    obj.promProyectos=Double.toString(promedioB);
                    obj.notafinal=Double.toString((promedioA+promedioB)/2);
                    info.add(obj);
                }
                }     
    return info;
}
}

