package InterfazA;


public class Perrito extends javax.swing.JFrame {

    /**
     * Creates new form Perrito
     */
    public Perrito() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CantidadPerroGrande = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CantidadPerroMediano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CantidadDePerroPeque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        CALCULAR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CantidadHoras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("SALIR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 150, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASEADOR DE PERROS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIPO DE MASCOTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INGRESE LA CANTIDAD  DE #PERROS GRANDES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, -1));

        CantidadPerroGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadPerroGrandeActionPerformed(evt);
            }
        });
        getContentPane().add(CantidadPerroGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INGRESE LA CANTIDAD DE #PERROS MEDIANOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        CantidadPerroMediano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadPerroMedianoActionPerformed(evt);
            }
        });
        getContentPane().add(CantidadPerroMediano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INGRESE LA CANTIDAD DE #PERROS PEQUEÑOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        getContentPane().add(CantidadDePerroPeque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOTAL (Pesos Colombianos)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, 30));

        CALCULAR.setText("CALCULAR");
        CALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULARActionPerformed(evt);
            }
        });
        getContentPane().add(CALCULAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CANTIDAD DE #HORAS DE SERVICIO ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 220, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("$");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NOTA: Precio puede variar si aplica el descuento(10%)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        CantidadHoras.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        CantidadHoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/animales-corre-hierba-perro-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(CantidadHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private float calcularCobroPorTipo(int cantidadPerros, int tipoPerro, int horas) {
        float cobroPorTipo = 0;

        switch (tipoPerro) {
            case 1:
                if (horas < 1) {
                    cobroPorTipo = 10000;
                } else {
                    cobroPorTipo = (horas * 10000);
                }
                break;
            case 2:
                if (horas < 1) {
                    cobroPorTipo = 5000;
                } else {
                    cobroPorTipo = (horas * 5000);
                }
                break;
            case 3:
                if (horas < 1) {
                    cobroPorTipo = 3000;
                } else {
                    cobroPorTipo = horas * 3000;
                }
                break;
            default:
                System.out.println("INCORRECTO");
                break;
        }

        return cobroPorTipo * cantidadPerros;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CantidadPerroGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadPerroGrandeActionPerformed

    }//GEN-LAST:event_CantidadPerroGrandeActionPerformed

    private void CantidadPerroMedianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadPerroMedianoActionPerformed
        
    }//GEN-LAST:event_CantidadPerroMedianoActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed

    }//GEN-LAST:event_TotalActionPerformed

    private void CALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULARActionPerformed
        try {
            int cantidadPerrosGrandes = Integer.parseInt(CantidadPerroGrande.getText());
            int cantidadPerrosMedianos = Integer.parseInt(CantidadPerroMediano.getText());
            int cantidadPerrosPequenos = Integer.parseInt(CantidadDePerroPeque.getText());
            int horas = Integer.parseInt(jTextField1.getText());

            float totalCobro = 0;

            totalCobro += calcularCobroPorTipo(cantidadPerrosGrandes, 1, horas); // Grande
            totalCobro += calcularCobroPorTipo(cantidadPerrosMedianos, 2, horas); // Mediano
            totalCobro += calcularCobroPorTipo(cantidadPerrosPequenos, 3, horas); // Pequeño

            int totalPerros = cantidadPerrosGrandes + cantidadPerrosMedianos + cantidadPerrosPequenos;
            if (totalPerros > 1) {
                float descuento = totalCobro * 0.1f;
                totalCobro -= descuento;
            }

            Total.setText(Float.toString(totalCobro));
        } catch (NumberFormatException ex) {
            
        }

    }//GEN-LAST:event_CALCULARActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed
public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Perrito().setVisible(true);
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULAR;
    private javax.swing.JTextField CantidadDePerroPeque;
    private javax.swing.JLabel CantidadHoras;
    private javax.swing.JTextField CantidadPerroGrande;
    private javax.swing.JTextField CantidadPerroMediano;
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}