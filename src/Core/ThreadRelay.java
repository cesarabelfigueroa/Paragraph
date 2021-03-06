package Core;

import Graphics.AppView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class ThreadRelay extends Thread {

    boolean active = true;
    AppView form;

    public ThreadRelay(AppView form) {
        this.form = form;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                form.autoSaveFile(false);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRelay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
