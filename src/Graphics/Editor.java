package Graphics;

import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;

public class Editor extends JRibbonFrame {

    public Editor() {
        initComponents();

        JRibbonBand band1 = new JRibbonBand("Hello", null);
        JRibbonBand band2 = new JRibbonBand("world!", null);
        band1.setResizePolicies((List) Arrays.asList(new IconRibbonBandResizePolicy(band1.getControlPanel())));
        band2.setResizePolicies((List) Arrays.asList(new IconRibbonBandResizePolicy(band1.getControlPanel())));
        RibbonTask task1 = new RibbonTask("One", band1);
        RibbonTask task2 = new RibbonTask("Two", band2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
