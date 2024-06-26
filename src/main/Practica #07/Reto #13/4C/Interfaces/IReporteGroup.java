
package Interfaces;

import Logica.GestionDeEquipos;

/**
 *
 * @author Edwyn Guzmán
 */
public class IReporteGroup extends javax.swing.JFrame {

        /**
         * Creates new form IReporteGroup
         */
        public IReporteGroup() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jScrollBar1 = new javax.swing.JScrollBar();
                Contenedor = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jCheckBox1 = new javax.swing.JCheckBox();
                jCheckBox2 = new javax.swing.JCheckBox();
                BotonReporteContinuar = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                listaDatos = new javax.swing.JList<>();
                BotonTotalizarGrupo = new javax.swing.JButton();
                jPanel3 = new javax.swing.JPanel();
                labelCantidadEquipo = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                LabelTotalBolivare = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new java.awt.FlowLayout());

                jLabel1.setText("Tipo de reporte:");

                jCheckBox1.setText("Individual");
                jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                jCheckBox1StateChanged(evt);
                        }
                });
                jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox1ActionPerformed(evt);
                        }
                });

                jCheckBox2.setSelected(true);
                jCheckBox2.setText("General");
                jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                jCheckBox2StateChanged(evt);
                        }
                });
                jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox2ActionPerformed(evt);
                        }
                });

                BotonReporteContinuar.setText("Continuar");
                BotonReporteContinuar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BotonReporteContinuarActionPerformed(evt);
                        }
                });

                jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel4.setText("Cantidad equipos");

                jLabel2.setText("C.I Responsable");

                jLabel6.setText("Monto total(Bs.)");

                listaDatos.setToolTipText("");
                jScrollPane1.setViewportView(listaDatos);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel4)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                296,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel6))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                72, Short.MAX_VALUE)
                                                                .addContainerGap()));

                BotonTotalizarGrupo.setText("Totalizar");
                BotonTotalizarGrupo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BotonTotalizarGrupoActionPerformed(evt);
                        }
                });

                labelCantidadEquipo.setText("_____");

                jLabel5.setText("Equipos");

                LabelTotalBolivare.setText("__________");

                jLabel7.setText("Bs.");

                jLabel3.setText("Totalización:");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(LabelTotalBolivare,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                72,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                48,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(labelCantidadEquipo,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                43,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                67,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                75,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 33, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(labelCantidadEquipo)
                                                                                .addComponent(jLabel5))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LabelTotalBolivare)
                                                                                .addComponent(jLabel7))
                                                                .addGap(0, 11, Short.MAX_VALUE)));

                javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
                Contenedor.setLayout(ContenedorLayout);
                ContenedorLayout.setHorizontalGroup(
                                ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ContenedorLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(ContenedorLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(ContenedorLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(ContenedorLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(BotonReporteContinuar,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                92,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(BotonTotalizarGrupo,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(ContenedorLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(ContenedorLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(ContenedorLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                95,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jCheckBox1)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jCheckBox2))
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                ContenedorLayout.setVerticalGroup(
                                ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ContenedorLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(
                                                                                ContenedorLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel1)
                                                                                                .addComponent(jCheckBox1)
                                                                                                .addComponent(jCheckBox2))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(ContenedorLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(ContenedorLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(BotonTotalizarGrupo)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(BotonReporteContinuar))
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                getContentPane().add(Contenedor);

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jCheckBox1StateChanged

        }// GEN-LAST:event_jCheckBox1StateChanged

        private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed
                setVisible(false);// TODO add your handling code here:
                new IReporte().run();

        }// GEN-LAST:event_jCheckBox1ActionPerformed

        private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jCheckBox2StateChanged
                // TODO add your handling code here:
        }// GEN-LAST:event_jCheckBox2StateChanged

        private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jCheckBox2ActionPerformed

        private void BotonReporteContinuarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotonReporteContinuarActionPerformed
                setVisible(false);
                new ICentro().run();
        }// GEN-LAST:event_BotonReporteContinuarActionPerformed

        private void BotonTotalizarGrupoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotonTotalizarGrupoActionPerformed
                String text = new GestionDeEquipos().generarReportes();
                if (!text.isEmpty()) {
                        int totalDinero = 0;
                        int totalEquipos = 0;
                        String personDato[] = text.split("#");
                        for (int i = 0; i < personDato.length; i++) {
                                String datos[] = personDato[i].split("-");
                                totalEquipos += Integer.parseInt(datos[1]);
                                totalDinero += Integer.parseInt(datos[2]);
                        }
                        labelCantidadEquipo.setText(Integer.toString(totalEquipos));
                        LabelTotalBolivare.setText(Integer.toString(totalDinero));
                } else {
                        labelCantidadEquipo.setText("_____");
                        LabelTotalBolivare.setText("__________");
                }
        }// GEN-LAST:event_BotonTotalizarGrupoActionPerformed

        public void TablaGroups() {
                String text = new GestionDeEquipos().generarReportes();
                String total = "";
                if (!text.trim().isEmpty()) {
                        String parse[] = text.split("#");
                        for (int i = 0; i < parse.length; i++) {
                                String temp[] = parse[i].split("-");
                                total += temp[0] + "                 " + temp[1] + "                               "
                                                + temp[2] + ",";
                        }
                        String[] arr = total.split(",");
                        listaDatos.setModel(new javax.swing.AbstractListModel<String>() {
                                String[] strings = arr;
                                public int getSize() {
                                        return strings.length;
                                }

                                public String getElementAt(int i) {
                                        return strings[i];
                                }
                        });
                }
        }

        public void run() {
                IReporteGroup frame = new IReporteGroup();
                frame.setTitle("Reporte del inventario del Centro de Investigación");
                frame.setVisible(true);
                frame.TablaGroups();
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BotonReporteContinuar;
        private javax.swing.JButton BotonTotalizarGrupo;
        private javax.swing.JPanel Contenedor;
        private javax.swing.JLabel LabelTotalBolivare;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JCheckBox jCheckBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollBar jScrollBar1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel labelCantidadEquipo;
        private javax.swing.JList<String> listaDatos;
        // End of variables declaration//GEN-END:variables
}
