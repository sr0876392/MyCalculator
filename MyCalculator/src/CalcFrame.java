/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
public class CalcFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalcFrame
     */
    public CalcFrame() {
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

        Output = new javax.swing.JTextField();
        NumOne = new javax.swing.JButton();
        NumTwo = new javax.swing.JButton();
        NumThree = new javax.swing.JButton();
        NumFour = new javax.swing.JButton();
        NumFive = new javax.swing.JButton();
        NumSix = new javax.swing.JButton();
        NumSeven = new javax.swing.JButton();
        NumEight = new javax.swing.JButton();
        NumNine = new javax.swing.JButton();
        NumZero = new javax.swing.JButton();
        NumComma = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Multiplication = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Output2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Output.setEditable(false);
        Output.setAutoscrolls(false);

        NumOne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumOne.setText("1");
        NumOne.setToolTipText("");
        NumOne.setMaximumSize(new java.awt.Dimension(90, 30));
        NumOne.setMinimumSize(new java.awt.Dimension(90, 30));
        NumOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumOneActionPerformed(evt);
            }
        });

        NumTwo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumTwo.setText("2");
        NumTwo.setMaximumSize(new java.awt.Dimension(90, 30));
        NumTwo.setMinimumSize(new java.awt.Dimension(90, 30));
        NumTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTwoActionPerformed(evt);
            }
        });

        NumThree.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumThree.setText("3");
        NumThree.setMaximumSize(new java.awt.Dimension(90, 30));
        NumThree.setMinimumSize(new java.awt.Dimension(90, 30));
        NumThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumThreeActionPerformed(evt);
            }
        });

        NumFour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumFour.setText("4");
        NumFour.setMaximumSize(new java.awt.Dimension(90, 30));
        NumFour.setMinimumSize(new java.awt.Dimension(90, 30));
        NumFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumFourActionPerformed(evt);
            }
        });

        NumFive.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumFive.setText("5");
        NumFive.setMaximumSize(new java.awt.Dimension(90, 30));
        NumFive.setMinimumSize(new java.awt.Dimension(90, 30));
        NumFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumFiveActionPerformed(evt);
            }
        });

        NumSix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumSix.setText("6");
        NumSix.setMaximumSize(new java.awt.Dimension(90, 30));
        NumSix.setMinimumSize(new java.awt.Dimension(90, 30));
        NumSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumSixActionPerformed(evt);
            }
        });

        NumSeven.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumSeven.setText("7");
        NumSeven.setMaximumSize(new java.awt.Dimension(90, 30));
        NumSeven.setMinimumSize(new java.awt.Dimension(90, 30));
        NumSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumSevenActionPerformed(evt);
            }
        });

        NumEight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumEight.setText("8");
        NumEight.setMaximumSize(new java.awt.Dimension(90, 30));
        NumEight.setMinimumSize(new java.awt.Dimension(90, 30));
        NumEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumEightActionPerformed(evt);
            }
        });

        NumNine.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumNine.setText("9");
        NumNine.setMaximumSize(new java.awt.Dimension(90, 30));
        NumNine.setMinimumSize(new java.awt.Dimension(90, 30));
        NumNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumNineActionPerformed(evt);
            }
        });

        NumZero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumZero.setText("0");
        NumZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumZeroActionPerformed(evt);
            }
        });

        NumComma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumComma.setText(",");
        NumComma.setMaximumSize(new java.awt.Dimension(90, 30));
        NumComma.setMinimumSize(new java.awt.Dimension(90, 30));
        NumComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumCommaActionPerformed(evt);
            }
        });

        Minus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Minus.setText("-");
        Minus.setMaximumSize(new java.awt.Dimension(90, 30));
        Minus.setMinimumSize(new java.awt.Dimension(90, 30));
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Plus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Plus.setText("+");
        Plus.setMaximumSize(new java.awt.Dimension(90, 30));
        Plus.setMinimumSize(new java.awt.Dimension(90, 30));
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Division.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Division.setText("/");
        Division.setMaximumSize(new java.awt.Dimension(90, 30));
        Division.setMinimumSize(new java.awt.Dimension(90, 30));
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Multiplication.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Multiplication.setText("*");
        Multiplication.setMaximumSize(new java.awt.Dimension(90, 30));
        Multiplication.setMinimumSize(new java.awt.Dimension(90, 30));
        Multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicationActionPerformed(evt);
            }
        });

        Equals.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Output2.setEditable(false);
        Output2.setAutoscrolls(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumZero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumComma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Output, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Output2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Division, Minus, Multiplication, NumComma, NumEight, NumFive, NumFour, NumNine, NumOne, NumSeven, NumSix, NumThree, NumTwo, Plus});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Output2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NumComma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Division, Minus, Multiplication, NumEight, NumFive, NumFour, NumNine, NumOne, NumSeven, NumSix, NumThree, NumTwo, Plus});

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void NumOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumOneActionPerformed
      Output.setText(Output.getText() + "1");
    }//GEN-LAST:event_NumOneActionPerformed

    private void NumTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTwoActionPerformed
        Output.setText(Output.getText() + "2");
    }//GEN-LAST:event_NumTwoActionPerformed

    private void NumThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumThreeActionPerformed
        Output.setText(Output.getText() + "3");
    }//GEN-LAST:event_NumThreeActionPerformed

    private void NumFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumFourActionPerformed
        Output.setText(Output.getText() + "4");
    }//GEN-LAST:event_NumFourActionPerformed

    private void NumFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumFiveActionPerformed
        Output.setText(Output.getText() + "5");
    }//GEN-LAST:event_NumFiveActionPerformed

    private void NumSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumSixActionPerformed
        Output.setText(Output.getText() + "6");
    }//GEN-LAST:event_NumSixActionPerformed

    private void NumSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumSevenActionPerformed
        Output.setText(Output.getText() + "7");
    }//GEN-LAST:event_NumSevenActionPerformed

    private void NumEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumEightActionPerformed
        Output.setText(Output.getText() + "8");
    }//GEN-LAST:event_NumEightActionPerformed

    private void NumNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumNineActionPerformed
        Output.setText(Output.getText() + "9");
    }//GEN-LAST:event_NumNineActionPerformed

    private void NumZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumZeroActionPerformed
        Output.setText(Output.getText() + "0");
    }//GEN-LAST:event_NumZeroActionPerformed

    private void NumCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumCommaActionPerformed
        Output.setText(Output.getText() + ".");
    }//GEN-LAST:event_NumCommaActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        Output.setText(Output.getText() + " - ");
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        Output.setText(Output.getText() + " + ");
    }//GEN-LAST:event_PlusActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        Output.setText(Output.getText() + " / ");
    }//GEN-LAST:event_DivisionActionPerformed

    private void MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicationActionPerformed
        Output.setText(Output.getText() + " * ");
    }//GEN-LAST:event_MultiplicationActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
       //ЗАЕБАШЬ ЧТОБ СЧИТАЛО ПОСЛЕ НАЖАТИЯ РАВНО
      ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
      String expression = Output.getText();
        try {
            // Evaluate the expression
            Object result = engine.eval(expression);
            Output2.setText(Output.getText() + " = " + result + "\n");
            Output.setText("0");
        }
        catch (ScriptException e) {
            // Something went wrong
            e.printStackTrace();
        }
    }//GEN-LAST:event_EqualsActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Output.setText("0");
    }//GEN-LAST:event_ClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Division;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiplication;
    private javax.swing.JButton NumComma;
    private javax.swing.JButton NumEight;
    private javax.swing.JButton NumFive;
    private javax.swing.JButton NumFour;
    private javax.swing.JButton NumNine;
    private javax.swing.JButton NumOne;
    private javax.swing.JButton NumSeven;
    private javax.swing.JButton NumSix;
    private javax.swing.JButton NumThree;
    private javax.swing.JButton NumTwo;
    private javax.swing.JButton NumZero;
    public static javax.swing.JTextField Output;
    public javax.swing.JTextField Output2;
    private javax.swing.JButton Plus;
    // End of variables declaration//GEN-END:variables
}
