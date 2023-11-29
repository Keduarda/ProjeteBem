package projetebem.Views;

import projetebem.Controllers.ProjetosController;
import projetebem.Controllers.SistemaController;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import projetebem.Models.UsuarioModel;

public class TelaInicial extends javax.swing.JFrame {

    private ProjetosController projetosController;
    private UsuarioModel usuarioLogado;
    
    public TelaInicial(UsuarioModel usuarioLogado) {
        initComponents();
        SistemaController.telaInicial = this;
        this.usuarioLogado = usuarioLogado;
        projetosController = new ProjetosController();
        popularTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        painelAdministrativo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAdministrativo = new javax.swing.JTable();
        botaoSalvarAdm = new javax.swing.JButton();
        painelComercial = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaComercial = new javax.swing.JTable();
        botaoSalvarComercial = new javax.swing.JButton();
        painelCompras = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCompras = new javax.swing.JTable();
        botaoSalvarCompras = new javax.swing.JButton();
        painelFinanceiro = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaFinanceiro = new javax.swing.JTable();
        botaoSalvarFinanceiro = new javax.swing.JButton();
        painelMarketing = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaMarketing = new javax.swing.JTable();
        botaoSalvarMarketing = new javax.swing.JButton();
        painelOperacoes = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaOperacoes = new javax.swing.JTable();
        botaoSalvarOperacoes = new javax.swing.JButton();
        painelRecursosHumanos = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaRecursosHumanos = new javax.swing.JTable();
        botaoSalvarRecursosHumanos = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        fundoTelaInicial = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcaoConfiguracoes = new javax.swing.JMenuItem();
        opcaoQuemSomos = new javax.swing.JMenuItem();
        opcaoDuvidas = new javax.swing.JMenuItem();
        opcaoContatos = new javax.swing.JMenuItem();
        opcaoCriarNovaTarefa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        TabbedPane.setForeground(new java.awt.Color(15, 46, 89));
        TabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabbedPaneMouseClicked(evt);
            }
        });

        painelAdministrativo.setBackground(new java.awt.Color(239, 216, 205));
        painelAdministrativo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(15, 46, 89));

        tabelaAdministrativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaAdministrativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da tarefa", "Descrição", "Data", "Setor", "Colaboradores", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaAdministrativo.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaAdministrativo.setRowHeight(40);
        tabelaAdministrativo.setSelectionBackground(new java.awt.Color(239, 216, 205));
        tabelaAdministrativo.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaAdministrativo);

        painelAdministrativo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 810, 490));

        botaoSalvarAdm.setBackground(new java.awt.Color(15, 46, 89));
        botaoSalvarAdm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoSalvarAdm.setForeground(new java.awt.Color(165, 191, 225));
        botaoSalvarAdm.setText("salvar");
        botaoSalvarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAdmActionPerformed(evt);
            }
        });
        painelAdministrativo.add(botaoSalvarAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 40));

        TabbedPane.addTab("administrativo", painelAdministrativo);

        painelComercial.setBackground(new java.awt.Color(239, 216, 205));
        painelComercial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(15, 46, 89));

        tabelaComercial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaComercial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da tarefa", "Descrição", "Data", "Setor", "Colaboradores", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaComercial.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaComercial.setRowHeight(40);
        tabelaComercial.setSelectionBackground(new java.awt.Color(239, 216, 205));
        tabelaComercial.setShowGrid(true);
        jScrollPane2.setViewportView(tabelaComercial);

        painelComercial.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 810, 490));

        botaoSalvarComercial.setBackground(new java.awt.Color(15, 46, 89));
        botaoSalvarComercial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoSalvarComercial.setForeground(new java.awt.Color(165, 191, 225));
        botaoSalvarComercial.setText("salvar");
        botaoSalvarComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarComercialActionPerformed(evt);
            }
        });
        painelComercial.add(botaoSalvarComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 40));

        TabbedPane.addTab("comercial", painelComercial);

        painelCompras.setBackground(new java.awt.Color(239, 216, 205));
        painelCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(15, 46, 89));

        tabelaCompras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da tarefa", "Descrição", "Data", "Setor", "Colaboradores", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCompras.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaCompras.setRowHeight(40);
        tabelaCompras.setSelectionBackground(new java.awt.Color(239, 216, 205));
        tabelaCompras.setShowGrid(true);
        jScrollPane3.setViewportView(tabelaCompras);

        painelCompras.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 810, 490));

        botaoSalvarCompras.setBackground(new java.awt.Color(15, 46, 89));
        botaoSalvarCompras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoSalvarCompras.setForeground(new java.awt.Color(165, 191, 225));
        botaoSalvarCompras.setText("salvar");
        botaoSalvarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarComprasActionPerformed(evt);
            }
        });
        painelCompras.add(botaoSalvarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 40));

        TabbedPane.addTab("compras", painelCompras);

        painelFinanceiro.setBackground(new java.awt.Color(239, 216, 205));
        painelFinanceiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBackground(new java.awt.Color(15, 46, 89));

        tabelaFinanceiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaFinanceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da tarefa", "Descrição", "Data", "Setor", "Colaboradores", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaFinanceiro.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaFinanceiro.setRowHeight(40);
        tabelaFinanceiro.setSelectionBackground(new java.awt.Color(239, 216, 205));
        tabelaFinanceiro.setShowGrid(true);
        jScrollPane4.setViewportView(tabelaFinanceiro);

        painelFinanceiro.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 810, 490));

        botaoSalvarFinanceiro.setBackground(new java.awt.Color(15, 46, 89));
        botaoSalvarFinanceiro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoSalvarFinanceiro.setForeground(new java.awt.Color(165, 191, 225));
        botaoSalvarFinanceiro.setText("salvar");
        botaoSalvarFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarFinanceiroActionPerformed(evt);
            }
        });
        painelFinanceiro.add(botaoSalvarFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 40));

        TabbedPane.addTab("financeiro", painelFinanceiro);

        painelMarketing.setBackground(new java.awt.Color(239, 216, 205));
        painelMarketing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBackground(new java.awt.Color(15, 46, 89));

        tabelaMarketing.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaMarketing.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da tarefa", "Descrição", "Data", "Setor", "Colaboradores", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaMarketing.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaMarketing.setRowHeight(40);
        tabelaMarketing.setSelectionBackground(new java.awt.Color(239, 216, 205));
        tabelaMarketing.setShowGrid(true);
        jScrollPane5.setViewportView(tabelaMarketing);

        painelMarketing.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 810, 490));

        botaoSalvarMarketing.setBackground(new java.awt.Color(15, 46, 89));
        botaoSalvarMarketing.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoSalvarMarketing.setForeground(new java.awt.Color(165, 191, 225));
        botaoSalvarMarketing.setText("salvar");
        botaoSalvarMarketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarMarketingActionPerformed(evt);
            }
        });
        painelMarketing.add(botaoSalvarMarketing, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 40));

        TabbedPane.addTab("marketing", painelMarketing);

        painelOperacoes.setBackground(new java.awt.Color(239, 216, 205));
        painelOperacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setBackground(new java.awt.Color(15, 46, 89));

        tabelaOperacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaOperacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da tarefa", "Descrição", "Data", "Setor", "Colaboradores", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaOperacoes.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaOperacoes.setRowHeight(40);
        tabelaOperacoes.setSelectionBackground(new java.awt.Color(239, 216, 205));
        tabelaOperacoes.setShowGrid(true);
        jScrollPane6.setViewportView(tabelaOperacoes);

        painelOperacoes.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 810, 490));

        botaoSalvarOperacoes.setBackground(new java.awt.Color(15, 46, 89));
        botaoSalvarOperacoes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoSalvarOperacoes.setForeground(new java.awt.Color(165, 191, 225));
        botaoSalvarOperacoes.setText("salvar");
        botaoSalvarOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarOperacoesActionPerformed(evt);
            }
        });
        painelOperacoes.add(botaoSalvarOperacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 40));

        TabbedPane.addTab("operacoes", painelOperacoes);

        painelRecursosHumanos.setBackground(new java.awt.Color(239, 216, 205));
        painelRecursosHumanos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane7.setBackground(new java.awt.Color(15, 46, 89));

        tabelaRecursosHumanos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaRecursosHumanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da tarefa", "Descrição", "Data", "Setor", "Colaboradores", "Completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaRecursosHumanos.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaRecursosHumanos.setRowHeight(40);
        tabelaRecursosHumanos.setSelectionBackground(new java.awt.Color(239, 216, 205));
        tabelaRecursosHumanos.setShowGrid(true);
        jScrollPane7.setViewportView(tabelaRecursosHumanos);

        painelRecursosHumanos.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 810, 490));

        botaoSalvarRecursosHumanos.setBackground(new java.awt.Color(15, 46, 89));
        botaoSalvarRecursosHumanos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoSalvarRecursosHumanos.setForeground(new java.awt.Color(165, 191, 225));
        botaoSalvarRecursosHumanos.setText("salvar");
        botaoSalvarRecursosHumanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarRecursosHumanosActionPerformed(evt);
            }
        });
        painelRecursosHumanos.add(botaoSalvarRecursosHumanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 40));

        TabbedPane.addTab("recursos humanos", painelRecursosHumanos);

        getContentPane().add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 870, 600));
        TabbedPane.getAccessibleContext().setAccessibleName("administrativo");
        TabbedPane.getAccessibleContext().setAccessibleDescription("");

        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 90, 20));
        botaoSair.setOpaque(false);
        botaoSair.setContentAreaFilled(false);
        botaoSair.setBorderPainted(false);

        fundoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoTelaInicial.png"))); // NOI18N
        getContentPane().add(fundoTelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 640));

        jMenuBar1.setForeground(new java.awt.Color(15, 46, 89));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(15, 46, 89));
        jMenu1.setText("opções");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        opcaoConfiguracoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcaoConfiguracoes.setForeground(new java.awt.Color(15, 46, 89));
        opcaoConfiguracoes.setText("configurações");
        opcaoConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoConfiguracoesActionPerformed(evt);
            }
        });
        jMenu1.add(opcaoConfiguracoes);

        opcaoQuemSomos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcaoQuemSomos.setForeground(new java.awt.Color(15, 46, 89));
        opcaoQuemSomos.setText("quem somos");
        opcaoQuemSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoQuemSomosActionPerformed(evt);
            }
        });
        jMenu1.add(opcaoQuemSomos);

        opcaoDuvidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcaoDuvidas.setForeground(new java.awt.Color(15, 46, 89));
        opcaoDuvidas.setText("dúvidas");
        opcaoDuvidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoDuvidasActionPerformed(evt);
            }
        });
        jMenu1.add(opcaoDuvidas);

        opcaoContatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcaoContatos.setForeground(new java.awt.Color(15, 46, 89));
        opcaoContatos.setText("lista de contatos");
        opcaoContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoContatosActionPerformed(evt);
            }
        });
        jMenu1.add(opcaoContatos);

        opcaoCriarNovaTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcaoCriarNovaTarefa.setForeground(new java.awt.Color(15, 46, 89));
        opcaoCriarNovaTarefa.setText("criar nova tarefa");
        opcaoCriarNovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCriarNovaTarefaActionPerformed(evt);
            }
        });
        jMenu1.add(opcaoCriarNovaTarefa);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoQuemSomosActionPerformed
        QuemSomos quemsomos = new QuemSomos();
        quemsomos.setVisible(true);
        this.hide();
        //QuemSomos quemsomos = new QuemSomos();
    }//GEN-LAST:event_opcaoQuemSomosActionPerformed

    private void opcaoCriarNovaTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCriarNovaTarefaActionPerformed
        CadastrarTarefa cadastrarTarefa = new CadastrarTarefa();
        cadastrarTarefa.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_opcaoCriarNovaTarefaActionPerformed

    private void opcaoConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoConfiguracoesActionPerformed
        Configuracoes configuracoes = new Configuracoes(usuarioLogado);
        configuracoes.setVisible(true);
        this.hide();
    }//GEN-LAST:event_opcaoConfiguracoesActionPerformed

    private void opcaoContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoContatosActionPerformed
        Contatos contatos = new Contatos();
        contatos.setVisible(true);
        this.hide();
    }//GEN-LAST:event_opcaoContatosActionPerformed

    private void TabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabbedPaneMouseClicked
        popularTabela();
    }//GEN-LAST:event_TabbedPaneMouseClicked

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        CertezaSair certezaSair = new CertezaSair();
        certezaSair.setVisible(true);
        
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoSalvarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAdmActionPerformed
       SalvarTabelaAdm();
    }//GEN-LAST:event_botaoSalvarAdmActionPerformed

    private void botaoSalvarComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarComercialActionPerformed
       SalvarTabelaComercial();
    }//GEN-LAST:event_botaoSalvarComercialActionPerformed

    private void botaoSalvarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarComprasActionPerformed
        SalvarTabelaCompras();
    }//GEN-LAST:event_botaoSalvarComprasActionPerformed

    private void botaoSalvarFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarFinanceiroActionPerformed
        SalvarTabelaFinanceiro();
    }//GEN-LAST:event_botaoSalvarFinanceiroActionPerformed

    private void botaoSalvarMarketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarMarketingActionPerformed
        SalvarTabelaMarketing(); 
    }//GEN-LAST:event_botaoSalvarMarketingActionPerformed

    private void botaoSalvarOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarOperacoesActionPerformed
        SalvarTabelaOperacoes();
    }//GEN-LAST:event_botaoSalvarOperacoesActionPerformed

    private void botaoSalvarRecursosHumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarRecursosHumanosActionPerformed
        SalvarTabelaRecursosHumanos();
    }//GEN-LAST:event_botaoSalvarRecursosHumanosActionPerformed

    private void opcaoDuvidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoDuvidasActionPerformed
        Duvidas duvidas = new Duvidas();
        duvidas.setVisible(true);
        this.hide();
    }//GEN-LAST:event_opcaoDuvidasActionPerformed

    private void popularTabela(){
        try{
            //System.out.println(TabbedPane.getTitleAt(TabbedPane.getSelectedIndex()));
            switch(TabbedPane.getTitleAt(TabbedPane.getSelectedIndex())){
                case "administrativo":
                    DefaultTableModel model = (DefaultTableModel) tabelaAdministrativo.getModel();
                    model.setRowCount(0);
                    ResultSet rs = projetosController.listarAdministrativo();
                    
                    while(rs.next()){
                        Object[] rowData = {
                            rs.getObject(2),
                            rs.getObject(3),
                            rs.getObject(4),
                            rs.getObject(5),
                            rs.getObject(6),
                            rs.getBoolean(7)
                        };    
                        
                        model.addRow(rowData);
                    }
                    
                    break;
                case "comercial":
                    DefaultTableModel model2 = (DefaultTableModel) tabelaComercial.getModel();
                    model2.setRowCount(0);
                    ResultSet rs2 = projetosController.listarComercial();
                    
                    while(rs2.next()){
                        Object[] rowData = {
                            rs2.getObject(2),
                            rs2.getObject(3),
                            rs2.getObject(4),
                            rs2.getObject(5),
                            rs2.getObject(6),
                            rs2.getObject(7)
                        };    
                        
                        model2.addRow(rowData);
                    }
                    break;
                case "compras":
                    DefaultTableModel model3 = (DefaultTableModel) tabelaCompras.getModel();
                    model3.setRowCount(0);
                    ResultSet rs3 = projetosController.listarCompras();
                    
                    while(rs3.next()){
                        Object[] rowData = {
                            rs3.getObject(2),
                            rs3.getObject(3),
                            rs3.getObject(4),
                            rs3.getObject(5),
                            rs3.getObject(6),
                            rs3.getObject(7)
                        };    
                        
                        model3.addRow(rowData);
                    }
                    break;
                case "financeiro":
                    DefaultTableModel model4 = (DefaultTableModel) tabelaFinanceiro.getModel();
                    model4.setRowCount(0);
                    ResultSet rs4 = projetosController.listarFinanceiro();
                    
                    while(rs4.next()){
                        Object[] rowData = {
                            rs4.getObject(2),
                            rs4.getObject(3),
                            rs4.getObject(4),
                            rs4.getObject(5),
                            rs4.getObject(6),
                            rs4.getObject(7)
                        };    
                        
                        model4.addRow(rowData);
                    }
                    break;
                case "marketing":
                    DefaultTableModel model5 = (DefaultTableModel) tabelaMarketing.getModel();
                    model5.setRowCount(0);
                    ResultSet rs5 = projetosController.listarMarketing();
                    
                    while(rs5.next()){
                        Object[] rowData = {
                            rs5.getObject(2),
                            rs5.getObject(3),
                            rs5.getObject(4),
                            rs5.getObject(5),
                            rs5.getObject(6),
                            rs5.getObject(7)
                        };    
                        
                        model5.addRow(rowData);
                    }
                    break;
                case "operacoes":
                    DefaultTableModel model6 = (DefaultTableModel) tabelaOperacoes.getModel();
                    model6.setRowCount(0);
                    ResultSet rs6 = projetosController.listarOperacoes();
                    
                    while(rs6.next()){
                        Object[] rowData = {
                            rs6.getObject(2),
                            rs6.getObject(3),
                            rs6.getObject(4),
                            rs6.getObject(5),
                            rs6.getObject(6),
                            rs6.getObject(7)
                        };    
                        
                        model6.addRow(rowData);
                    }
                    break;
                case "recursos humanos":
                    DefaultTableModel model7 = (DefaultTableModel) tabelaRecursosHumanos.getModel();
                    model7.setRowCount(0);
                    ResultSet rs7 = projetosController.listarRecursosHumanos();
                    
                    while(rs7.next()){
                        Object[] rowData = {
                            rs7.getObject(2),
                            rs7.getObject(3),
                            rs7.getObject(4),
                            rs7.getObject(5),
                            rs7.getObject(6),
                            rs7.getObject(7)
                        };    
                        
                        model7.addRow(rowData);
                    }
                    break;  
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void SalvarTabelaAdm() {
        DefaultTableModel model = (DefaultTableModel) tabelaAdministrativo.getModel();
        int linha = 0;
        ResultSet rsAdm = projetosController.listarAdministrativo();
        ProjetosController proj = new ProjetosController();
        try {
            while(rsAdm.next()){
                int completo = 0;
                if((Boolean)model.getValueAt(linha, 5)) completo =1;
                proj.editarProjeto("administrativo",(int)rsAdm.getObject(1), (String)model.getValueAt(linha, 0), (String)model.getValueAt(linha, 1), (String)model.getValueAt(linha, 2),(String)model.getValueAt(linha, 3), (String)model.getValueAt(linha, 4), completo);
                linha++;
                //System.out.println("Valores: ID:" +(int)rsAdm.getObject(1) +"\n nome:" +(String)model.getValueAt(linha, 0)+ "\n descricao:" + (String)model.getValueAt(linha, 1)+"\n data:" + (String)model.getValueAt(linha, 2)+"\n setor:" +(String)model.getValueAt(linha, 3)+", nome:" +(String)model.getValueAt(linha, 4)+"\n completo:" +completo);
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    private void SalvarTabelaComercial() {
        DefaultTableModel model = (DefaultTableModel) tabelaComercial.getModel();
        int linha = 0;
        ResultSet rsComercial = projetosController.listarComercial();
        ProjetosController proj = new ProjetosController();
        try {
            while(rsComercial.next()){
                int completo = 0;
                if((Boolean)model.getValueAt(linha, 5)) completo =1;
                proj.editarProjeto("comercial",(int)rsComercial.getObject(1), (String)model.getValueAt(linha, 0), (String)model.getValueAt(linha, 1), (String)model.getValueAt(linha, 2),(String)model.getValueAt(linha, 3), (String)model.getValueAt(linha, 4), completo);
                linha++;
                //System.out.println("Valores: ID:" +(int)rsAdm.getObject(1) +"\n nome:" +(String)model.getValueAt(linha, 0)+ "\n descricao:" + (String)model.getValueAt(linha, 1)+"\n data:" + (String)model.getValueAt(linha, 2)+"\n setor:" +(String)model.getValueAt(linha, 3)+", nome:" +(String)model.getValueAt(linha, 4)+"\n completo:" +completo);
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    private void SalvarTabelaCompras() {
        DefaultTableModel model = (DefaultTableModel) tabelaCompras.getModel();
        int linha = 0;
        ResultSet rsCompras = projetosController.listarCompras();
        ProjetosController proj = new ProjetosController();
        try {
            while(rsCompras.next()){
                int completo = 0;
                if((Boolean)model.getValueAt(linha, 5)) completo =1;
                proj.editarProjeto("compras",(int)rsCompras.getObject(1), (String)model.getValueAt(linha, 0), (String)model.getValueAt(linha, 1), (String)model.getValueAt(linha, 2),(String)model.getValueAt(linha, 3), (String)model.getValueAt(linha, 4), completo);
                linha++;
                //System.out.println("Valores: ID:" +(int)rsAdm.getObject(1) +"\n nome:" +(String)model.getValueAt(linha, 0)+ "\n descricao:" + (String)model.getValueAt(linha, 1)+"\n data:" + (String)model.getValueAt(linha, 2)+"\n setor:" +(String)model.getValueAt(linha, 3)+", nome:" +(String)model.getValueAt(linha, 4)+"\n completo:" +completo);
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    private void SalvarTabelaFinanceiro() {
        DefaultTableModel model = (DefaultTableModel) tabelaFinanceiro.getModel();
        int linha = 0;
        ResultSet rsFinanceiro = projetosController.listarFinanceiro();
        ProjetosController proj = new ProjetosController();
        try {
            while(rsFinanceiro.next()){
                int completo = 0;
                if((Boolean)model.getValueAt(linha, 5)) completo =1;
                proj.editarProjeto("financeiro",(int)rsFinanceiro.getObject(1), (String)model.getValueAt(linha, 0), (String)model.getValueAt(linha, 1), (String)model.getValueAt(linha, 2),(String)model.getValueAt(linha, 3), (String)model.getValueAt(linha, 4), completo);
                linha++;
                //System.out.println("Valores: ID:" +(int)rsAdm.getObject(1) +"\n nome:" +(String)model.getValueAt(linha, 0)+ "\n descricao:" + (String)model.getValueAt(linha, 1)+"\n data:" + (String)model.getValueAt(linha, 2)+"\n setor:" +(String)model.getValueAt(linha, 3)+", nome:" +(String)model.getValueAt(linha, 4)+"\n completo:" +completo);
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    private void SalvarTabelaMarketing() {
        DefaultTableModel model = (DefaultTableModel) tabelaMarketing.getModel();
        int linha = 0;
        ResultSet rsMarketing = projetosController.listarMarketing();
        ProjetosController proj = new ProjetosController();
        try {
            while(rsMarketing.next()){
                int completo = 0;
                if((Boolean)model.getValueAt(linha, 5)) completo =1;
                proj.editarProjeto("marketing",(int)rsMarketing.getObject(1), (String)model.getValueAt(linha, 0), (String)model.getValueAt(linha, 1), (String)model.getValueAt(linha, 2),(String)model.getValueAt(linha, 3), (String)model.getValueAt(linha, 4), completo);
                linha++;
                //System.out.println("Valores: ID:" +(int)rsAdm.getObject(1) +"\n nome:" +(String)model.getValueAt(linha, 0)+ "\n descricao:" + (String)model.getValueAt(linha, 1)+"\n data:" + (String)model.getValueAt(linha, 2)+"\n setor:" +(String)model.getValueAt(linha, 3)+", nome:" +(String)model.getValueAt(linha, 4)+"\n completo:" +completo);
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    private void SalvarTabelaOperacoes() {
        DefaultTableModel model = (DefaultTableModel) tabelaOperacoes.getModel();
        int linha = 0;
        ResultSet rsOperacoes = projetosController.listarOperacoes();
        ProjetosController proj = new ProjetosController();
        try {
            while(rsOperacoes.next()){
                int completo = 0;
                if((Boolean)model.getValueAt(linha, 5)) completo =1;
                proj.editarProjeto("operacoes",(int)rsOperacoes.getObject(1), (String)model.getValueAt(linha, 0), (String)model.getValueAt(linha, 1), (String)model.getValueAt(linha, 2),(String)model.getValueAt(linha, 3), (String)model.getValueAt(linha, 4), completo);
                linha++;
                //System.out.println("Valores: ID:" +(int)rsAdm.getObject(1) +"\n nome:" +(String)model.getValueAt(linha, 0)+ "\n descricao:" + (String)model.getValueAt(linha, 1)+"\n data:" + (String)model.getValueAt(linha, 2)+"\n setor:" +(String)model.getValueAt(linha, 3)+", nome:" +(String)model.getValueAt(linha, 4)+"\n completo:" +completo);
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    private void SalvarTabelaRecursosHumanos() {
        DefaultTableModel model = (DefaultTableModel) tabelaRecursosHumanos.getModel();
        int linha = 0;
        ResultSet rsRecursosHumanos = projetosController.listarRecursosHumanos();
        ProjetosController proj = new ProjetosController();
        try {
            while(rsRecursosHumanos.next()){
                int completo = 0;
                if((Boolean)model.getValueAt(linha, 5)) completo =1;
                proj.editarProjeto("recursoshumanos",(int)rsRecursosHumanos.getObject(1), (String)model.getValueAt(linha, 0), (String)model.getValueAt(linha, 1), (String)model.getValueAt(linha, 2),(String)model.getValueAt(linha, 3), (String)model.getValueAt(linha, 4), completo);
                linha++;
                //System.out.println("Valores: ID:" +(int)rsAdm.getObject(1) +"\n nome:" +(String)model.getValueAt(linha, 0)+ "\n descricao:" + (String)model.getValueAt(linha, 1)+"\n data:" + (String)model.getValueAt(linha, 2)+"\n setor:" +(String)model.getValueAt(linha, 3)+", nome:" +(String)model.getValueAt(linha, 4)+"\n completo:" +completo);
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvarAdm;
    private javax.swing.JButton botaoSalvarComercial;
    private javax.swing.JButton botaoSalvarCompras;
    private javax.swing.JButton botaoSalvarFinanceiro;
    private javax.swing.JButton botaoSalvarMarketing;
    private javax.swing.JButton botaoSalvarOperacoes;
    private javax.swing.JButton botaoSalvarRecursosHumanos;
    private javax.swing.JLabel fundoTelaInicial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JMenuItem opcaoConfiguracoes;
    private javax.swing.JMenuItem opcaoContatos;
    private javax.swing.JMenuItem opcaoCriarNovaTarefa;
    private javax.swing.JMenuItem opcaoDuvidas;
    private javax.swing.JMenuItem opcaoQuemSomos;
    private javax.swing.JPanel painelAdministrativo;
    private javax.swing.JPanel painelComercial;
    private javax.swing.JPanel painelCompras;
    private javax.swing.JPanel painelFinanceiro;
    private javax.swing.JPanel painelMarketing;
    private javax.swing.JPanel painelOperacoes;
    private javax.swing.JPanel painelRecursosHumanos;
    private javax.swing.JTable tabelaAdministrativo;
    private javax.swing.JTable tabelaComercial;
    private javax.swing.JTable tabelaCompras;
    private javax.swing.JTable tabelaFinanceiro;
    private javax.swing.JTable tabelaMarketing;
    private javax.swing.JTable tabelaOperacoes;
    private javax.swing.JTable tabelaRecursosHumanos;
    // End of variables declaration//GEN-END:variables
}
