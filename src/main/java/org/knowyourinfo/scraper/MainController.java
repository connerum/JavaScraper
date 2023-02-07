package org.knowyourinfo.scraper;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private Label testLabel;
    @FXML
    private TextField testTextField;
    @FXML
    private Button scrapeBtn;

    @FXML
    protected void scrapeBtnClick() {
        LabelChanger labelChanger = new LabelChanger();
        testLabel.setText(labelChanger.changeLabel());
    }
}