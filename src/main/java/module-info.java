module com.parseofsingularity.drakalh.library.library_javafx_serialisable {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.parseofsingularity.drakalh.library.library_javafx_serialisable to javafx.fxml;
    exports com.parseofsingularity.drakalh.library.library_javafx_serialisable;
}