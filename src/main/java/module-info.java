module be.katle.schaken {
    requires javafx.controls;
    requires javafx.fxml;

    opens be.katle.schaken to javafx.fxml;
    exports be.katle.schaken;
}
