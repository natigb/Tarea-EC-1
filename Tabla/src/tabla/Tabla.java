
package tabla;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
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
        columtipo.setMinWidth(100);
        columtipo.setCellValueFactory(new PropertyValueFactory<Informacion, String>("tipo"));
        
        TableColumn<Informacion, Double> columexamenes= new TableColumn<>("Promedio de los examenes");
        columexamenes.setMinWidth(100);
        columexamenes.setCellValueFactory(new PropertyValueFactory<Informacion, Double>("examenes"));
        
        TableColumn<Informacion, Double> columquices= new TableColumn<>("Promedio de los quices");
        columquices.setMinWidth(100);
        columquices.setCellValueFactory(new PropertyValueFactory<Informacion, Double>("quices"));
        
        TableColumn<Informacion, Double> columtareas= new TableColumn<>("Promedio de las tareas");
        columtareas.setMinWidth(100);
        columtareas.setCellValueFactory(new PropertyValueFactory<Informacion, Double>("tareas"));
        
        TableColumn<Informacion, Double> columproyecto1= new TableColumn<>("Nota del Proyecto 1");
        columproyecto1.setMinWidth(100);
        columproyecto1.setCellValueFactory(new PropertyValueFactory<Informacion, Double>("proyecto1"));
        
        TableColumn<Informacion, Double> columproyecto2= new TableColumn<>("Nota del Proyecto 2");
        columproyecto2.setMinWidth(100);
        columproyecto2.setCellValueFactory(new PropertyValueFactory<Informacion, Double>("proyecto2"));
        
        TableColumn<Informacion, Double> columproyecto3= new TableColumn<>("Nota del Proyecto 3");
        columproyecto3.setMinWidth(100);
        columproyecto3.setCellValueFactory(new PropertyValueFactory<Informacion, Double>("proyecto3"));
        
        latabla= new TableView<>();
        latabla.setItems(getInformacion());
        latabla.getColumns().addAll(columcarnet,columnombre,columcorreo,columtelefono, columnickname, columtipo,
                columexamenes,columquices,columtareas,columproyecto1,columproyecto2,columproyecto3);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(latabla);
        
        Scene escena = new Scene(vbox);
        ventana.setScene(escena);
        ventana.show();    
    }
    
public ObservableList<Informacion> getInformacion() throws FileNotFoundException, IOException{
    ObservableList<Informacion> info = FXCollections.observableArrayList();
    String linea;
             
          BufferedReader archivo=new BufferedReader(new FileReader("C:\\Users\\Nati Gonzalez\\Desktop\\Datos I\\Tarea EC 1\\Notas.csv"));
          System.out.println(archivo);
         
          while ((linea=archivo.readLine()) != null) {
                String[] dato = linea.split(",", -1);
               
 
                info.add( new Informacion(dato[0], dato[1], dato[2],
                        dato[3], dato[4], dato[5],Double.parseDouble(dato[6]),Double.parseDouble(dato[7]),
                        Double.parseDouble(dato[8]),Double.parseDouble(dato[9]),Double.parseDouble(dato[10]),
                        Double.parseDouble(dato[11])));
       
 
            }
    return info;
}
}
