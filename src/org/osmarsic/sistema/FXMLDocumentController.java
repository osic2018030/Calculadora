/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osmarsic.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {
    float dato1,dato2,Resultado;
    int op;
    @FXML Button btnMasMenos;
    @FXML Button btnCero;
    @FXML Button btnPunto;
    @FXML Button btnIgual;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnSuma;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnResta;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnMultiplicacion;
    @FXML Button btnCE;
    @FXML Button btnC;
    @FXML Button btnUnoDivididoX;
    @FXML Button btnDivision;
    @FXML Button btnPorcentaje;
    @FXML Button btnXAlCuadrado;
    @FXML Button btnRaizCuadrada;
    @FXML TextField txtResultado;
    
    
          
    
    
    
    
    

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btnUno)
        txtResultado.setText(txtResultado.getText() + "1");
         else if(event.getSource() == btnDos)
        txtResultado.setText(txtResultado.getText() + "2");
         else if(event.getSource() == btnTres)
        txtResultado.setText(txtResultado.getText() + "3");
         else if(event.getSource() == btnCuatro)
        txtResultado.setText(txtResultado.getText() + "4");
         else if(event.getSource() == btnCinco)
        txtResultado.setText(txtResultado.getText() + "5");
         else if(event.getSource() == btnSeis)
        txtResultado.setText(txtResultado.getText() + "6");
         else if(event.getSource() == btnSiete)
        txtResultado.setText(txtResultado.getText() + "7");
         else if(event.getSource() == btnOcho)
        txtResultado.setText(txtResultado.getText() + "8");
         else if(event.getSource() == btnNueve)
        txtResultado.setText(txtResultado.getText() + "9");
         else if(event.getSource() == btnCero)
        txtResultado.setText(txtResultado.getText() + "0");
         else if(event.getSource() == btnPunto){
             String cadena;
             cadena = txtResultado.getText();
             boolean resultado;
             resultado = false;
             for(int i=0 ; i < cadena.length(); i++){
                 if(cadena.substring(i, i+1).equals("."))
                     resultado = true;
             }
         if(cadena.length() <= 0)
         txtResultado.setText(txtResultado.getText() + "0.");
         else if(resultado == false)    
         txtResultado.setText(txtResultado.getText() + ".");
         }else if(event.getSource() == btnSuma){
             dato1 = Float.parseFloat(txtResultado.getText());
             txtResultado.setText("");
             op = 1;
        }else if(event.getSource() == btnResta){
             dato1 = Float.parseFloat(txtResultado.getText());
             txtResultado.setText(""); 
             op = 2;
        }else if(event.getSource() == btnMultiplicacion){
            dato1 = Float.parseFloat(txtResultado.getText());
            txtResultado.setText("");
            op = 3;
        }else if(event.getSource() == btnDivision){
            dato1 = Float.parseFloat(txtResultado.getText());
            txtResultado.setText("");
            op = 4;
        // pendiente de preguntar 
        }else if(event.getSource() == btnUnoDivididoX){
            dato1 =Float.parseFloat(txtResultado.getText());
            Resultado = 1/dato1;
            txtResultado.setText(String.valueOf(Resultado));
        }else if(event.getSource() == btnRaizCuadrada){
            dato1 = Float.parseFloat(txtResultado.getText());
            Resultado = (float) Math.sqrt(dato1);
            txtResultado.setText(String.valueOf(Resultado));   
        }else if(event.getSource() == btnXAlCuadrado){
            dato1 = Float.parseFloat(txtResultado.getText());
            Resultado = dato1*dato1;
            txtResultado.setText(String.valueOf(Resultado));   
        }else if(event.getSource() == btnPorcentaje){
            Resultado = Resultado/100;
            txtResultado.setText(String.valueOf(Resultado));
        }else if (event.getSource() == btnCE){
            String borrar = txtResultado.getText();
            if(borrar.length() > 0){
                borrar = borrar.substring(0, borrar.length()-1);
                txtResultado.setText(borrar);
            }   
        }else if (event.getSource() == btnC){
            txtResultado.setText("");
        }else if (event.getSource()== btnMasMenos){
          dato1 =Float.parseFloat(txtResultado.getText());
            Resultado = dato1*-1;
           txtResultado.setText(String.valueOf(Resultado));
         }else if(event.getSource() == btnIgual){
               dato2 = Float.parseFloat(txtResultado.getText());
               txtResultado.setText("");
               switch(op){
                   case 1 :
                     Resultado = dato1+dato2;
                     txtResultado.setText(String.valueOf(Resultado));
                     break;
                   case 2:
                      Resultado = dato1-dato2;
                     txtResultado.setText(String.valueOf(Resultado));
                     break;
                   case 3:
                       Resultado = dato1*dato2;
                     txtResultado.setText(String.valueOf(Resultado));
                     break;
                   case 4:
                       Resultado = dato1/dato2;
                      txtResultado.setText(String.valueOf(Resultado));
                      break;
               }
    }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
