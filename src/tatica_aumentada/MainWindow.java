package tatica_aumentada;

import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        jTabbedPane_main = new javax.swing.JTabbedPane();
        jPanel_playerCreation = new javax.swing.JPanel();
        jPanel_bottom = new javax.swing.JPanel();
        jButton_create_clear = new javax.swing.JButton();
        jButton_create_saveCreatedPlayer = new javax.swing.JButton();
        jPanel_right = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton_create_takePicture = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel_central = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_create_waist = new javax.swing.JTextField();
        jTextField_create_shoulders = new javax.swing.JTextField();
        jTextField_create_height = new javax.swing.JTextField();
        jTextField_create_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox_create_color = new javax.swing.JComboBox();
        jPanel_playerEdit = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_players = new javax.swing.JList();
        jButton_right = new javax.swing.JButton();
        jButton_left = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_selectedPlayers = new javax.swing.JList();
        jLabel14 = new javax.swing.JLabel();
        jButton_run = new javax.swing.JButton();
        jComboBox_cards = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tática Aumentada");
        setName("frame_mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(520, 327));

        jTabbedPane_main.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane_mainMouseClicked(evt);
            }
        });

        jPanel_playerCreation.setLayout(new java.awt.BorderLayout());

        jPanel_bottom.setLayout(new java.awt.GridLayout(1, 0));

        jButton_create_clear.setText("Limpar");
        jButton_create_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_create_clearActionPerformed(evt);
            }
        });
        jPanel_bottom.add(jButton_create_clear);

        jButton_create_saveCreatedPlayer.setText("Salvar jogador");
        jButton_create_saveCreatedPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_create_saveCreatedPlayerActionPerformed(evt);
            }
        });
        jPanel_bottom.add(jButton_create_saveCreatedPlayer);

        jPanel_playerCreation.add(jPanel_bottom, java.awt.BorderLayout.PAGE_END);

        jLabel9.setText("\"webcam aqui\"");

        jButton_create_takePicture.setText("Tirar foto");

        jLabel12.setText("\"foto tirada\"");

        javax.swing.GroupLayout jPanel_rightLayout = new javax.swing.GroupLayout(jPanel_right);
        jPanel_right.setLayout(jPanel_rightLayout);
        jPanel_rightLayout.setHorizontalGroup(
            jPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_rightLayout.createSequentialGroup()
                .addGroup(jPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_rightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_create_takePicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_rightLayout.createSequentialGroup()
                        .addGroup(jPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_rightLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9))
                            .addGroup(jPanel_rightLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_rightLayout.setVerticalGroup(
            jPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_rightLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(46, 46, 46)
                .addComponent(jButton_create_takePicture)
                .addGap(39, 39, 39)
                .addComponent(jLabel12)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel_playerCreation.add(jPanel_right, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Preencha com as informações do jogador:");

        jLabel3.setText("Altura:");

        jLabel4.setText("Ombros:");

        jLabel5.setText("Cintura:");

        jLabel6.setText("cm");

        jLabel7.setText("cm");

        jLabel8.setText("cm");

        jLabel2.setText("Nome:");

        jLabel10.setText("Cor:");

        jComboBox_create_color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_centralLayout = new javax.swing.GroupLayout(jPanel_central);
        jPanel_central.setLayout(jPanel_centralLayout);
        jPanel_centralLayout.setHorizontalGroup(
            jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel_centralLayout.createSequentialGroup()
                        .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel2))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_centralLayout.createSequentialGroup()
                                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_create_height, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jTextField_create_shoulders)
                                    .addComponent(jTextField_create_waist))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)))
                            .addComponent(jComboBox_create_color, 0, 74, Short.MAX_VALUE)
                            .addComponent(jTextField_create_name))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel_centralLayout.setVerticalGroup(
            jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_create_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_create_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_create_shoulders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_create_waist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox_create_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPanel_playerCreation.add(jPanel_central, java.awt.BorderLayout.CENTER);

        jTabbedPane_main.addTab("Criar jogador", new javax.swing.ImageIcon(getClass().getResource("/tatica_aumentada/Imagens/boneco.png")), jPanel_playerCreation, "Aqui você cria um boneco com as características do jogador e seleciona seu respectivo cartão."); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Jogadores cadastrados:");

        jScrollPane1.setViewportView(jList_players);

        jButton_right.setText(">>>");
        jButton_right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rightActionPerformed(evt);
            }
        });

        jButton_left.setText("<<<");
        jButton_left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_leftActionPerformed(evt);
            }
        });

        jButton_delete.setText("Excluir");
        jButton_delete.setToolTipText("Elimina os registros desse jogador.");

        jList_selectedPlayers.setModel(Functions.model_listOfSelectedPlayers);
        jScrollPane2.setViewportView(jList_selectedPlayers);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Jogadores Selecionados:");

        jButton_run.setText("Rodar!");
        jButton_run.setToolTipText("");

        jComboBox_cards.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

        jLabel11.setText("Cartão:");

        javax.swing.GroupLayout jPanel_playerEditLayout = new javax.swing.GroupLayout(jPanel_playerEdit);
        jPanel_playerEdit.setLayout(jPanel_playerEditLayout);
        jPanel_playerEditLayout.setHorizontalGroup(
            jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_playerEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_playerEditLayout.createSequentialGroup()
                        .addComponent(jButton_delete)
                        .addGap(228, 228, 228)
                        .addComponent(jButton_run))
                    .addGroup(jPanel_playerEditLayout.createSequentialGroup()
                        .addGroup(jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox_cards, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_right, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_left, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel_playerEditLayout.setVerticalGroup(
            jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_playerEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_playerEditLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_cards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton_right)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_left)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_playerEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_run)
                    .addComponent(jButton_delete))
                .addContainerGap())
        );

        jTabbedPane_main.addTab("Jogadores", new javax.swing.ImageIcon(getClass().getResource("/tatica_aumentada/Imagens/jogadoreS.png")), jPanel_playerEdit, "Aqui é onde você edita as configurações dos bonecos ja criados anteriormente, como trocar o cartão de cada um."); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        jTabbedPane_main.addTab("Cartões", new javax.swing.ImageIcon(getClass().getResource("/tatica_aumentada/Imagens/imprimir.png")), jPanel3, "Selecione os cartões usados para imprimir."); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_main)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_main)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_create_saveCreatedPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_create_saveCreatedPlayerActionPerformed
        //crio e adiciono um novo objeto Player ao listOfPlayers
        Functions.listOfPlayers.add(new Player(jTextField_create_name.getText(),
                                               "pictureName",
                                               Float.parseFloat(jTextField_create_shoulders.getText()),
                                               Float.parseFloat(jTextField_create_height.getText()),
                                               Float.parseFloat(jTextField_create_waist.getText()),
                                               jComboBox_create_color.getSelectedIndex()));
        
        //Sorting em ordem alfabética pelo nome do jogador
        Collections.sort(Functions.listOfPlayers, new Comparator<Player>() {
        @Override
        public int compare(Player  player1, Player  player2)
        {

            return  player1.name.compareTo(player2.name);
        }
        });
        Functions.writePlayers();       
    }//GEN-LAST:event_jButton_create_saveCreatedPlayerActionPerformed

    private void jButton_create_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_create_clearActionPerformed
        //limpa todos os campos de entrada da aba "criar jogador"
        jTextField_create_height.setText(null);
        jTextField_create_name.setText(null);
        jTextField_create_shoulders.setText(null);
        jTextField_create_waist.setText(null);
        jComboBox_create_color.setSelectedIndex(0);
           
    }//GEN-LAST:event_jButton_create_clearActionPerformed

    private void jTabbedPane_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane_mainMouseClicked
       //sempre que troco de aba recarrago todos ss jogadores para a lista de jogadores disponiveis 
        Functions.model_listOfPlayers.clear();
        for (int i=0; i < Functions.listOfPlayers.size(); i++){
            Functions.model_listOfPlayers.addElement(Functions.listOfPlayers.get(i).name);
        }
        jList_players.setModel(Functions.model_listOfPlayers);
       
    }//GEN-LAST:event_jTabbedPane_mainMouseClicked

    private void jButton_rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rightActionPerformed
        Functions.model_listOfSelectedPlayers.addElement(Functions.listOfPlayers.get( jList_players.getSelectedIndex()).name);
        Functions.listOfSelectedPlayers.add(Functions.listOfPlayers.get( jList_players.getSelectedIndex()));
    }//GEN-LAST:event_jButton_rightActionPerformed

    private void jButton_leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_leftActionPerformed
        Functions.listOfSelectedPlayers.remove(jList_selectedPlayers.getSelectedIndex());
        Functions.model_listOfSelectedPlayers.remove(jList_selectedPlayers.getSelectedIndex());        
    }//GEN-LAST:event_jButton_leftActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_create_clear;
    private javax.swing.JButton jButton_create_saveCreatedPlayer;
    private javax.swing.JButton jButton_create_takePicture;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_left;
    private javax.swing.JButton jButton_right;
    private javax.swing.JButton jButton_run;
    private javax.swing.JComboBox jComboBox_cards;
    private javax.swing.JComboBox jComboBox_create_color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList_players;
    private javax.swing.JList jList_selectedPlayers;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_bottom;
    private javax.swing.JPanel jPanel_central;
    private javax.swing.JPanel jPanel_playerCreation;
    private javax.swing.JPanel jPanel_playerEdit;
    private javax.swing.JPanel jPanel_right;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane_main;
    private javax.swing.JTextField jTextField_create_height;
    private javax.swing.JTextField jTextField_create_name;
    private javax.swing.JTextField jTextField_create_shoulders;
    private javax.swing.JTextField jTextField_create_waist;
    // End of variables declaration//GEN-END:variables
}
