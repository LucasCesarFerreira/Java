
import static java.lang.Math.pow;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lcferreira
 */
public class SuperCc extends javax.swing.JFrame {

    /**
     * Creates new form SuperCc
     */
    public SuperCc() {
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

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spSp = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lDiv = new javax.swing.JLabel();
        lCube = new javax.swing.JLabel();
        lSqrt = new javax.swing.JLabel();
        lCrt = new javax.swing.JLabel();
        lAbs = new javax.swing.JLabel();
        resDiv = new javax.swing.JLabel();
        resCube = new javax.swing.JLabel();
        resSqrt = new javax.swing.JLabel();
        resCrt = new javax.swing.JLabel();
        resAbs = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setText("Informe um Valor: ");

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        jLabel2.setText("SUPER Calculadora");

        lDiv.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        lCube.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        lSqrt.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        lCrt.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        lAbs.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        resDiv.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        resDiv.setForeground(new java.awt.Color(51, 51, 255));

        resCube.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        resCube.setForeground(new java.awt.Color(51, 51, 255));

        resSqrt.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        resSqrt.setForeground(new java.awt.Color(51, 51, 255));

        resCrt.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        resCrt.setForeground(new java.awt.Color(51, 51, 255));

        resAbs.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        resAbs.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lAbs)
                            .addComponent(lCrt)
                            .addComponent(lSqrt)
                            .addComponent(lCube)
                            .addComponent(lDiv))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spSp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resDiv)
                            .addComponent(resCube)
                            .addComponent(resSqrt)
                            .addComponent(resCrt)
                            .addComponent(resAbs))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spSp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDiv)
                    .addComponent(resDiv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCube)
                    .addComponent(resCube))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSqrt)
                    .addComponent(resSqrt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCrt)
                    .addComponent(resCrt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAbs)
                    .addComponent(resAbs))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        float n1=Float.parseFloat(spSp.getValue().toString());
        float div= n1%2;
        float cub=(float)(pow(n1,3));
        float sq=(float)(Math.sqrt(n1));
        float cr=(float)(Math.cbrt(n1));
        float abs=(float)(Math.abs(n1));
        
        lDiv.setText("Resto da Divisão por 2");
        lCube.setText("Elevado ao cubo");
        lSqrt.setText("Raiz quadrada");
        lCrt.setText("Raiz Cúbica");
        lAbs.setText("Valor absoluto");
        
        
        resDiv.setText(Float.toString(div));
        resCube.setText(Float.toString(cub));
        resSqrt.setText(Float.toString(sq));
        resCrt.setText(Float.toString(cr));
        resAbs.setText(Float.toString(abs));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SuperCc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperCc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperCc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperCc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperCc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lAbs;
    private javax.swing.JLabel lCrt;
    private javax.swing.JLabel lCube;
    private javax.swing.JLabel lDiv;
    private javax.swing.JLabel lSqrt;
    private javax.swing.JLabel resAbs;
    private javax.swing.JLabel resCrt;
    private javax.swing.JLabel resCube;
    private javax.swing.JLabel resDiv;
    private javax.swing.JLabel resSqrt;
    private javax.swing.JSpinner spSp;
    // End of variables declaration//GEN-END:variables
}
