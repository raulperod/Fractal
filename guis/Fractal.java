package guis;

import hilo.Rama;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Raul Perez
 */
public class Fractal extends javax.swing.JPanel {
    Dibujo dibujo;
    Movimiento movimiento;
    /**
     * Creas un nuevo JPanel Fractal
     * @param dibujo
     * @param movimiento
     */
    public Fractal(Dibujo dibujo, Movimiento movimiento) {
        initComponents();
        this.setBounds(1, 1, 880, 600);
        this.dibujo = dibujo;
        this.movimiento = movimiento;
        this.setSize(880, 600);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fractal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que crea una rama (hilo), la cual creara mas ramas formando asi el fractal
     * @param brocha
     * @param x1
     * @param y1
     * @param angulo
     * @param nivel
     * @param colorOrigen
     * @param colorDestino 
     */
    public void dibujarFractal(Graphics brocha, int x1, int y1, int angulo, int nivel, Color colorOrigen ,Color colorDestino ) {
       
        // en cada rama crea otras dos ramas hasta el nivel dado
        Rama ramita = new Rama( x1,y1 , angulo , nivel ,this.dibujo , this ,this.movimiento , colorOrigen , colorDestino);
        ramita.start();
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


}
