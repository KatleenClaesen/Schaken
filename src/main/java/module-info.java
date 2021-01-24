module be.katle.schaken {
    requires javafx.media;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    
    opens be.katle.schaken to javafx.fxml;
    exports be.katle.schaken;
    
}
