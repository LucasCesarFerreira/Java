module com.mycompany.cafefx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cafefx to javafx.fxml;
    exports com.mycompany.cafefx;
}
