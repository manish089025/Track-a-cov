package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class SymptomAnalyser {
    public Button BackBT;
    public void BackListener(ActionEvent actionEvent){
        Stage secondarystage= (Stage) BackBT.getScene().getWindow();
        Parent root=null;
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        secondarystage.setScene(new Scene(root, 300, 275));
    }
}
