
package tabla;

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
    public void start(Stage primaryStage) {
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
    
public ObservableList<Informacion> getInformacion(){
    ObservableList<Informacion> info = FXCollections.observableArrayList();
    info.add(new Informacion("1000", "Pri Mero", "1@tec.cr","1234","One","A",65,34,87,45,74,73));
    info.add(new Informacion("1001", "Seg Undo", "2@tec.cr","1264","Two","A",85,74,67,85,34,63));
    info.add(new Informacion("1002", "Ter Cero", "3@tec.cr","1284","Three","B",76,54,98,64,78,79));
    return info;
}
}
