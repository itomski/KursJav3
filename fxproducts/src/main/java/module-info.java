module de.lubowiecki.fxproducts {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires java.sql;

    opens de.lubowiecki.fxproducts to javafx.fxml;
    exports de.lubowiecki.fxproducts;
}
