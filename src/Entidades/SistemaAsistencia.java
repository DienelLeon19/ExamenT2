package Entidades;

    import java.util.ArrayList;
    import java.util.List;
import javax.swing.DefaultListModel;
   
public class SistemaAsistencia extends javax.swing.JFrame {

    DefaultListModel veraula  = new DefaultListModel();
    List<Aula> aulas = new ArrayList<>();
    
    public SistemaAsistencia() 
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Aulas = new javax.swing.JList<>();
        btn_Agregar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Estudiante1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/SISTEMA DE ASISTENCIA.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lst_Aulas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_Aulas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 320, -1));

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Agregar.png"))); // NOI18N
        btn_Agregar.setBorder(null);
        btn_Agregar.setContentAreaFilled(false);
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/salir.png"))); // NOI18N
        btn_Salir.setBorder(null);
        btn_Salir.setContentAreaFilled(false);
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        btn_Estudiante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Estudiantes.png"))); // NOI18N
        btn_Estudiante1.setBorder(null);
        btn_Estudiante1.setContentAreaFilled(false);
        btn_Estudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Estudiante1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Estudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        MostrarNewAula();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_Estudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Estudiante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Estudiante1ActionPerformed
     private void MostrarJEstudiante(Aula nuevo,int index)
    {
        JEstudiante Jprof = new JEstudiante(this,nuevo,index);
        Jprof.setLocationRelativeTo(null);
        Jprof.setVisible(true);
        this.setVisible(false);
    }
   public void agregaraula(Aula Nuevo)
    {
        aulas.add(Nuevo);
        veraula.addElement(Nuevo.Texto());
        lst_Aulas.setModel(veraula);
    }
    
    
    public void MostrarNewAula()
    {
        NewAula vent = new NewAula(this);
        vent.setLocationRelativeTo(null);
        vent.setVisible(true);
        this.setVisible(false);
    
    }
    
    
    

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(SistemaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Estudiante1;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Aulas;
    // End of variables declaration//GEN-END:variables
}
