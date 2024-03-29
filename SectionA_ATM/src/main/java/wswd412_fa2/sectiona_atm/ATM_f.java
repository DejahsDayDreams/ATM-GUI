
package wswd412_fa2.sectiona_atm;

public class ATM_f extends javax.swing.JFrame {
    /**
     * Creates new form ATM
     */
    public ATM_f() {
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

        jPanel1 = new javax.swing.JPanel();
        Welcome = new java.awt.Label();
        TextField = new java.awt.TextField();
        label1 = new java.awt.Label();
        Deposit = new java.awt.Button();
        Withdraw = new java.awt.Button();
        panel1 = new java.awt.Panel();
        Btn1 = new java.awt.Button();
        Btn2 = new java.awt.Button();
        Btn3 = new java.awt.Button();
        Btn4 = new java.awt.Button();
        Btn5 = new java.awt.Button();
        Btn6 = new java.awt.Button();
        Btn7 = new java.awt.Button();
        Btn8 = new java.awt.Button();
        Btn9 = new java.awt.Button();
        Btn10 = new java.awt.Button();
        Btn0 = new java.awt.Button();
        Btn11 = new java.awt.Button();
        panel2 = new java.awt.Panel();
        Cancel = new java.awt.Button();
        Clear = new java.awt.Button();
        Submit = new java.awt.Button();
        AccountTextField = new java.awt.TextField();
        AccountBalanceLabel = new java.awt.Label();
        StatusLabel = new java.awt.Label();
        AmountAvilable = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Welcome.setAlignment(java.awt.Label.CENTER);
        Welcome.setFont(new java.awt.Font("Good Times Rg", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(51, 51, 51));
        Welcome.setText("Welcome to Sams Bank");

        TextField.setCaretPosition(5);
        TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 102));
        label1.setName(""); // NOI18N
        label1.setText("V1 - Released in 2022 @ Samantha Kitchener.");

        Deposit.setBackground(new java.awt.Color(153, 204, 255));
        Deposit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Deposit.setForeground(new java.awt.Color(51, 51, 51));
        Deposit.setLabel("Deposit");
        Deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositMouseClicked(evt);
            }
        });

        Withdraw.setBackground(new java.awt.Color(153, 204, 255));
        Withdraw.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Withdraw.setForeground(new java.awt.Color(51, 51, 51));
        Withdraw.setLabel("Withdraw");
        Withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrawMouseClicked(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(153, 153, 153));

        Btn1.setActionCommand("1");
        Btn1.setBackground(new java.awt.Color(102, 102, 102));
        Btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Btn1.setLabel("1");
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1MouseClicked(evt);
            }
        });

        Btn2.setBackground(new java.awt.Color(102, 102, 102));
        Btn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn2.setForeground(new java.awt.Color(255, 255, 255));
        Btn2.setLabel("2");
        Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn2MouseClicked(evt);
            }
        });

        Btn3.setBackground(new java.awt.Color(102, 102, 102));
        Btn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn3.setForeground(new java.awt.Color(255, 255, 255));
        Btn3.setLabel("3");
        Btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn3MouseClicked(evt);
            }
        });

        Btn4.setBackground(new java.awt.Color(102, 102, 102));
        Btn4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn4.setForeground(new java.awt.Color(255, 255, 255));
        Btn4.setLabel("4");
        Btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn4MouseClicked(evt);
            }
        });

        Btn5.setBackground(new java.awt.Color(102, 102, 102));
        Btn5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn5.setForeground(new java.awt.Color(255, 255, 255));
        Btn5.setLabel("5");
        Btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn5MouseClicked(evt);
            }
        });

        Btn6.setBackground(new java.awt.Color(102, 102, 102));
        Btn6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn6.setForeground(new java.awt.Color(255, 255, 255));
        Btn6.setLabel("6");
        Btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn6MouseClicked(evt);
            }
        });

        Btn7.setBackground(new java.awt.Color(102, 102, 102));
        Btn7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn7.setForeground(new java.awt.Color(255, 255, 255));
        Btn7.setLabel("7");
        Btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn7MouseClicked(evt);
            }
        });

        Btn8.setBackground(new java.awt.Color(102, 102, 102));
        Btn8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn8.setForeground(new java.awt.Color(255, 255, 255));
        Btn8.setLabel("8");
        Btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn8MouseClicked(evt);
            }
        });

        Btn9.setBackground(new java.awt.Color(102, 102, 102));
        Btn9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn9.setForeground(new java.awt.Color(255, 255, 255));
        Btn9.setLabel("9");
        Btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn9MouseClicked(evt);
            }
        });

        Btn10.setBackground(new java.awt.Color(153, 153, 153));

        Btn0.setBackground(new java.awt.Color(102, 102, 102));
        Btn0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn0.setForeground(new java.awt.Color(255, 255, 255));
        Btn0.setLabel("0");
        Btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn0MouseClicked(evt);
            }
        });

        Btn11.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(153, 153, 153));

        Cancel.setBackground(new java.awt.Color(255, 102, 102));
        Cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(51, 51, 51));
        Cancel.setLabel("Cancel");
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 255, 153));
        Clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(51, 51, 51));
        Clear.setLabel("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(0, 204, 153));
        Submit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Submit.setForeground(new java.awt.Color(51, 51, 51));
        Submit.setLabel("Submit");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        AccountBalanceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AccountBalanceLabel.setForeground(new java.awt.Color(51, 51, 51));
        AccountBalanceLabel.setName(""); // NOI18N
        AccountBalanceLabel.setText("  Current Account balance");

        StatusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(51, 51, 51));
        StatusLabel.setText(" Account Status");

        AmountAvilable.setAlignment(java.awt.Label.CENTER);
        AmountAvilable.setBackground(new java.awt.Color(255, 255, 255));
        AmountAvilable.setFont(new java.awt.Font("Good Times Rg", 0, 18)); // NOI18N
        AmountAvilable.setName(""); // NOI18N
        AmountAvilable.setText("R" + Amount);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountAvilable, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(AccountBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AmountAvilable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(AccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked
                UserAmount += "1";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn1MouseClicked

    private void Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseClicked
                UserAmount += "2";
                TextField.setText(UserAmount )   
    }//GEN-LAST:event_Btn2MouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
                UserAmount += " ";
                TextField.setText(UserAmount =" ");
                AccountTextField.setText(" ");
    }//GEN-LAST:event_ClearMouseClicked

    private void Btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseClicked
                UserAmount += "3";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn3MouseClicked

    private void Btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn4MouseClicked
                UserAmount += "4";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn4MouseClicked

    private void Btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseClicked
                UserAmount += "5";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn5MouseClicked

    private void Btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseClicked
                UserAmount += "6";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn6MouseClicked

    private void Btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn7MouseClicked
                UserAmount += "7";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn7MouseClicked

    private void Btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn8MouseClicked
                UserAmount += "8";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn8MouseClicked

    private void Btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn9MouseClicked
                UserAmount += "9";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn9MouseClicked

    private void Btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn0MouseClicked
                UserAmount += "0";
                TextField.setText(UserAmount );
    }//GEN-LAST:event_Btn0MouseClicked

    private void WithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrawMouseClicked
                               
                                int WithdrawAmount = Amount - Integer.parseInt(UserAmount.trim());
                               TextField.setText(String.valueOf(WithdrawAmount));
                               TextField.setText(" Funds remaining: R" + String.valueOf(WithdrawAmount));
                               if(WithdrawAmount <= 0)
                               {
                                   AccountTextField.setText("insuficent funds");
                               }
                               else
                               {
                                   AccountTextField.setText("OK");
                               }
                              

    }//GEN-LAST:event_WithdrawMouseClicked

    private void DepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositMouseClicked
                                                                   
                                        int DepositAmount = Amount + Integer.parseInt(UserAmount.trim());
                                        TextField.setText(String.valueOf(DepositAmount));
                                        TextField.setText("Funds remaining: R" + String.valueOf(DepositAmount));
                                        AccountTextField.setText("Done");
                                         UserAmount = "";
                                        
                                         
    }//GEN-LAST:event_DepositMouseClicked

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked

                                        TextField.setText(UserAmount =" ");

		AccountTextField.setText(" ");
                

		
    }//GEN-LAST:event_CancelMouseClicked

    public static void main(String args[]) 
    {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                ATM_f atm =new ATM_f();
                atm.setVisible(true);
            }
            
        }); 
        
    }

    String UserAmount ="";
    int Amount = 1500;
   



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label AccountBalanceLabel;
    private java.awt.TextField AccountTextField;
    private java.awt.Label AmountAvilable;
    private java.awt.Button Btn0;
    private java.awt.Button Btn1;
    private java.awt.Button Btn10;
    private java.awt.Button Btn11;
    private java.awt.Button Btn2;
    private java.awt.Button Btn3;
    private java.awt.Button Btn4;
    private java.awt.Button Btn5;
    private java.awt.Button Btn6;
    private java.awt.Button Btn7;
    private java.awt.Button Btn8;
    private java.awt.Button Btn9;
    private java.awt.Button Cancel;
    private java.awt.Button Clear;
    private java.awt.Button Deposit;
    private java.awt.Label StatusLabel;
    private java.awt.Button Submit;
    private java.awt.TextField TextField;
    private java.awt.Label Welcome;
    private java.awt.Button Withdraw;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
