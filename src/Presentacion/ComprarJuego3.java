/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Controlador1;
import Logica.Controlador2;
import Logica.Datatypes.DataFecha;
import Logica.Datatypes.infoComp;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Nicole
 */
public class ComprarJuego3 extends javax.swing.JFrame {

    /**
     * Creates new form ComprarJuego3
     */
    public ComprarJuego3() {
        initComponents();
        Controlador1 c1=Controlador1.getInstance();
       
        infoComp ic=new infoComp();
        ic=c1.getInfoComp();
        e_cliente.setText(ic.getNick());
        DataFecha df=new DataFecha();
        df=df.getFecha(ic.getFecha().getFecha());
        e_fecha.setText(df.imprimirFecha());
        e_juego.setText(ic.getJuego().getNombre());
        DefaultListModel modell=new DefaultListModel();
        modell.addElement(ic.getJuego().getDescripcion());
        e_descripcion.setModel(modell);
        e_precio.setText(Double.toString(ic.getJuego().getPrecio().getcantidad()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        e_cliente = new javax.swing.JLabel();
        e_fecha = new javax.swing.JLabel();
        e_juego = new javax.swing.JLabel();
        e_precio = new javax.swing.JLabel();
        b_comprar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        e_descripcion = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(745, 453));
        setPreferredSize(new java.awt.Dimension(745, 453));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Comprar Juego");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(24, 21, 259, 48);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(176, 104, 45, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Fecha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 139, 41, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Nombre del juego:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(107, 174, 114, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Descripción:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(146, 219, 75, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Precio: U$S");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 330, 71, 17);
        getContentPane().add(e_cliente);
        e_cliente.setBounds(239, 97, 170, 30);
        getContentPane().add(e_fecha);
        e_fecha.setBounds(240, 140, 180, 20);
        getContentPane().add(e_juego);
        e_juego.setBounds(240, 177, 150, 20);
        getContentPane().add(e_precio);
        e_precio.setBounds(240, 330, 100, 20);

        b_comprar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_comprar.setForeground(new java.awt.Color(0, 51, 102));
        b_comprar.setText("Comprar");
        b_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comprarActionPerformed(evt);
            }
        });
        getContentPane().add(b_comprar);
        b_comprar.setBounds(430, 370, 90, 30);

        b_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(0, 51, 102));
        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(540, 370, 90, 30);

        e_descripcion.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(e_descripcion);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(240, 230, 230, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Music\\TAREA13333\\fondoprograma.jpg")); // NOI18N
        jLabel8.setInheritsPopupMenu(false);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -30, 1120, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprarActionPerformed
        Controlador2 c2=Controlador2.getInstance();
        try {
            c2.registrComp();
            this.setVisible(false);
            Inicio vista = new Inicio();
            vista.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ComprarJuego3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_comprarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
     this.setVisible(false);
      Inicio view;
        view = new Inicio();
      view.setVisible(true); 
    }//GEN-LAST:event_b_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarJuego3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_comprar;
    private javax.swing.JLabel e_cliente;
    private javax.swing.JList e_descripcion;
    private javax.swing.JLabel e_fecha;
    private javax.swing.JLabel e_juego;
    private javax.swing.JLabel e_precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}