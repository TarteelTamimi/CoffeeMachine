package coffeemachine;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuiMain extends javax.swing.JFrame {

    public GuiMain() {
        initComponents();
    }
    
    Calendar c = Calendar.getInstance();
    
    BeansContainer b1 = new BeansContainer(180, 180, 57);
    WaterContainer w1 = new WaterContainer(500, 500);
    Grinder g1 = new Grinder(1);
    WasteTray t1 = new WasteTray(100, 0);
    FileLogger fw1 = new FileLogger();
    CoffeeMachine c1 = new CoffeeMachine(w1, b1, t1, g1, fw1);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        startButton = new javax.swing.JButton();
        espressoSingleShotButton = new javax.swing.JRadioButton();
        espressoDoubleShotButton = new javax.swing.JRadioButton();
        americanoSingleShotButton = new javax.swing.JRadioButton();
        americanoDoubleShotButton = new javax.swing.JRadioButton();
        stopButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        makeCoffeeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stateTextArea = new javax.swing.JTextArea();
        fillBeansButton = new javax.swing.JButton();
        fillWaterButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee Machine");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        startButton.setBackground(new java.awt.Color(226, 120, 14));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        espressoSingleShotButton.setBackground(new java.awt.Color(226, 169, 117));
        buttonGroup.add(espressoSingleShotButton);
        espressoSingleShotButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        espressoSingleShotButton.setText("Espresso single shot");
        espressoSingleShotButton.setEnabled(false);
        espressoSingleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espressoSingleShotButtonActionPerformed(evt);
            }
        });

        espressoDoubleShotButton.setBackground(new java.awt.Color(226, 169, 117));
        buttonGroup.add(espressoDoubleShotButton);
        espressoDoubleShotButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        espressoDoubleShotButton.setText("Espresso double shot");
        espressoDoubleShotButton.setEnabled(false);
        espressoDoubleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espressoDoubleShotButtonActionPerformed(evt);
            }
        });

        americanoSingleShotButton.setBackground(new java.awt.Color(226, 169, 117));
        buttonGroup.add(americanoSingleShotButton);
        americanoSingleShotButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        americanoSingleShotButton.setText("Americano single shot");
        americanoSingleShotButton.setEnabled(false);
        americanoSingleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanoSingleShotButtonActionPerformed(evt);
            }
        });

        americanoDoubleShotButton.setBackground(new java.awt.Color(226, 169, 117));
        buttonGroup.add(americanoDoubleShotButton);
        americanoDoubleShotButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        americanoDoubleShotButton.setText("Americano double shot");
        americanoDoubleShotButton.setEnabled(false);
        americanoDoubleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanoDoubleShotButtonActionPerformed(evt);
            }
        });

        stopButton.setBackground(new java.awt.Color(0, 182, 189));
        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(226, 169, 117));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Make your choice:");

        makeCoffeeButton.setBackground(new java.awt.Color(181, 127, 95));
        makeCoffeeButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        makeCoffeeButton.setText("Make Coffee");
        makeCoffeeButton.setToolTipText("");
        makeCoffeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        makeCoffeeButton.setEnabled(false);
        makeCoffeeButton.setSelected(true);
        makeCoffeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeCoffeeButtonActionPerformed(evt);
            }
        });

        stateTextArea.setBackground(new java.awt.Color(226, 169, 117));
        stateTextArea.setColumns(20);
        stateTextArea.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        stateTextArea.setRows(5);
        jScrollPane1.setViewportView(stateTextArea);

        fillBeansButton.setBackground(new java.awt.Color(226, 169, 117));
        fillBeansButton.setText("Fill Beans");
        fillBeansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillBeansButtonActionPerformed(evt);
            }
        });

        fillWaterButton.setBackground(new java.awt.Color(226, 169, 117));
        fillWaterButton.setText("Fill Water");
        fillWaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillWaterButtonActionPerformed(evt);
            }
        });

        cleanButton.setBackground(new java.awt.Color(226, 169, 117));
        cleanButton.setText("Clean");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/coffee-machine (2).png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(226, 169, 117));
        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Coffe machine ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/coffee-cup (4).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/coffee-beans.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/water.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/data-cleaning.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/coffee (3).png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/coffee (3).png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/coffee (3).png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachine/coffee (3).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(makeCoffeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fillWaterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fillBeansButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cleanButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(americanoSingleShotButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(espressoSingleShotButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(espressoDoubleShotButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(americanoDoubleShotButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makeCoffeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(espressoSingleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(espressoDoubleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(americanoSingleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(americanoDoubleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fillBeansButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fillWaterButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cleanButton)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))))
        );

        espressoDoubleShotButton.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
 //           FileInputStream fileIn = new FileInputStream("State.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            c1 = (CoffeeMachine) in.readObject();
//            in.close();
//            fileIn.close();
        
            c1.start();
            espressoSingleShotButton.setEnabled(true);
            espressoDoubleShotButton.setEnabled(true);
            americanoSingleShotButton.setEnabled(true);
            americanoDoubleShotButton.setEnabled(true);
            stopButton.setEnabled(true);
        } 
        catch (OutOfBeansException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the beans container, please.");
            espressoSingleShotButton.setEnabled(false);
            espressoDoubleShotButton.setEnabled(false);
            americanoSingleShotButton.setEnabled(false);
            americanoDoubleShotButton.setEnabled(false);
        }
        
        catch (OutOfWaterException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the water container, please.");
            espressoSingleShotButton.setEnabled(false);
            espressoDoubleShotButton.setEnabled(false);
            americanoSingleShotButton.setEnabled(false);
            americanoDoubleShotButton.setEnabled(false);
        }
        
        catch (CleanException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Clean the waste tray, please.");
            espressoSingleShotButton.setEnabled(false);
            espressoDoubleShotButton.setEnabled(false);
            americanoSingleShotButton.setEnabled(false);
            americanoDoubleShotButton.setEnabled(false);
        }
        
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Something wrong!!!");
        }
        startButton.setEnabled(false);
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void makeCoffeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeCoffeeButtonActionPerformed
        try {
            if (espressoSingleShotButton.isSelected()) {
                c1.makeCupOfCoffee(1);
            }
            if (espressoDoubleShotButton.isSelected()) {
                c1.makeCupOfCoffee(2);
            }
            if (americanoSingleShotButton.isSelected()) {
                c1.makeCupOfCoffee(3);
            }
            if (americanoDoubleShotButton.isSelected()) {
                c1.makeCupOfCoffee(4);
            }
        } catch (OutOfBeansException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the beans container, please.");
            espressoSingleShotButton.setEnabled(false);
            espressoDoubleShotButton.setEnabled(false);
            americanoSingleShotButton.setEnabled(false);
            americanoDoubleShotButton.setEnabled(false);
        }
        
        catch (OutOfWaterException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the water container, please.");
            espressoSingleShotButton.setEnabled(false);
            espressoDoubleShotButton.setEnabled(false);
            americanoSingleShotButton.setEnabled(false);
            americanoDoubleShotButton.setEnabled(false);
        }
        
        catch (CleanException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Clean the waste tray, please.");
            espressoSingleShotButton.setEnabled(false);
            espressoDoubleShotButton.setEnabled(false);
            americanoSingleShotButton.setEnabled(false);
            americanoDoubleShotButton.setEnabled(false);
        }
        
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Something wrong!!!");
        }
        
        buttonGroup.clearSelection();
        makeCoffeeButton.setEnabled(false);
        stateTextArea.append(c1.getState());
        
    }//GEN-LAST:event_makeCoffeeButtonActionPerformed

    private void espressoSingleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espressoSingleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
    }//GEN-LAST:event_espressoSingleShotButtonActionPerformed

    private void fillBeansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillBeansButtonActionPerformed
        c1.getBeansContainer().fill();
        c1.getLogger().log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  BEANS CONTAINER FILLED\n");
        espressoSingleShotButton.setEnabled(true);
        espressoDoubleShotButton.setEnabled(true);
        americanoSingleShotButton.setEnabled(true);
        americanoDoubleShotButton.setEnabled(true);
    }//GEN-LAST:event_fillBeansButtonActionPerformed

    private void fillWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillWaterButtonActionPerformed
        c1.getWaterContainer().fill();
        c1.getLogger().log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  WATER CONTAINER FILLED\n");
        espressoSingleShotButton.setEnabled(true);
        espressoDoubleShotButton.setEnabled(true);
        americanoSingleShotButton.setEnabled(true);
        americanoDoubleShotButton.setEnabled(true);
    }//GEN-LAST:event_fillWaterButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        c1.getWasteTray().clean();
        c1.getLogger().log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  WASTE TARY CLEANED\n");
        espressoSingleShotButton.setEnabled(true);
        espressoDoubleShotButton.setEnabled(true);
        americanoSingleShotButton.setEnabled(true);
        americanoDoubleShotButton.setEnabled(true);
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void espressoDoubleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espressoDoubleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
    }//GEN-LAST:event_espressoDoubleShotButtonActionPerformed

    private void americanoSingleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanoSingleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
    }//GEN-LAST:event_americanoSingleShotButtonActionPerformed

    private void americanoDoubleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanoDoubleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
   //     TextAttribute.FONT
    }//GEN-LAST:event_americanoDoubleShotButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        stopButton.setEnabled(false);
        espressoSingleShotButton.setEnabled(false);
        espressoDoubleShotButton.setEnabled(false);
        americanoSingleShotButton.setEnabled(false);
        americanoDoubleShotButton.setEnabled(false);
        startButton.setEnabled(true);
        try {
            c1.stop();
        } catch (Exception ex) {
            Logger.getLogger(GuiMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton americanoDoubleShotButton;
    private javax.swing.JRadioButton americanoSingleShotButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cleanButton;
    private javax.swing.JRadioButton espressoDoubleShotButton;
    private javax.swing.JRadioButton espressoSingleShotButton;
    private javax.swing.JButton fillBeansButton;
    private javax.swing.JButton fillWaterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeCoffeeButton;
    private javax.swing.JButton startButton;
    private javax.swing.JTextArea stateTextArea;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
