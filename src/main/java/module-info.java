module org.knowyourinfo.scraper {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.jsoup;


    opens org.knowyourinfo.scraper to javafx.fxml;
    exports org.knowyourinfo.scraper;
}