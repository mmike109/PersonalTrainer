import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 *The purpose of this application is to measure one's training progress
 * and claculate calories burned based on different sport activities. 
 * 
 */
/**
 *
 * @author Michael Gornik
 */
public class PersonalTrainer1 extends javax.swing.JFrame {
    String weightFlag; // Variable used to determine weight units
    String heightFlag; // Variable used to determine height units
    double cBurned; // Variable used to calculate total burned calories
    double MET; // Calculates MET (metabolic equivalent)
    double origMET; // Variable used to calculate final MET
    double weight; // Stores converted weight
    double time; // Stores activity duration
    int age; // Stores the age of the user

    /**
     * Creates new form PersonalTrainer1
     */
    public PersonalTrainer1() {
        initComponents();
        setSize(780, 750);
    }

    // Generating Form Controllers
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        cmbGen = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        txtMET = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConf = new java.awt.Button();
        btnReset = new java.awt.Button();
        cmbActive = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdoCM = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rdoFT = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        rdoKG = new javax.swing.JLabel();
        rdoKg = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rdoLbs = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        ageSpinner = new javax.swing.JSpinner();
        txtH = new javax.swing.JTextField();
        txtW = new javax.swing.JTextField();
        cmbAero = new javax.swing.JComboBox<>();
        cmbSwim = new javax.swing.JComboBox<>();
        cmbCardio = new javax.swing.JComboBox<>();
        cmbStrenght = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        frmResults = new javax.swing.JInternalFrame();
        lblCalories = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator2 = new javax.swing.JSeparator();
        lblResult = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbMET = new javax.swing.JComboBox<>();
        txtTime = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSurename = new javax.swing.JTextField();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Gender :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 270, 47, 20);

        cmbGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Male ", " Female "," Other " }));
        cmbGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenActionPerformed(evt);
            }
        });
        getContentPane().add(cmbGen);
        cmbGen.setBounds(60, 270, 90, 26);

        txtName.setEditable(false);
        txtName.setText(" ");
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(90, 190, 120, 30);

        txtMET.setEditable(false);
        txtMET.setText(" ");
        txtMET.setName("txtMET"); // NOI18N
        getContentPane().add(txtMET);
        txtMET.setBounds(70, 350, 117, 24);

        jLabel2.setText("Given Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 180, 83, 50);

        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 180, 70, 50);

        btnConf.setLabel("Calculate");
        btnConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfActionPerformed(evt);
            }
        });
        getContentPane().add(btnConf);
        btnConf.setBounds(10, 660, 73, 24);

        btnReset.setLabel("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(700, 660, 50, 24);

        cmbActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Aerobics", "Cardio", "Strength Training", "Swimming" }));
        cmbActive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbActiveItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbActive);
        cmbActive.setBounds(70, 310, 114, 26);

        jLabel5.setText("Activity: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 310, 61, 16);

        jLabel6.setText("Time (in mins)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 390, 80, 20);

        jLabel7.setText("Height: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 430, 42, 16);

        jLabel8.setText("Centimeters");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 430, 70, 30);
        getContentPane().add(rdoCM);
        rdoCM.setBounds(220, 430, 30, 28);

        jLabel9.setText("Feet");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 430, 40, 30);

        rdoFT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoFTMouseClicked(evt);
            }
        });
        getContentPane().add(rdoFT);
        rdoFT.setBounds(330, 430, 30, 28);

        jLabel10.setText("Weight:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 470, 43, 16);

        rdoKG.setText("Kilograms");
        getContentPane().add(rdoKG);
        rdoKG.setBounds(250, 470, 58, 30);
        getContentPane().add(rdoKg);
        rdoKg.setBounds(218, 470, 30, 28);

        jLabel12.setText("Lbs");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(360, 470, 21, 30);
        getContentPane().add(rdoLbs);
        rdoLbs.setBounds(330, 470, 30, 28);

        jLabel13.setText("Age");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 230, 30, 20);

        ageSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        ageSpinner.setFocusCycleRoot(true);
        getContentPane().add(ageSpinner);
        ageSpinner.setBounds(40, 230, 64, 26);

        txtH.setText("What is your height? ");
        txtH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHMouseClicked(evt);
            }
        });
        getContentPane().add(txtH);
        txtH.setBounds(60, 430, 130, 24);

        txtW.setText("What is your weight? ");
        txtW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWMouseClicked(evt);
            }
        });
        getContentPane().add(txtW);
        txtW.setBounds(60, 470, 130, 24);

        cmbAero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rowing", "Jogging", "Rope Jumping" }));
        cmbAero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAeroItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbAero);
        cmbAero.setBounds(210, 310, 116, 26);

        cmbSwim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Butterfly Stroke", "Back Stroke", "Breast Stroke" }));
        cmbSwim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSwimItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbSwim);
        cmbSwim.setBounds(210, 310, 116, 26);

        cmbCardio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Walking", "Cycling", "Running" }));
        cmbCardio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCardioItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbCardio);
        cmbCardio.setBounds(210, 310, 116, 26);

        cmbStrenght.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bench Press", "Squat", "Dead Lift"}));
        cmbStrenght.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStrenghtItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbStrenght);
        cmbStrenght.setBounds(210, 310, 116, 26);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Michael\\Downloads\\running.jpeg")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 40, 740, 140);

        frmResults.setTitle("Results");
        frmResults.setToolTipText("");
        frmResults.setName(""); // NOI18N
        frmResults.setVisible(true);

        lblCalories.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCalories.setText("Calories Burned: ");
        lblCalories.setToolTipText("");

        jProgressBar1.setValue(50);

        lblResult.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblResult.setText("Congratulations!");
        lblResult.setToolTipText("");

        javax.swing.GroupLayout frmResultsLayout = new javax.swing.GroupLayout(frmResults.getContentPane());
        frmResults.getContentPane().setLayout(frmResultsLayout);
        frmResultsLayout.setHorizontalGroup(
            frmResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmResultsLayout.createSequentialGroup()
                        .addComponent(lblCalories, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                        .addGap(4374, 4374, 4374))
                    .addGroup(frmResultsLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frmResultsLayout.createSequentialGroup()
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        frmResultsLayout.setVerticalGroup(
            frmResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmResultsLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalories, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(frmResults);
        frmResults.setBounds(10, 510, 740, 140);

        jLabel15.setText("Intensity: ");
        jLabel15.setName("lblMET"); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 350, 61, 16);

        cmbMET.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Light", "Moderate", "Vigorous" }));
        cmbMET.setName("cmbMET"); // NOI18N
        cmbMET.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMETItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbMET);
        cmbMET.setBounds(190, 350, 114, 26);
        getContentPane().add(txtTime);
        txtTime.setBounds(100, 390, 117, 24);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Welcome to your personal trainer! Prepare yourself to get ripped!");
        jLabel16.setToolTipText("");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 740, 24);

        txtSurename.setEditable(false);
        txtSurename.setText(" ");
        txtSurename.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSurenameMouseClicked(evt);
            }
        });
        getContentPane().add(txtSurename);
        txtSurename.setBounds(630, 190, 117, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenActionPerformed
    
    // Button used to calculate calories burned based on activities
    private void btnConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfActionPerformed


        try {
            weight = Integer.parseInt(txtW.getText());
            time = Integer.parseInt(txtTime.getText());
            age = (int) ageSpinner.getValue();
            //Conversion from minutes to hours
            time = time / 60;

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Please fill the required textfields and try again." + System.lineSeparator() + "Only numbers are allowed!");
        }

        if (weightFlag == "LBS") {
            //If user enters weight in LBS, conversion from LBS to KG occurs
            weight = weight / 2.204;
        }
        
        if (weightFlag == null || heightFlag == null) {
            JOptionPane.showMessageDialog(null, "Please specify all the measruments");
        } 
        
        else if (age <= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "Oops! It looks like we missed your age.",
                    "Unwanted action",
                    JOptionPane.WARNING_MESSAGE
            );
            
        } 
            
        else {
            DecimalFormat df = new DecimalFormat("#.##");
            cBurned = (time * 60 * MET * 3.5 * weight / 200);
            cBurned = Double.valueOf(df.format(cBurned));
            //lblCalories.setText("Calories Burned: " + time * 60 * MET * 3.5 * weight / 200);
            lblResult.setText("Congratulations, " + txtName.getText() + " " + txtSurename.getText() + "!");
            lblCalories.setText("Calories Burned: " + cBurned);
        }             
    }//GEN-LAST:event_btnConfActionPerformed

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        txtMET.setText("");
        txtName.setText("");
        txtTime.setText("");
        cmbActive.setSelectedIndex(0);
        cmbGen.setSelectedIndex(0);
        txtSurename.setText("");
        ageSpinner.setValue(0);
        lblCalories.setText("Congratulations!");
        lblResult.setText("Calories Burned:");
        txtH.setText("What is your height?");
        txtW.setText("What is your weight?");
        cmbAero.setVisible(false);
        cmbSwim.setVisible(false);
        cmbCardio.setVisible(false);
        cmbStrenght.setVisible(false);
        cmbMET.setVisible(false);
        //Resetting radiobuttons (Height)
        rdoFT.setSelected(false);
        rdoFT.setEnabled(true);
        rdoCM.setSelected(false);
        rdoCM.setEnabled(true);
        //Resettomg radiobuttons (Weight)
        rdoKg.setSelected(false);
        rdoKg.setEnabled(true);
        rdoLbs.setSelected(false);
        rdoLbs.setEnabled(true);
    }//GEN-LAST:event_btnResetMouseClicked

    private void txtHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHMouseClicked
        // TODO add your handling code here:
        txtH.setText("");
    }//GEN-LAST:event_txtHMouseClicked

    private void txtWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWMouseClicked
        // TODO add your handling code here:
        txtW.setText("");
    }//GEN-LAST:event_txtWMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cmbAero.setVisible(false);
        cmbSwim.setVisible(false);
        cmbCardio.setVisible(false);
        cmbStrenght.setVisible(false);
        cmbMET.setVisible(false);

    }//GEN-LAST:event_formWindowOpened

    private void cmbActiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbActiveItemStateChanged
        // TODO add your handling code here:

        //Aerobics
        if (cmbActive.getSelectedIndex() == 1) {
            cmbAero.setVisible(true);

            if (cmbAero.getSelectedIndex() == 0) {
                MET = 8.92;
                origMET = MET;
                cmbMET.setVisible(true);
                txtMET.setText(Double.toString(MET));
            }

        } else {
            cmbAero.setVisible(false);
        }

        //Cardio
        if (cmbActive.getSelectedIndex() == 2) {
            cmbCardio.setVisible(true);

            if (cmbCardio.getSelectedIndex() == 0) {
                MET = 3;
                origMET = MET;
                cmbMET.setVisible(true);
                txtMET.setText(Double.toString(MET));
            }

        } else {
            cmbCardio.setVisible(false);
        }

        //Strenth Traning
        if (cmbActive.getSelectedIndex() == 3) {
            cmbStrenght.setVisible(true);

            if (cmbStrenght.getSelectedIndex() == 0) {
                MET = 8.5;
                origMET = MET;
                cmbMET.setVisible(true);
                txtMET.setText(Double.toString(MET));
            }

        } else {
            cmbStrenght.setVisible(false);
        }

        //Swimming
        if (cmbActive.getSelectedIndex() == 4) {
            cmbSwim.setVisible(true);

            if (cmbSwim.getSelectedIndex() == 0) {
                MET = 11;
                origMET = MET;
                cmbMET.setVisible(true);
                txtMET.setText(Double.toString(MET));
            }

        } else {
            cmbSwim.setVisible(false);
        }
    }//GEN-LAST:event_cmbActiveItemStateChanged

    private void rdoFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoFTMouseClicked

        rdoCM.setSelected(false);
    }//GEN-LAST:event_rdoFTMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:v
        if (rdoCM.isSelected() && rdoCM.isEnabled()) //CM
        {
            rdoFT.setSelected(false);
            rdoCM.setEnabled(false);
            rdoFT.setEnabled(true);
            heightFlag = "CM";
        }

        if (rdoFT.isSelected() && rdoFT.isEnabled()) {
            rdoCM.setSelected(false);
            rdoFT.setEnabled(false);
            rdoCM.setEnabled(true);
            heightFlag = "FT";
        }
        if (rdoKg.isSelected() && rdoKg.isEnabled()) {
            rdoLbs.setSelected(false);
            rdoKg.setEnabled(false);
            rdoLbs.setEnabled(true);
            weightFlag = "KG";
        }

        if (rdoLbs.isSelected() && rdoLbs.isEnabled()) {
            rdoKg.setSelected(false);
            rdoLbs.setEnabled(false);
            rdoKg.setEnabled(true);
            weightFlag = "LBS";
        }
    }//GEN-LAST:event_formMouseMoved

    private void cmbMETItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMETItemStateChanged
        // TODO add your handling code here:
        if (cmbMET.getSelectedIndex() == 0) {

            MET = origMET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbMET.getSelectedIndex() == 1) {

            MET = origMET + 3;
            txtMET.setText(Double.toString(MET));

        } else if (cmbMET.getSelectedIndex() == 2) {

            MET = origMET + 6;
            txtMET.setText(Double.toString(MET));
        }
    }//GEN-LAST:event_cmbMETItemStateChanged

    private void cmbAeroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAeroItemStateChanged
        // TODO add your handling code here:
        if (cmbAero.getSelectedIndex() == 0) {
            MET = 8.92;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbAero.getSelectedIndex() == 1) {
            MET = 7.5;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbAero.getSelectedIndex() == 2) {
            MET = 10;
            origMET = MET;
            txtMET.setText(Double.toString(MET));
        }

        cmbMET.setVisible(true);
    }//GEN-LAST:event_cmbAeroItemStateChanged

    private void cmbCardioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCardioItemStateChanged
        // TODO add your handling code here:
        if (cmbCardio.getSelectedIndex() == 0) {
            MET = 3;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbCardio.getSelectedIndex() == 1) {
            MET = 6;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbCardio.getSelectedIndex() == 2) {
            MET = 10.2;
            origMET = MET;
            txtMET.setText(Double.toString(MET));
        }

        cmbMET.setVisible(true);
    }//GEN-LAST:event_cmbCardioItemStateChanged

    private void cmbStrenghtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStrenghtItemStateChanged
        // TODO add your handling code here:
        if (cmbStrenght.getSelectedIndex() == 0) {
            MET = 8.5;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbStrenght.getSelectedIndex() == 1) {
            MET = 5.5;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbStrenght.getSelectedIndex() == 2) {
            MET = 13;
            origMET = MET;
            txtMET.setText(Double.toString(MET));
        }

        cmbMET.setVisible(true);
    }//GEN-LAST:event_cmbStrenghtItemStateChanged

    private void cmbSwimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSwimItemStateChanged
        // TODO add your handling code here:
        if (cmbSwim.getSelectedIndex() == 0) {
            MET = 11;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbSwim.getSelectedIndex() == 1) {
            MET = 7;
            origMET = MET;
            txtMET.setText(Double.toString(MET));

        } else if (cmbSwim.getSelectedIndex() == 2) {
            MET = 10;
            origMET = MET;
            txtMET.setText(Double.toString(MET));
        }

        cmbMET.setVisible(true);
    }//GEN-LAST:event_cmbSwimItemStateChanged

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked

        String name = JOptionPane.showInputDialog(
                null,
                "Please enter your name!",
                "Textfield Required",
                JOptionPane.INFORMATION_MESSAGE
        );

        if (name != null && !(name.matches("^\\d+(\\.\\d+)?"))) {
            txtName.setText(name);
        } else {
            name = JOptionPane.showInputDialog(
                    null,
                    "No name was entered. Please enter a name and try again!",
                    "Textfield Required",
                    JOptionPane.ERROR_MESSAGE
            );

            if ((name != null) && (name.length() > 0) && !(name.matches("^\\d+(\\.\\d+)?"))) {
                txtName.setText(name);

            } else {
                txtName.setText("Anonymous");
            }

        }
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtSurenameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSurenameMouseClicked
        // TODO add your handling code here:
        String surename = JOptionPane.showInputDialog(
                null,
                "Please enter your last name!",
                "Textfield Required",
                JOptionPane.INFORMATION_MESSAGE
        );

        if (surename != null && !(surename.matches("^\\d+(\\.\\d+)?"))) {
            txtSurename.setText(surename);
        } else {
            surename = JOptionPane.showInputDialog(
                    null,
                    "No last name was entered. Please enter last name and try again!",
                    "Textfield Required",
                    JOptionPane.ERROR_MESSAGE
            );

            if ((surename != null) && (surename.length() > 0) && !(surename.matches("^\\d+(\\.\\d+)?"))) {
                txtName.setText(surename);

            } else {
                txtName.setText("");
            }
        }
    }//GEN-LAST:event_txtSurenameMouseClicked

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
            java.util.logging.Logger.getLogger(PersonalTrainer1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalTrainer1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalTrainer1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalTrainer1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalTrainer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ageSpinner;
    private java.awt.Button btnConf;
    private java.awt.Button btnReset;
    private javax.swing.JComboBox<String> cmbActive;
    private javax.swing.JComboBox<String> cmbAero;
    private javax.swing.JComboBox<String> cmbCardio;
    private javax.swing.JComboBox<String> cmbGen;
    private javax.swing.JComboBox<String> cmbMET;
    private javax.swing.JComboBox<String> cmbStrenght;
    private javax.swing.JComboBox<String> cmbSwim;
    private javax.swing.JInternalFrame frmResults;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCalories;
    private javax.swing.JLabel lblResult;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JRadioButton rdoCM;
    private javax.swing.JRadioButton rdoFT;
    private javax.swing.JLabel rdoKG;
    private javax.swing.JRadioButton rdoKg;
    private javax.swing.JRadioButton rdoLbs;
    private javax.swing.JTextField txtH;
    private javax.swing.JTextField txtMET;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurename;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtW;
    // End of variables declaration//GEN-END:variables
}
