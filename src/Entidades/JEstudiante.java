package Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;


public class JEstudiante extends javax.swing.JFrame {

    
    private SistemaAsistencia padre;
    private Aula NuevoCurs;    
    private int index;
    
    DefaultListModel Estu  = new DefaultListModel();
    List<Estudiante> DEstu = new ArrayList<>();
     
    public JEstudiante() {
        initComponents();
    }
       
    public JEstudiante(SistemaAsistencia padre)
    {
        initComponents();
        this.padre = padre;
    }
     public JEstudiante(SistemaAsistencia padre,Aula NuevoCurs, int index) 
    {   initComponents();
        this.padre = padre;
        this.NuevoCurs = NuevoCurs;
        this.index = index;
        TraerEstudiante();
    }
     
    public void TraerEstudiante()
    {
        Estu.clear(); 
        
        Estudiante[] estudiantes = NuevoCurs.getEstudiantes();

        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                Estu.addElement(estudiante.Texto());
            }
        }
        lst_Estudiantes.setModel(Estu);
    } 
    
      private void MostrarNewEstudiante()
    {
        NewEstudiante AgreEstudiante = new NewEstudiante(this, NuevoCurs);
        AgreEstudiante.setLocationRelativeTo(null);
        AgreEstudiante.setVisible(true);
        this.setVisible(false);
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Estudiantes = new javax.swing.JList<>();
        btn_Agregar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(lst_Estudiantes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 290, 158));

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Agregar.png"))); // NOI18N
        btn_Agregar.setBorder(null);
        btn_Agregar.setContentAreaFilled(false);
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Eliminar.png"))); // NOI18N
        btn_Eliminar.setBorder(null);
        btn_Eliminar.setContentAreaFilled(false);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/salir.png"))); // NOI18N
        btn_Salir.setBorder(null);
        btn_Salir.setContentAreaFilled(false);
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Estudiantes.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        MostrarNewEstudiante();
    }//GEN-LAST:event_btn_AgregarActionPerformed
    
    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        int inde = lst_Estudiantes.getSelectedIndex();
        if (inde != -1)
        {
            NuevoCurs.eliminarEstudiante(inde);
            Estu.removeElementAt(inde);
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(JEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lst_Estudiantes;
    // End of variables declaration//GEN-END:variables
}
