/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crudarchivos.UI;

import javax.swing.JOptionPane;

/**
 *
 * @author Charly Cimino
 */
public class UIMenuCliente extends javax.swing.JFrame {
    //instaciar la ventana de forma global, para no instanciar nuevas ventas
    private UICliente uiCliente;
    private UIListarClientes uiListarClientes;
    private UIActualizarEliminar uiActualizarEliminar;
    
    /**
     * Creates new form UIMenuCliente
     */
    public UIMenuCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCrearCliente = new javax.swing.JButton();
        jBtnMostrarCliente = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jBtnActualizarEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCrearCliente.setText("Crear Cliente");
        jButtonCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearClienteActionPerformed(evt);
            }
        });

        jBtnMostrarCliente.setText("Mostrar Clientes");
        jBtnMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMostrarClienteActionPerformed(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnActualizarEliminar.setText("Actualizar y Eliminar");
        jBtnActualizarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnMostrarCliente)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCrearCliente)
                        .addGap(9, 9, 9)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnActualizarEliminar)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnSalir)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButtonCrearCliente)
                .addGap(18, 18, 18)
                .addComponent(jBtnMostrarCliente)
                .addGap(29, 29, 29)
                .addComponent(jBtnActualizarEliminar)
                .addGap(26, 26, 26)
                .addComponent(jBtnSalir)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setUIListarClientes(UIListarClientes uiListarClientes){
        this.uiListarClientes = uiListarClientes;
    }
    
    public void setUiCliente(UICliente uiCliente){
        this.uiCliente = uiCliente;
    }
    
    public void setUIActualizarEliminar(UIActualizarEliminar uiActualizarEliminar){
        this.uiActualizarEliminar = uiActualizarEliminar;
    }
    private void jButtonCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearClienteActionPerformed
        
        //Para abrir la venta crear cliente
        //verificar si ya existe una ventana creada, para utilizar la misma.
        if (uiCliente == null){
            uiCliente = new UICliente();
            uiCliente.setUiMenuCliente(this);
        }
        
        uiCliente.setVisible(true);     //para abrir la venta para crear un nuevo cliente
        this.setVisible(false);     //Para cerrar la ventana Menu
    }//GEN-LAST:event_jButtonCrearClienteActionPerformed

    private void jBtnMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMostrarClienteActionPerformed
        // TODO add your handling code here:
        //ventana listar clientes
        //verificar si ya hay una ventana creada
        if (uiListarClientes == null){
            uiListarClientes = new UIListarClientes();
            uiListarClientes.setVisible(true);
            this.setVisible(false);
        }
        uiListarClientes.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jBtnMostrarClienteActionPerformed

    private void jBtnActualizarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarEliminarActionPerformed
        // ventana para eliminar y actualizar cliente
        
        //verificar si ya hay una ventana creada
        if (uiActualizarEliminar == null){
            uiActualizarEliminar = new UIActualizarEliminar();
            uiActualizarEliminar.setVisible(true);
            this.setVisible(false);
        }
        
        uiActualizarEliminar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnActualizarEliminarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        // TODO add your handling code here:
        //mensaje de confirmación para salir del programa
        int respuesta = JOptionPane.showConfirmDialog(rootPane,"¿Deseas cerrar el programa?", "Cerrar",JOptionPane.YES_NO_OPTION);
        //condicion para terminar la ejecución del programa
        if (respuesta == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jBtnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIMenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizarEliminar;
    private javax.swing.JButton jBtnMostrarCliente;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jButtonCrearCliente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    
}
