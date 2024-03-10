package Caculator;

import java.awt.event.KeyEvent;

public class Caulator extends javax.swing.JFrame {

    private double x;
    private double y;
    private boolean isDotUsed = false;
    private String value = "";
    private String choice = "";

    public Caulator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Display = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        minus = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        divideptn = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        Dot = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

        jButton7.setBackground(new java.awt.Color(197, 137, 47));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setBorder(null);
        jButton7.setDefaultCapable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 71, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Display.setBackground(new java.awt.Color(150, 147, 147));
        Display.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display.setBorder(new javax.swing.border.MatteBorder(null));
        Display.setName(""); // NOI18N
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        Display.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DisplayKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(59, 58, 58));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        minus.setBackground(new java.awt.Color(197, 137, 47));
        minus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("-");
        minus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        minus.setDefaultCapable(false);
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(197, 137, 47));
        plus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("+");
        plus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        plus.setDefaultCapable(false);
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(197, 137, 47));
        multiply.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        multiply.setForeground(new java.awt.Color(255, 255, 255));
        multiply.setText("*");
        multiply.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        multiply.setDefaultCapable(false);
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        percentage.setBackground(new java.awt.Color(204, 204, 204));
        percentage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("%");
        percentage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        percentage.setDefaultCapable(false);
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        divideptn.setBackground(new java.awt.Color(204, 204, 204));
        divideptn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        divideptn.setForeground(new java.awt.Color(255, 255, 255));
        divideptn.setText("/");
        divideptn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        divideptn.setDefaultCapable(false);
        divideptn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideptnActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(64, 64, 64));
        btn5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn5.setDefaultCapable(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(64, 64, 64));
        btn8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn8.setDefaultCapable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(204, 204, 204));
        Delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("c");
        Delete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Delete.setDefaultCapable(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(64, 64, 64));
        btn7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn7.setDefaultCapable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(64, 64, 64));
        btn9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn9.setDefaultCapable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(64, 64, 64));
        btn4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn4.setDefaultCapable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(64, 64, 64));
        btn6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn6.setDefaultCapable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(64, 64, 64));
        btn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn3.setDefaultCapable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(64, 64, 64));
        btn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn1.setDefaultCapable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(64, 64, 64));
        btn0.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn0.setDefaultCapable(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        Dot.setBackground(new java.awt.Color(64, 64, 64));
        Dot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dot.setForeground(new java.awt.Color(255, 255, 255));
        Dot.setText(".");
        Dot.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Dot.setDefaultCapable(false);
        Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(64, 64, 64));
        equal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setText("=");
        equal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        equal.setDefaultCapable(false);
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(64, 64, 64));
        btn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn2.setDefaultCapable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(divideptn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divideptn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if (Display.getText().equals("")) {
            choice = "-";
            value = "-";
            Display.setText(choice);
        }

        if (!(Display.getText().equals("") || Display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "-";
            value = " ";
            Display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_minusActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        if (!(Display.getText().equals("") || Display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "+";
            value = " ";
            Display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_plusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        if (!(Display.getText().equals("") || Display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "*";
            value = " ";
            Display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed
        if (!(Display.getText().equals("") || Display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "%";
            value = " ";
            Display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_percentageActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        value += "7";
        Display.setText(value);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void divideptnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideptnActionPerformed
        if (!(Display.getText().equals("") || Display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "/";
            value = " ";
            Display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_divideptnActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        value += "5";
        Display.setText(value);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        value += "8";
        Display.setText(value);
    }//GEN-LAST:event_btn8ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        choice = "";
        value = "";
        x = 0;
        y = 0;
        isDotUsed = false;
        Display.setText(value);
    }//GEN-LAST:event_DeleteActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        value += "7";
        Display.setText(value);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        value += "9";
        Display.setText(value);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        value += "4";
        Display.setText(value);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        value += "6";
        Display.setText(value);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        value += "3";
        Display.setText(value);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        value += "1";
        Display.setText(value);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        value += "0";
        Display.setText(value);
    }//GEN-LAST:event_btn0ActionPerformed

    private void DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotActionPerformed
        if (isDotUsed == false) {
            value += ".";
            Display.setText(value);
            isDotUsed = true;
        }
    }//GEN-LAST:event_DotActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        if (!choice.equals("")) {
            y = Double.parseDouble(value);
            double result = 0;
            switch (choice) {
                case "+":
                    result=x+y;
                    Display.setText(String.valueOf(result));
                    choice="";
                    value="";
                    isDotUsed=false;
                    break;
                case "-":
                     result=x-y;
                    Display.setText(String.valueOf(result));
                    choice="";
                    value="";
                    isDotUsed=false;
                    break;
                case "*":
                     result=x*y;
                    Display.setText(String.valueOf(result));
                    choice="";
                    value="";
                    isDotUsed=false;
                    break;
                case "/":
                    try {
                        result=x/y;
                        if(String.valueOf(result).equalsIgnoreCase("infinity")){
                            throw new ArithmeticException();
                        }
                        Display.setText(String.valueOf(result));
                        value="";
                        isDotUsed=false;
                    } catch (ArithmeticException e) {
                         Display.setText("khong the chia cho 0");
                        value="";
                        isDotUsed=false;
                    }
                    break;
                case "%":
                     result=x%y;
                    Display.setText(String.valueOf(result));
                    choice="";
                    value="";
                    isDotUsed=false;
                    break;
            }

        }
    }//GEN-LAST:event_equalActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        value += "2";
        Display.setText(value);
    }//GEN-LAST:event_btn2ActionPerformed

    private void DisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DisplayKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || KeyEvent.VK_BACK_SPACE == c || KeyEvent.VK_DELETE == c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_DisplayKeyTyped

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
            java.util.logging.Logger.getLogger(Caulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caulator().setVisible(true);
            }
        });
        System.out.println("Finish!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Display;
    private javax.swing.JButton Dot;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton divideptn;
    private javax.swing.JButton equal;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton percentage;
    private javax.swing.JButton plus;
    // End of variables declaration//GEN-END:variables
}
