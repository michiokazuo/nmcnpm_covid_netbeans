package main;

import java.util.Calendar;
import javax.swing.UIManager;
import views.LoginUI;

public class Main {

    public static Calendar calendar = Calendar.getInstance();

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
    }

}
