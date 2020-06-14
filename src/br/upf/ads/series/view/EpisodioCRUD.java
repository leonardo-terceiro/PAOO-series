/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.ads.series.view;

import br.upf.ads.series.dominio.Episodio;
import br.upf.ads.series.dominio.Temporada;
import br.upf.ads.series.persistencia.JPAUtil;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author leonardo.bertuzzi
 */
public class EpisodioCRUD extends javax.swing.JDialog {

    private Boolean editando;
    private Episodio selecionado;
   
    private void atualizaLista(){
        list1.clear();
        list1.addAll(query1.getResultList());
    }
    
    private void atualizaTela(){
        uiIncluir.setEnabled(!editando);
        uiAlterar.setEnabled(!editando && uiTabela.getSelectedRow() >= 0);
        uiExcluir.setEnabled(!editando && uiTabela.getSelectedRow() >= 0);
        uiSalvar.setEnabled(editando);
        uiCancelar.setEnabled(editando);
        uiPaineis.setSelectedComponent(editando ? uiEdicao : uiConsulta);
    }

    
    /**
     * Creates new form EpisodioCRUD1
     */
    public EpisodioCRUD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager1 = JPAUtil.getEntityManager();
        query1 = java.beans.Beans.isDesignTime() ? null : entityManager1.createQuery("SELECT e FROM Episodio e");
        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query1.getResultList());
        queryTemporada = java.beans.Beans.isDesignTime() ? null : entityManager1.createQuery("SELECT t FROM Temporada t");
        listTemporada = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryTemporada.getResultList());
        uiPaineis = new javax.swing.JTabbedPane();
        uiConsulta = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        uiIncluir = new javax.swing.JButton();
        uiAlterar = new javax.swing.JButton();
        uiExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uiTabela = new javax.swing.JTable();
        uiEdicao = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        uiSalvar = new javax.swing.JButton();
        uiCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        uiNomeEpisodio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        uiResumo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uiTemporada = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uiIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/upf/ads/series/icones/cad_incluir.png"))); // NOI18N
        uiIncluir.setText("Incluir");
        uiIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiIncluirActionPerformed(evt);
            }
        });

        uiAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/upf/ads/series/icones/cad_alterar.png"))); // NOI18N
        uiAlterar.setText("Alterar");
        uiAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiAlterarActionPerformed(evt);
            }
        });

        uiExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/upf/ads/series/icones/cad_excluir.png"))); // NOI18N
        uiExcluir.setText("Excluir");
        uiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uiIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uiAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uiExcluir)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiIncluir)
                    .addComponent(uiAlterar)
                    .addComponent(uiExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list1, uiTabela);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${resumo}"));
        columnBinding.setColumnName("Resumo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${temporada}"));
        columnBinding.setColumnName("Temporada");
        columnBinding.setColumnClass(br.upf.ads.series.dominio.Temporada.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        uiTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uiTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uiTabela);
        if (uiTabela.getColumnModel().getColumnCount() > 0) {
            uiTabela.getColumnModel().getColumn(0).setMinWidth(50);
            uiTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            uiTabela.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout uiConsultaLayout = new javax.swing.GroupLayout(uiConsulta);
        uiConsulta.setLayout(uiConsultaLayout);
        uiConsultaLayout.setHorizontalGroup(
            uiConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        uiConsultaLayout.setVerticalGroup(
            uiConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uiConsultaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        uiPaineis.addTab("Consulta", uiConsulta);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uiSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/upf/ads/series/icones/cad_gravar.png"))); // NOI18N
        uiSalvar.setText("Salvar");
        uiSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiSalvarActionPerformed(evt);
            }
        });

        uiCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/upf/ads/series/icones/botao_voltar.png"))); // NOI18N
        uiCancelar.setText("Cancelar");
        uiCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uiSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uiCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiSalvar)
                    .addComponent(uiCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Nome do episódio:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, uiTabela, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), uiNomeEpisodio, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setText("Resumo:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, uiTabela, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.resumo}"), uiResumo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel3.setText("Temporada:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listTemporada, uiTemporada);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, uiTabela, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.temporada}"), uiTemporada, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout uiEdicaoLayout = new javax.swing.GroupLayout(uiEdicao);
        uiEdicao.setLayout(uiEdicaoLayout);
        uiEdicaoLayout.setHorizontalGroup(
            uiEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(uiEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uiEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uiEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uiResumo)
                    .addGroup(uiEdicaoLayout.createSequentialGroup()
                        .addComponent(uiNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 150, Short.MAX_VALUE))
                    .addComponent(uiTemporada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        uiEdicaoLayout.setVerticalGroup(
            uiEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uiEdicaoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uiEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uiNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uiEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(uiResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uiEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        uiPaineis.addTab("Edição", uiEdicao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uiPaineis)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uiPaineis, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uiIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiIncluirActionPerformed
        editando = true;
        selecionado = new Episodio();
        list1.add(selecionado);
        uiTabela.setRowSelectionInterval(list1.size() - 1, list1.size() - 1);
        atualizaTela();
    }//GEN-LAST:event_uiIncluirActionPerformed

    private void uiAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiAlterarActionPerformed
        editando = true;
        selecionado = list1.get(uiTabela.getSelectedRow());
        atualizaTela();
    }//GEN-LAST:event_uiAlterarActionPerformed

    private void uiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Confirma a exclusão?") == 0) {
            selecionado = list1.get(uiTabela.getSelectedRow());
            EntityManager em = JPAUtil.getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(selecionado));
            em.getTransaction().commit();
            selecionado = null;
            atualizaLista();
            atualizaTela();
        }
    }//GEN-LAST:event_uiExcluirActionPerformed

    private void uiSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiSalvarActionPerformed
        editando = false;
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(selecionado);
        em.getTransaction().commit();
        selecionado = null;
        atualizaLista();
        atualizaTela();
    }//GEN-LAST:event_uiSalvarActionPerformed

    private void uiCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiCancelarActionPerformed
        editando = false;
        selecionado = null;
        atualizaLista();
        atualizaTela();
    }//GEN-LAST:event_uiCancelarActionPerformed

    private void uiTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uiTabelaMouseClicked
        atualizaTela();
    }//GEN-LAST:event_uiTabelaMouseClicked

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
            java.util.logging.Logger.getLogger(EpisodioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EpisodioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EpisodioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EpisodioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EpisodioCRUD dialog = new EpisodioCRUD(new javax.swing.JFrame(), true);
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
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Episodio> list1;
    private java.util.List<Temporada> listTemporada;
    private javax.persistence.Query query1;
    private javax.persistence.Query queryTemporada;
    private javax.swing.JButton uiAlterar;
    private javax.swing.JButton uiCancelar;
    private javax.swing.JPanel uiConsulta;
    private javax.swing.JPanel uiEdicao;
    private javax.swing.JButton uiExcluir;
    private javax.swing.JButton uiIncluir;
    private javax.swing.JTextField uiNomeEpisodio;
    private javax.swing.JTabbedPane uiPaineis;
    private javax.swing.JTextField uiResumo;
    private javax.swing.JButton uiSalvar;
    private javax.swing.JTable uiTabela;
    private javax.swing.JComboBox<String> uiTemporada;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
