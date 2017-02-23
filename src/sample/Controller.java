package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    Car car;
    @FXML private TextField makeField;
    @FXML private TextField modelField;
    @FXML private TextField yearField;
    @FXML private TextField mileageField;
    @FXML private TextField priceField;
    @FXML private TextField featuresField;
    @FXML private Button submitButton;
    @FXML private Label statusLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        submitButton.setOnAction(e -> submitButtonClicked());
    }

    public void submitButtonClicked(){
        String make = makeField.getText();
        String model = modelField.getText();
        int year = Integer.parseInt(yearField.getText());
        int mileage = Integer.parseInt(mileageField.getText());
        double price = Double.parseDouble(priceField.getText());
        String features = featuresField.getText();

        try {
            car = new Car(make, model, year, mileage, price, features);
        } catch (IllegalArgumentException e){
            statusLabel.setText(e.getMessage());
        }
        statusLabel.setText(car.toString());
    }
}
