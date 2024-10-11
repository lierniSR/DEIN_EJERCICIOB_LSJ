package es.liernisarraoa.gestiondepersonas.Controlador;

import es.liernisarraoa.gestiondepersonas.Modelo.Personas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableView<Personas> tablaPersonas;

    @FXML
    private TableColumn<Personas, String> columnaNombre;

    @FXML
    private TableColumn<Personas, String> columnaApellido;

    @FXML
    private TableColumn<Personas, String> columnaEdad;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablaPersonas.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_ALL_COLUMNS);
        columnaNombre.setResizable(true);
        columnaApellido.setResizable(true);
        columnaEdad.setResizable(true);
    }
}