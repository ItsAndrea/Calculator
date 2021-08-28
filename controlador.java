import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.fxml.Initializable;

public class controlador {

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private RadioButton rdbsuma;

    @FXML
    private RadioButton rdbresta;

    @FXML
    private RadioButton rdbmult;

    @FXML
    private RadioButton rdbdiv;

    @FXML
    private Button btnEjecutar;

    @FXML
    private TextField result;

    @FXML
    public void initialize(URL url, ResourceBundle rb){
        ToggleGroup tg = new ToggleGroup();

        this.rdbsuma.setToggleGroup(tg);
        this.rdbresta.setToggleGroup(tg);
        this.rdbmult.setToggleGroup(tg);
        this.rdbdiv.setToggleGroup(tg);
    }
    @FXML
    void HacerOperacion(ActionEvent event) {

    }

}