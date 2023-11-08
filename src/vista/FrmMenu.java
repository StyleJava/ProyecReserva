package vista;


import java.awt.Dimension;
import javax.swing.JDesktopPane;


public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Reservas");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbtn_usuario = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        mbtn_cliente = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        mbtn_campodeportivo = new javax.swing.JMenu();
        jMenuItem_nuevo_campoDeportivo = new javax.swing.JMenuItem();
        jMenuItem_gestionar_camposDeportivos = new javax.swing.JMenuItem();
        mbtn_reserva = new javax.swing.JMenu();
        jMenuItem_nuevo_alquiler = new javax.swing.JMenuItem();
        jMenuItem_gestionar_alquiler = new javax.swing.JMenuItem();
        mbtn_reportes = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_reservas = new javax.swing.JMenuItem();
        mbtn_historial = new javax.swing.JMenu();
        jMenuItem_ver_historial = new javax.swing.JMenuItem();
        mbtn_cerrarsesion = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mbtn_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbtn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        mbtn_usuario.setText("Usuario");
        mbtn_usuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbtn_usuario.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        mbtn_usuario.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        mbtn_usuario.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(mbtn_usuario);

        mbtn_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbtn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        mbtn_cliente.setText("Cliente");
        mbtn_cliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbtn_cliente.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        mbtn_cliente.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenuItem_gestionar_cliente.setText("Gestionar Clientes");
        jMenuItem_gestionar_cliente.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_clienteActionPerformed(evt);
            }
        });
        mbtn_cliente.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(mbtn_cliente);

        mbtn_campodeportivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbtn_campodeportivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        mbtn_campodeportivo.setText("Campo Deportivo");
        mbtn_campodeportivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbtn_campodeportivo.setPreferredSize(new java.awt.Dimension(220, 50));

        jMenuItem_nuevo_campoDeportivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_campoDeportivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nuevo_campoDeportivo.setText("Nuevo Campo ");
        jMenuItem_nuevo_campoDeportivo.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevo_campoDeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_campoDeportivoActionPerformed(evt);
            }
        });
        mbtn_campodeportivo.add(jMenuItem_nuevo_campoDeportivo);

        jMenuItem_gestionar_camposDeportivos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_camposDeportivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem_gestionar_camposDeportivos.setText("Gestionar Campos");
        jMenuItem_gestionar_camposDeportivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_camposDeportivosActionPerformed(evt);
            }
        });
        mbtn_campodeportivo.add(jMenuItem_gestionar_camposDeportivos);

        jMenuBar1.add(mbtn_campodeportivo);

        mbtn_reserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbtn_reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        mbtn_reserva.setText("Reserva");
        mbtn_reserva.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbtn_reserva.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_alquiler.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_alquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem_nuevo_alquiler.setText("Nuevo Alquiler");
        jMenuItem_nuevo_alquiler.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_nuevo_alquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_alquilerActionPerformed(evt);
            }
        });
        mbtn_reserva.add(jMenuItem_nuevo_alquiler);

        jMenuItem_gestionar_alquiler.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_alquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_alquiler.setText("Gestionar Reserva");
        jMenuItem_gestionar_alquiler.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_gestionar_alquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_alquilerActionPerformed(evt);
            }
        });
        mbtn_reserva.add(jMenuItem_gestionar_alquiler);

        jMenuBar1.add(mbtn_reserva);

        mbtn_reportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbtn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        mbtn_reportes.setText("Reportes");
        mbtn_reportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbtn_reportes.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_reportes_clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenuItem_reportes_clientes.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_reportes_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_clientesActionPerformed(evt);
            }
        });
        mbtn_reportes.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_reservas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportes_reservas.setText("Reportes Reservas");
        jMenuItem_reportes_reservas.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_reportes_reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_reservasActionPerformed(evt);
            }
        });
        mbtn_reportes.add(jMenuItem_reportes_reservas);

        jMenuBar1.add(mbtn_reportes);

        mbtn_historial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbtn_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        mbtn_historial.setText("Historial");
        mbtn_historial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbtn_historial.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem_ver_historial.setText("Ver Historial");
        jMenuItem_ver_historial.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem_ver_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_historialActionPerformed(evt);
            }
        });
        mbtn_historial.add(jMenuItem_ver_historial);

        jMenuBar1.add(mbtn_historial);

        mbtn_cerrarsesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbtn_cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        mbtn_cerrarsesion.setText("Cerrar Sesión");
        mbtn_cerrarsesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mbtn_cerrarsesion.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem_cerrar_sesion.setText("Cerrar Sesión");
        jMenuItem_cerrar_sesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesionActionPerformed(evt);
            }
        });
        mbtn_cerrarsesion.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(mbtn_cerrarsesion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_reportes_reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_reservasActionPerformed
      
    }//GEN-LAST:event_jMenuItem_reportes_reservasActionPerformed

    private void jMenuItem_nuevo_campoDeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_campoDeportivoActionPerformed
                    InterCampoDeportivo intercampo = new InterCampoDeportivo();
                jDesktopPane_menu.add(intercampo);
                    intercampo.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_campoDeportivoActionPerformed

    private void jMenuItem_gestionar_camposDeportivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_camposDeportivosActionPerformed
                     InterGestionarCampoDeportivo intergescampo = new InterGestionarCampoDeportivo();
                jDesktopPane_menu.add(intergescampo);
                    intergescampo.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_camposDeportivosActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed
                InterCliente intercli = new InterCliente();
                jDesktopPane_menu.add(intercli);
                    intercli.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_clienteActionPerformed
                InterGestionarCliente intergescli = new InterGestionarCliente();
                 jDesktopPane_menu.add(intergescli);
                    intergescli.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenuItem_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesionActionPerformed
                    System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerrar_sesionActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
                    InterUsuario interu = new InterUsuario();
                 jDesktopPane_menu.add(interu);
                    interu.setVisible(true);    
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
                    InterGestionarUsuario intergesu = new InterGestionarUsuario();
                 jDesktopPane_menu.add(intergesu);
                    intergesu.setVisible(true);   
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_nuevo_alquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_alquilerActionPerformed
                    InterReserva interres = new InterReserva();
                 jDesktopPane_menu.add(interres);
                    interres.setVisible(true);   
    }//GEN-LAST:event_jMenuItem_nuevo_alquilerActionPerformed

    private void jMenuItem_gestionar_alquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_alquilerActionPerformed
      
    }//GEN-LAST:event_jMenuItem_gestionar_alquilerActionPerformed

    private void jMenuItem_reportes_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_clientesActionPerformed
       
    }//GEN-LAST:event_jMenuItem_reportes_clientesActionPerformed

    private void jMenuItem_ver_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_historialActionPerformed
                    InterGraficas intergra = new InterGraficas();
                    jDesktopPane_menu.add(intergra);
                    intergra.setVisible(true);   
    }//GEN-LAST:event_jMenuItem_ver_historialActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_gestionar_alquiler;
    private javax.swing.JMenuItem jMenuItem_gestionar_camposDeportivos;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_nuevo_alquiler;
    private javax.swing.JMenuItem jMenuItem_nuevo_campoDeportivo;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_reservas;
    private javax.swing.JMenuItem jMenuItem_ver_historial;
    private javax.swing.JMenu mbtn_campodeportivo;
    private javax.swing.JMenu mbtn_cerrarsesion;
    private javax.swing.JMenu mbtn_cliente;
    private javax.swing.JMenu mbtn_historial;
    private javax.swing.JMenu mbtn_reportes;
    private javax.swing.JMenu mbtn_reserva;
    private javax.swing.JMenu mbtn_usuario;
    // End of variables declaration//GEN-END:variables
}
