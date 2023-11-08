package vista;

import controlador.Ctrl_CampoDeportivo;
import javax.swing.JOptionPane;
import modelo.CampoDeportivo;


public class InterCampoDeportivo extends javax.swing.JInternalFrame {

    public InterCampoDeportivo() {
        initComponents();
       
        this.setTitle("Nuevo Campo Deportivo");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_ubicacion = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_fvalido = new javax.swing.JComboBox<>();
        txt_ftamaño = new javax.swing.JTextField();
        txt_fpm = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_vvalido = new javax.swing.JComboBox<>();
        txt_vtamaño = new javax.swing.JTextField();
        txt_vpm = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_bvalido = new javax.swing.JComboBox<>();
        txt_btamaño = new javax.swing.JTextField();
        txt_bpm = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel6.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 12, 270, 60));

        txt_ubicacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_ubicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel6.add(txt_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 510, 70));

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel6.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 140, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 170));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Futbol  ---->");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        btn_fvalido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel7.add(btn_fvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 6, 90, -1));

        txt_ftamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_ftamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ftamañoActionPerformed(evt);
            }
        });
        jPanel7.add(txt_ftamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 60));
        txt_ftamaño.getAccessibleContext().setAccessibleName("Tamaño");

        txt_fpm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Por Minuto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_fpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fpmActionPerformed(evt);
            }
        });
        jPanel7.add(txt_fpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 60));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 250, 270));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Voley ---->");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 9, 74, -1));

        btn_vvalido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel8.add(btn_vvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 6, -1, -1));

        txt_vtamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_vtamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vtamañoActionPerformed(evt);
            }
        });
        jPanel8.add(txt_vtamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 60));

        txt_vpm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Por Minuto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_vpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vpmActionPerformed(evt);
            }
        });
        jPanel8.add(txt_vpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 180, 60));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 440, 140));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Baloncesto ---->");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, -1, -1));

        btn_bvalido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel9.add(btn_bvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 12, -1, -1));

        txt_btamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_btamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_btamañoActionPerformed(evt);
            }
        });
        jPanel9.add(txt_btamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 60));

        txt_bpm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Por Minuto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_bpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bpmActionPerformed(evt);
            }
        });
        jPanel9.add(txt_bpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 180, 60));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 440, 120));

        jPanel1.setBackground(new java.awt.Color(18, 41, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bpmActionPerformed

    private void txt_btamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_btamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_btamañoActionPerformed

    private void txt_vpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vpmActionPerformed

    private void txt_vtamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vtamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vtamañoActionPerformed

    private void txt_fpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fpmActionPerformed

    private void txt_ftamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ftamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ftamañoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        CampoDeportivo campodeportivo = new CampoDeportivo();
        Ctrl_CampoDeportivo controlcampodeportivo = new Ctrl_CampoDeportivo();
        String fvali = "", vvali = "",bvali = "";
        fvali = btn_fvalido.getSelectedItem().toString().trim();
        vvali = btn_vvalido.getSelectedItem().toString().trim();
        bvali = btn_bvalido.getSelectedItem().toString().trim();

        //validamos camoos vacios
        if (txt_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete  todos los campos");
        } else {
            if (!controlcampodeportivo.existeCategoria(txt_nombre.getText().trim())) {
                campodeportivo.setNombre(txt_nombre.getText().trim());
                campodeportivo.setUbicacion(txt_ubicacion.getText().trim());
                campodeportivo.setFvalido(fvali);
                campodeportivo.setFtamaño(txt_ftamaño.getText().trim());
                campodeportivo.setFprecioMinuto(Double.parseDouble(txt_fpm.getText().trim()));

                campodeportivo.setVvalido(vvali);
                campodeportivo.setVtamaño(txt_vtamaño.getText().trim());
                campodeportivo.setVprecioMinuto(Double.parseDouble(txt_vpm.getText().trim()));

                campodeportivo.setBvalido(bvali);
                campodeportivo.setBtamaño(txt_btamaño.getText().trim());
                campodeportivo.setBprecioMinuto(Double.parseDouble(txt_bpm.getText().trim()));

                if (controlcampodeportivo.guardar(campodeportivo)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La Categoria ya esta registrada en la Base de Datos");
            }
        }
        //limpiar campo
        txt_nombre.setText("");

    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btn_bvalido;
    private javax.swing.JComboBox<String> btn_fvalido;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> btn_vvalido;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txt_bpm;
    private javax.swing.JTextField txt_btamaño;
    private javax.swing.JTextField txt_fpm;
    private javax.swing.JTextField txt_ftamaño;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_ubicacion;
    private javax.swing.JTextField txt_vpm;
    private javax.swing.JTextField txt_vtamaño;
    // End of variables declaration//GEN-END:variables
}
