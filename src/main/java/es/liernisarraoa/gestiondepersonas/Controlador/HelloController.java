package es.liernisarraoa.gestiondepersonas.Controlador;

import es.liernisarraoa.gestiondepersonas.HelloApplication;
import es.liernisarraoa.gestiondepersonas.Modelo.Personas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private String errores = "";
    private Scene escenaAplicacion;

    @FXML
    private TableView<Personas> tablaPersonas;

    @FXML
    private TableColumn<Personas, String> columnaNombre;

    @FXML
    private TableColumn<Personas, String> columnaApellido;

    @FXML
    private TableColumn<Personas, Integer> columnaEdad;

    @FXML
    private TextField nombreTextField;

    @FXML
    private TextField apellidoTextField;

    @FXML
    private TextField edadTextField;

    @FXML
    private Button btnAniadirPersona;

    public void aniadirPersona(ActionEvent actionEvent){
        errores = "";
        escenaAplicacion = HelloApplication.getScene();
        if(nombreTextField.getText().isEmpty()){
            errores += "El campo nombre es obligatorio.\n";
        }
        if(apellidoTextField.getText().isEmpty()){
            errores += "El campo apellidos es obligatorio.\n";
        }
        if(edadTextField.getText().isEmpty()){
            errores += "El campo edad es obligatorio";
        } else {
            try{
                Integer edad = Integer.parseInt(edadTextField.getText());
            } catch (NumberFormatException e){
                errores += "El campo edad tiene que ser númerico.\n";
            }
        }
        if(errores.isEmpty()){
            aniadirPersonaTabla();
        } else{
            alertaError();
        }
    }

    private void aniadirPersonaTabla() {
        Personas p = new Personas(nombreTextField.getText(), apellidoTextField.getText(), Integer.parseInt(edadTextField.getText()));
        tablaPersonas.getItems().add(p);
        //alertaAniadirPersona();
    }

    private void alertaError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initOwner(escenaAplicacion.getWindow());
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(errores);
        alert.showAndWait();
    }

    private void alertaAniadirPersona() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(escenaAplicacion.getWindow());
        alert.setHeaderText(null);
        alert.setTitle("Persona añadida");
        alert.setContentText("Persona añadida correctamente.");
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        columnaEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
    }
}