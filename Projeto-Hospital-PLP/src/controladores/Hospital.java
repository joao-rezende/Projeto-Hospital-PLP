package controladores;

import javax.swing.JFrame;
import visoes.Secretaria;

/**
 *
 * @author Antonio, João Vitor e Liliana
 */
public class Hospital {

    public static void main(String[] args) {
        
        Secretaria secretaria = new Secretaria();
        secretaria.setLocationRelativeTo(null);
        secretaria.setVisible(true);
    }
}
