package railway; //This is a change.

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }
    private static Train trains[] = new Train[100];
    private static int trainCount = 0;
    private static Train selectedTrain = new Train(0);

    private void updateCurrentTrain() {
        jLabel1.setText("Current train: " + selectedTrain.getMTrainNumber());
    }

    private boolean checkIfGivenParcelIDIsExceptional(int ID) {
        boolean returnValue = true;
        for (int i = 0; i < selectedTrain.getNumberOfWagons(); i++) {
            for (int j = 0; j < selectedTrain.getWagon(i).getmParcelCount(); j++) {
                if (ID == selectedTrain.getWagon(i).getParcel(j).getID()) {
                    returnValue = false;
                }
            }
        }
        return returnValue;
    }

    private boolean checkIfGivenEngineIDIsExceptional(int ID) {
        boolean returnValue = true;
        for (int i = 0; i < selectedTrain.getEngineCount(); i++) {
            if (ID == selectedTrain.getEngine(i).getID()) {
                returnValue = false;
            }
        }
        return returnValue;
    }

    private boolean checkIfGivenWagonIDIsExceptional(int ID) {
        boolean returnValue = true;
        for (int i = 0; i < selectedTrain.getNumberOfWagons(); i++) {
            if (ID == selectedTrain.getWagon(i).getID()) {
                returnValue = false;
            }
        }
        return returnValue;
    }

    private void makeJTextAreasUneditable() {
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        jTextArea3.setEditable(false);
    }

    private void setLineWrapInJTextAreas() {
        jTextArea1.setLineWrap(true);
        jTextArea2.setLineWrap(true);
        jTextArea3.setLineWrap(true);
    }

    private static void fillTrains() {
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train(i);
            trainCount++;
        }
    }

    private void updateTrainCount() {
        jLabel18.setText("Count: " + trainCount + "/" + trains.length);
    }

    private int countParcels() {
        int totalParcelCount = 0;
        for (int i = 0; i < selectedTrain.getNumberOfWagons(); i++) {
            totalParcelCount = totalParcelCount + selectedTrain.getWagon(i).getmParcelCount();
        }
        return totalParcelCount;
    }

    private void displayWagons() {
        jTextArea1.setText("");
        for (int i = 0; i < selectedTrain.getNumberOfWagons(); i++) {
            jTextArea1.append(i + ". " + selectedTrain.getWagon(i).toString() + "\n");
        }
        jLabel15.setText("Count: " + selectedTrain.getNumberOfWagons() + "/" + selectedTrain.getMWagonsLength());
    }

    private void displayEngines() {
        jTextArea2.setText("");
        for (int i = 0; i < selectedTrain.getEngineCount(); i++) {
            jTextArea2.append(i + ". " + selectedTrain.getEngine(i).toString() + "\n");
        }
        jLabel16.setText("Count: " + selectedTrain.getEngineCount() + "/" + selectedTrain.getMEnginesLength());
    }

    private void displayParcels() {
        jTextArea3.setText("");
        int maximumNumberOfParcels = 0;
        int k = 0;
        for (int i = 0; i < selectedTrain.getNumberOfWagons(); i++) {
            for (int j = 0; j < selectedTrain.getWagon(i).getmParcelCount(); j++) {
                jTextArea3.append(k + ". " + "Wagon ID: " + selectedTrain.getWagon(i).getID() + " " + selectedTrain.getWagon(i).getParcel(j).toString() + "\n");
                k++;
            }
            maximumNumberOfParcels = maximumNumberOfParcels + selectedTrain.getWagon(i).getMParcelsLength();
        }
        jLabel17.setText("Count: " + countParcels() + "/" + Integer.toString(maximumNumberOfParcels));
    }

    private void displayInformation() {
        displayEngines();
        displayWagons();
        displayParcels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Current train: ");

        jLabel2.setText("Train number:");

        jLabel3.setText("Engine ID:");

        jLabel4.setText("Wagon ID:");

        jLabel5.setText("Add parcel:");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Engines:");

        jLabel7.setText("Wagons:");

        jLabel8.setText("Parcels:");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel9.setText("Wagon ID:");

        jLabel10.setText("Parcel ID:");

        jLabel11.setText("Weight:");

        jLabel12.setText("Destination:");

        jLabel14.setText("Origin:");

        jLabel15.setText("Count: 0");

        jLabel16.setText("Count: 0");

        jLabel17.setText("Count: 0");

        jLabel18.setText("Count: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel14)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4)
                                                .addGap(155, 155, 155)
                                                .addComponent(jLabel17)
                                                .addGap(3, 3, 3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(466, 466, 466)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel6))))
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(146, 146, 146)
                                                .addComponent(jLabel18))
                                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(7, 7, 7)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(324, 324, 324)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4)
                                            .addComponent(jLabel14)))
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (checkIfGivenEngineIDIsExceptional(Integer.parseInt(jTextField2.getText())) == true) {
                selectedTrain.addEngine(new Engine(Integer.parseInt(jTextField2.getText())));
                displayInformation();
                jTextArea4.setText("Engine added successfully");
            } else {
                jTextArea4.setText("ID taken");
            }
        } catch (java.util.InputMismatchException e) {
            jTextArea4.setText("Input mismatch exception: " + e);
        } catch (java.lang.NullPointerException e) {
            jTextArea4.setText("Null pointer exception: " + e);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            jTextArea4.setText("Array index out of bounds exception: " + e);
        } catch (java.lang.NumberFormatException e) {
            jTextArea4.setText("Number format exception: " + e);
        }
        jTextField2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            selectedTrain = trains[Integer.parseInt(jTextField1.getText())];
            displayInformation();
            updateCurrentTrain();
            jTextArea4.setText("Train selected successfully");
        } catch (java.lang.NullPointerException e) {
            jTextArea4.setText("Null pointer exception: " + e);
        } catch (java.util.InputMismatchException e) {
            jTextArea4.setText("Input mismatch exception: " + e);
        } catch (java.lang.NumberFormatException e) {
            jTextArea4.setText("Number format exception: " + e);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            jTextArea4.setText("Array index out of bounds exception: " + e);
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (checkIfGivenWagonIDIsExceptional(Integer.parseInt(jTextField3.getText())) == true) {
                selectedTrain.addWagon(new Wagon(Integer.parseInt(jTextField3.getText())));
                displayInformation();
                jTextArea4.setText("Wagon added successfully");
            } else {
                jTextArea4.setText("ID taken");
            }
        } catch (java.util.InputMismatchException e) {
            jTextArea4.setText("Input mismatch exception: " + e);
        } catch (java.lang.NullPointerException e) {
            jTextArea4.setText("Null pointer exception: " + e);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            jTextArea4.setText("Array index out of bounds exception: " + e);
        } catch (java.lang.NumberFormatException e) {
            jTextArea4.setText("Number format exception: " + e);
        }
        jTextField3.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (checkIfGivenParcelIDIsExceptional(Integer.parseInt(jTextField4.getText())) == true && Double.parseDouble(jTextField5.getText()) > 0) {
                selectedTrain.selectWagonWithID(Integer.parseInt(jTextField8.getText())).addParcel(new Parcel(Integer.parseInt(jTextField4.getText()), Double.parseDouble(jTextField5.getText()), jTextField6.getText(), jTextField7.getText()));
                displayInformation();
                jTextArea4.setText("Parcel added successfully");
            } else if (checkIfGivenParcelIDIsExceptional(Integer.parseInt(jTextField4.getText())) == false && Double.parseDouble(jTextField5.getText()) > 0) {
                jTextArea4.setText("ID taken");
            } else if (checkIfGivenParcelIDIsExceptional(Integer.parseInt(jTextField4.getText())) == true && Double.parseDouble(jTextField5.getText()) <= 0) {
                jTextArea4.setText("weight has to be positive");
            } else {
                jTextArea4.setText("ID taken and weight has to be positive");
            }
        } catch (java.util.InputMismatchException e) {
            jTextArea4.setText("Input mismatch exception: " + e);
        } catch (java.lang.NullPointerException e) {
            jTextArea4.setText("Null pointer exception: " + e);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            jTextArea4.setText("Array index out of bounds exception: " + e);
        } catch (java.lang.NumberFormatException e) {
            jTextArea4.setText("Number format exception: " + e);
        }
        jTextField8.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
    }//GEN-LAST:event_jTextField8ActionPerformed
    public static void main(String args[]) {
        fillTrains();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                gui.setVisible(true);
                gui.setLineWrapInJTextAreas();
                gui.makeJTextAreasUneditable();
                gui.displayInformation();
                gui.updateTrainCount();
                gui.updateCurrentTrain();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
