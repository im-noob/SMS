/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setting;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kumar
 */
@SuppressWarnings("serial")
public class ComboBoxFiter {
      private int key;
    private String value;

    public ComboBoxFiter(){}
    public ComboBoxFiter(int key, String value)
    {
        this.key = key;
        this.value = value;
    }

    public int getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
    
    public static void numberValidation(java.awt.event.KeyEvent evt){
         char c = evt.getKeyChar();

        if (!((c >= '0') && (c <= '9') ||    
           (c == KeyEvent.VK_BACK_SPACE) ||
           (c == KeyEvent.VK_DELETE))) {
            Toolkit.getDefaultToolkit().beep();
              evt.consume();
        }
    } 
}
