package veterinaria.vistas;

import javax.swing.JFrame;

public class Consultar extends javax.swing.JFrame {
    
    private JFrame ventanaPrincipal;

    public Consultar(JFrame ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDuenio = new javax.swing.JButton();
        btnAnimalC = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(485, 337));

        jPanel1.setBackground(new java.awt.Color(250, 244, 246));

        jLabel1.setFont(new java.awt.Font("KoHo", 1, 18)); // NOI18N
        jLabel1.setText("¿Que quieres consultar?");

        btnDuenio.setText("Duenio");
        btnDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuenioActionPerformed(evt);
            }
        });

        btnAnimalC.setText("Animal Compania");
        btnAnimalC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalCActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDuenio)
                        .addGap(59, 59, 59)
                        .addComponent(btnAnimalC))
                    .addComponent(jLabel1))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDuenio)
                    .addComponent(btnAnimalC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuenioActionPerformed
        irConsultarDuenio();
    }//GEN-LAST:event_btnDuenioActionPerformed

    private void btnAnimalCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalCActionPerformed
        irConsultarAnimal();
    }//GEN-LAST:event_btnAnimalCActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void irConsultarDuenio(){
        ConsultarDuenio pantallaconConsultarDuenio = new ConsultarDuenio();
        pantallaconConsultarDuenio.setVisible(true);
        pantallaconConsultarDuenio.toFront();
    }
    
    private void irConsultarAnimal(){
        ConsultarAnimal pantallaConsultarAnimal = new ConsultarAnimal();
        pantallaConsultarAnimal.setVisible(true);
        pantallaConsultarAnimal.toFront();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalC;
    private javax.swing.JButton btnDuenio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
