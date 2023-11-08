package vista;

import conexion.Conexion;
import controlador.Ctrl_CampoDeportivo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.CampoDeportivo;

public class InterGestionarCampoDeportivo extends javax.swing.JInternalFrame {

    private int idCampo;
    
    public InterGestionarCampoDeportivo() {
        initComponents();
      
        this.setTitle("Gestionar Campo Deportivo");
        this.CargarTablaCampoDeportivo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_ubicacion = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_bvalido = new javax.swing.JComboBox<>();
        txt_btamaño = new javax.swing.JTextField();
        txt_bpm = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_campoDeportivo = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(41, 2, 41));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 60));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, 60));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 360, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Campos Deportivos");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Futbol  ---->");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        btn_fvalido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel7.add(btn_fvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, -1));

        txt_ftamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_ftamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ftamañoActionPerformed(evt);
            }
        });
        jPanel7.add(txt_ftamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 60));

        txt_fpm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Por Minuto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_fpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fpmActionPerformed(evt);
            }
        });
        jPanel7.add(txt_fpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 220, 60));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 530, 130));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Voley ---->");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 9, 74, -1));

        btn_vvalido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel8.add(btn_vvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        txt_vtamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_vtamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vtamañoActionPerformed(evt);
            }
        });
        jPanel8.add(txt_vtamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 60));

        txt_vpm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Por Minuto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_vpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vpmActionPerformed(evt);
            }
        });
        jPanel8.add(txt_vpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 180, 60));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 460, 150));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel6.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 12, 390, 60));

        txt_ubicacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_ubicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel6.add(txt_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 390, 70));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 440, 170));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Baloncesto ---->");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_bvalido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel9.add(btn_bvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        txt_btamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_btamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_btamañoActionPerformed(evt);
            }
        });
        jPanel9.add(txt_btamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 60));

        txt_bpm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Por Minuto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_bpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bpmActionPerformed(evt);
            }
        });
        jPanel9.add(txt_bpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 200, 60));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 510, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_campoDeportivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_campoDeportivo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1350, 150));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1390, 180));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
            
            String fpm="",vpm="",bpm="";
            fpm=txt_fpm.getText().trim();
            vpm=txt_vpm.getText().trim();
            bpm=txt_bpm.getText().trim();
        
            if (!txt_nombre.getText().isEmpty()) {
            CampoDeportivo campodeportivo = new CampoDeportivo();
            Ctrl_CampoDeportivo controlCampo = new Ctrl_CampoDeportivo();

            campodeportivo.setNombre(txt_nombre.getText().trim());
            campodeportivo.setUbicacion(txt_ubicacion.getText().trim());
            campodeportivo.setFvalido(btn_fvalido.getSelectedItem().toString());  
            campodeportivo.setFtamaño(txt_ftamaño.getText().trim());
            campodeportivo.setFprecioMinuto(Double.parseDouble(fpm));
            
            campodeportivo.setVvalido(btn_vvalido.getSelectedItem().toString());  
            campodeportivo.setVtamaño(txt_vtamaño.getText().trim());
            campodeportivo.setVprecioMinuto(Double.parseDouble(vpm));
            
            campodeportivo.setBvalido(btn_fvalido.getSelectedItem().toString());  
            campodeportivo.setBtamaño(txt_btamaño.getText().trim());
            campodeportivo.setBprecioMinuto(Double.parseDouble(bpm));
       

            
            
            
            if (controlCampo.actualizar(campodeportivo, idCampo)) {
                JOptionPane.showMessageDialog(null, "Categoria Actulizada");
                txt_nombre.setText("");
                txt_ubicacion.setText("");
                this.CargarTablaCampoDeportivo();
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar Categoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        } 
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        Ctrl_CampoDeportivo controlcampodeportivo = new Ctrl_CampoDeportivo();
        if (idCampo == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un cliente!");
        } else {
            if (!controlcampodeportivo.eliminar(idCampo)) {
                JOptionPane.showMessageDialog(null, "¡Cliente Eliminado!");
                this.CargarTablaCampoDeportivo();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar cliente!");
                this.Limpiar();
            }
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_ftamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ftamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ftamañoActionPerformed

    private void txt_fpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fpmActionPerformed

    private void txt_vtamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vtamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vtamañoActionPerformed

    private void txt_vpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vpmActionPerformed

    private void txt_btamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_btamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_btamañoActionPerformed

    private void txt_bpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bpmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btn_bvalido;
    private javax.swing.JComboBox<String> btn_fvalido;
    private javax.swing.JComboBox<String> btn_vvalido;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbl_campoDeportivo;
    private javax.swing.JTextField txt_bpm;
    private javax.swing.JTextField txt_btamaño;
    private javax.swing.JTextField txt_fpm;
    private javax.swing.JTextField txt_ftamaño;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_ubicacion;
    private javax.swing.JTextField txt_vpm;
    private javax.swing.JTextField txt_vtamaño;
    // End of variables declaration//GEN-END:variables

        private void Limpiar() {
       
                txt_nombre.setText("");
                txt_ubicacion.setText("");
                btn_fvalido.setSelectedItem(0);
                txt_ftamaño.setText("");
                txt_fpm.setText("");
                btn_vvalido.setSelectedItem(0);
                txt_vtamaño.setText("");
                txt_vpm.setText("");
                btn_bvalido.setSelectedItem(0);
                txt_btamaño.setText("");
                txt_bpm.setText("");
        

        
    }
    
    

    private void CargarTablaCampoDeportivo() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        //si sale error ponerle space
        String sql = "select idCampo,nombre,ubicacion,Fvalido,Ftamaño,FprecioMinuto,Vvalido,Vtamaño,VprecioMinuto,Bvalido,Btamaño,BprecioMinuto from tb_campodeportivo";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarCampoDeportivo.tbl_campoDeportivo = new JTable(model);
            InterGestionarCampoDeportivo.jScrollPane1.setViewportView(InterGestionarCampoDeportivo.tbl_campoDeportivo);

            model.addColumn("idCampo");
            model.addColumn("nombre");
            model.addColumn("ubicacion");
            model.addColumn("Fvalido");
            model.addColumn("Ftamaño");
            model.addColumn("FprecioMinuto");
            model.addColumn("Vvalido");
            model.addColumn("Vtamaño");
            model.addColumn("VprecioMinuto");
            model.addColumn("Bvalido");
            model.addColumn("Btamaño");
            model.addColumn("BprecioMinuto");

            
            while (rs.next()) {
                Object fila[] = new Object[12];
                for (int i = 0; i < 12; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla categorias: " + e);
        }
        
      
        tbl_campoDeportivo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tbl_campoDeportivo.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCampo = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosCategoriaSeleccionada(idCampo);
                }
            }
        });
    }

  
    private void EnviarDatosCategoriaSeleccionada(int idCampo) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from tb_campodeportivo where idCampo = '" + idCampo + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_ubicacion.setText(rs.getString("ubicacion"));
                btn_fvalido.setSelectedItem(rs.getString("Fvalido"));
                txt_ftamaño.setText(rs.getString("Ftamaño"));
                txt_fpm.setText(rs.getString("FprecioMinuto"));
                btn_vvalido.setSelectedItem(rs.getString("Vvalido"));
                txt_vtamaño.setText(rs.getString("Vtamaño"));
                txt_vpm.setText(rs.getString("VprecioMinuto"));
                btn_bvalido.setSelectedItem(rs.getString("Bvalido"));
                txt_btamaño.setText(rs.getString("Btamaño"));
                txt_bpm.setText(rs.getString("BprecioMinuto"));
     
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar categoria: " + e);
        }
    }
    
}
