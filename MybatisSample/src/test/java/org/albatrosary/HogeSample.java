package org.albatrosary;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.albatrosary.pl.ViewLogin;

public class HogeSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(HogeSample.class.getName()).log(Level.SEVERE, null, ex);
            }
            ViewLogin viewLogin = new ViewLogin();
	}

}
