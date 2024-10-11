module es.liernisarraoa.gestiondepersonas {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.liernisarraoa.gestiondepersonas.Modelo to javafx.base;
    opens es.liernisarraoa.gestiondepersonas to javafx.fxml;
    exports es.liernisarraoa.gestiondepersonas;
    exports es.liernisarraoa.gestiondepersonas.Controlador;
    opens es.liernisarraoa.gestiondepersonas.Controlador to javafx.fxml;
}