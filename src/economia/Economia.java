/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economia;

/**
 *
 * @author giuli
 */
public class Economia {

    
    public Economia()
    {
        Home home = new Home();
        home.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            Economia go = new Economia();
        });
        
    }
    
}
