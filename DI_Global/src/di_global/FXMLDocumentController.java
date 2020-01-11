/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_global;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author Jairo Martínez
 */
public class FXMLDocumentController implements Initializable {
    
    //Componentes FXML
    @FXML private TextField resultDisplay;
    @FXML private Button nine;
    @FXML private Button minus;
    @FXML private Button ac;
    @FXML private Button six;
    @FXML private Button mul;
    @FXML private Button one;
    @FXML private Button dot;
    @FXML private Button seven;
    @FXML private Button two;
    @FXML private Button three;
    @FXML private Button plus;
    @FXML private Button eight;
    @FXML private Button zero;
    @FXML private Button equal;
    @FXML private Button four;
    @FXML private Button div;
    @FXML private Button five;
    
    //Variables que almacenaran resultados
    double result = 0;
    double input1 ;
    double input2;
    int ps;
    int point;
    
    /**Print by scree the introduced numbers.
     * Método encargado de imprimir los numeros introducidos.
     * @param event Recoge el evento del botón.
     */
    @FXML
    public void dataReception(ActionEvent event) {
        if(event.getSource() == one){           resultDisplay.appendText("1");
        }else if(event.getSource() == two){     resultDisplay.appendText("2");
        }else if(event.getSource() == three){   resultDisplay.appendText("3");
        }else if(event.getSource() == four){    resultDisplay.appendText("4");
        }else if(event.getSource() == five){    resultDisplay.appendText("5");
        }else if(event.getSource() == six){     resultDisplay.appendText("6");
        }else if(event.getSource() == seven){   resultDisplay.appendText("7");
        }else if(event.getSource() == eight){   resultDisplay.appendText("8");
        }else if(event.getSource() == nine){    resultDisplay.appendText("9");
        }else if(event.getSource() == zero){    resultDisplay.appendText("0");
        }else if(event.getSource() == dot && point == 0){
            resultDisplay.appendText(".");
            point = 1;
        }else if(event.getSource() == ac){
            resultDisplay.setText("");
            input1 = 0;
            input2 = 0;
            ps=0;
            point =0;
        }else if(event.getSource() == plus){
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 1;
            point =0;
        }else if(event.getSource() == minus){
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 2;
            point =0;
        }else if(event.getSource() == mul){
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps=3;
            point =0;
        }else if(event.getSource() == div){
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps=4;
            point =0;
        }else if(event.getSource() == equal && ps > 0){
            input2 = Double.parseDouble(resultDisplay.getText());
            this.calculos(ps, input1, input2);
        }
    }
    /**Realize the calcule of every option.
     * Se encarga de realizar el calculo de cada operacion.
     * @param opcion Indica el tipo de operacion a realizar.
     * @param input1 Recibe el primer parametro para la operacion.
     * @param input2 Recibe el segundo parametro para la operacion.
     */
    public double calculos(int opcion, double input1, double input2){
            DecimalFormat td = new DecimalFormat("#0.00");
            
            if((input1 == 0  &&  input2 ==0) ){
                resultDisplay.setText("No se puede calcular");
            }else{
                
                if(ps == 1){
                    result = input1+input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));
                }else if(ps == 2){
                    result = input1-input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));
                }else if(ps == 3){
                    result = input1*input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));                 
                }else if(ps == 4){
                    result = input1/input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));
                }
            }
            ps = 0;
            return result;
    }
    /**Realize the number value change.
     * Realiza el cambio de valor del numero introducido
     * @param event Recoge el evento del botón.
     */
    @FXML
    public void cambioValor(ActionEvent event){
        try{
        if(resultDisplay.getText().contains("-")){
            Long positive = Math.abs(Long.parseLong(resultDisplay.getText()));
            resultDisplay.setText(String.valueOf(positive));
        }else{
            long negative = Math.negateExact(Long.parseLong(resultDisplay.getText()));
            resultDisplay.setText(String.valueOf(negative));
        }
        }catch(Exception e){
        resultDisplay.setText("Error");}
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
