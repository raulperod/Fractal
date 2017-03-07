package guis;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Raul Perez
 * Fecha: Noviembre 2015
 */
public class Dibujo extends javax.swing.JPanel {
    private Color colorOrigen = Color.BLACK;
    private Color colorDestino = Color.BLACK;
    private int nivel = 5;
    private double relacion = 1;
    private int ramificaciones = 2;
    private int velocidad = 1000; 
    private Fractal fractal;
    private Movimiento movimiento;
    private VentanaPrincipal ventana;
    /**
     * Construye un JPanel Dibujo
     * @param ventana
     * @param movimiento
     */
    public Dibujo(VentanaPrincipal ventana,Movimiento movimiento) {
        initComponents();
        this.setSize(300, 400);
        this.movimiento = movimiento;
        this.ventana = ventana;
     
    }
    
    /**
     * Metodo que agrega el fractal
     * @param fractal 
     */
    public void agregarFractal(Fractal fractal){
        this.fractal = fractal;
    }
    
    /**
     * Metodo que obtiene el colorDestino
     * @return 
     */
    public Color obtenerColorDestino(){
        return this.colorDestino;
    }
    
    /**
     * Metodo que obtiene el nivel
     * @return 
     */
    public int obtenerNivel(){
        return this.nivel;
    }

    /**
     * Metodo que obtiene la relacion
     * @return 
     */
    public double obtenerRelacion(){
        return this.relacion;
    }
    
    /**
     * Metodo que obtiene la ramificacion
     * @return 
     */
    public int obtenerRamificacion(){
        return this.ramificaciones;
    }
    
    /**
     * metodo que obtiene la velocidad
     * @return 
     */
    public int obtenerVelocidad(){
        return this.velocidad;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jsNivel = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jsRelacion = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jsRamificacion = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jsVelocidad = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dibujo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Color destino:");

        jButton1.setText("Elegir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Niveles de Rama:");

        jsNivel.setModel(new javax.swing.SpinnerNumberModel(5, 1, 15, 1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Relacion / Proporcion:");

        jsRelacion.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.1d, 1.0d, 0.1d));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Ramificaciones:");

        jsRamificacion.setModel(new javax.swing.SpinnerNumberModel(2, 1, 8, 1));
        jsRamificacion.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Velocidad (seg):");

        jsVelocidad.setModel(new javax.swing.SpinnerNumberModel(0.5d, 0.1d, 1.0d, 0.1d));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("CREAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Color origen:");

        jButton3.setText("Elegir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jsRamificacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsRelacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsNivel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jsVelocidad)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jsNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jsRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsRamificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jsVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que cambia el colorDestino
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Color colorAux = this.colorDestino;
        this.colorDestino = JColorChooser.showDialog(this, "Eligiendo color", colorDestino);
        if ( this.colorDestino == null  ){
            this.colorDestino = colorAux;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Metodo que actualiza los atributos y dibuja un fractal
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        this.nivel = Integer.parseInt( this.jsNivel.getValue().toString() );
        this.ramificaciones = Integer.parseInt( this.jsRamificacion.getValue().toString() );
        this.relacion = Double.parseDouble(this.jsRelacion.getValue().toString());
        this.velocidad = (int)( 1000 * Double.parseDouble(this.jsVelocidad.getValue().toString()) );
        
        this.ventana.repaint();
        
        this.fractal.dibujarFractal( this.fractal.getGraphics() , 450 + this.movimiento.obtenerTranslacionX(), 500 + this.movimiento.obtenerTranslacionY(),
                -this.movimiento.obtenerRotacion(), this.nivel  , this.colorOrigen ,this.colorDestino );
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Metodo que guarda el colorOrigen
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        Color colorAux = colorOrigen;
        this.colorOrigen = JColorChooser.showDialog(this, "Eligiendo color", colorOrigen);
        if ( this.colorOrigen == null  ){
            this.colorOrigen = colorAux;
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jsNivel;
    private javax.swing.JSpinner jsRamificacion;
    private javax.swing.JSpinner jsRelacion;
    private javax.swing.JSpinner jsVelocidad;
    // End of variables declaration//GEN-END:variables
}
