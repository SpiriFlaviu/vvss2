/**
 * Created by flaviu on 5/24/17.
 */


import java.io.IOException;

import ui.LaboratoriesUI;

public class App {

    public static void main(String[] args) {
        LaboratoriesUI view  = new LaboratoriesUI();

        try {
            view.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
