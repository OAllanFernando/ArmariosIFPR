/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao;

import javax.swing.JOptionPane;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.ReservaBiblioteca;
import br.edu.ifpr.paranavai.armarios.modelo.ReservaSaguao;
import br.edu.ifpr.paranavai.armarios.servico.EstudanteServico;
import br.edu.ifpr.paranavai.armarios.servico.ReservaBibliotecaServico;
import br.edu.ifpr.paranavai.armarios.servico.ReservaSaguaoServico;
import java.awt.Color;

/**
 *
 * @author suporte
 */
public class ServidorControleUI extends javax.swing.JFrame {

    /**
     * Creates new form ServidorControle
     */
    public ServidorControleUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botaoCadArmario = new javax.swing.JToggleButton();
        botaoOcupados = new javax.swing.JButton();
        marcadorBiblioteca = new javax.swing.JRadioButton();
        marcadorSaguao = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        selecionaNumero = new javax.swing.JSpinner();
        alunos = new javax.swing.JPanel();
        botaoCadAluno = new javax.swing.JToggleButton();
        nomeAluno = new javax.swing.JTextField();
        emailAluno = new javax.swing.JTextField();
        senhaAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botaoAlunosCadastrados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        raAluno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblrespostacad = new javax.swing.JLabel();
        telefoneAluno = new javax.swing.JFormattedTextField();

        jLabel6.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Painel de Controle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Source Sans Pro Black", 0, 12))); // NOI18N

        botaoCadArmario.setText("Cadastrar Arm??rio");
        botaoCadArmario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoCadArmario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadArmarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoCadArmarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoCadArmarioMouseReleased(evt);
            }
        });
        botaoCadArmario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadArmarioActionPerformed(evt);
            }
        });

        botaoOcupados.setText("Armarios ");
        botaoOcupados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botaoOcupados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoOcupadosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoOcupadosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoOcupadosMouseReleased(evt);
            }
        });
        botaoOcupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOcupadosActionPerformed(evt);
            }
        });

        buttonGroup1.add(marcadorBiblioteca);
        marcadorBiblioteca.setText("Biblioteca");
        marcadorBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcadorBibliotecaMouseClicked(evt);
            }
        });
        marcadorBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcadorBibliotecaActionPerformed(evt);
            }
        });

        buttonGroup1.add(marcadorSaguao);
        marcadorSaguao.setText("Sagu??o");
        marcadorSaguao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcadorSaguaoActionPerformed(evt);
            }
        });

        jLabel1.setText("N??mero do Arm??rio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCadArmario, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selecionaNumero)
                            .addGap(18, 18, 18)
                            .addComponent(marcadorSaguao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(marcadorBiblioteca))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(botaoOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcadorBiblioteca)
                    .addComponent(marcadorSaguao)
                    .addComponent(selecionaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(botaoCadArmario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );

        alunos.setBackground(new java.awt.Color(255, 255, 255));
        alunos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Source Code Pro Black", 0, 12))); // NOI18N
        alunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoCadAluno.setText("Cadastrar Aluno");
        botaoCadAluno.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoCadAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadAlunoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoCadAlunoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoCadAlunoMouseReleased(evt);
            }
        });
        botaoCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadAlunoActionPerformed(evt);
            }
        });

        nomeAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeAlunoMouseClicked(evt);
            }
        });
        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });

        emailAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAlunoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Telefone:");

        jLabel7.setText("Senha:");

        botaoAlunosCadastrados.setText("Alunos Cadastrados ");
        botaoAlunosCadastrados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botaoAlunosCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlunosCadastradosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoAlunosCadastradosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoAlunosCadastradosMouseReleased(evt);
            }
        });
        botaoAlunosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlunosCadastradosActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iflogomenor.png"))); // NOI18N

        raAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raAlunoActionPerformed(evt);
            }
        });

        jLabel8.setText("RA:");

        try {
            telefoneAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alunosLayout = new javax.swing.GroupLayout(alunos);
        alunos.setLayout(alunosLayout);
        alunosLayout.setHorizontalGroup(
            alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alunosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblrespostacad, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunosLayout.createSequentialGroup()
                                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(emailAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                    .addComponent(nomeAluno))
                                .addContainerGap())
                            .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(raAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(senhaAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefoneAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunosLayout.createSequentialGroup()
                        .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoAlunosCadastrados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCadAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        alunosLayout.setVerticalGroup(
            alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosLayout.createSequentialGroup()
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAlunosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrespostacad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadAlunoActionPerformed


    }//GEN-LAST:event_botaoCadAlunoActionPerformed

    private void botaoCadArmarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadArmarioActionPerformed

    }//GEN-LAST:event_botaoCadArmarioActionPerformed

    private void botaoOcupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOcupadosActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaArmarioUI().setVisible(true);
            }
        });

    }//GEN-LAST:event_botaoOcupadosActionPerformed

    private void marcadorBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcadorBibliotecaActionPerformed
        // TODO add your handling code here:
        // bot??o biblioteca
    }//GEN-LAST:event_marcadorBibliotecaActionPerformed

    private void marcadorSaguaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcadorSaguaoActionPerformed
        // TODO add your handling code here:
        // bot??o  saguao
    }//GEN-LAST:event_marcadorSaguaoActionPerformed

    private void botaoCadArmarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadArmarioMouseClicked

        if (marcadorBiblioteca.isSelected() == false && marcadorSaguao.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Selecione um local onde o arm??rio ser?? disponibilizado.");
        } else if (marcadorBiblioteca.isSelected()) {

            ReservaBiblioteca reserva = new ReservaBiblioteca();

            String numero = selecionaNumero.getValue().toString();
            int convertido = Integer.parseInt(numero);

            if (numero.equals("0")) {
                JOptionPane.showMessageDialog(null, "Defina o n??mero do novo arm??rio");
            } else {
                reserva.setNumero(convertido);
            }
            reserva.setAtivo(true);
            ReservaBibliotecaServico.inserir(reserva);
            lblrespostacad.setText("Cadastrado com sucesso!");

            /**
             * ALTERAR OS BOT??ES PARA PISCAR AS CORES QUANDO CLICADOS DEIXAR
             * BRANCO*
             */
        } else if (marcadorSaguao.isSelected()) {
            ReservaSaguao reserva = new ReservaSaguao();
            String numero = selecionaNumero.getValue().toString();
            int convertido = Integer.parseInt(numero);

            if (numero.equals("0")) {
                JOptionPane.showMessageDialog(null, "Defina o n??mero do novo arm??rio");

            } else {
                reserva.setNumero(convertido);
            }
            reserva.setAtivo(true);
            ReservaSaguaoServico.inserir(reserva);

            lblrespostacad.setText("Cadastrado com sucesso!");
        }


    }//GEN-LAST:event_botaoCadArmarioMouseClicked

    private void marcadorBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcadorBibliotecaMouseClicked

    }//GEN-LAST:event_marcadorBibliotecaMouseClicked

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void botaoAlunosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlunosCadastradosActionPerformed

    }//GEN-LAST:event_botaoAlunosCadastradosActionPerformed

    private void raAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raAlunoActionPerformed

    private void botaoCadArmarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadArmarioMousePressed
        botaoCadArmario.setBackground(Color.green);
    }//GEN-LAST:event_botaoCadArmarioMousePressed

    private void botaoCadArmarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadArmarioMouseReleased
        botaoCadArmario.setBackground(Color.white);
    }//GEN-LAST:event_botaoCadArmarioMouseReleased

    private void botaoOcupadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOcupadosMousePressed
        botaoOcupados.setBackground(Color.blue);
    }//GEN-LAST:event_botaoOcupadosMousePressed

    private void botaoOcupadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOcupadosMouseReleased
        botaoOcupados.setBackground(Color.white);
    }//GEN-LAST:event_botaoOcupadosMouseReleased

    private void botaoCadAlunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadAlunoMousePressed
        botaoCadAluno.setBackground(Color.green);
    }//GEN-LAST:event_botaoCadAlunoMousePressed

    private void botaoCadAlunoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadAlunoMouseReleased
        botaoCadAluno.setBackground(Color.white);
    }//GEN-LAST:event_botaoCadAlunoMouseReleased

    private void botaoAlunosCadastradosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlunosCadastradosMousePressed
        botaoAlunosCadastrados.setBackground(Color.blue);
    }//GEN-LAST:event_botaoAlunosCadastradosMousePressed

    private void botaoAlunosCadastradosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlunosCadastradosMouseReleased
        botaoAlunosCadastrados.setBackground(Color.white);
    }//GEN-LAST:event_botaoAlunosCadastradosMouseReleased

    private void emailAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAlunoActionPerformed

    private void nomeAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeAlunoMouseClicked
        lblrespostacad.setVisible(false);
    }//GEN-LAST:event_nomeAlunoMouseClicked

    private void botaoCadAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadAlunoMouseClicked
        Estudante aluno = new Estudante();
        int a = 0;

        if (nomeAluno.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "O campo nome n??o pode ser vazio");
        } else if (emailAluno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo email n??o pode ser vazio");
        } else if (telefoneAluno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo telefone n??o pode ser vazio");
        } else if (senhaAluno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo telefone n??o pode ser vazio");
        } else if (raAluno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo RA n??o pode ser vazio");
        } else {
            a = JOptionPane.showConfirmDialog(null, "Confirme os dados do cadastro: \n " + "Nome: " + nomeAluno.getText() + "\n E-mail: " + emailAluno.getText() + "\n Telefone: " + telefoneAluno.getText() + "\n RA: " + raAluno.getText() + "\n Os dados est??o corretos?");
        }
        if (a == JOptionPane.YES_OPTION) {
            aluno.setNome(nomeAluno.getText());
            aluno.setEmail(emailAluno.getText());
            aluno.setTelefone(telefoneAluno.getText());
            aluno.setRa(raAluno.getText());
            aluno.setSenha(senhaAluno.getText());
            EstudanteServico estudante = new EstudanteServico();
            estudante.inserir(aluno);
            lblrespostacad.setText("Aluno cadastrado com sucesso!");
            lblrespostacad.setVisible(true);
            nomeAluno.setText("");
            emailAluno.setText("");
            telefoneAluno.setText("");
            senhaAluno.setText("");
            raAluno.setText("");

        }
    }//GEN-LAST:event_botaoCadAlunoMouseClicked

    private void telefoneAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneAlunoActionPerformed

    private void botaoOcupadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOcupadosMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaArmarioUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_botaoOcupadosMouseClicked

    private void botaoAlunosCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlunosCadastradosMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaAlunoUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_botaoAlunosCadastradosMouseClicked

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(ServidorControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServidorControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServidorControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServidorControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServidorControleUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alunos;
    private javax.swing.JButton botaoAlunosCadastrados;
    private javax.swing.JToggleButton botaoCadAluno;
    private javax.swing.JToggleButton botaoCadArmario;
    private javax.swing.JButton botaoOcupados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblrespostacad;
    private javax.swing.JRadioButton marcadorBiblioteca;
    private javax.swing.JRadioButton marcadorSaguao;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField raAluno;
    private javax.swing.JSpinner selecionaNumero;
    private javax.swing.JTextField senhaAluno;
    private javax.swing.JFormattedTextField telefoneAluno;
    // End of variables declaration//GEN-END:variables
}
