/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executargramatica.visitor;

import executargramatica.lingaguemmodel.LinguagemLexer;
import executargramatica.lingaguemmodel.LinguagemParser;
import executargramatica.models.ErroLexico;
import executargramatica.models.Identificador;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author noschang
 */
public class ExecutarGramatica extends javax.swing.JFrame {

    String url;
    List<Identificador> ids = null;
    String codigoAssembly = "";

    /**
     * Creates new form Frame
     */
    public ExecutarGramatica() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        compiladorBotao = new javax.swing.JButton();
        abrirBotao = new javax.swing.JButton();
        salvarBotao = new javax.swing.JButton();
        tabelaBotao = new javax.swing.JButton();
        telaAssmbly = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelAvisos = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMensagens = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaAvisos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teste de Gramática");

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel1.setText("Código:");

        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane1.setViewportView(txtCodigo);

        compiladorBotao.setText("Compilar");
        compiladorBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compiladorBotaoActionPerformed(evt);
            }
        });

        abrirBotao.setText("Abrir");
        abrirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirBotaoActionPerformed(evt);
            }
        });

        salvarBotao.setText("Salvar");
        salvarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBotaoActionPerformed(evt);
            }
        });

        tabelaBotao.setText("Tabela");
        tabelaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelaBotaoActionPerformed(evt);
            }
        });

        telaAssmbly.setText("AVENGERS: ASSMBLY");
        telaAssmbly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaAssmblyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(abrirBotao)
                        .addGap(36, 36, 36)
                        .addComponent(salvarBotao)
                        .addGap(38, 38, 38)
                        .addComponent(tabelaBotao)
                        .addGap(48, 48, 48)
                        .addComponent(telaAssmbly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(compiladorBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compiladorBotao)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(abrirBotao)
                            .addComponent(salvarBotao)
                            .addComponent(tabelaBotao)
                            .addComponent(telaAssmbly))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jSplitPane1.setTopComponent(jPanel2);

        jLabel2.setText("Mensagens:");

        jScrollPane2.setViewportView(listaMensagens);

        panelAvisos.addTab("Erros", jScrollPane2);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane4.setViewportView(listaAvisos);

        jPanel1.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        panelAvisos.addTab("Avisos", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(panelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel3);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compiladorBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compiladorBotaoActionPerformed
        ANTLRInputStream ais = new ANTLRInputStream(txtCodigo.getText());
        LinguagemLexer lexer = new LinguagemLexer(ais);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        LinguagemParser parser = new LinguagemParser(stream);

        DefaultListModel modeloLista = new DefaultListModel();
        listaMensagens.setModel(modeloLista);

        DefaultListModel modeloAviso = new DefaultListModel();
        listaAvisos.setModel(modeloAviso);
        ErroLexico errolexico = new ErroLexico();

        // Remove o tratador de erros padrão do lexer e do parser
        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        // Instala o tratador de erros personalizado que irá exibir as mensagens
        // em tela na JList
        lexer.addErrorListener(errolexico);
        parser.addErrorListener(errolexico);

        ParseTree tree = parser.prog();

        if (errolexico.getErrors().isEmpty()) {
            LiguagemSemantico visitor = new LiguagemSemantico(new ArrayList<Identificador>());
            try {
                visitor.visit(tree);
                ids = visitor.getTabelaSimbolos();
                BipGenerator vesetador = new BipGenerator(ids);
                for (Identificador id : ids) {
                    if (id.isUsada() == false) {
                        modeloAviso.addElement(((!id.isFuncao() ? "Váriavel " : "Função ") + id.getNome() + " foi declarada mas não utilizada"));
                    }
                }
                if (!visitor.getWarnings().isEmpty()) {
                    panelAvisos.setSelectedIndex(1);
                    for (String warning : visitor.getWarnings()) {
                        modeloAviso.addElement(warning);
                    }
                }
                vesetador.visit(tree);
                System.out.println(vesetador.getCodigo());
                codigoAssembly = vesetador.getCodigo();
                
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                errolexico.getErrors().add(e.getLocalizedMessage());
                modeloLista.addElement(e.getLocalizedMessage());
            }
        }
        for (String errin : errolexico.getErrors()) {
            modeloLista.addElement(errin);
        }
        listaMensagens.setModel(modeloLista);

        if (modeloLista.isEmpty()) {
            modeloLista.addElement("VERYMUCHCOMPILED");

        }
    }//GEN-LAST:event_compiladorBotaoActionPerformed

    private void abrirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirBotaoActionPerformed

        JFileChooser fileChooser = new JFileChooser("C:\\Coisas");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos TXT & LANGUAGE", "txt", "LANGUAGE");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                String x = new String(Files.readAllBytes(file.toPath()));
                txtCodigo.setText(x);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Não Deu");
            }
        }
    }//GEN-LAST:event_abrirBotaoActionPerformed

    private void salvarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBotaoActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo LANGUAGE", "LANGUAGE");
        fc.addChoosableFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);

        int returnVal = fc.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try (FileWriter fw = new FileWriter(fc.getSelectedFile() + ".LANGUAGE")) {
                fw.write(txtCodigo.getText());
                fw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel salvar o arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_salvarBotaoActionPerformed

    private void tabelaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelaBotaoActionPerformed
        new Tabela(ids).setVisible(true);
    }//GEN-LAST:event_tabelaBotaoActionPerformed

    private void telaAssmblyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaAssmblyActionPerformed
        TelaAssamble telaAssamble = new TelaAssamble(codigoAssembly);
        telaAssamble.setSize(1024, 768);
        telaAssamble.setVisible(true);
    }//GEN-LAST:event_telaAssmblyActionPerformed

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
            java.util.logging.Logger.getLogger(ExecutarGramatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExecutarGramatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExecutarGramatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExecutarGramatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExecutarGramatica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirBotao;
    private javax.swing.JButton compiladorBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList<String> listaAvisos;
    private javax.swing.JList listaMensagens;
    private javax.swing.JTabbedPane panelAvisos;
    private javax.swing.JButton salvarBotao;
    private javax.swing.JButton tabelaBotao;
    private javax.swing.JButton telaAssmbly;
    private javax.swing.JTextArea txtCodigo;
    // End of variables declaration//GEN-END:variables
}
