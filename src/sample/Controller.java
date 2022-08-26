package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.*;

public class Controller {

public TextArea GlobalTextArea;
public Label Lb1;
public Button GlobalBT;
public Button StatewBT;
public Button DistwBT;
public Button RefreshBT;
public Button SympBT;
StateData std= new StateData();


public void refreshListener(ActionEvent actionEvent){

    //GlobalTextArea.setText(std.StateStats());
}
public void StateListener(ActionEvent actionEvent){
    Stage stage= (Stage) SympBT.getScene().getWindow();
    Parent root =null;
    try {
        root = FXMLLoader.load(getClass().getResource("Statewise.fxml"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    stage.setScene(new Scene(root, 300, 275));

}
public void SympListener(ActionEvent actionEvent){
    Stage stage= (Stage) SympBT.getScene().getWindow();
    Parent root =null;
    try {
         root = FXMLLoader.load(getClass().getResource("SymptomAnalyser.fxml"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    stage.setScene(new Scene(root, 300, 275));
}
}
