/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Datos.Pacientes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class ConsultaHoras extends javax.swing.JDialog {
private DefaultTableModel m ;
    /**
     * Creates new form ConsultaHoras
     */

     public ConsultaHoras() {
     initComponents();
     this.setLocationRelativeTo(null);
       
     }
     
     public ConsultaHoras(ArrayList listado)
     {
        initComponents();
        this.listado = listado;
        this.mostrarDatos();
        this.setLocationRelativeTo(null);
        
     }

//    public ConsultaHoras(java.awt.Frame parent, boolean modal) {
//        super(parent, modal);
//        initComponents();
//        this.listado = listado;
//        this.mostrarDatos();
//        this.setLocationRelativeTo(null);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        lblConsultaHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultaHora = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de Reservas");
        setResizable(false);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblConsultaHora.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        lblConsultaHora.setText("Listado de horas registradas");

        tblConsultaHora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RUN", "Apellidos", "Nombre", "Fono", "Especialidad", "Médico", "Fecha Reserva", "Hora Reserva"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsultaHora);
        tblConsultaHora.getColumnModel().getColumn(0).setResizable(false);
        tblConsultaHora.getColumnModel().getColumn(1).setResizable(false);
        tblConsultaHora.getColumnModel().getColumn(2).setResizable(false);
        tblConsultaHora.getColumnModel().getColumn(3).setResizable(false);
        tblConsultaHora.getColumnModel().getColumn(4).setResizable(false);
        tblConsultaHora.getColumnModel().getColumn(5).setResizable(false);
        tblConsultaHora.getColumnModel().getColumn(6).setResizable(false);
        tblConsultaHora.getColumnModel().getColumn(7).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(lblConsultaHora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultaHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultaHoras dialog = new ConsultaHoras();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConsultaHora;
    private javax.swing.JTable tblConsultaHora;
    // End of variables declaration//GEN-END:variables
 private ArrayList<Pacientes> listado;
 
 public void  Datos(ArrayList listado)
 {
     this.listado=listado;
 }

 private void mostrarDatos()
 {
      m = new DefaultTableModel();
        m.addColumn("RUN");
        m.addColumn("Apellidos");
        m.addColumn("Nombres");
        m.addColumn("Fono");
        m.addColumn("Especialidad");
        m.addColumn("Médico");
        m.addColumn("Fecha Reserva");
        m.addColumn("Hora Reserva");
        this.tblConsultaHora.setModel(m);
 
   Object[] fila = new Object[8];
        for(int i=0; i<this.listado.size(); i++)
        {
            Pacientes reserva =  listado.get(i);
            fila[0] = reserva.getRut() + "-" + reserva.getDigitoVer();
            fila[1] = reserva.getApellidos();
            fila[2] = reserva.getNombres();
            fila[3] = reserva.getTelefono();
            fila[4] = reserva.getEspecialidad();
            fila[5] = reserva.getNombreDoc();
            fila[6] = reserva.getFechaReserva();
            fila[7] = reserva.getHora();
            m.addRow(fila);
 
 
 }
}
}