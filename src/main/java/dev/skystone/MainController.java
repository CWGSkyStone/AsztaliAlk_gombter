package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class MainController {

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceField;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc(){
        double radius = Double.parseDouble(radiusField.getText());
        double volume = Sphere.calcVolume(radius);
        double surface = Sphere.calcSurface(radius);
        volumeField.setText(String.valueOf(volume));
        surfaceField.setText(String.valueOf(surface));
        String line = makeLine(radius, volume, surface);
        FileHandler.writeToFile(line);
    }

    String makeLine(double radius, double volume, double surface){
        return radius + ";" + volume + ";" + surface + "\n";
    }

}
