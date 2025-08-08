
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainMenu extends javax.swing.JFrame {
    int processCount = 3;
    int timeQuantum = 1;
    int forRoundRobin = 0;
    int newCount = 0;
    int count;
    int inputMode = 0;
    JPanel[] panels = new JPanel[20];
    JPanel[] randPanels = new JPanel[20];
    JComboBox[] combos = new JComboBox[20];
    JLabel[] burst = new JLabel[20];
    JLabel[] arrival = new JLabel[20];
    JLabel[] prio = new JLabel[20];
    JPanel[] out = new JPanel[20];
    String[][] tokens = new String[20][5];
    JFileChooser fc = new JFileChooser("./");
    FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
    String message;
    
    public MainMenu() {
        initComponents();
        addToArray();
        this.setSize(new Dimension(1280,750));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        inputProcessPanel.setVisible(false);
        manualDataPanel.setVisible(false);
        chooseInputPanel.setVisible(false);
        randomDataPanel.setVisible(false);
        chooseAlgo.setVisible(false);
        outputPanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        helpButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        exitButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        outputPanel = new javax.swing.JPanel();
        labOut1 = new javax.swing.JLabel();
        labOut7 = new javax.swing.JLabel();
        labOut2 = new javax.swing.JLabel();
        labOut6 = new javax.swing.JLabel();
        labOut5 = new javax.swing.JLabel();
        labOut4 = new javax.swing.JLabel();
        labOut3 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        outputPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        burstOut3 = new javax.swing.JLabel();
        arrivalOut3 = new javax.swing.JLabel();
        prioOut3 = new javax.swing.JLabel();
        waitTime3 = new javax.swing.JLabel();
        turnTime3 = new javax.swing.JLabel();
        ave3 = new javax.swing.JLabel();
        outputPanel2 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        burstOut2 = new javax.swing.JLabel();
        arrivalOut2 = new javax.swing.JLabel();
        prioOut2 = new javax.swing.JLabel();
        waitTime2 = new javax.swing.JLabel();
        turnTime2 = new javax.swing.JLabel();
        ave2 = new javax.swing.JLabel();
        outputPanel1 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        burstOut1 = new javax.swing.JLabel();
        arrivalOut1 = new javax.swing.JLabel();
        prioOut1 = new javax.swing.JLabel();
        waitTime1 = new javax.swing.JLabel();
        turnTime1 = new javax.swing.JLabel();
        ave1 = new javax.swing.JLabel();
        outputPanel4 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        burstOut4 = new javax.swing.JLabel();
        arrivalOut4 = new javax.swing.JLabel();
        prioOut4 = new javax.swing.JLabel();
        waitTime4 = new javax.swing.JLabel();
        turnTime4 = new javax.swing.JLabel();
        ave4 = new javax.swing.JLabel();
        outputPanel5 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        burstOut5 = new javax.swing.JLabel();
        arrivalOut5 = new javax.swing.JLabel();
        prioOut5 = new javax.swing.JLabel();
        waitTime5 = new javax.swing.JLabel();
        turnTime5 = new javax.swing.JLabel();
        ave5 = new javax.swing.JLabel();
        outputPanel6 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        burstOut6 = new javax.swing.JLabel();
        arrivalOut6 = new javax.swing.JLabel();
        prioOut6 = new javax.swing.JLabel();
        waitTime6 = new javax.swing.JLabel();
        turnTime6 = new javax.swing.JLabel();
        ave6 = new javax.swing.JLabel();
        outputPanel7 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        burstOut7 = new javax.swing.JLabel();
        arrivalOut7 = new javax.swing.JLabel();
        prioOut7 = new javax.swing.JLabel();
        waitTime7 = new javax.swing.JLabel();
        turnTime7 = new javax.swing.JLabel();
        ave7 = new javax.swing.JLabel();
        outputPanel8 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        burstOut8 = new javax.swing.JLabel();
        arrivalOut8 = new javax.swing.JLabel();
        prioOut8 = new javax.swing.JLabel();
        waitTime8 = new javax.swing.JLabel();
        turnTime8 = new javax.swing.JLabel();
        ave8 = new javax.swing.JLabel();
        outputPanel9 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        burstOut9 = new javax.swing.JLabel();
        arrivalOut9 = new javax.swing.JLabel();
        prioOut9 = new javax.swing.JLabel();
        waitTime9 = new javax.swing.JLabel();
        turnTime9 = new javax.swing.JLabel();
        ave9 = new javax.swing.JLabel();
        outputPanel10 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        burstOut10 = new javax.swing.JLabel();
        arrivalOut10 = new javax.swing.JLabel();
        prioOut10 = new javax.swing.JLabel();
        waitTime10 = new javax.swing.JLabel();
        turnTime10 = new javax.swing.JLabel();
        ave10 = new javax.swing.JLabel();
        outputPanel11 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        burstOut11 = new javax.swing.JLabel();
        arrivalOut11 = new javax.swing.JLabel();
        prioOut11 = new javax.swing.JLabel();
        waitTime11 = new javax.swing.JLabel();
        turnTime11 = new javax.swing.JLabel();
        ave11 = new javax.swing.JLabel();
        outputPanel12 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        burstOut12 = new javax.swing.JLabel();
        arrivalOut12 = new javax.swing.JLabel();
        prioOut12 = new javax.swing.JLabel();
        waitTime12 = new javax.swing.JLabel();
        turnTime12 = new javax.swing.JLabel();
        ave12 = new javax.swing.JLabel();
        outputPanel13 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        burstOut13 = new javax.swing.JLabel();
        arrivalOut13 = new javax.swing.JLabel();
        prioOut13 = new javax.swing.JLabel();
        waitTime13 = new javax.swing.JLabel();
        turnTime13 = new javax.swing.JLabel();
        ave13 = new javax.swing.JLabel();
        outputPanel14 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        burstOut14 = new javax.swing.JLabel();
        arrivalOut14 = new javax.swing.JLabel();
        prioOut14 = new javax.swing.JLabel();
        waitTime14 = new javax.swing.JLabel();
        turnTime14 = new javax.swing.JLabel();
        ave14 = new javax.swing.JLabel();
        outputPanel15 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        burstOut15 = new javax.swing.JLabel();
        arrivalOut15 = new javax.swing.JLabel();
        prioOut15 = new javax.swing.JLabel();
        waitTime15 = new javax.swing.JLabel();
        turnTime15 = new javax.swing.JLabel();
        ave15 = new javax.swing.JLabel();
        outputPanel16 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        burstOut16 = new javax.swing.JLabel();
        arrivalOut16 = new javax.swing.JLabel();
        prioOut16 = new javax.swing.JLabel();
        waitTime16 = new javax.swing.JLabel();
        turnTime16 = new javax.swing.JLabel();
        ave16 = new javax.swing.JLabel();
        outputPanel17 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        burstOut17 = new javax.swing.JLabel();
        arrivalOut17 = new javax.swing.JLabel();
        prioOut17 = new javax.swing.JLabel();
        waitTime17 = new javax.swing.JLabel();
        turnTime17 = new javax.swing.JLabel();
        ave17 = new javax.swing.JLabel();
        outputPanel18 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        burstOut18 = new javax.swing.JLabel();
        arrivalOut18 = new javax.swing.JLabel();
        prioOut18 = new javax.swing.JLabel();
        waitTime18 = new javax.swing.JLabel();
        turnTime18 = new javax.swing.JLabel();
        ave18 = new javax.swing.JLabel();
        outputPanel19 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        burstOut19 = new javax.swing.JLabel();
        arrivalOut19 = new javax.swing.JLabel();
        prioOut19 = new javax.swing.JLabel();
        waitTime19 = new javax.swing.JLabel();
        turnTime19 = new javax.swing.JLabel();
        ave19 = new javax.swing.JLabel();
        outputPanel20 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        burstOut20 = new javax.swing.JLabel();
        arrivalOut20 = new javax.swing.JLabel();
        prioOut20 = new javax.swing.JLabel();
        waitTime20 = new javax.swing.JLabel();
        turnTime20 = new javax.swing.JLabel();
        ave20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chooseAlgo = new javax.swing.JPanel();
        fcfs = new javax.swing.JButton();
        rr = new javax.swing.JButton();
        sjfp = new javax.swing.JButton();
        sjfnp = new javax.swing.JButton();
        prionp = new javax.swing.JButton();
        priop = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inputProcessPanel = new javax.swing.JPanel();
        decButton = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        incButton = new javax.swing.JLabel();
        showNumOfProc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chooseInputPanel = new javax.swing.JPanel();
        randomInput = new javax.swing.JButton();
        manualInput = new javax.swing.JButton();
        fileInput = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        randomDataPanel = new javax.swing.JPanel();
        priorityLabel3 = new javax.swing.JLabel();
        arrivalLabel3 = new javax.swing.JLabel();
        burstLabel3 = new javax.swing.JLabel();
        solve1 = new javax.swing.JButton();
        processRandPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        burst1 = new javax.swing.JLabel();
        arrival1 = new javax.swing.JLabel();
        prio1 = new javax.swing.JLabel();
        processRandPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        burst2 = new javax.swing.JLabel();
        prio2 = new javax.swing.JLabel();
        arrival2 = new javax.swing.JLabel();
        processRandPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        prio3 = new javax.swing.JLabel();
        arrival3 = new javax.swing.JLabel();
        burst3 = new javax.swing.JLabel();
        processRandPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        prio4 = new javax.swing.JLabel();
        arrival4 = new javax.swing.JLabel();
        burst4 = new javax.swing.JLabel();
        processRandPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        burst5 = new javax.swing.JLabel();
        prio5 = new javax.swing.JLabel();
        arrival5 = new javax.swing.JLabel();
        processRandPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        burst6 = new javax.swing.JLabel();
        arrival6 = new javax.swing.JLabel();
        prio6 = new javax.swing.JLabel();
        processRandPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        burst7 = new javax.swing.JLabel();
        arrival7 = new javax.swing.JLabel();
        prio7 = new javax.swing.JLabel();
        processRandPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        burst8 = new javax.swing.JLabel();
        arrival8 = new javax.swing.JLabel();
        prio8 = new javax.swing.JLabel();
        processRandPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        prio9 = new javax.swing.JLabel();
        arrival9 = new javax.swing.JLabel();
        burst9 = new javax.swing.JLabel();
        processRandPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        burst10 = new javax.swing.JLabel();
        arrival10 = new javax.swing.JLabel();
        prio10 = new javax.swing.JLabel();
        processRandPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        prio11 = new javax.swing.JLabel();
        arrival11 = new javax.swing.JLabel();
        burst11 = new javax.swing.JLabel();
        processRandPanel12 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        burst12 = new javax.swing.JLabel();
        prio12 = new javax.swing.JLabel();
        arrival12 = new javax.swing.JLabel();
        processRandPanel13 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        prio13 = new javax.swing.JLabel();
        burst13 = new javax.swing.JLabel();
        arrival13 = new javax.swing.JLabel();
        processRandPanel14 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        prio14 = new javax.swing.JLabel();
        burst14 = new javax.swing.JLabel();
        arrival14 = new javax.swing.JLabel();
        processRandPanel15 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        prio15 = new javax.swing.JLabel();
        arrival15 = new javax.swing.JLabel();
        burst15 = new javax.swing.JLabel();
        processRandPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        arrival16 = new javax.swing.JLabel();
        prio16 = new javax.swing.JLabel();
        burst16 = new javax.swing.JLabel();
        processRandPanel17 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        prio17 = new javax.swing.JLabel();
        burst17 = new javax.swing.JLabel();
        arrival17 = new javax.swing.JLabel();
        processRandPanel18 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        burst18 = new javax.swing.JLabel();
        prio18 = new javax.swing.JLabel();
        arrival18 = new javax.swing.JLabel();
        processRandPanel19 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        burst19 = new javax.swing.JLabel();
        prio19 = new javax.swing.JLabel();
        arrival19 = new javax.swing.JLabel();
        processRandPanel20 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        arrival20 = new javax.swing.JLabel();
        burst20 = new javax.swing.JLabel();
        prio20 = new javax.swing.JLabel();
        burstLabel4 = new javax.swing.JLabel();
        arrivalLabel4 = new javax.swing.JLabel();
        priorityLabel4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        manualDataPanel = new javax.swing.JPanel();
        priorityLabel1 = new javax.swing.JLabel();
        arrivalLabel1 = new javax.swing.JLabel();
        burstLabel1 = new javax.swing.JLabel();
        solve = new javax.swing.JButton();
        processPanel1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        priorityP1 = new javax.swing.JComboBox<>();
        arrivalP1 = new javax.swing.JSpinner();
        burstP1 = new javax.swing.JSpinner();
        processPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        priorityP2 = new javax.swing.JComboBox<>();
        arrivalP2 = new javax.swing.JSpinner();
        burstP2 = new javax.swing.JSpinner();
        processPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        priorityP3 = new javax.swing.JComboBox<>();
        arrivalP3 = new javax.swing.JSpinner();
        burstP3 = new javax.swing.JSpinner();
        processPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        priorityP4 = new javax.swing.JComboBox<>();
        arrivalP4 = new javax.swing.JSpinner();
        burstP4 = new javax.swing.JSpinner();
        processPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        priorityP5 = new javax.swing.JComboBox<>();
        arrivalP5 = new javax.swing.JSpinner();
        burstP5 = new javax.swing.JSpinner();
        processPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        priorityP6 = new javax.swing.JComboBox<>();
        arrivalP6 = new javax.swing.JSpinner();
        burstP6 = new javax.swing.JSpinner();
        processPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        priorityP7 = new javax.swing.JComboBox<>();
        arrivalP7 = new javax.swing.JSpinner();
        burstP7 = new javax.swing.JSpinner();
        processPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        priorityP8 = new javax.swing.JComboBox<>();
        arrivalP8 = new javax.swing.JSpinner();
        burstP8 = new javax.swing.JSpinner();
        processPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        priorityP9 = new javax.swing.JComboBox<>();
        arrivalP9 = new javax.swing.JSpinner();
        burstP9 = new javax.swing.JSpinner();
        processPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        priorityP10 = new javax.swing.JComboBox<>();
        arrivalP10 = new javax.swing.JSpinner();
        burstP10 = new javax.swing.JSpinner();
        processPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        priorityP11 = new javax.swing.JComboBox<>();
        arrivalP11 = new javax.swing.JSpinner();
        burstP11 = new javax.swing.JSpinner();
        processPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        priorityP12 = new javax.swing.JComboBox<>();
        arrivalP12 = new javax.swing.JSpinner();
        burstP12 = new javax.swing.JSpinner();
        processPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        priorityP13 = new javax.swing.JComboBox<>();
        arrivalP13 = new javax.swing.JSpinner();
        burstP13 = new javax.swing.JSpinner();
        processPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        priorityP14 = new javax.swing.JComboBox<>();
        arrivalP14 = new javax.swing.JSpinner();
        burstP14 = new javax.swing.JSpinner();
        processPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        priorityP15 = new javax.swing.JComboBox<>();
        arrivalP15 = new javax.swing.JSpinner();
        burstP15 = new javax.swing.JSpinner();
        processPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        priorityP16 = new javax.swing.JComboBox<>();
        arrivalP16 = new javax.swing.JSpinner();
        burstP16 = new javax.swing.JSpinner();
        processPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        priorityP17 = new javax.swing.JComboBox<>();
        arrivalP17 = new javax.swing.JSpinner();
        burstP17 = new javax.swing.JSpinner();
        processPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        priorityP18 = new javax.swing.JComboBox<>();
        arrivalP18 = new javax.swing.JSpinner();
        burstP18 = new javax.swing.JSpinner();
        processPanel19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        priorityP19 = new javax.swing.JComboBox<>();
        arrivalP19 = new javax.swing.JSpinner();
        burstP19 = new javax.swing.JSpinner();
        processPanel20 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        priorityP20 = new javax.swing.JComboBox<>();
        arrivalP20 = new javax.swing.JSpinner();
        burstP20 = new javax.swing.JSpinner();
        burstLabel2 = new javax.swing.JLabel();
        arrivalLabel2 = new javax.swing.JLabel();
        priorityLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        MainPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helpButton.setBackground(new java.awt.Color(255, 153, 0));
        helpButton.setFont(new Font("Mansory", Font.PLAIN, 30));
        helpButton.setText("Help");
        helpButton.setBorder(null);
        helpButton.setBorderPainted(false);
        helpButton.setFocusPainted(false);
        helpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpButtonMouseExited(evt);
            }
        });
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        MainPanel.add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 160, 60));

        startButton.setBackground(new java.awt.Color(255, 153, 0));
        startButton.setFont(new Font("Mansory", Font.PLAIN, 30));
        startButton.setText("Start");
        startButton.setBorder(null);
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButtonMouseExited(evt);
            }
        });
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        MainPanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 160, 60));

        exitButton.setFont(new Font("Mansory", Font.PLAIN, 30));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exitButton.setText("EXIT");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        MainPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 640, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bground.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setFocusable(false);
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1279, -1));

        outputPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        outputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labOut1.setForeground(new java.awt.Color(255, 255, 255));
        labOut1.setText("Process ID");
        outputPanel.add(labOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 100, -1));

        labOut7.setForeground(new java.awt.Color(255, 255, 255));
        labOut7.setText("Ave Turnaround Time");
        outputPanel.add(labOut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, -1, -1));

        labOut2.setForeground(new java.awt.Color(255, 255, 255));
        labOut2.setText("Burst Time");
        outputPanel.add(labOut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        labOut6.setForeground(new java.awt.Color(255, 255, 255));
        labOut6.setText("Turnaround Time");
        outputPanel.add(labOut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 310, -1, -1));

        labOut5.setForeground(new java.awt.Color(255, 255, 255));
        labOut5.setText("Waiting Time");
        outputPanel.add(labOut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, -1, -1));

        labOut4.setForeground(new java.awt.Color(255, 255, 255));
        labOut4.setText("Priority #");
        outputPanel.add(labOut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        labOut3.setForeground(new java.awt.Color(255, 255, 255));
        labOut3.setText("Arrival Time");
        outputPanel.add(labOut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Burst Time");
        outputPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Process ID");
        outputPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, -1));

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Arrival Time");
        outputPanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        outputPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 30, 340));

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Priority #");
        outputPanel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Waiting Time");
        outputPanel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Turnaround Time");
        outputPanel.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Ave Turnaround Time");
        outputPanel.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        outputPanel3.setOpaque(false);

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("3");

        burstOut3.setBackground(new java.awt.Color(0, 0, 0));
        burstOut3.setForeground(new java.awt.Color(255, 255, 255));
        burstOut3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut3.setText("20");

        arrivalOut3.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut3.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut3.setText("20");

        prioOut3.setBackground(new java.awt.Color(0, 0, 0));
        prioOut3.setForeground(new java.awt.Color(255, 255, 255));
        prioOut3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut3.setText("20");

        waitTime3.setBackground(new java.awt.Color(0, 0, 0));
        waitTime3.setForeground(new java.awt.Color(255, 255, 255));
        waitTime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime3.setText("20");

        turnTime3.setBackground(new java.awt.Color(0, 0, 0));
        turnTime3.setForeground(new java.awt.Color(255, 255, 255));
        turnTime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime3.setText("20");

        ave3.setBackground(new java.awt.Color(0, 0, 0));
        ave3.setForeground(new java.awt.Color(255, 255, 255));
        ave3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave3.setText("20");

        javax.swing.GroupLayout outputPanel3Layout = new javax.swing.GroupLayout(outputPanel3);
        outputPanel3.setLayout(outputPanel3Layout);
        outputPanel3Layout.setHorizontalGroup(
            outputPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel3Layout.createSequentialGroup()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel3Layout.setVerticalGroup(
            outputPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel51)
                .addComponent(burstOut3)
                .addComponent(arrivalOut3)
                .addComponent(prioOut3)
                .addComponent(waitTime3)
                .addComponent(turnTime3)
                .addComponent(ave3))
        );

        outputPanel.add(outputPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 600, 20));

        outputPanel2.setOpaque(false);

        jLabel50.setBackground(new java.awt.Color(0, 0, 0));
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("2");

        burstOut2.setBackground(new java.awt.Color(0, 0, 0));
        burstOut2.setForeground(new java.awt.Color(255, 255, 255));
        burstOut2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut2.setText("20");

        arrivalOut2.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut2.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut2.setText("20");

        prioOut2.setBackground(new java.awt.Color(0, 0, 0));
        prioOut2.setForeground(new java.awt.Color(255, 255, 255));
        prioOut2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut2.setText("20");

        waitTime2.setBackground(new java.awt.Color(0, 0, 0));
        waitTime2.setForeground(new java.awt.Color(255, 255, 255));
        waitTime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime2.setText("20");

        turnTime2.setBackground(new java.awt.Color(0, 0, 0));
        turnTime2.setForeground(new java.awt.Color(255, 255, 255));
        turnTime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime2.setText("20");

        ave2.setBackground(new java.awt.Color(0, 0, 0));
        ave2.setForeground(new java.awt.Color(255, 255, 255));
        ave2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave2.setText("20");

        javax.swing.GroupLayout outputPanel2Layout = new javax.swing.GroupLayout(outputPanel2);
        outputPanel2.setLayout(outputPanel2Layout);
        outputPanel2Layout.setHorizontalGroup(
            outputPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel2Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel2Layout.setVerticalGroup(
            outputPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel50)
                .addComponent(burstOut2)
                .addComponent(arrivalOut2)
                .addComponent(prioOut2)
                .addComponent(waitTime2)
                .addComponent(turnTime2)
                .addComponent(ave2))
        );

        outputPanel.add(outputPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 600, 20));

        outputPanel1.setOpaque(false);

        jLabel49.setBackground(new java.awt.Color(0, 0, 0));
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("1");

        burstOut1.setBackground(new java.awt.Color(0, 0, 0));
        burstOut1.setForeground(new java.awt.Color(255, 255, 255));
        burstOut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut1.setText("20");

        arrivalOut1.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut1.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut1.setText("20");

        prioOut1.setBackground(new java.awt.Color(0, 0, 0));
        prioOut1.setForeground(new java.awt.Color(255, 255, 255));
        prioOut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut1.setText("20");

        waitTime1.setBackground(new java.awt.Color(0, 0, 0));
        waitTime1.setForeground(new java.awt.Color(255, 255, 255));
        waitTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime1.setText("20");

        turnTime1.setBackground(new java.awt.Color(0, 0, 0));
        turnTime1.setForeground(new java.awt.Color(255, 255, 255));
        turnTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime1.setText("20");

        ave1.setBackground(new java.awt.Color(0, 0, 0));
        ave1.setForeground(new java.awt.Color(255, 255, 255));
        ave1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave1.setText("20");

        javax.swing.GroupLayout outputPanel1Layout = new javax.swing.GroupLayout(outputPanel1);
        outputPanel1.setLayout(outputPanel1Layout);
        outputPanel1Layout.setHorizontalGroup(
            outputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel1Layout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel1Layout.setVerticalGroup(
            outputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel49)
                .addComponent(burstOut1)
                .addComponent(arrivalOut1)
                .addComponent(prioOut1)
                .addComponent(waitTime1)
                .addComponent(turnTime1)
                .addComponent(ave1))
        );

        outputPanel.add(outputPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 600, 20));

        outputPanel4.setOpaque(false);

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("4");

        burstOut4.setBackground(new java.awt.Color(0, 0, 0));
        burstOut4.setForeground(new java.awt.Color(255, 255, 255));
        burstOut4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut4.setText("20");

        arrivalOut4.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut4.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut4.setText("20");

        prioOut4.setBackground(new java.awt.Color(0, 0, 0));
        prioOut4.setForeground(new java.awt.Color(255, 255, 255));
        prioOut4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut4.setText("20");

        waitTime4.setBackground(new java.awt.Color(0, 0, 0));
        waitTime4.setForeground(new java.awt.Color(255, 255, 255));
        waitTime4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime4.setText("20");

        turnTime4.setBackground(new java.awt.Color(0, 0, 0));
        turnTime4.setForeground(new java.awt.Color(255, 255, 255));
        turnTime4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime4.setText("20");

        ave4.setBackground(new java.awt.Color(0, 0, 0));
        ave4.setForeground(new java.awt.Color(255, 255, 255));
        ave4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave4.setText("20");

        javax.swing.GroupLayout outputPanel4Layout = new javax.swing.GroupLayout(outputPanel4);
        outputPanel4.setLayout(outputPanel4Layout);
        outputPanel4Layout.setHorizontalGroup(
            outputPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel4Layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel4Layout.setVerticalGroup(
            outputPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel52)
                .addComponent(burstOut4)
                .addComponent(arrivalOut4)
                .addComponent(prioOut4)
                .addComponent(waitTime4)
                .addComponent(turnTime4)
                .addComponent(ave4))
        );

        outputPanel.add(outputPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        outputPanel5.setOpaque(false);

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("5");

        burstOut5.setBackground(new java.awt.Color(0, 0, 0));
        burstOut5.setForeground(new java.awt.Color(255, 255, 255));
        burstOut5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut5.setText("20");

        arrivalOut5.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut5.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut5.setText("20");

        prioOut5.setBackground(new java.awt.Color(0, 0, 0));
        prioOut5.setForeground(new java.awt.Color(255, 255, 255));
        prioOut5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut5.setText("20");

        waitTime5.setBackground(new java.awt.Color(0, 0, 0));
        waitTime5.setForeground(new java.awt.Color(255, 255, 255));
        waitTime5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime5.setText("20");

        turnTime5.setBackground(new java.awt.Color(0, 0, 0));
        turnTime5.setForeground(new java.awt.Color(255, 255, 255));
        turnTime5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime5.setText("20");

        ave5.setBackground(new java.awt.Color(0, 0, 0));
        ave5.setForeground(new java.awt.Color(255, 255, 255));
        ave5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave5.setText("20");

        javax.swing.GroupLayout outputPanel5Layout = new javax.swing.GroupLayout(outputPanel5);
        outputPanel5.setLayout(outputPanel5Layout);
        outputPanel5Layout.setHorizontalGroup(
            outputPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel5Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel5Layout.setVerticalGroup(
            outputPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel53)
                .addComponent(burstOut5)
                .addComponent(arrivalOut5)
                .addComponent(prioOut5)
                .addComponent(waitTime5)
                .addComponent(turnTime5)
                .addComponent(ave5))
        );

        outputPanel.add(outputPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        outputPanel6.setOpaque(false);

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("6");

        burstOut6.setBackground(new java.awt.Color(0, 0, 0));
        burstOut6.setForeground(new java.awt.Color(255, 255, 255));
        burstOut6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut6.setText("20");

        arrivalOut6.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut6.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut6.setText("20");

        prioOut6.setBackground(new java.awt.Color(0, 0, 0));
        prioOut6.setForeground(new java.awt.Color(255, 255, 255));
        prioOut6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut6.setText("20");

        waitTime6.setBackground(new java.awt.Color(0, 0, 0));
        waitTime6.setForeground(new java.awt.Color(255, 255, 255));
        waitTime6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime6.setText("20");

        turnTime6.setBackground(new java.awt.Color(0, 0, 0));
        turnTime6.setForeground(new java.awt.Color(255, 255, 255));
        turnTime6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime6.setText("20");

        ave6.setBackground(new java.awt.Color(0, 0, 0));
        ave6.setForeground(new java.awt.Color(255, 255, 255));
        ave6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave6.setText("20");

        javax.swing.GroupLayout outputPanel6Layout = new javax.swing.GroupLayout(outputPanel6);
        outputPanel6.setLayout(outputPanel6Layout);
        outputPanel6Layout.setHorizontalGroup(
            outputPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel6Layout.createSequentialGroup()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave6, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel6Layout.setVerticalGroup(
            outputPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel54)
                .addComponent(burstOut6)
                .addComponent(arrivalOut6)
                .addComponent(prioOut6)
                .addComponent(waitTime6)
                .addComponent(turnTime6)
                .addComponent(ave6))
        );

        outputPanel.add(outputPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        outputPanel7.setOpaque(false);

        jLabel55.setBackground(new java.awt.Color(0, 0, 0));
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("7");

        burstOut7.setBackground(new java.awt.Color(0, 0, 0));
        burstOut7.setForeground(new java.awt.Color(255, 255, 255));
        burstOut7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut7.setText("20");

        arrivalOut7.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut7.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut7.setText("20");

        prioOut7.setBackground(new java.awt.Color(0, 0, 0));
        prioOut7.setForeground(new java.awt.Color(255, 255, 255));
        prioOut7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut7.setText("20");

        waitTime7.setBackground(new java.awt.Color(0, 0, 0));
        waitTime7.setForeground(new java.awt.Color(255, 255, 255));
        waitTime7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime7.setText("20");

        turnTime7.setBackground(new java.awt.Color(0, 0, 0));
        turnTime7.setForeground(new java.awt.Color(255, 255, 255));
        turnTime7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime7.setText("20");

        ave7.setBackground(new java.awt.Color(0, 0, 0));
        ave7.setForeground(new java.awt.Color(255, 255, 255));
        ave7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave7.setText("20");

        javax.swing.GroupLayout outputPanel7Layout = new javax.swing.GroupLayout(outputPanel7);
        outputPanel7.setLayout(outputPanel7Layout);
        outputPanel7Layout.setHorizontalGroup(
            outputPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel7Layout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave7, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel7Layout.setVerticalGroup(
            outputPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel55)
                .addComponent(burstOut7)
                .addComponent(arrivalOut7)
                .addComponent(prioOut7)
                .addComponent(waitTime7)
                .addComponent(turnTime7)
                .addComponent(ave7))
        );

        outputPanel.add(outputPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        outputPanel8.setOpaque(false);

        jLabel56.setBackground(new java.awt.Color(0, 0, 0));
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("8");

        burstOut8.setBackground(new java.awt.Color(0, 0, 0));
        burstOut8.setForeground(new java.awt.Color(255, 255, 255));
        burstOut8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut8.setText("20");

        arrivalOut8.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut8.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut8.setText("20");

        prioOut8.setBackground(new java.awt.Color(0, 0, 0));
        prioOut8.setForeground(new java.awt.Color(255, 255, 255));
        prioOut8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut8.setText("20");

        waitTime8.setBackground(new java.awt.Color(0, 0, 0));
        waitTime8.setForeground(new java.awt.Color(255, 255, 255));
        waitTime8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime8.setText("20");

        turnTime8.setBackground(new java.awt.Color(0, 0, 0));
        turnTime8.setForeground(new java.awt.Color(255, 255, 255));
        turnTime8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime8.setText("20");

        ave8.setBackground(new java.awt.Color(0, 0, 0));
        ave8.setForeground(new java.awt.Color(255, 255, 255));
        ave8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave8.setText("20");

        javax.swing.GroupLayout outputPanel8Layout = new javax.swing.GroupLayout(outputPanel8);
        outputPanel8.setLayout(outputPanel8Layout);
        outputPanel8Layout.setHorizontalGroup(
            outputPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel8Layout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave8, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel8Layout.setVerticalGroup(
            outputPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel56)
                .addComponent(burstOut8)
                .addComponent(arrivalOut8)
                .addComponent(prioOut8)
                .addComponent(waitTime8)
                .addComponent(turnTime8)
                .addComponent(ave8))
        );

        outputPanel.add(outputPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        outputPanel9.setOpaque(false);

        jLabel57.setBackground(new java.awt.Color(0, 0, 0));
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("9");

        burstOut9.setBackground(new java.awt.Color(0, 0, 0));
        burstOut9.setForeground(new java.awt.Color(255, 255, 255));
        burstOut9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut9.setText("20");

        arrivalOut9.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut9.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut9.setText("20");

        prioOut9.setBackground(new java.awt.Color(0, 0, 0));
        prioOut9.setForeground(new java.awt.Color(255, 255, 255));
        prioOut9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut9.setText("20");

        waitTime9.setBackground(new java.awt.Color(0, 0, 0));
        waitTime9.setForeground(new java.awt.Color(255, 255, 255));
        waitTime9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime9.setText("20");

        turnTime9.setBackground(new java.awt.Color(0, 0, 0));
        turnTime9.setForeground(new java.awt.Color(255, 255, 255));
        turnTime9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime9.setText("20");

        ave9.setBackground(new java.awt.Color(0, 0, 0));
        ave9.setForeground(new java.awt.Color(255, 255, 255));
        ave9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave9.setText("20");

        javax.swing.GroupLayout outputPanel9Layout = new javax.swing.GroupLayout(outputPanel9);
        outputPanel9.setLayout(outputPanel9Layout);
        outputPanel9Layout.setHorizontalGroup(
            outputPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel9Layout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave9, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel9Layout.setVerticalGroup(
            outputPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel57)
                .addComponent(burstOut9)
                .addComponent(arrivalOut9)
                .addComponent(prioOut9)
                .addComponent(waitTime9)
                .addComponent(turnTime9)
                .addComponent(ave9))
        );

        outputPanel.add(outputPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        outputPanel10.setOpaque(false);

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("10");

        burstOut10.setBackground(new java.awt.Color(0, 0, 0));
        burstOut10.setForeground(new java.awt.Color(255, 255, 255));
        burstOut10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut10.setText("20");

        arrivalOut10.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut10.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut10.setText("20");

        prioOut10.setBackground(new java.awt.Color(0, 0, 0));
        prioOut10.setForeground(new java.awt.Color(255, 255, 255));
        prioOut10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut10.setText("20");

        waitTime10.setBackground(new java.awt.Color(0, 0, 0));
        waitTime10.setForeground(new java.awt.Color(255, 255, 255));
        waitTime10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime10.setText("20");

        turnTime10.setBackground(new java.awt.Color(0, 0, 0));
        turnTime10.setForeground(new java.awt.Color(255, 255, 255));
        turnTime10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime10.setText("20");

        ave10.setBackground(new java.awt.Color(0, 0, 0));
        ave10.setForeground(new java.awt.Color(255, 255, 255));
        ave10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave10.setText("20");

        javax.swing.GroupLayout outputPanel10Layout = new javax.swing.GroupLayout(outputPanel10);
        outputPanel10.setLayout(outputPanel10Layout);
        outputPanel10Layout.setHorizontalGroup(
            outputPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel10Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave10, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel10Layout.setVerticalGroup(
            outputPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel58)
                .addComponent(burstOut10)
                .addComponent(arrivalOut10)
                .addComponent(prioOut10)
                .addComponent(waitTime10)
                .addComponent(turnTime10)
                .addComponent(ave10))
        );

        outputPanel.add(outputPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        outputPanel11.setOpaque(false);

        jLabel72.setBackground(new java.awt.Color(0, 0, 0));
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("11");

        burstOut11.setBackground(new java.awt.Color(0, 0, 0));
        burstOut11.setForeground(new java.awt.Color(255, 255, 255));
        burstOut11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut11.setText("20");

        arrivalOut11.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut11.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut11.setText("20");

        prioOut11.setBackground(new java.awt.Color(0, 0, 0));
        prioOut11.setForeground(new java.awt.Color(255, 255, 255));
        prioOut11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut11.setText("20");

        waitTime11.setBackground(new java.awt.Color(0, 0, 0));
        waitTime11.setForeground(new java.awt.Color(255, 255, 255));
        waitTime11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime11.setText("20");

        turnTime11.setBackground(new java.awt.Color(0, 0, 0));
        turnTime11.setForeground(new java.awt.Color(255, 255, 255));
        turnTime11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime11.setText("20");

        ave11.setBackground(new java.awt.Color(0, 0, 0));
        ave11.setForeground(new java.awt.Color(255, 255, 255));
        ave11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave11.setText("20");

        javax.swing.GroupLayout outputPanel11Layout = new javax.swing.GroupLayout(outputPanel11);
        outputPanel11.setLayout(outputPanel11Layout);
        outputPanel11Layout.setHorizontalGroup(
            outputPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel11Layout.createSequentialGroup()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave11, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel11Layout.setVerticalGroup(
            outputPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel72)
                .addComponent(burstOut11)
                .addComponent(arrivalOut11)
                .addComponent(prioOut11)
                .addComponent(waitTime11)
                .addComponent(turnTime11)
                .addComponent(ave11))
        );

        outputPanel.add(outputPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        outputPanel12.setOpaque(false);

        jLabel73.setBackground(new java.awt.Color(0, 0, 0));
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("12");

        burstOut12.setBackground(new java.awt.Color(0, 0, 0));
        burstOut12.setForeground(new java.awt.Color(255, 255, 255));
        burstOut12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut12.setText("20");

        arrivalOut12.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut12.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut12.setText("20");

        prioOut12.setBackground(new java.awt.Color(0, 0, 0));
        prioOut12.setForeground(new java.awt.Color(255, 255, 255));
        prioOut12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut12.setText("20");

        waitTime12.setBackground(new java.awt.Color(0, 0, 0));
        waitTime12.setForeground(new java.awt.Color(255, 255, 255));
        waitTime12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime12.setText("20");

        turnTime12.setBackground(new java.awt.Color(0, 0, 0));
        turnTime12.setForeground(new java.awt.Color(255, 255, 255));
        turnTime12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime12.setText("20");

        ave12.setBackground(new java.awt.Color(0, 0, 0));
        ave12.setForeground(new java.awt.Color(255, 255, 255));
        ave12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave12.setText("20");

        javax.swing.GroupLayout outputPanel12Layout = new javax.swing.GroupLayout(outputPanel12);
        outputPanel12.setLayout(outputPanel12Layout);
        outputPanel12Layout.setHorizontalGroup(
            outputPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel12Layout.createSequentialGroup()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave12, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel12Layout.setVerticalGroup(
            outputPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel73)
                .addComponent(burstOut12)
                .addComponent(arrivalOut12)
                .addComponent(prioOut12)
                .addComponent(waitTime12)
                .addComponent(turnTime12)
                .addComponent(ave12))
        );

        outputPanel.add(outputPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        outputPanel13.setOpaque(false);

        jLabel74.setBackground(new java.awt.Color(0, 0, 0));
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("13");

        burstOut13.setBackground(new java.awt.Color(0, 0, 0));
        burstOut13.setForeground(new java.awt.Color(255, 255, 255));
        burstOut13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut13.setText("20");

        arrivalOut13.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut13.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut13.setText("20");

        prioOut13.setBackground(new java.awt.Color(0, 0, 0));
        prioOut13.setForeground(new java.awt.Color(255, 255, 255));
        prioOut13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut13.setText("20");

        waitTime13.setBackground(new java.awt.Color(0, 0, 0));
        waitTime13.setForeground(new java.awt.Color(255, 255, 255));
        waitTime13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime13.setText("20");

        turnTime13.setBackground(new java.awt.Color(0, 0, 0));
        turnTime13.setForeground(new java.awt.Color(255, 255, 255));
        turnTime13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime13.setText("20");

        ave13.setBackground(new java.awt.Color(0, 0, 0));
        ave13.setForeground(new java.awt.Color(255, 255, 255));
        ave13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave13.setText("20");

        javax.swing.GroupLayout outputPanel13Layout = new javax.swing.GroupLayout(outputPanel13);
        outputPanel13.setLayout(outputPanel13Layout);
        outputPanel13Layout.setHorizontalGroup(
            outputPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel13Layout.createSequentialGroup()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave13, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel13Layout.setVerticalGroup(
            outputPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel74)
                .addComponent(burstOut13)
                .addComponent(arrivalOut13)
                .addComponent(prioOut13)
                .addComponent(waitTime13)
                .addComponent(turnTime13)
                .addComponent(ave13))
        );

        outputPanel.add(outputPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        outputPanel14.setOpaque(false);

        jLabel75.setBackground(new java.awt.Color(0, 0, 0));
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("14");

        burstOut14.setBackground(new java.awt.Color(0, 0, 0));
        burstOut14.setForeground(new java.awt.Color(255, 255, 255));
        burstOut14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut14.setText("20");

        arrivalOut14.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut14.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut14.setText("20");

        prioOut14.setBackground(new java.awt.Color(0, 0, 0));
        prioOut14.setForeground(new java.awt.Color(255, 255, 255));
        prioOut14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut14.setText("20");

        waitTime14.setBackground(new java.awt.Color(0, 0, 0));
        waitTime14.setForeground(new java.awt.Color(255, 255, 255));
        waitTime14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime14.setText("20");

        turnTime14.setBackground(new java.awt.Color(0, 0, 0));
        turnTime14.setForeground(new java.awt.Color(255, 255, 255));
        turnTime14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime14.setText("20");

        ave14.setBackground(new java.awt.Color(0, 0, 0));
        ave14.setForeground(new java.awt.Color(255, 255, 255));
        ave14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave14.setText("20");

        javax.swing.GroupLayout outputPanel14Layout = new javax.swing.GroupLayout(outputPanel14);
        outputPanel14.setLayout(outputPanel14Layout);
        outputPanel14Layout.setHorizontalGroup(
            outputPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel14Layout.createSequentialGroup()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave14, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel14Layout.setVerticalGroup(
            outputPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel75)
                .addComponent(burstOut14)
                .addComponent(arrivalOut14)
                .addComponent(prioOut14)
                .addComponent(waitTime14)
                .addComponent(turnTime14)
                .addComponent(ave14))
        );

        outputPanel.add(outputPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        outputPanel15.setOpaque(false);

        jLabel76.setBackground(new java.awt.Color(0, 0, 0));
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("15");

        burstOut15.setBackground(new java.awt.Color(0, 0, 0));
        burstOut15.setForeground(new java.awt.Color(255, 255, 255));
        burstOut15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut15.setText("20");

        arrivalOut15.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut15.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut15.setText("20");

        prioOut15.setBackground(new java.awt.Color(0, 0, 0));
        prioOut15.setForeground(new java.awt.Color(255, 255, 255));
        prioOut15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut15.setText("20");

        waitTime15.setBackground(new java.awt.Color(0, 0, 0));
        waitTime15.setForeground(new java.awt.Color(255, 255, 255));
        waitTime15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime15.setText("20");

        turnTime15.setBackground(new java.awt.Color(0, 0, 0));
        turnTime15.setForeground(new java.awt.Color(255, 255, 255));
        turnTime15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime15.setText("20");

        ave15.setBackground(new java.awt.Color(0, 0, 0));
        ave15.setForeground(new java.awt.Color(255, 255, 255));
        ave15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave15.setText("20");

        javax.swing.GroupLayout outputPanel15Layout = new javax.swing.GroupLayout(outputPanel15);
        outputPanel15.setLayout(outputPanel15Layout);
        outputPanel15Layout.setHorizontalGroup(
            outputPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel15Layout.createSequentialGroup()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave15, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel15Layout.setVerticalGroup(
            outputPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel76)
                .addComponent(burstOut15)
                .addComponent(arrivalOut15)
                .addComponent(prioOut15)
                .addComponent(waitTime15)
                .addComponent(turnTime15)
                .addComponent(ave15))
        );

        outputPanel.add(outputPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        outputPanel16.setOpaque(false);

        jLabel77.setBackground(new java.awt.Color(0, 0, 0));
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("16");

        burstOut16.setBackground(new java.awt.Color(0, 0, 0));
        burstOut16.setForeground(new java.awt.Color(255, 255, 255));
        burstOut16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut16.setText("20");

        arrivalOut16.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut16.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut16.setText("20");

        prioOut16.setBackground(new java.awt.Color(0, 0, 0));
        prioOut16.setForeground(new java.awt.Color(255, 255, 255));
        prioOut16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut16.setText("20");

        waitTime16.setBackground(new java.awt.Color(0, 0, 0));
        waitTime16.setForeground(new java.awt.Color(255, 255, 255));
        waitTime16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime16.setText("20");

        turnTime16.setBackground(new java.awt.Color(0, 0, 0));
        turnTime16.setForeground(new java.awt.Color(255, 255, 255));
        turnTime16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime16.setText("20");

        ave16.setBackground(new java.awt.Color(0, 0, 0));
        ave16.setForeground(new java.awt.Color(255, 255, 255));
        ave16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave16.setText("20");

        javax.swing.GroupLayout outputPanel16Layout = new javax.swing.GroupLayout(outputPanel16);
        outputPanel16.setLayout(outputPanel16Layout);
        outputPanel16Layout.setHorizontalGroup(
            outputPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel16Layout.createSequentialGroup()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave16, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel16Layout.setVerticalGroup(
            outputPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel77)
                .addComponent(burstOut16)
                .addComponent(arrivalOut16)
                .addComponent(prioOut16)
                .addComponent(waitTime16)
                .addComponent(turnTime16)
                .addComponent(ave16))
        );

        outputPanel.add(outputPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        outputPanel17.setOpaque(false);

        jLabel78.setBackground(new java.awt.Color(0, 0, 0));
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("17");

        burstOut17.setBackground(new java.awt.Color(0, 0, 0));
        burstOut17.setForeground(new java.awt.Color(255, 255, 255));
        burstOut17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut17.setText("20");

        arrivalOut17.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut17.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut17.setText("20");

        prioOut17.setBackground(new java.awt.Color(0, 0, 0));
        prioOut17.setForeground(new java.awt.Color(255, 255, 255));
        prioOut17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut17.setText("20");

        waitTime17.setBackground(new java.awt.Color(0, 0, 0));
        waitTime17.setForeground(new java.awt.Color(255, 255, 255));
        waitTime17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime17.setText("20");

        turnTime17.setBackground(new java.awt.Color(0, 0, 0));
        turnTime17.setForeground(new java.awt.Color(255, 255, 255));
        turnTime17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime17.setText("20");

        ave17.setBackground(new java.awt.Color(0, 0, 0));
        ave17.setForeground(new java.awt.Color(255, 255, 255));
        ave17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave17.setText("20");

        javax.swing.GroupLayout outputPanel17Layout = new javax.swing.GroupLayout(outputPanel17);
        outputPanel17.setLayout(outputPanel17Layout);
        outputPanel17Layout.setHorizontalGroup(
            outputPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel17Layout.createSequentialGroup()
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave17, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel17Layout.setVerticalGroup(
            outputPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel78)
                .addComponent(burstOut17)
                .addComponent(arrivalOut17)
                .addComponent(prioOut17)
                .addComponent(waitTime17)
                .addComponent(turnTime17)
                .addComponent(ave17))
        );

        outputPanel.add(outputPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, -1, -1));

        outputPanel18.setOpaque(false);

        jLabel79.setBackground(new java.awt.Color(0, 0, 0));
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("18");

        burstOut18.setBackground(new java.awt.Color(0, 0, 0));
        burstOut18.setForeground(new java.awt.Color(255, 255, 255));
        burstOut18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut18.setText("20");

        arrivalOut18.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut18.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut18.setText("20");

        prioOut18.setBackground(new java.awt.Color(0, 0, 0));
        prioOut18.setForeground(new java.awt.Color(255, 255, 255));
        prioOut18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut18.setText("20");

        waitTime18.setBackground(new java.awt.Color(0, 0, 0));
        waitTime18.setForeground(new java.awt.Color(255, 255, 255));
        waitTime18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime18.setText("20");

        turnTime18.setBackground(new java.awt.Color(0, 0, 0));
        turnTime18.setForeground(new java.awt.Color(255, 255, 255));
        turnTime18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime18.setText("20");

        ave18.setBackground(new java.awt.Color(0, 0, 0));
        ave18.setForeground(new java.awt.Color(255, 255, 255));
        ave18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave18.setText("20");

        javax.swing.GroupLayout outputPanel18Layout = new javax.swing.GroupLayout(outputPanel18);
        outputPanel18.setLayout(outputPanel18Layout);
        outputPanel18Layout.setHorizontalGroup(
            outputPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel18Layout.createSequentialGroup()
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave18, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel18Layout.setVerticalGroup(
            outputPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel79)
                .addComponent(burstOut18)
                .addComponent(arrivalOut18)
                .addComponent(prioOut18)
                .addComponent(waitTime18)
                .addComponent(turnTime18)
                .addComponent(ave18))
        );

        outputPanel.add(outputPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, -1, -1));

        outputPanel19.setOpaque(false);

        jLabel80.setBackground(new java.awt.Color(0, 0, 0));
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("19");

        burstOut19.setBackground(new java.awt.Color(0, 0, 0));
        burstOut19.setForeground(new java.awt.Color(255, 255, 255));
        burstOut19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut19.setText("20");

        arrivalOut19.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut19.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut19.setText("20");

        prioOut19.setBackground(new java.awt.Color(0, 0, 0));
        prioOut19.setForeground(new java.awt.Color(255, 255, 255));
        prioOut19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut19.setText("20");

        waitTime19.setBackground(new java.awt.Color(0, 0, 0));
        waitTime19.setForeground(new java.awt.Color(255, 255, 255));
        waitTime19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime19.setText("20");

        turnTime19.setBackground(new java.awt.Color(0, 0, 0));
        turnTime19.setForeground(new java.awt.Color(255, 255, 255));
        turnTime19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime19.setText("20");

        ave19.setBackground(new java.awt.Color(0, 0, 0));
        ave19.setForeground(new java.awt.Color(255, 255, 255));
        ave19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave19.setText("20");

        javax.swing.GroupLayout outputPanel19Layout = new javax.swing.GroupLayout(outputPanel19);
        outputPanel19.setLayout(outputPanel19Layout);
        outputPanel19Layout.setHorizontalGroup(
            outputPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel19Layout.createSequentialGroup()
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave19, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel19Layout.setVerticalGroup(
            outputPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel80)
                .addComponent(burstOut19)
                .addComponent(arrivalOut19)
                .addComponent(prioOut19)
                .addComponent(waitTime19)
                .addComponent(turnTime19)
                .addComponent(ave19))
        );

        outputPanel.add(outputPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        outputPanel20.setOpaque(false);

        jLabel81.setBackground(new java.awt.Color(0, 0, 0));
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("20");

        burstOut20.setBackground(new java.awt.Color(0, 0, 0));
        burstOut20.setForeground(new java.awt.Color(255, 255, 255));
        burstOut20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burstOut20.setText("20");

        arrivalOut20.setBackground(new java.awt.Color(0, 0, 0));
        arrivalOut20.setForeground(new java.awt.Color(255, 255, 255));
        arrivalOut20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalOut20.setText("20");

        prioOut20.setBackground(new java.awt.Color(0, 0, 0));
        prioOut20.setForeground(new java.awt.Color(255, 255, 255));
        prioOut20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioOut20.setText("20");

        waitTime20.setBackground(new java.awt.Color(0, 0, 0));
        waitTime20.setForeground(new java.awt.Color(255, 255, 255));
        waitTime20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitTime20.setText("20");

        turnTime20.setBackground(new java.awt.Color(0, 0, 0));
        turnTime20.setForeground(new java.awt.Color(255, 255, 255));
        turnTime20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnTime20.setText("20");

        ave20.setBackground(new java.awt.Color(0, 0, 0));
        ave20.setForeground(new java.awt.Color(255, 255, 255));
        ave20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ave20.setText("20");

        javax.swing.GroupLayout outputPanel20Layout = new javax.swing.GroupLayout(outputPanel20);
        outputPanel20.setLayout(outputPanel20Layout);
        outputPanel20Layout.setHorizontalGroup(
            outputPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel20Layout.createSequentialGroup()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(burstOut20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalOut20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prioOut20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTime20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnTime20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ave20, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanel20Layout.setVerticalGroup(
            outputPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel81)
                .addComponent(burstOut20)
                .addComponent(arrivalOut20)
                .addComponent(prioOut20)
                .addComponent(waitTime20)
                .addComponent(turnTime20)
                .addComponent(ave20))
        );

        outputPanel.add(outputPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/output.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel6.setFocusable(false);
        outputPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1279, -1));

        chooseAlgo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1algo.png"))); // NOI18N
        fcfs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fcfsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fcfsMouseExited(evt);
            }
        });
        fcfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcfsActionPerformed(evt);
            }
        });
        chooseAlgo.add(fcfs, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 220, 220));

        rr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2algo.png"))); // NOI18N
        rr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rrMouseExited(evt);
            }
        });
        rr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrActionPerformed(evt);
            }
        });
        chooseAlgo.add(rr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 220, 220));

        sjfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3algo.png"))); // NOI18N
        sjfp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sjfpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sjfpMouseExited(evt);
            }
        });
        chooseAlgo.add(sjfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 220, 220));

        sjfnp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4algo.png"))); // NOI18N
        sjfnp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sjfnpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sjfnpMouseExited(evt);
            }
        });
        chooseAlgo.add(sjfnp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 220, 220));

        prionp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6algo.png"))); // NOI18N
        prionp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prionpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prionpMouseExited(evt);
            }
        });
        chooseAlgo.add(prionp, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 220, 220));

        priop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5algo.png"))); // NOI18N
        priop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                priopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                priopMouseExited(evt);
            }
        });
        chooseAlgo.add(priop, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 220, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chooseAlgo.png"))); // NOI18N
        chooseAlgo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        inputProcessPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        inputProcessPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        decButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downArrow.png"))); // NOI18N
        decButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                decButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                decButtonMouseReleased(evt);
            }
        });
        inputProcessPanel.add(decButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        enter.setBackground(new java.awt.Color(255, 153, 0));
        enter.setFont(new Font("Mansory", Font.PLAIN, 20));
        enter.setText("Enter");
        enter.setBorder(null);
        enter.setBorderPainted(false);
        enter.setFocusPainted(false);
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterMouseExited(evt);
            }
        });
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        inputProcessPanel.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 110, 40));

        incButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upArrow.png"))); // NOI18N
        incButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                incButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                incButtonMouseReleased(evt);
            }
        });
        inputProcessPanel.add(incButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, -1, -1));

        showNumOfProc.setFont(new Font("Mansory", Font.PLAIN, 30));
        showNumOfProc.setForeground(new java.awt.Color(255, 255, 255));
        showNumOfProc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showNumOfProc.setText("3");
        showNumOfProc.setFocusable(false);
        showNumOfProc.setRequestFocusEnabled(false);
        showNumOfProc.setVerifyInputWhenFocusTarget(false);
        inputProcessPanel.add(showNumOfProc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 80, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inputProcess.png"))); // NOI18N
        inputProcessPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        chooseInputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        randomInput.setBackground(new java.awt.Color(255, 153, 0));
        randomInput.setFont(new Font("Mansory", Font.PLAIN, 20));
        randomInput.setText("Random Input");
        randomInput.setBorder(null);
        randomInput.setBorderPainted(false);
        randomInput.setFocusPainted(false);
        randomInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                randomInputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                randomInputMouseExited(evt);
            }
        });
        randomInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomInputActionPerformed(evt);
            }
        });
        chooseInputPanel.add(randomInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 290, 40));

        manualInput.setBackground(new java.awt.Color(255, 153, 0));
        manualInput.setFont(new Font("Mansory", Font.PLAIN, 20));
        manualInput.setText("Manual Input");
        manualInput.setBorder(null);
        manualInput.setBorderPainted(false);
        manualInput.setFocusPainted(false);
        manualInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manualInputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manualInputMouseExited(evt);
            }
        });
        manualInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualInputActionPerformed(evt);
            }
        });
        chooseInputPanel.add(manualInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 290, 40));

        fileInput.setBackground(new java.awt.Color(255, 153, 0));
        fileInput.setFont(new Font("Mansory", Font.PLAIN, 20));
        fileInput.setText("Input from File");
        fileInput.setBorder(null);
        fileInput.setBorderPainted(false);
        fileInput.setFocusPainted(false);
        fileInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fileInputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fileInputMouseExited(evt);
            }
        });
        fileInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileInputActionPerformed(evt);
            }
        });
        chooseInputPanel.add(fileInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 290, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chooseInputBG.png"))); // NOI18N
        chooseInputPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        randomDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        priorityLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        priorityLabel3.setForeground(new java.awt.Color(204, 204, 204));
        priorityLabel3.setText("PRIORITY #");
        randomDataPanel.add(priorityLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 120, 30));

        arrivalLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        arrivalLabel3.setForeground(new java.awt.Color(204, 204, 204));
        arrivalLabel3.setText("ARRIVAL TIME");
        randomDataPanel.add(arrivalLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 200, 30));

        burstLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        burstLabel3.setForeground(new java.awt.Color(204, 204, 204));
        burstLabel3.setText("BURST TIME");
        randomDataPanel.add(burstLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 160, 30));

        solve1.setBackground(new java.awt.Color(255, 153, 0));
        solve1.setFont(new Font("Mansory", Font.PLAIN, 20));
        solve1.setText("Solve");
        solve1.setBorder(null);
        solve1.setBorderPainted(false);
        solve1.setFocusPainted(false);
        solve1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                solve1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                solve1MouseExited(evt);
            }
        });
        solve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solve1ActionPerformed(evt);
            }
        });
        randomDataPanel.add(solve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, 200, 40));

        processRandPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel28.setText("Process 1");

        burst1.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst1.setText("5");

        arrival1.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival1.setText("5");

        prio1.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio1.setText("5");

        javax.swing.GroupLayout processRandPanel1Layout = new javax.swing.GroupLayout(processRandPanel1);
        processRandPanel1.setLayout(processRandPanel1Layout);
        processRandPanel1Layout.setHorizontalGroup(
            processRandPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel1Layout.setVerticalGroup(
            processRandPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processRandPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(processRandPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 490, 40));

        processRandPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel29.setText("Process 2");

        burst2.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst2.setText("5");

        prio2.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio2.setText("5");

        arrival2.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival2.setText("5");

        javax.swing.GroupLayout processRandPanel2Layout = new javax.swing.GroupLayout(processRandPanel2);
        processRandPanel2.setLayout(processRandPanel2Layout);
        processRandPanel2Layout.setHorizontalGroup(
            processRandPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel2Layout.setVerticalGroup(
            processRandPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel29))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 490, 40));

        processRandPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel30.setText("Process 3");

        prio3.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio3.setText("5");

        arrival3.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival3.setText("5");

        burst3.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst3.setText("5");

        javax.swing.GroupLayout processRandPanel3Layout = new javax.swing.GroupLayout(processRandPanel3);
        processRandPanel3.setLayout(processRandPanel3Layout);
        processRandPanel3Layout.setHorizontalGroup(
            processRandPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel3Layout.setVerticalGroup(
            processRandPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel30))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 490, 40));

        processRandPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel31.setText("Process 4");

        prio4.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio4.setText("5");

        arrival4.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival4.setText("5");

        burst4.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst4.setText("5");

        javax.swing.GroupLayout processRandPanel4Layout = new javax.swing.GroupLayout(processRandPanel4);
        processRandPanel4.setLayout(processRandPanel4Layout);
        processRandPanel4Layout.setHorizontalGroup(
            processRandPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel4Layout.setVerticalGroup(
            processRandPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel31))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 490, 40));

        processRandPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel32.setText("Process 5");

        burst5.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst5.setText("5");

        prio5.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio5.setText("5");

        arrival5.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival5.setText("5");

        javax.swing.GroupLayout processRandPanel5Layout = new javax.swing.GroupLayout(processRandPanel5);
        processRandPanel5.setLayout(processRandPanel5Layout);
        processRandPanel5Layout.setHorizontalGroup(
            processRandPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel5Layout.setVerticalGroup(
            processRandPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel32))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 490, 40));

        processRandPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel33.setText("Process 6");

        burst6.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst6.setText("5");

        arrival6.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival6.setText("5");

        prio6.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio6.setText("5");

        javax.swing.GroupLayout processRandPanel6Layout = new javax.swing.GroupLayout(processRandPanel6);
        processRandPanel6.setLayout(processRandPanel6Layout);
        processRandPanel6Layout.setHorizontalGroup(
            processRandPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel6Layout.setVerticalGroup(
            processRandPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel33))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 490, 40));

        processRandPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel34.setText("Process 7");

        burst7.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst7.setText("5");

        arrival7.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival7.setText("5");

        prio7.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio7.setText("5");

        javax.swing.GroupLayout processRandPanel7Layout = new javax.swing.GroupLayout(processRandPanel7);
        processRandPanel7.setLayout(processRandPanel7Layout);
        processRandPanel7Layout.setHorizontalGroup(
            processRandPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel7Layout.setVerticalGroup(
            processRandPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel34))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 490, 40));

        processRandPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel35.setText("Process 8");

        burst8.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst8.setText("5");

        arrival8.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival8.setText("5");

        prio8.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio8.setText("5");

        javax.swing.GroupLayout processRandPanel8Layout = new javax.swing.GroupLayout(processRandPanel8);
        processRandPanel8.setLayout(processRandPanel8Layout);
        processRandPanel8Layout.setHorizontalGroup(
            processRandPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel8Layout.setVerticalGroup(
            processRandPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processRandPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel35))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 490, 40));

        processRandPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel36.setText("Process 9");

        prio9.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio9.setText("5");

        arrival9.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival9.setText("5");

        burst9.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst9.setText("5");

        javax.swing.GroupLayout processRandPanel9Layout = new javax.swing.GroupLayout(processRandPanel9);
        processRandPanel9.setLayout(processRandPanel9Layout);
        processRandPanel9Layout.setHorizontalGroup(
            processRandPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(burst9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel9Layout.setVerticalGroup(
            processRandPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel36))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 490, -1));

        processRandPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel37.setText("Process 10");

        burst10.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst10.setText("5");

        arrival10.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival10.setText("5");

        prio10.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio10.setText("5");

        javax.swing.GroupLayout processRandPanel10Layout = new javax.swing.GroupLayout(processRandPanel10);
        processRandPanel10.setLayout(processRandPanel10Layout);
        processRandPanel10Layout.setHorizontalGroup(
            processRandPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(23, 23, 23)
                .addComponent(burst10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel10Layout.setVerticalGroup(
            processRandPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel37))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 490, -1));

        processRandPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel38.setText("Process 11");

        prio11.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio11.setText("5");

        arrival11.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival11.setText("5");

        burst11.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst11.setText("5");

        javax.swing.GroupLayout processRandPanel11Layout = new javax.swing.GroupLayout(processRandPanel11);
        processRandPanel11.setLayout(processRandPanel11Layout);
        processRandPanel11Layout.setHorizontalGroup(
            processRandPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addGap(23, 23, 23)
                .addComponent(burst11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel11Layout.setVerticalGroup(
            processRandPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel38))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 490, -1));

        processRandPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel39.setText("Process 12");

        burst12.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst12.setText("5");

        prio12.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio12.setText("5");

        arrival12.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival12.setText("5");

        javax.swing.GroupLayout processRandPanel12Layout = new javax.swing.GroupLayout(processRandPanel12);
        processRandPanel12.setLayout(processRandPanel12Layout);
        processRandPanel12Layout.setHorizontalGroup(
            processRandPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addGap(23, 23, 23)
                .addComponent(burst12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel12Layout.setVerticalGroup(
            processRandPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel39))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 490, -1));

        processRandPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel40.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel40.setText("Process 13");

        prio13.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio13.setText("5");

        burst13.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst13.setText("5");

        arrival13.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival13.setText("5");

        javax.swing.GroupLayout processRandPanel13Layout = new javax.swing.GroupLayout(processRandPanel13);
        processRandPanel13.setLayout(processRandPanel13Layout);
        processRandPanel13Layout.setHorizontalGroup(
            processRandPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(23, 23, 23)
                .addComponent(burst13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel13Layout.setVerticalGroup(
            processRandPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel13Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel40))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 490, -1));

        processRandPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel41.setText("Process 14");

        prio14.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio14.setText("5");

        burst14.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst14.setText("5");

        arrival14.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival14.setText("5");

        javax.swing.GroupLayout processRandPanel14Layout = new javax.swing.GroupLayout(processRandPanel14);
        processRandPanel14.setLayout(processRandPanel14Layout);
        processRandPanel14Layout.setHorizontalGroup(
            processRandPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addGap(23, 23, 23)
                .addComponent(burst14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel14Layout.setVerticalGroup(
            processRandPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel14Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel41))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 490, -1));

        processRandPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel42.setText("Process 15");

        prio15.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio15.setText("5");

        arrival15.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival15.setText("5");

        burst15.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst15.setText("5");

        javax.swing.GroupLayout processRandPanel15Layout = new javax.swing.GroupLayout(processRandPanel15);
        processRandPanel15.setLayout(processRandPanel15Layout);
        processRandPanel15Layout.setHorizontalGroup(
            processRandPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(23, 23, 23)
                .addComponent(burst15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel15Layout.setVerticalGroup(
            processRandPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel15Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel42))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 490, -1));

        processRandPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel43.setText("Process 16");

        arrival16.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival16.setText("5");

        prio16.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio16.setText("5");

        burst16.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst16.setText("5");

        javax.swing.GroupLayout processRandPanel16Layout = new javax.swing.GroupLayout(processRandPanel16);
        processRandPanel16.setLayout(processRandPanel16Layout);
        processRandPanel16Layout.setHorizontalGroup(
            processRandPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addGap(23, 23, 23)
                .addComponent(burst16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel16Layout.setVerticalGroup(
            processRandPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel16Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel43))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 490, -1));

        processRandPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel44.setText("Process 17");

        prio17.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio17.setText("5");

        burst17.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst17.setText("5");

        arrival17.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival17.setText("5");

        javax.swing.GroupLayout processRandPanel17Layout = new javax.swing.GroupLayout(processRandPanel17);
        processRandPanel17.setLayout(processRandPanel17Layout);
        processRandPanel17Layout.setHorizontalGroup(
            processRandPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(23, 23, 23)
                .addComponent(burst17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel17Layout.setVerticalGroup(
            processRandPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel17Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel44))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 490, -1));

        processRandPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel45.setText("Process 18");

        burst18.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst18.setText("5");

        prio18.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio18.setText("5");

        arrival18.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival18.setText("5");

        javax.swing.GroupLayout processRandPanel18Layout = new javax.swing.GroupLayout(processRandPanel18);
        processRandPanel18.setLayout(processRandPanel18Layout);
        processRandPanel18Layout.setHorizontalGroup(
            processRandPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(23, 23, 23)
                .addComponent(burst18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel18Layout.setVerticalGroup(
            processRandPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel18Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel45))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 490, -1));

        processRandPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel46.setText("Process 19");

        burst19.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst19.setText("5");

        prio19.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio19.setText("5");

        arrival19.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival19.setText("5");

        javax.swing.GroupLayout processRandPanel19Layout = new javax.swing.GroupLayout(processRandPanel19);
        processRandPanel19.setLayout(processRandPanel19Layout);
        processRandPanel19Layout.setHorizontalGroup(
            processRandPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(23, 23, 23)
                .addComponent(burst19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio19, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel19Layout.setVerticalGroup(
            processRandPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel19Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel46))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 490, -1));

        processRandPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel47.setText("Process 20");

        arrival20.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        arrival20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival20.setText("5");

        burst20.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        burst20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burst20.setText("5");

        prio20.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        prio20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prio20.setText("5");

        javax.swing.GroupLayout processRandPanel20Layout = new javax.swing.GroupLayout(processRandPanel20);
        processRandPanel20.setLayout(processRandPanel20Layout);
        processRandPanel20Layout.setHorizontalGroup(
            processRandPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addGap(23, 23, 23)
                .addComponent(burst20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arrival20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(prio20, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        processRandPanel20Layout.setVerticalGroup(
            processRandPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processRandPanel20Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(processRandPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processRandPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(burst20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrival20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prio20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel47))
                .addContainerGap())
        );

        randomDataPanel.add(processRandPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 490, -1));

        burstLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        burstLabel4.setForeground(new java.awt.Color(204, 204, 204));
        burstLabel4.setText("BURST TIME");
        randomDataPanel.add(burstLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 160, 30));

        arrivalLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        arrivalLabel4.setForeground(new java.awt.Color(204, 204, 204));
        arrivalLabel4.setText("ARRIVAL TIME");
        randomDataPanel.add(arrivalLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 200, 30));

        priorityLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        priorityLabel4.setForeground(new java.awt.Color(204, 204, 204));
        priorityLabel4.setText("PRIORITY #");
        randomDataPanel.add(priorityLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 120, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/randomInputBG.png"))); // NOI18N
        randomDataPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        manualDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        priorityLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        priorityLabel1.setForeground(new java.awt.Color(204, 204, 204));
        priorityLabel1.setText("PRIORITY #");
        manualDataPanel.add(priorityLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 120, 30));

        arrivalLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        arrivalLabel1.setForeground(new java.awt.Color(204, 204, 204));
        arrivalLabel1.setText("ARRIVAL TIME");
        manualDataPanel.add(arrivalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 200, 30));

        burstLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        burstLabel1.setForeground(new java.awt.Color(204, 204, 204));
        burstLabel1.setText("BURST TIME");
        manualDataPanel.add(burstLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 160, 30));

        solve.setBackground(new java.awt.Color(255, 153, 0));
        solve.setFont(new Font("Mansory", Font.PLAIN, 20));
        solve.setText("Solve");
        solve.setBorder(null);
        solve.setBorderPainted(false);
        solve.setFocusPainted(false);
        solve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                solveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                solveMouseExited(evt);
            }
        });
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });
        manualDataPanel.add(solve, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, 200, 40));

        processPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel48.setText("Process 1");

        priorityP1.setBackground(new java.awt.Color(204, 204, 204));
        priorityP1.setMaximumRowCount(20);
        priorityP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP1ItemStateChanged(evt);
            }
        });

        arrivalP1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel1Layout = new javax.swing.GroupLayout(processPanel1);
        processPanel1.setLayout(processPanel1Layout);
        processPanel1Layout.setHorizontalGroup(
            processPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel1Layout.setVerticalGroup(
            processPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 490, 40));

        processPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setText("Process 2");

        priorityP2.setBackground(new java.awt.Color(204, 204, 204));
        priorityP2.setMaximumRowCount(20);
        priorityP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP2ItemStateChanged(evt);
            }
        });

        arrivalP2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel2Layout = new javax.swing.GroupLayout(processPanel2);
        processPanel2.setLayout(processPanel2Layout);
        processPanel2Layout.setHorizontalGroup(
            processPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel2Layout.setVerticalGroup(
            processPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 490, 40));

        processPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setText("Process 3");

        priorityP3.setBackground(new java.awt.Color(204, 204, 204));
        priorityP3.setMaximumRowCount(20);
        priorityP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP3ItemStateChanged(evt);
            }
        });

        arrivalP3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel3Layout = new javax.swing.GroupLayout(processPanel3);
        processPanel3.setLayout(processPanel3Layout);
        processPanel3Layout.setHorizontalGroup(
            processPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel3Layout.setVerticalGroup(
            processPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 490, 40));

        processPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel11.setText("Process 4");

        priorityP4.setBackground(new java.awt.Color(204, 204, 204));
        priorityP4.setMaximumRowCount(20);
        priorityP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP4ItemStateChanged(evt);
            }
        });

        arrivalP4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel4Layout = new javax.swing.GroupLayout(processPanel4);
        processPanel4.setLayout(processPanel4Layout);
        processPanel4Layout.setHorizontalGroup(
            processPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel4Layout.setVerticalGroup(
            processPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 490, 40));

        processPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel12.setText("Process 5");

        priorityP5.setBackground(new java.awt.Color(204, 204, 204));
        priorityP5.setMaximumRowCount(20);
        priorityP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP5ItemStateChanged(evt);
            }
        });

        arrivalP5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel5Layout = new javax.swing.GroupLayout(processPanel5);
        processPanel5.setLayout(processPanel5Layout);
        processPanel5Layout.setHorizontalGroup(
            processPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel5Layout.setVerticalGroup(
            processPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 490, 40));

        processPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel13.setText("Process 6");

        priorityP6.setBackground(new java.awt.Color(204, 204, 204));
        priorityP6.setMaximumRowCount(20);
        priorityP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP6ItemStateChanged(evt);
            }
        });

        arrivalP6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel6Layout = new javax.swing.GroupLayout(processPanel6);
        processPanel6.setLayout(processPanel6Layout);
        processPanel6Layout.setHorizontalGroup(
            processPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel6Layout.setVerticalGroup(
            processPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 490, 40));

        processPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel14.setText("Process 7");

        priorityP7.setBackground(new java.awt.Color(204, 204, 204));
        priorityP7.setMaximumRowCount(20);
        priorityP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP7ItemStateChanged(evt);
            }
        });

        arrivalP7.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP7.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel7Layout = new javax.swing.GroupLayout(processPanel7);
        processPanel7.setLayout(processPanel7Layout);
        processPanel7Layout.setHorizontalGroup(
            processPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel7Layout.setVerticalGroup(
            processPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 490, 40));

        processPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel15.setText("Process 8");

        priorityP8.setBackground(new java.awt.Color(204, 204, 204));
        priorityP8.setMaximumRowCount(20);
        priorityP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP8ItemStateChanged(evt);
            }
        });

        arrivalP8.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP8.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel8Layout = new javax.swing.GroupLayout(processPanel8);
        processPanel8.setLayout(processPanel8Layout);
        processPanel8Layout.setHorizontalGroup(
            processPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel8Layout.setVerticalGroup(
            processPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 490, 40));

        processPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel16.setText("Process 9");

        priorityP9.setBackground(new java.awt.Color(204, 204, 204));
        priorityP9.setMaximumRowCount(20);
        priorityP9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP9ItemStateChanged(evt);
            }
        });

        arrivalP9.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP9.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel9Layout = new javax.swing.GroupLayout(processPanel9);
        processPanel9.setLayout(processPanel9Layout);
        processPanel9Layout.setHorizontalGroup(
            processPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(burstP9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel9Layout.setVerticalGroup(
            processPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 490, -1));

        processPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel17.setText("Process 10");

        priorityP10.setBackground(new java.awt.Color(204, 204, 204));
        priorityP10.setMaximumRowCount(20);
        priorityP10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP10ItemStateChanged(evt);
            }
        });

        arrivalP10.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP10.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel10Layout = new javax.swing.GroupLayout(processPanel10);
        processPanel10.setLayout(processPanel10Layout);
        processPanel10Layout.setHorizontalGroup(
            processPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(34, 34, 34)
                .addComponent(burstP10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel10Layout.setVerticalGroup(
            processPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 490, -1));

        processPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel18.setText("Process 11");

        priorityP11.setBackground(new java.awt.Color(204, 204, 204));
        priorityP11.setMaximumRowCount(20);
        priorityP11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP11ItemStateChanged(evt);
            }
        });

        arrivalP11.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP11.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel11Layout = new javax.swing.GroupLayout(processPanel11);
        processPanel11.setLayout(processPanel11Layout);
        processPanel11Layout.setHorizontalGroup(
            processPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(34, 34, 34)
                .addComponent(burstP11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel11Layout.setVerticalGroup(
            processPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 490, -1));

        processPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel19.setText("Process 12");

        priorityP12.setBackground(new java.awt.Color(204, 204, 204));
        priorityP12.setMaximumRowCount(20);
        priorityP12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP12ItemStateChanged(evt);
            }
        });

        arrivalP12.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP12.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel12Layout = new javax.swing.GroupLayout(processPanel12);
        processPanel12.setLayout(processPanel12Layout);
        processPanel12Layout.setHorizontalGroup(
            processPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(34, 34, 34)
                .addComponent(burstP12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel12Layout.setVerticalGroup(
            processPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 490, -1));

        processPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel20.setText("Process 13");

        priorityP13.setBackground(new java.awt.Color(204, 204, 204));
        priorityP13.setMaximumRowCount(20);
        priorityP13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP13ItemStateChanged(evt);
            }
        });

        arrivalP13.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP13.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel13Layout = new javax.swing.GroupLayout(processPanel13);
        processPanel13.setLayout(processPanel13Layout);
        processPanel13Layout.setHorizontalGroup(
            processPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(34, 34, 34)
                .addComponent(burstP13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel13Layout.setVerticalGroup(
            processPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 490, -1));

        processPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel21.setText("Process 14");

        priorityP14.setBackground(new java.awt.Color(204, 204, 204));
        priorityP14.setMaximumRowCount(20);
        priorityP14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP14ItemStateChanged(evt);
            }
        });

        arrivalP14.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP14.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel14Layout = new javax.swing.GroupLayout(processPanel14);
        processPanel14.setLayout(processPanel14Layout);
        processPanel14Layout.setHorizontalGroup(
            processPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(34, 34, 34)
                .addComponent(burstP14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel14Layout.setVerticalGroup(
            processPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel14Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 490, -1));

        processPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel22.setText("Process 15");

        priorityP15.setBackground(new java.awt.Color(204, 204, 204));
        priorityP15.setMaximumRowCount(20);
        priorityP15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP15ItemStateChanged(evt);
            }
        });

        arrivalP15.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP15.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel15Layout = new javax.swing.GroupLayout(processPanel15);
        processPanel15.setLayout(processPanel15Layout);
        processPanel15Layout.setHorizontalGroup(
            processPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(34, 34, 34)
                .addComponent(burstP15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel15Layout.setVerticalGroup(
            processPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 490, -1));

        processPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel23.setText("Process 16");

        priorityP16.setBackground(new java.awt.Color(204, 204, 204));
        priorityP16.setMaximumRowCount(20);
        priorityP16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP16ItemStateChanged(evt);
            }
        });

        arrivalP16.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP16.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel16Layout = new javax.swing.GroupLayout(processPanel16);
        processPanel16.setLayout(processPanel16Layout);
        processPanel16Layout.setHorizontalGroup(
            processPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(34, 34, 34)
                .addComponent(burstP16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel16Layout.setVerticalGroup(
            processPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel16Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 490, -1));

        processPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel24.setText("Process 17");

        priorityP17.setBackground(new java.awt.Color(204, 204, 204));
        priorityP17.setMaximumRowCount(20);
        priorityP17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP17ItemStateChanged(evt);
            }
        });

        arrivalP17.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP17.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel17Layout = new javax.swing.GroupLayout(processPanel17);
        processPanel17.setLayout(processPanel17Layout);
        processPanel17Layout.setHorizontalGroup(
            processPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(34, 34, 34)
                .addComponent(burstP17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel17Layout.setVerticalGroup(
            processPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel17Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 490, -1));

        processPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel25.setText("Process 18");

        priorityP18.setBackground(new java.awt.Color(204, 204, 204));
        priorityP18.setMaximumRowCount(20);
        priorityP18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP18ItemStateChanged(evt);
            }
        });

        arrivalP18.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP18.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel18Layout = new javax.swing.GroupLayout(processPanel18);
        processPanel18.setLayout(processPanel18Layout);
        processPanel18Layout.setHorizontalGroup(
            processPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(34, 34, 34)
                .addComponent(burstP18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel18Layout.setVerticalGroup(
            processPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel18Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 490, -1));

        processPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel26.setText("Process 19");

        priorityP19.setBackground(new java.awt.Color(204, 204, 204));
        priorityP19.setMaximumRowCount(20);
        priorityP19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP19ItemStateChanged(evt);
            }
        });

        arrivalP19.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP19.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel19Layout = new javax.swing.GroupLayout(processPanel19);
        processPanel19.setLayout(processPanel19Layout);
        processPanel19Layout.setHorizontalGroup(
            processPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(34, 34, 34)
                .addComponent(burstP19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel19Layout.setVerticalGroup(
            processPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel19Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 490, -1));

        processPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel27.setText("Process 20");

        priorityP20.setBackground(new java.awt.Color(204, 204, 204));
        priorityP20.setMaximumRowCount(20);
        priorityP20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "1", "2", "3" }));
        priorityP20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        priorityP20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priorityP20ItemStateChanged(evt);
            }
        });

        arrivalP20.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        burstP20.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout processPanel20Layout = new javax.swing.GroupLayout(processPanel20);
        processPanel20.setLayout(processPanel20Layout);
        processPanel20Layout.setHorizontalGroup(
            processPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(34, 34, 34)
                .addComponent(burstP20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(arrivalP20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(priorityP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        processPanel20Layout.setVerticalGroup(
            processPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanel20Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(processPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burstP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manualDataPanel.add(processPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 490, -1));

        burstLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        burstLabel2.setForeground(new java.awt.Color(204, 204, 204));
        burstLabel2.setText("BURST TIME");
        manualDataPanel.add(burstLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 160, 30));

        arrivalLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        arrivalLabel2.setForeground(new java.awt.Color(204, 204, 204));
        arrivalLabel2.setText("ARRIVAL TIME");
        manualDataPanel.add(arrivalLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 200, 30));

        priorityLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        priorityLabel2.setForeground(new java.awt.Color(204, 204, 204));
        priorityLabel2.setText("PRIORITY #");
        manualDataPanel.add(priorityLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 120, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inputData.png"))); // NOI18N
        manualDataPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(inputProcessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manualDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chooseInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(randomDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chooseAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(inputProcessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 720, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manualDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chooseInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(randomDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chooseAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void startButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseEntered
        hoverEnter(startButton);
    }//GEN-LAST:event_startButtonMouseEntered

    private void startButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseExited
        hoverExit(startButton);
    }//GEN-LAST:event_startButtonMouseExited

    private void helpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseEntered
        hoverEnter(helpButton);
    }//GEN-LAST:event_helpButtonMouseEntered

    private void helpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseExited
        hoverExit(helpButton);
    }//GEN-LAST:event_helpButtonMouseExited

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        changePanel(MainPanel,chooseInputPanel);
    }//GEN-LAST:event_startButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setForeground(new Color(255,153,0));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setForeground(Color.white);
    }//GEN-LAST:event_exitButtonMouseExited

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        hideUnusedPanels();
        if(forRoundRobin == 1){
            changePanel(inputProcessPanel,outputPanel);
            toOutputPanel();
        }
        else{
            switch(inputMode){
                case 1 -> {
                    changePanel(inputProcessPanel,manualDataPanel);
                    if(processCount > 3){
                        for(int i = 3; i < processCount; i++){
                            panels[i].setVisible(true);
                        }
                        for(int i = 0; i < processCount; i++){
                            for(int x = 4; x <= processCount; x++){
                                combos[i].addItem(x);
                            }
                        }
                    } 
                    if(processCount > 10){
                        burstLabel1.setVisible(true);
                        arrivalLabel1.setVisible(true);
                        priorityLabel1.setVisible(true);
                    }
                }
                case 3 -> {
                    changePanel(inputProcessPanel,randomDataPanel);
                    ArrayList<Integer> prioArray = new ArrayList<>();
                    Random rand = new Random();
                    if(processCount > 3){
                        for(int i = 0; i < processCount; i++){
                            int burstTime = rand.nextInt(30)+1;
                            int arrivalTime = rand.nextInt(30)+1;
                            burst[i].setText(String.valueOf(burstTime));
                            arrival[i].setText(String.valueOf(arrivalTime));
                            prioArray.add(i+1);
                            if(i>=3)
                                randPanels[i].setVisible(true);
                        }
                    }
                    Collections.shuffle(prioArray);
                    for(int i = 0; i<processCount; i++){
                        int set = prioArray.remove(0);
                        prio[i].setText(String.valueOf(set));
                    } 
                    if(processCount > 10){
                        burstLabel3.setVisible(true);
                        arrivalLabel3.setVisible(true);
                        priorityLabel3.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_enterActionPerformed

    private void enterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseExited
        hoverExit(enter);
    }//GEN-LAST:event_enterMouseExited

    private void enterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseEntered
        hoverEnter(enter);
    }//GEN-LAST:event_enterMouseEntered

    private void incButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incButtonMouseClicked
        if(forRoundRobin == 0){
            if(processCount<20){
                processCount++;
                showNumOfProc.setText(String.valueOf(processCount));
            }
        }
        else{
            if(timeQuantum<10){
                timeQuantum++;
                showNumOfProc.setText(String.valueOf(timeQuantum));
            }
        }
    }//GEN-LAST:event_incButtonMouseClicked

    private void decButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decButtonMouseClicked
        if(forRoundRobin == 0){
            if(processCount>3){
                processCount--;
                showNumOfProc.setText(String.valueOf(processCount));
            }
        }
        else{
            if(timeQuantum>1){
                timeQuantum--;
                showNumOfProc.setText(String.valueOf(timeQuantum));
            }
        }
    }//GEN-LAST:event_decButtonMouseClicked

    private void solveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solveMouseEntered
        hoverEnter(solve);
    }//GEN-LAST:event_solveMouseEntered

    private void solveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solveMouseExited
        hoverExit(solve);
    }//GEN-LAST:event_solveMouseExited

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveActionPerformed
        if(checkInputs()){
            changePanel(manualDataPanel,chooseAlgo);
        }
        else{
            JOptionPane.showMessageDialog(chooseInputPanel, "Invalid Inputs. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_solveActionPerformed

    private void randomInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randomInputMouseEntered
        hoverEnter(randomInput);
    }//GEN-LAST:event_randomInputMouseEntered

    private void randomInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randomInputMouseExited
        hoverExit(randomInput);
    }//GEN-LAST:event_randomInputMouseExited

    private void randomInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomInputActionPerformed
        changePanel(chooseInputPanel,inputProcessPanel);
        inputMode = 3;
    }//GEN-LAST:event_randomInputActionPerformed

    private void manualInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manualInputMouseEntered
        hoverEnter(manualInput);
    }//GEN-LAST:event_manualInputMouseEntered

    private void manualInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manualInputMouseExited
        hoverExit(manualInput);
    }//GEN-LAST:event_manualInputMouseExited

    private void manualInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualInputActionPerformed
        changePanel(chooseInputPanel,inputProcessPanel);
        inputMode = 1;
    }//GEN-LAST:event_manualInputActionPerformed

    private void fileInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileInputMouseEntered
        hoverEnter(fileInput);
    }//GEN-LAST:event_fileInputMouseEntered

    private void fileInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileInputMouseExited
        hoverExit(fileInput);
    }//GEN-LAST:event_fileInputMouseExited

    private void fileInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileInputActionPerformed
        inputMode = 2;
        fc.setFileFilter(filter);
        try{
            int returnFile = fc.showOpenDialog(chooseInputPanel);
            if(returnFile == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();
                String str;
                try {
                    FileReader fr = new FileReader(file);
                    BufferedReader bufReader = new BufferedReader(fr);
                    while((str = bufReader.readLine()) != null) {
                        tokens[newCount] = str.split(",");
                        newCount++;
                    }
                    if(newCount<3 || !validator()){
                        tokens = new String[20][5];
                        newCount = 0;
                        JOptionPane.showMessageDialog(chooseInputPanel, message, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileInputBG.png")));
                        hideUnusedPanels();
                        changePanel(chooseInputPanel,randomDataPanel);
                        for(int i = 0; i < newCount; i++){
                            burst[i].setText(String.valueOf(tokens[i][1]));
                            arrival[i].setText(String.valueOf(tokens[i][2]));
                            prio[i].setText(String.valueOf(tokens[i][3]));
                            if(i>=3)
                                randPanels[i].setVisible(true);
                        }
                        if(newCount > 10){
                            burstLabel3.setVisible(true);
                            arrivalLabel3.setVisible(true);
                            priorityLabel3.setVisible(true);
                        }
                    }
                }
                catch (IOException e){
                }
            }
        }
        catch(HeadlessException ex){
        }
    }//GEN-LAST:event_fileInputActionPerformed

    private void priorityP4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP4ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=3)
                combos[i].removeItem(priorityP4.getSelectedItem());
        }
        priorityP4.setEnabled(false);
    }//GEN-LAST:event_priorityP4ItemStateChanged

    private void priorityP5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP5ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=4)
                combos[i].removeItem(priorityP5.getSelectedItem());
        }
        priorityP5.setEnabled(false);
    }//GEN-LAST:event_priorityP5ItemStateChanged

    private void priorityP6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP6ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=5)
                combos[i].removeItem(priorityP6.getSelectedItem());
        }
        priorityP6.setEnabled(false);
    }//GEN-LAST:event_priorityP6ItemStateChanged

    private void priorityP7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP7ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=6)
                combos[i].removeItem(priorityP7.getSelectedItem());
        }
        priorityP7.setEnabled(false);
    }//GEN-LAST:event_priorityP7ItemStateChanged

    private void priorityP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP8ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=7)
                combos[i].removeItem(priorityP8.getSelectedItem());
        }
        priorityP8.setEnabled(false);
    }//GEN-LAST:event_priorityP8ItemStateChanged

    private void priorityP9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP9ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=8)
                combos[i].removeItem(priorityP9.getSelectedItem());
        }
        priorityP9.setEnabled(false);
    }//GEN-LAST:event_priorityP9ItemStateChanged

    private void priorityP10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP10ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=9)
                combos[i].removeItem(priorityP10.getSelectedItem());
        }
        priorityP10.setEnabled(false);
    }//GEN-LAST:event_priorityP10ItemStateChanged

    private void priorityP11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP11ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=10)
                combos[i].removeItem(priorityP11.getSelectedItem());
        }
        priorityP11.setEnabled(false);
    }//GEN-LAST:event_priorityP11ItemStateChanged

    private void priorityP12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP12ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=11)
                combos[i].removeItem(priorityP12.getSelectedItem());
        }
        priorityP12.setEnabled(false);
    }//GEN-LAST:event_priorityP12ItemStateChanged

    private void priorityP13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP13ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=12)
                combos[i].removeItem(priorityP13.getSelectedItem());
        }
        priorityP13.setEnabled(false);
    }//GEN-LAST:event_priorityP13ItemStateChanged

    private void priorityP14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP14ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=13)
                combos[i].removeItem(priorityP14.getSelectedItem());
        }
        priorityP14.setEnabled(false);
    }//GEN-LAST:event_priorityP14ItemStateChanged

    private void priorityP15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP15ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=14)
                combos[i].removeItem(priorityP15.getSelectedItem());
        }
        priorityP15.setEnabled(false);
    }//GEN-LAST:event_priorityP15ItemStateChanged

    private void priorityP16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP16ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=15)
                combos[i].removeItem(priorityP16.getSelectedItem());
        }
        priorityP16.setEnabled(false);
    }//GEN-LAST:event_priorityP16ItemStateChanged

    private void priorityP17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP17ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=16)
                combos[i].removeItem(priorityP17.getSelectedItem());
        }
        priorityP17.setEnabled(false);
    }//GEN-LAST:event_priorityP17ItemStateChanged

    private void priorityP18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP18ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=17)
                combos[i].removeItem(priorityP18.getSelectedItem());
        }
        priorityP18.setEnabled(false);
    }//GEN-LAST:event_priorityP18ItemStateChanged

    private void priorityP19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP19ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=18)
                combos[i].removeItem(priorityP19.getSelectedItem());
        }
        priorityP19.setEnabled(false);
    }//GEN-LAST:event_priorityP19ItemStateChanged

    private void priorityP20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP20ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=19)
                combos[i].removeItem(priorityP20.getSelectedItem());
        }
        priorityP20.setEnabled(false);
    }//GEN-LAST:event_priorityP20ItemStateChanged

    private void solve1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solve1MouseEntered
        hoverEnter(solve1);
    }//GEN-LAST:event_solve1MouseEntered

    private void solve1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solve1MouseExited
        hoverExit(solve1);
    }//GEN-LAST:event_solve1MouseExited

    private void solve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solve1ActionPerformed
        changePanel(randomDataPanel,chooseAlgo);
    }//GEN-LAST:event_solve1ActionPerformed

    private void priorityP3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP3ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=2)
            combos[i].removeItem(priorityP3.getSelectedItem());
        }
        priorityP3.setEnabled(false);
    }//GEN-LAST:event_priorityP3ItemStateChanged

    private void priorityP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP2ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=1)
            combos[i].removeItem(priorityP2.getSelectedItem());
        }
        priorityP2.setEnabled(false);
    }//GEN-LAST:event_priorityP2ItemStateChanged

    private void priorityP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priorityP1ItemStateChanged
        for (int i = 0; i < processCount; i++){
            if(i!=0)
            combos[i].removeItem(priorityP1.getSelectedItem());
        }
        priorityP1.setEnabled(false);
    }//GEN-LAST:event_priorityP1ItemStateChanged

    private void incButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incButtonMousePressed
        incButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upClicked.png")));
    }//GEN-LAST:event_incButtonMousePressed

    private void incButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incButtonMouseReleased
        incButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upArrow.png")));
    }//GEN-LAST:event_incButtonMouseReleased

    private void decButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decButtonMousePressed
        decButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downClicked.png")));
    }//GEN-LAST:event_decButtonMousePressed

    private void decButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decButtonMouseReleased
        decButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downArrow.png")));
    }//GEN-LAST:event_decButtonMouseReleased

    private void fcfsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fcfsMouseEntered
        fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1hover.png")));
    }//GEN-LAST:event_fcfsMouseEntered

    private void fcfsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fcfsMouseExited
        fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1algo.png")));
    }//GEN-LAST:event_fcfsMouseExited

    private void rrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rrMouseExited
        rr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2algo.png")));
    }//GEN-LAST:event_rrMouseExited

    private void rrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rrMouseEntered
        rr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2hover.png")));
    }//GEN-LAST:event_rrMouseEntered

    private void sjfpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sjfpMouseEntered
        sjfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3hover.png")));
    }//GEN-LAST:event_sjfpMouseEntered

    private void sjfpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sjfpMouseExited
        sjfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3algo.png")));
    }//GEN-LAST:event_sjfpMouseExited

    private void sjfnpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sjfnpMouseEntered
        sjfnp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4hover.png")));
    }//GEN-LAST:event_sjfnpMouseEntered

    private void sjfnpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sjfnpMouseExited
        sjfnp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4algo.png")));
    }//GEN-LAST:event_sjfnpMouseExited

    private void priopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priopMouseEntered
        priop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5hover.png")));
    }//GEN-LAST:event_priopMouseEntered

    private void priopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priopMouseExited
        priop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5algo.png")));
    }//GEN-LAST:event_priopMouseExited

    private void prionpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prionpMouseEntered
        prionp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6hover.png")));
    }//GEN-LAST:event_prionpMouseEntered

    private void prionpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prionpMouseExited
        prionp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6algo.png")));
    }//GEN-LAST:event_prionpMouseExited

    private void fcfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcfsActionPerformed
        hideUnusedPanels();
        changePanel(chooseAlgo,outputPanel);
        toOutputPanel();
    }//GEN-LAST:event_fcfsActionPerformed

    private void rrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrActionPerformed
        forRoundRobin = 1;
        changePanel(chooseAlgo,inputProcessPanel);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timeQuanBG.png")));
        showNumOfProc.setText(String.valueOf(timeQuantum));
    }//GEN-LAST:event_rrActionPerformed

    private void hideUnusedPanels(){
        processPanel4.setVisible(false);
        processPanel5.setVisible(false);
        processPanel6.setVisible(false);
        processPanel7.setVisible(false);
        processPanel8.setVisible(false);
        processPanel9.setVisible(false);
        processPanel10.setVisible(false);
        processPanel11.setVisible(false);
        processPanel12.setVisible(false);
        processPanel13.setVisible(false);
        processPanel14.setVisible(false);
        processPanel15.setVisible(false);
        processPanel16.setVisible(false);
        processPanel17.setVisible(false);
        processPanel18.setVisible(false);
        processPanel19.setVisible(false);
        processPanel20.setVisible(false);
        burstLabel1.setVisible(false);
        arrivalLabel1.setVisible(false);
        priorityLabel1.setVisible(false);
        processRandPanel4.setVisible(false);
        processRandPanel5.setVisible(false);
        processRandPanel6.setVisible(false);
        processRandPanel7.setVisible(false);
        processRandPanel8.setVisible(false);
        processRandPanel9.setVisible(false);
        processRandPanel10.setVisible(false);
        processRandPanel11.setVisible(false);
        processRandPanel12.setVisible(false);
        processRandPanel13.setVisible(false);
        processRandPanel14.setVisible(false);
        processRandPanel15.setVisible(false);
        processRandPanel16.setVisible(false);
        processRandPanel17.setVisible(false);
        processRandPanel18.setVisible(false);
        processRandPanel19.setVisible(false);
        processRandPanel20.setVisible(false);
        burstLabel3.setVisible(false);
        arrivalLabel3.setVisible(false);
        priorityLabel3.setVisible(false);
        outputPanel4.setVisible(false);
        outputPanel5.setVisible(false);
        outputPanel6.setVisible(false);
        outputPanel7.setVisible(false);
        outputPanel8.setVisible(false);
        outputPanel9.setVisible(false);
        outputPanel10.setVisible(false);
        outputPanel11.setVisible(false);
        outputPanel12.setVisible(false);
        outputPanel13.setVisible(false);
        outputPanel14.setVisible(false);
        outputPanel15.setVisible(false);
        outputPanel16.setVisible(false);
        outputPanel17.setVisible(false);
        outputPanel18.setVisible(false);
        outputPanel19.setVisible(false);
        outputPanel20.setVisible(false);
        labOut1.setVisible(false);
        labOut2.setVisible(false);
        labOut3.setVisible(false);
        labOut4.setVisible(false);
        labOut5.setVisible(false);
        labOut6.setVisible(false);
        labOut7.setVisible(false);
    }
    
    private void addToArray(){
        panels[0] = processPanel1;
        panels[1] = processPanel2;
        panels[2] = processPanel3;
        panels[3] = processPanel4;
        panels[4] = processPanel5;
        panels[5] = processPanel6;
        panels[6] = processPanel7;
        panels[7] = processPanel8;
        panels[8] = processPanel9;
        panels[9] = processPanel10;
        panels[10] = processPanel11;
        panels[11] = processPanel12;
        panels[12] = processPanel13;
        panels[13] = processPanel14;
        panels[14] = processPanel15;
        panels[15] = processPanel16;
        panels[16] = processPanel17;
        panels[17] = processPanel18;
        panels[18] = processPanel19;
        panels[19] = processPanel20;
        randPanels[0] = processRandPanel1;
        randPanels[1] = processRandPanel2;
        randPanels[2] = processRandPanel3;
        randPanels[3] = processRandPanel4;
        randPanels[4] = processRandPanel5;
        randPanels[5] = processRandPanel6;
        randPanels[6] = processRandPanel7;
        randPanels[7] = processRandPanel8;
        randPanels[8] = processRandPanel9;
        randPanels[9] = processRandPanel10;
        randPanels[10] = processRandPanel11;
        randPanels[11] = processRandPanel12;
        randPanels[12] = processRandPanel13;
        randPanels[13] = processRandPanel14;
        randPanels[14] = processRandPanel15;
        randPanels[15] = processRandPanel16;
        randPanels[16] = processRandPanel17;
        randPanels[17] = processRandPanel18;
        randPanels[18] = processRandPanel19;
        randPanels[19] = processRandPanel20;
        combos[0] = priorityP1;
        combos[1] = priorityP2;
        combos[2] = priorityP3;
        combos[3] = priorityP4;
        combos[4] = priorityP5;
        combos[5] = priorityP6;
        combos[6] = priorityP7;
        combos[7] = priorityP8;
        combos[8] = priorityP9;
        combos[9] = priorityP10;
        combos[10] = priorityP11;
        combos[11] = priorityP12;
        combos[12] = priorityP13;
        combos[13] = priorityP14;
        combos[14] = priorityP15;
        combos[15] = priorityP16;
        combos[16] = priorityP17;
        combos[17] = priorityP18;
        combos[18] = priorityP19;
        combos[19] = priorityP20;
        burst[0] = burst1;
        burst[1] = burst2;
        burst[2] = burst3;
        burst[3] = burst4;
        burst[4] = burst5;
        burst[5] = burst6;
        burst[6] = burst7;
        burst[7] = burst8;
        burst[8] = burst9;
        burst[9] = burst10;
        burst[10] = burst11;
        burst[11] = burst12;
        burst[12] = burst13;
        burst[13] = burst14;
        burst[14] = burst15;
        burst[15] = burst16;
        burst[16] = burst17;
        burst[17] = burst18;
        burst[18] = burst19;
        burst[19] = burst20;
        arrival[0] = arrival1;
        arrival[1] = arrival2;
        arrival[2] = arrival3;
        arrival[3] = arrival4;
        arrival[4] = arrival5;
        arrival[5] = arrival6;
        arrival[6] = arrival7;
        arrival[7] = arrival8;
        arrival[8] = arrival9;
        arrival[9] = arrival10;
        arrival[10] = arrival11;
        arrival[11] = arrival12;
        arrival[12] = arrival13;
        arrival[13] = arrival14;
        arrival[14] = arrival15;
        arrival[15] = arrival16;
        arrival[16] = arrival17;
        arrival[17] = arrival18;
        arrival[18] = arrival19;
        arrival[19] = arrival20;
        prio[0] = prio1;
        prio[1] = prio2;
        prio[2] = prio3;
        prio[3] = prio4;
        prio[4] = prio5;
        prio[5] = prio6;
        prio[6] = prio7;
        prio[7] = prio8;
        prio[8] = prio9;
        prio[9] = prio10;
        prio[10] = prio11;
        prio[11] = prio12;
        prio[12] = prio13;
        prio[13] = prio14;
        prio[14] = prio15;
        prio[15] = prio16;
        prio[16] = prio17;
        prio[17] = prio18;
        prio[18] = prio19;
        prio[19] = prio20;
        out[0] = outputPanel1;
        out[1] = outputPanel2;
        out[2] = outputPanel3;
        out[3] = outputPanel4;
        out[4] = outputPanel5;
        out[5] = outputPanel6;
        out[6] = outputPanel7;
        out[7] = outputPanel8;
        out[8] = outputPanel9;
        out[9] = outputPanel10;
        out[10] = outputPanel11;
        out[11] = outputPanel12;
        out[12] = outputPanel13;
        out[13] = outputPanel14;
        out[14] = outputPanel15;
        out[15] = outputPanel16;
        out[16] = outputPanel17;
        out[17] = outputPanel18;
        out[18] = outputPanel19;
        out[19] = outputPanel20;
    }
    
    public void toOutputPanel(){
        if(processCount > 3 || newCount > 3){
            if(inputMode == 2){
                count = newCount;
            }
            else{
                count = processCount;
            }
            for(int i = 0; i < count; i++){
                /*enter code for output*/
                if(i>=3)
                    out[i].setVisible(true);
            }
        }
        if(processCount > 10){
            labOut1.setVisible(true);
            labOut2.setVisible(true);
            labOut3.setVisible(true);
            labOut4.setVisible(true);
            labOut5.setVisible(true);
            labOut6.setVisible(true);
            labOut7.setVisible(true);
        }
    }
    
    public boolean validator(){
        for(int i = 0; i < newCount; i++){
            if(Integer.parseInt(tokens[i][1]) > 30 || Integer.parseInt(tokens[i][1]) < 1 ){
                message = "Invalid burst time inputs.";
                return false;
            } 
            if(Integer.parseInt(tokens[i][2]) > 30 || Integer.parseInt(tokens[i][2]) < 1){
                message = "Invalid arrival time inputs.";
                return false;
            }
            if(Integer.parseInt(tokens[i][3]) < 1 || Integer.parseInt(tokens[i][3]) > newCount){
                message = "Invalid priority time inputs.";
                return false;
            }
            if(i < newCount-1){
                if(Integer.parseInt(tokens[i][3]) == Integer.parseInt(tokens[i+1][3])){
                    message = "Invalid priority time inputs.";
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean checkInputs(){
        for(int i=0; i<processCount; i++){
            if(combos[i].getSelectedItem()=="Choose"){
                return false;
            }
        }
        return true;
    }
    
    private void hoverEnter(Component obj){
        obj.setForeground(new Color(255,153,0));
        obj.setBackground(Color.black);
    }
    
    private void hoverExit(Component obj){
        obj.setForeground(Color.black);
        obj.setBackground(new Color(255,153,0));
    }
    
    private void changePanel (JPanel current, JPanel next){
        current.setVisible(false);
        next.setVisible(true);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel arrival1;
    private javax.swing.JLabel arrival10;
    private javax.swing.JLabel arrival11;
    private javax.swing.JLabel arrival12;
    private javax.swing.JLabel arrival13;
    private javax.swing.JLabel arrival14;
    private javax.swing.JLabel arrival15;
    private javax.swing.JLabel arrival16;
    private javax.swing.JLabel arrival17;
    private javax.swing.JLabel arrival18;
    private javax.swing.JLabel arrival19;
    private javax.swing.JLabel arrival2;
    private javax.swing.JLabel arrival20;
    private javax.swing.JLabel arrival3;
    private javax.swing.JLabel arrival4;
    private javax.swing.JLabel arrival5;
    private javax.swing.JLabel arrival6;
    private javax.swing.JLabel arrival7;
    private javax.swing.JLabel arrival8;
    private javax.swing.JLabel arrival9;
    private javax.swing.JLabel arrivalLabel1;
    private javax.swing.JLabel arrivalLabel2;
    private javax.swing.JLabel arrivalLabel3;
    private javax.swing.JLabel arrivalLabel4;
    private javax.swing.JLabel arrivalOut1;
    private javax.swing.JLabel arrivalOut10;
    private javax.swing.JLabel arrivalOut11;
    private javax.swing.JLabel arrivalOut12;
    private javax.swing.JLabel arrivalOut13;
    private javax.swing.JLabel arrivalOut14;
    private javax.swing.JLabel arrivalOut15;
    private javax.swing.JLabel arrivalOut16;
    private javax.swing.JLabel arrivalOut17;
    private javax.swing.JLabel arrivalOut18;
    private javax.swing.JLabel arrivalOut19;
    private javax.swing.JLabel arrivalOut2;
    private javax.swing.JLabel arrivalOut20;
    private javax.swing.JLabel arrivalOut3;
    private javax.swing.JLabel arrivalOut4;
    private javax.swing.JLabel arrivalOut5;
    private javax.swing.JLabel arrivalOut6;
    private javax.swing.JLabel arrivalOut7;
    private javax.swing.JLabel arrivalOut8;
    private javax.swing.JLabel arrivalOut9;
    private javax.swing.JSpinner arrivalP1;
    private javax.swing.JSpinner arrivalP10;
    private javax.swing.JSpinner arrivalP11;
    private javax.swing.JSpinner arrivalP12;
    private javax.swing.JSpinner arrivalP13;
    private javax.swing.JSpinner arrivalP14;
    private javax.swing.JSpinner arrivalP15;
    private javax.swing.JSpinner arrivalP16;
    private javax.swing.JSpinner arrivalP17;
    private javax.swing.JSpinner arrivalP18;
    private javax.swing.JSpinner arrivalP19;
    private javax.swing.JSpinner arrivalP2;
    private javax.swing.JSpinner arrivalP20;
    private javax.swing.JSpinner arrivalP3;
    private javax.swing.JSpinner arrivalP4;
    private javax.swing.JSpinner arrivalP5;
    private javax.swing.JSpinner arrivalP6;
    private javax.swing.JSpinner arrivalP7;
    private javax.swing.JSpinner arrivalP8;
    private javax.swing.JSpinner arrivalP9;
    private javax.swing.JLabel ave1;
    private javax.swing.JLabel ave10;
    private javax.swing.JLabel ave11;
    private javax.swing.JLabel ave12;
    private javax.swing.JLabel ave13;
    private javax.swing.JLabel ave14;
    private javax.swing.JLabel ave15;
    private javax.swing.JLabel ave16;
    private javax.swing.JLabel ave17;
    private javax.swing.JLabel ave18;
    private javax.swing.JLabel ave19;
    private javax.swing.JLabel ave2;
    private javax.swing.JLabel ave20;
    private javax.swing.JLabel ave3;
    private javax.swing.JLabel ave4;
    private javax.swing.JLabel ave5;
    private javax.swing.JLabel ave6;
    private javax.swing.JLabel ave7;
    private javax.swing.JLabel ave8;
    private javax.swing.JLabel ave9;
    private javax.swing.JLabel burst1;
    private javax.swing.JLabel burst10;
    private javax.swing.JLabel burst11;
    private javax.swing.JLabel burst12;
    private javax.swing.JLabel burst13;
    private javax.swing.JLabel burst14;
    private javax.swing.JLabel burst15;
    private javax.swing.JLabel burst16;
    private javax.swing.JLabel burst17;
    private javax.swing.JLabel burst18;
    private javax.swing.JLabel burst19;
    private javax.swing.JLabel burst2;
    private javax.swing.JLabel burst20;
    private javax.swing.JLabel burst3;
    private javax.swing.JLabel burst4;
    private javax.swing.JLabel burst5;
    private javax.swing.JLabel burst6;
    private javax.swing.JLabel burst7;
    private javax.swing.JLabel burst8;
    private javax.swing.JLabel burst9;
    private javax.swing.JLabel burstLabel1;
    private javax.swing.JLabel burstLabel2;
    private javax.swing.JLabel burstLabel3;
    private javax.swing.JLabel burstLabel4;
    private javax.swing.JLabel burstOut1;
    private javax.swing.JLabel burstOut10;
    private javax.swing.JLabel burstOut11;
    private javax.swing.JLabel burstOut12;
    private javax.swing.JLabel burstOut13;
    private javax.swing.JLabel burstOut14;
    private javax.swing.JLabel burstOut15;
    private javax.swing.JLabel burstOut16;
    private javax.swing.JLabel burstOut17;
    private javax.swing.JLabel burstOut18;
    private javax.swing.JLabel burstOut19;
    private javax.swing.JLabel burstOut2;
    private javax.swing.JLabel burstOut20;
    private javax.swing.JLabel burstOut3;
    private javax.swing.JLabel burstOut4;
    private javax.swing.JLabel burstOut5;
    private javax.swing.JLabel burstOut6;
    private javax.swing.JLabel burstOut7;
    private javax.swing.JLabel burstOut8;
    private javax.swing.JLabel burstOut9;
    private javax.swing.JSpinner burstP1;
    private javax.swing.JSpinner burstP10;
    private javax.swing.JSpinner burstP11;
    private javax.swing.JSpinner burstP12;
    private javax.swing.JSpinner burstP13;
    private javax.swing.JSpinner burstP14;
    private javax.swing.JSpinner burstP15;
    private javax.swing.JSpinner burstP16;
    private javax.swing.JSpinner burstP17;
    private javax.swing.JSpinner burstP18;
    private javax.swing.JSpinner burstP19;
    private javax.swing.JSpinner burstP2;
    private javax.swing.JSpinner burstP20;
    private javax.swing.JSpinner burstP3;
    private javax.swing.JSpinner burstP4;
    private javax.swing.JSpinner burstP5;
    private javax.swing.JSpinner burstP6;
    private javax.swing.JSpinner burstP7;
    private javax.swing.JSpinner burstP8;
    private javax.swing.JSpinner burstP9;
    private javax.swing.JPanel chooseAlgo;
    private javax.swing.JPanel chooseInputPanel;
    private javax.swing.JLabel decButton;
    private javax.swing.JButton enter;
    private javax.swing.JLabel exitButton;
    private javax.swing.JButton fcfs;
    private javax.swing.JButton fileInput;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel incButton;
    private javax.swing.JPanel inputProcessPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labOut1;
    private javax.swing.JLabel labOut2;
    private javax.swing.JLabel labOut3;
    private javax.swing.JLabel labOut4;
    private javax.swing.JLabel labOut5;
    private javax.swing.JLabel labOut6;
    private javax.swing.JLabel labOut7;
    private javax.swing.JPanel manualDataPanel;
    private javax.swing.JButton manualInput;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JPanel outputPanel1;
    private javax.swing.JPanel outputPanel10;
    private javax.swing.JPanel outputPanel11;
    private javax.swing.JPanel outputPanel12;
    private javax.swing.JPanel outputPanel13;
    private javax.swing.JPanel outputPanel14;
    private javax.swing.JPanel outputPanel15;
    private javax.swing.JPanel outputPanel16;
    private javax.swing.JPanel outputPanel17;
    private javax.swing.JPanel outputPanel18;
    private javax.swing.JPanel outputPanel19;
    private javax.swing.JPanel outputPanel2;
    private javax.swing.JPanel outputPanel20;
    private javax.swing.JPanel outputPanel3;
    private javax.swing.JPanel outputPanel4;
    private javax.swing.JPanel outputPanel5;
    private javax.swing.JPanel outputPanel6;
    private javax.swing.JPanel outputPanel7;
    private javax.swing.JPanel outputPanel8;
    private javax.swing.JPanel outputPanel9;
    private javax.swing.JLabel prio1;
    private javax.swing.JLabel prio10;
    private javax.swing.JLabel prio11;
    private javax.swing.JLabel prio12;
    private javax.swing.JLabel prio13;
    private javax.swing.JLabel prio14;
    private javax.swing.JLabel prio15;
    private javax.swing.JLabel prio16;
    private javax.swing.JLabel prio17;
    private javax.swing.JLabel prio18;
    private javax.swing.JLabel prio19;
    private javax.swing.JLabel prio2;
    private javax.swing.JLabel prio20;
    private javax.swing.JLabel prio3;
    private javax.swing.JLabel prio4;
    private javax.swing.JLabel prio5;
    private javax.swing.JLabel prio6;
    private javax.swing.JLabel prio7;
    private javax.swing.JLabel prio8;
    private javax.swing.JLabel prio9;
    private javax.swing.JLabel prioOut1;
    private javax.swing.JLabel prioOut10;
    private javax.swing.JLabel prioOut11;
    private javax.swing.JLabel prioOut12;
    private javax.swing.JLabel prioOut13;
    private javax.swing.JLabel prioOut14;
    private javax.swing.JLabel prioOut15;
    private javax.swing.JLabel prioOut16;
    private javax.swing.JLabel prioOut17;
    private javax.swing.JLabel prioOut18;
    private javax.swing.JLabel prioOut19;
    private javax.swing.JLabel prioOut2;
    private javax.swing.JLabel prioOut20;
    private javax.swing.JLabel prioOut3;
    private javax.swing.JLabel prioOut4;
    private javax.swing.JLabel prioOut5;
    private javax.swing.JLabel prioOut6;
    private javax.swing.JLabel prioOut7;
    private javax.swing.JLabel prioOut8;
    private javax.swing.JLabel prioOut9;
    private javax.swing.JButton prionp;
    private javax.swing.JButton priop;
    private javax.swing.JLabel priorityLabel1;
    private javax.swing.JLabel priorityLabel2;
    private javax.swing.JLabel priorityLabel3;
    private javax.swing.JLabel priorityLabel4;
    private javax.swing.JComboBox<String> priorityP1;
    private javax.swing.JComboBox<String> priorityP10;
    private javax.swing.JComboBox<String> priorityP11;
    private javax.swing.JComboBox<String> priorityP12;
    private javax.swing.JComboBox<String> priorityP13;
    private javax.swing.JComboBox<String> priorityP14;
    private javax.swing.JComboBox<String> priorityP15;
    private javax.swing.JComboBox<String> priorityP16;
    private javax.swing.JComboBox<String> priorityP17;
    private javax.swing.JComboBox<String> priorityP18;
    private javax.swing.JComboBox<String> priorityP19;
    private javax.swing.JComboBox<String> priorityP2;
    private javax.swing.JComboBox<String> priorityP20;
    private javax.swing.JComboBox<String> priorityP3;
    private javax.swing.JComboBox<String> priorityP4;
    private javax.swing.JComboBox<String> priorityP5;
    private javax.swing.JComboBox<String> priorityP6;
    private javax.swing.JComboBox<String> priorityP7;
    private javax.swing.JComboBox<String> priorityP8;
    private javax.swing.JComboBox<String> priorityP9;
    private javax.swing.JPanel processPanel1;
    private javax.swing.JPanel processPanel10;
    private javax.swing.JPanel processPanel11;
    private javax.swing.JPanel processPanel12;
    private javax.swing.JPanel processPanel13;
    private javax.swing.JPanel processPanel14;
    private javax.swing.JPanel processPanel15;
    private javax.swing.JPanel processPanel16;
    private javax.swing.JPanel processPanel17;
    private javax.swing.JPanel processPanel18;
    private javax.swing.JPanel processPanel19;
    private javax.swing.JPanel processPanel2;
    private javax.swing.JPanel processPanel20;
    private javax.swing.JPanel processPanel3;
    private javax.swing.JPanel processPanel4;
    private javax.swing.JPanel processPanel5;
    private javax.swing.JPanel processPanel6;
    private javax.swing.JPanel processPanel7;
    private javax.swing.JPanel processPanel8;
    private javax.swing.JPanel processPanel9;
    private javax.swing.JPanel processRandPanel1;
    private javax.swing.JPanel processRandPanel10;
    private javax.swing.JPanel processRandPanel11;
    private javax.swing.JPanel processRandPanel12;
    private javax.swing.JPanel processRandPanel13;
    private javax.swing.JPanel processRandPanel14;
    private javax.swing.JPanel processRandPanel15;
    private javax.swing.JPanel processRandPanel16;
    private javax.swing.JPanel processRandPanel17;
    private javax.swing.JPanel processRandPanel18;
    private javax.swing.JPanel processRandPanel19;
    private javax.swing.JPanel processRandPanel2;
    private javax.swing.JPanel processRandPanel20;
    private javax.swing.JPanel processRandPanel3;
    private javax.swing.JPanel processRandPanel4;
    private javax.swing.JPanel processRandPanel5;
    private javax.swing.JPanel processRandPanel6;
    private javax.swing.JPanel processRandPanel7;
    private javax.swing.JPanel processRandPanel8;
    private javax.swing.JPanel processRandPanel9;
    private javax.swing.JPanel randomDataPanel;
    private javax.swing.JButton randomInput;
    private javax.swing.JButton rr;
    private javax.swing.JLabel showNumOfProc;
    private javax.swing.JButton sjfnp;
    private javax.swing.JButton sjfp;
    private javax.swing.JButton solve;
    private javax.swing.JButton solve1;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel turnTime1;
    private javax.swing.JLabel turnTime10;
    private javax.swing.JLabel turnTime11;
    private javax.swing.JLabel turnTime12;
    private javax.swing.JLabel turnTime13;
    private javax.swing.JLabel turnTime14;
    private javax.swing.JLabel turnTime15;
    private javax.swing.JLabel turnTime16;
    private javax.swing.JLabel turnTime17;
    private javax.swing.JLabel turnTime18;
    private javax.swing.JLabel turnTime19;
    private javax.swing.JLabel turnTime2;
    private javax.swing.JLabel turnTime20;
    private javax.swing.JLabel turnTime3;
    private javax.swing.JLabel turnTime4;
    private javax.swing.JLabel turnTime5;
    private javax.swing.JLabel turnTime6;
    private javax.swing.JLabel turnTime7;
    private javax.swing.JLabel turnTime8;
    private javax.swing.JLabel turnTime9;
    private javax.swing.JLabel waitTime1;
    private javax.swing.JLabel waitTime10;
    private javax.swing.JLabel waitTime11;
    private javax.swing.JLabel waitTime12;
    private javax.swing.JLabel waitTime13;
    private javax.swing.JLabel waitTime14;
    private javax.swing.JLabel waitTime15;
    private javax.swing.JLabel waitTime16;
    private javax.swing.JLabel waitTime17;
    private javax.swing.JLabel waitTime18;
    private javax.swing.JLabel waitTime19;
    private javax.swing.JLabel waitTime2;
    private javax.swing.JLabel waitTime20;
    private javax.swing.JLabel waitTime3;
    private javax.swing.JLabel waitTime4;
    private javax.swing.JLabel waitTime5;
    private javax.swing.JLabel waitTime6;
    private javax.swing.JLabel waitTime7;
    private javax.swing.JLabel waitTime8;
    private javax.swing.JLabel waitTime9;
    // End of variables declaration//GEN-END:variables
}