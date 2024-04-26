package Utilidades;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class VerificadorDouble extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input){
        if(input instanceof JTextField){
            JTextField textfield = (JTextField) input;
            String texto = textfield.getText();
            
            try{
                Double.parseDouble(texto);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}
