/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21mml4;

/**
 *
 * @author Usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        d_p_contenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        m_i_suma = new javax.swing.JMenuItem();
        m_i_resta = new javax.swing.JMenuItem();
        m_i_multiplicacion = new javax.swing.JMenuItem();
        m_i_division = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        m_i_potencia = new javax.swing.JMenuItem();
        m_i_factorial = new javax.swing.JMenuItem();
        m_i_logaritmo = new javax.swing.JMenuItem();
        m_i_raizcuadrada = new javax.swing.JMenuItem();
        m_i_raizcubica = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout d_p_contenedorLayout = new javax.swing.GroupLayout(d_p_contenedor);
        d_p_contenedor.setLayout(d_p_contenedorLayout);
        d_p_contenedorLayout.setHorizontalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        d_p_contenedorLayout.setVerticalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Operaciones");

        jMenu3.setText("Basicas");

        m_i_suma.setText("Suma");
        m_i_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_sumaActionPerformed(evt);
            }
        });
        jMenu3.add(m_i_suma);

        m_i_resta.setText("Resta");
        m_i_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_restaActionPerformed(evt);
            }
        });
        jMenu3.add(m_i_resta);

        m_i_multiplicacion.setText("Multiplicacion");
        m_i_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_multiplicacionActionPerformed(evt);
            }
        });
        jMenu3.add(m_i_multiplicacion);

        m_i_division.setText("Division");
        m_i_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_divisionActionPerformed(evt);
            }
        });
        jMenu3.add(m_i_division);

        jMenu1.add(jMenu3);

        jMenu4.setText("Avanzadas");

        m_i_potencia.setText("Potencia");
        m_i_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_potenciaActionPerformed(evt);
            }
        });
        jMenu4.add(m_i_potencia);

        m_i_factorial.setText("Factorial");
        m_i_factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_factorialActionPerformed(evt);
            }
        });
        jMenu4.add(m_i_factorial);

        m_i_logaritmo.setText("Logaritmo");
        m_i_logaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_logaritmoActionPerformed(evt);
            }
        });
        jMenu4.add(m_i_logaritmo);

        m_i_raizcuadrada.setText("Raiz cuadrada");
        m_i_raizcuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_raizcuadradaActionPerformed(evt);
            }
        });
        jMenu4.add(m_i_raizcuadrada);

        m_i_raizcubica.setText("Raiz cubica");
        m_i_raizcubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_raizcubicaActionPerformed(evt);
            }
        });
        jMenu4.add(m_i_raizcubica);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_p_contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_p_contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_i_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_multiplicacionActionPerformed
        // TODO add your handling code here:
        IfrmMultiplicacion objmultiplicacion =new IfrmMultiplicacion();
        objmultiplicacion.setVisible(true);
        d_p_contenedor.add(objmultiplicacion);
    }//GEN-LAST:event_m_i_multiplicacionActionPerformed

    private void m_i_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_sumaActionPerformed
        // TODO add your handling code here:
        Ifrmsuma objsuma =new Ifrmsuma();
        objsuma.setVisible(true);
        d_p_contenedor.add(objsuma);
    }//GEN-LAST:event_m_i_sumaActionPerformed

    private void m_i_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_restaActionPerformed
        // TODO add your handling code here:
        IfrmResta objresta =new IfrmResta();
        objresta.setVisible(true);
        d_p_contenedor.add(objresta);
    }//GEN-LAST:event_m_i_restaActionPerformed

    private void m_i_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_divisionActionPerformed
        // TODO add your handling code here:
        IfrmDivision objdivision =new IfrmDivision();
        objdivision.setVisible(true);
        d_p_contenedor.add(objdivision);
    }//GEN-LAST:event_m_i_divisionActionPerformed

    private void m_i_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_potenciaActionPerformed
        // TODO add your handling code here:
        IfrmPotencia objpotencia =new IfrmPotencia();
        objpotencia.setVisible(true);
        d_p_contenedor.add(objpotencia);
    }//GEN-LAST:event_m_i_potenciaActionPerformed

    private void m_i_factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_factorialActionPerformed
        // TODO add your handling code here:
        IfrmFactorial objfactorial =new IfrmFactorial();
        objfactorial.setVisible(true);
        d_p_contenedor.add(objfactorial);
    }//GEN-LAST:event_m_i_factorialActionPerformed

    private void m_i_logaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_logaritmoActionPerformed
        // TODO add your handling code here:
        IfrmLogaritmo objlogaritmo =new IfrmLogaritmo();
        objlogaritmo.setVisible(true);
        d_p_contenedor.add(objlogaritmo);
    }//GEN-LAST:event_m_i_logaritmoActionPerformed

    private void m_i_raizcuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_raizcuadradaActionPerformed
        // TODO add your handling code here:
        IfrmRaizcuadrada objraizcuadrada =new IfrmRaizcuadrada();
        objraizcuadrada.setVisible(true);
        d_p_contenedor.add(objraizcuadrada);
    }//GEN-LAST:event_m_i_raizcuadradaActionPerformed

    private void m_i_raizcubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_raizcubicaActionPerformed
        // TODO add your handling code here:
        IfrmRaizcubica objraizcubica =new IfrmRaizcubica();
        objraizcubica.setVisible(true);
        d_p_contenedor.add(objraizcubica);
    }//GEN-LAST:event_m_i_raizcubicaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane d_p_contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem m_i_division;
    private javax.swing.JMenuItem m_i_factorial;
    private javax.swing.JMenuItem m_i_logaritmo;
    private javax.swing.JMenuItem m_i_multiplicacion;
    private javax.swing.JMenuItem m_i_potencia;
    private javax.swing.JMenuItem m_i_raizcuadrada;
    private javax.swing.JMenuItem m_i_raizcubica;
    private javax.swing.JMenuItem m_i_resta;
    private javax.swing.JMenuItem m_i_suma;
    // End of variables declaration//GEN-END:variables
}
