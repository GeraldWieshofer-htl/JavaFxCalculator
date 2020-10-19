package controller;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import java.net.URL;
import java.util.ResourceBundle;


public class CalculatorController implements Initializable {

    @FXML
    private Label rechenanzeige;

    String rechner=new String();

    public void mouseClick(Event e) {
        Button button= (Button) e.getSource();
        System.out.println(button.getText());
        rechner += button.getText();
        rechenanzeige.setText(rechner);
    }
    public void cl(){
        rechenanzeige.setText(" ");
    }

    public void eval() throws ScriptException {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            rechenanzeige.setText(String.valueOf(engine.eval(rechner)));
            rechner="";
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
