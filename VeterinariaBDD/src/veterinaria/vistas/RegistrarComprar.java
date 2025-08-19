/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veterinaria.vistas;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import veterinaria.dao.CompraDAO;
import veterinaria.dao.ProductoDAO;
import veterinaria.dto.ProductoDTO;
import veterinaria.utilidades.Utilidad;

/**
 *
 * @author lizbello
 */
public class RegistrarComprar extends javax.swing.JFrame {
    private ArrayList<ProductoDTO> productos = new ArrayList<>();
    private CompraDAO dao = new CompraDAO();
    private int idProducto;

    /**
     * Creates new form RegistrarComprar
     */
    public RegistrarComprar() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIdProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEmailCliente = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taProductos = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 242, 242));

        jLabel1.setFont(new java.awt.Font("Muna", 1, 24)); // NOI18N
        jLabel1.setText("Registra la compra");

        jLabel2.setFont(new java.awt.Font("Muna", 0, 18)); // NOI18N
        jLabel2.setText("Identificador producto");

        tfIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdProductoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Muna", 0, 18)); // NOI18N
        jLabel3.setText("Email cliente");

        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        taProductos.setColumns(20);
        taProductos.setRows(5);
        jScrollPane1.setViewportView(taProductos);

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Muna", 0, 13)); // NOI18N
        jLabel4.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdProducto)
                                    .addComponent(tfEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(86, 86, 86))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(btnAgregarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnAgregarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addGap(22, 22, 22))
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

    private void tfIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        String idProd = tfIdProducto.getText();
        boolean rs = Utilidad.checharNumeroEntero(idProd);
        
        if(rs){
            idProducto = Integer.parseInt(idProd);
           if(!idProd.isEmpty()){
                ProductoDTO dto = new ProductoDTO();
                dto = ProductoDAO.obtenerProducto(idProducto);
                productos.add(dto);
                taProductos.append("- " + dto.getNombre() + "  " + dto.getPrecio() + "\n");
            }else{
                JOptionPane.showMessageDialog(this, "Falta completar los campos");
            } 
        } else{
            Utilidad.mostrarAlertaSimple(JOptionPane.ERROR_MESSAGE, "Informacion incorrecta", "La información del producto que proporcionaste no es correcta");
        }
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        String idProd = tfIdProducto.getText();
        String email = tfEmailCliente.getText();
        String cadenaCantidad = tfCantidad.getText();
        boolean resultado = Utilidad.checharNumeroEntero(cadenaCantidad);
        boolean rs = Utilidad.checharNumeroEntero(idProd);
        
        if(rs){
            idProducto = Integer.parseInt(idProd);
        
        
            if(resultado){
                int cantidad = Integer.parseInt(cadenaCantidad);
                boolean result = dao.registrarCompra(idProducto, email, cantidad);
            
                if(result){
                    Utilidad.mostrarAlertaSimple(JOptionPane.INFORMATION_MESSAGE, "Exito", "Transacción realizada correctamente");
                } else{
                    Utilidad.mostrarAlertaSimple(JOptionPane.ERROR_MESSAGE, "Error", "No se pudo completar la transaccion");
                }

            }else{
                Utilidad.mostrarAlertaSimple(JOptionPane.ERROR_MESSAGE, "No se pudo registrar", "Los datos que proporcionaste son inválidos, inténtalo nuevamente");
            }
        }else{
            Utilidad.mostrarAlertaSimple(JOptionPane.ERROR_MESSAGE, "Informacion incorrecta", "La información del producto que proporcionaste no es correcta");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taProductos;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfIdProducto;
    // End of variables declaration//GEN-END:variables
}
