package veterinaria.vistas;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Registrar extends javax.swing.JFrame {
    
    private JFrame ventanaPrincipal;

    public Registrar(JFrame ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarDuenio = new javax.swing.JButton();
        btnRegistrarAnimal = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(250, 244, 246));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Muna", 1, 18)); // NOI18N
        jLabel1.setText("Selecciona una opción para REGISTRAR:");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnRegistrarDuenio.setText("Dueño");
        btnRegistrarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDuenioActionPerformed(evt);
            }
        });
        Panel.add(btnRegistrarDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        btnRegistrarAnimal.setText("Animal Compañia");
        btnRegistrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAnimalActionPerformed(evt);
            }
        });
        Panel.add(btnRegistrarAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        Panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 100, 30));

        btnCompra.setText("Compra");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        Panel.add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean ventanaYaAbierta(JInternalFrame ventana, JDesktopPane panel){
        for (JInternalFrame frame : panel.getAllFrames()){
            if (frame.getClass().equals(ventana.getClass())){
                frame.toFront();
                try{
                    frame.setSelected(true);
                }catch (java.beans.PropertyVetoException e){
                    e.printStackTrace();
                }
                return true;
            }
        }
        return false;
    }
    
    public void mostrarVentana(){
        this.setVisible(true);
    }
    
    private void btnRegistrarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDuenioActionPerformed
        irRegistrarDuenio();
    }//GEN-LAST:event_btnRegistrarDuenioActionPerformed

    
    private void irRegistrarDuenio(){
        RegistrarDuenio pantallaRegistrarDuenio = new RegistrarDuenio();
        pantallaRegistrarDuenio.setVisible(true);
        pantallaRegistrarDuenio.toFront();
    }
            
    private void btnRegistrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAnimalActionPerformed
        irRegistrarAnimal();
    }//GEN-LAST:event_btnRegistrarAnimalActionPerformed

    
    private void irRegistrarAnimal(){
        RegistrarAnimal pantallaRegistrarAnimal = new RegistrarAnimal();
        pantallaRegistrarAnimal.setVisible(true);
        pantallaRegistrarAnimal.toFront();
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        irRegistrarCompra();
      
    }//GEN-LAST:event_btnCompraActionPerformed

    private void irRegistrarCompra(){
        RegistrarComprar nuevaCompra = new RegistrarComprar();
        nuevaCompra.setVisible(true);
        nuevaCompra.toFront();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnRegistrarAnimal;
    private javax.swing.JButton btnRegistrarDuenio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
