module org.example.module {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.module to javafx.fxml;
    exports org.example.module;
}