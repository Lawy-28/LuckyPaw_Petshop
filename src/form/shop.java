package form;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Abu Aqila Balawi
 */
public class shop extends javax.swing.JPanel {
  
    public shop() {
        initComponents();
        init();
    }
    public void init(){
       
        setTime();
    }
    
    public boolean qtyIsZero(int qty) {
    if (qty == 0) {
        JOptionPane.showMessageDialog(null, "Please increase the item quantity");
        return true;
    }
    return false;
}

    public void reset(){
        // mereset spiner
        js_item1.setValue(0);
        js_item2.setValue(0);
        js_item3.setValue(0);
        js_item4.setValue(0);
        js_item5.setValue(0);
        js_item6.setValue(0);
        jTextFieldTax.setText("0.0");
        jTextFieldSubTotal.setText("0.0");
        jTextFieldTotal.setText("0.0");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pn_utama = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        pn_atas7 = new javax.swing.JPanel();
        jb_item9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        js_item2 = new javax.swing.JSpinner();
        lb_price3 = new javax.swing.JLabel();
        lb_quantty3 = new javax.swing.JLabel();
        lb_purchese2 = new javax.swing.JLabel();
        lb_item3 = new javax.swing.JLabel();
        lb_image1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_atas8 = new javax.swing.JPanel();
        jb_item10 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        js_item1 = new javax.swing.JSpinner();
        lb_price1 = new javax.swing.JLabel();
        lb_quantty1 = new javax.swing.JLabel();
        lb_purchese = new javax.swing.JLabel();
        lb_item2 = new javax.swing.JLabel();
        lb_image = new javax.swing.JLabel();
        pn_atas9 = new javax.swing.JPanel();
        jb_item11 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        js_item3 = new javax.swing.JSpinner();
        lb_price4 = new javax.swing.JLabel();
        lb_quantty4 = new javax.swing.JLabel();
        lb_purchese3 = new javax.swing.JLabel();
        lb_item1 = new javax.swing.JLabel();
        lb_image2 = new javax.swing.JLabel();
        pn_atas10 = new javax.swing.JPanel();
        jb_item45 = new javax.swing.JLabel();
        jb_item12 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        js_item4 = new javax.swing.JSpinner();
        lb_price5 = new javax.swing.JLabel();
        lb_quantty5 = new javax.swing.JLabel();
        lb_purchese4 = new javax.swing.JLabel();
        lb_image3 = new javax.swing.JLabel();
        pn_atas11 = new javax.swing.JPanel();
        jb_item50 = new javax.swing.JLabel();
        jb_item13 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        js_item5 = new javax.swing.JSpinner();
        lb_price6 = new javax.swing.JLabel();
        lb_quantty6 = new javax.swing.JLabel();
        lb_purchese5 = new javax.swing.JLabel();
        lb_image4 = new javax.swing.JLabel();
        pn_atas12 = new javax.swing.JPanel();
        jb_item55 = new javax.swing.JLabel();
        jb_item56 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        js_item6 = new javax.swing.JSpinner();
        lb_price2 = new javax.swing.JLabel();
        lb_quantty2 = new javax.swing.JLabel();
        lb_purchese1 = new javax.swing.JLabel();
        lb_image5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jb_time = new javax.swing.JLabel();
        jb_date = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(831, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBar(null);

        pn_utama.setBackground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(78, 19, 4));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 330));

        jTextFieldTax.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextFieldTax.setText("0.0");
        jPanel1.add(jTextFieldTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 170, 40));

        jTextFieldSubTotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextFieldSubTotal.setText("0.0");
        jPanel1.add(jTextFieldSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 170, 40));

        jTextFieldTotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextFieldTotal.setText("0.0");
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 170, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 110, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sub Total");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("TAX");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 40));

        jPanel3.setBackground(new java.awt.Color(78, 19, 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 85, 30));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Total");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 85, 30));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setText("Receipt");
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 85, 30));

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel3.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 85, 30));

        pn_atas7.setBackground(new java.awt.Color(78, 19, 4));
        pn_atas7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_atas7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_item9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jb_item9.setForeground(new java.awt.Color(255, 255, 255));
        jb_item9.setText("$3");
        pn_atas7.add(jb_item9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 20));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        pn_atas7.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        js_item2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        js_item2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        pn_atas7.add(js_item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, -1));

        lb_price3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_price3.setForeground(new java.awt.Color(255, 255, 255));
        lb_price3.setText("Price:");
        pn_atas7.add(lb_price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, 20));

        lb_quantty3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_quantty3.setForeground(new java.awt.Color(255, 255, 255));
        lb_quantty3.setText("Quantty:");
        pn_atas7.add(lb_quantty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 20));

        lb_purchese2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_purchese2.setForeground(new java.awt.Color(255, 255, 255));
        lb_purchese2.setText("Purchese:");
        pn_atas7.add(lb_purchese2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 20));

        lb_item3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_item3.setForeground(new java.awt.Color(255, 255, 255));
        lb_item3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_item3.setText("Whiskas");
        pn_atas7.add(lb_item3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 20));

        lb_image1.setText("jLabel5");
        pn_atas7.add(lb_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Items");

        pn_atas8.setBackground(new java.awt.Color(78, 19, 4));
        pn_atas8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_atas8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_item10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jb_item10.setForeground(new java.awt.Color(255, 255, 255));
        jb_item10.setText("$3");
        pn_atas8.add(jb_item10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 20));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        pn_atas8.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        js_item1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        js_item1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        pn_atas8.add(js_item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, -1));

        lb_price1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_price1.setForeground(new java.awt.Color(255, 255, 255));
        lb_price1.setText("Price:");
        pn_atas8.add(lb_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, 20));

        lb_quantty1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_quantty1.setForeground(new java.awt.Color(255, 255, 255));
        lb_quantty1.setText("Quantty:");
        pn_atas8.add(lb_quantty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 20));

        lb_purchese.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_purchese.setForeground(new java.awt.Color(255, 255, 255));
        lb_purchese.setText("Purchese:");
        pn_atas8.add(lb_purchese, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 20));

        lb_item2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_item2.setForeground(new java.awt.Color(255, 255, 255));
        lb_item2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_item2.setText("Whiskas");
        pn_atas8.add(lb_item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 20));

        lb_image.setText("jLabel5");
        pn_atas8.add(lb_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));

        pn_atas9.setBackground(new java.awt.Color(78, 19, 4));
        pn_atas9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_atas9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_item11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jb_item11.setForeground(new java.awt.Color(255, 255, 255));
        jb_item11.setText("$3");
        pn_atas9.add(jb_item11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 20));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        pn_atas9.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        js_item3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        js_item3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        pn_atas9.add(js_item3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, -1));

        lb_price4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_price4.setForeground(new java.awt.Color(255, 255, 255));
        lb_price4.setText("Price:");
        pn_atas9.add(lb_price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, 20));

        lb_quantty4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_quantty4.setForeground(new java.awt.Color(255, 255, 255));
        lb_quantty4.setText("Quantty:");
        pn_atas9.add(lb_quantty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 20));

        lb_purchese3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_purchese3.setForeground(new java.awt.Color(255, 255, 255));
        lb_purchese3.setText("Purchese:");
        pn_atas9.add(lb_purchese3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 20));

        lb_item1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_item1.setForeground(new java.awt.Color(255, 255, 255));
        lb_item1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_item1.setText("Whiskas");
        pn_atas9.add(lb_item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 20));

        lb_image2.setText("jLabel5");
        pn_atas9.add(lb_image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));

        pn_atas10.setBackground(new java.awt.Color(78, 19, 4));
        pn_atas10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_atas10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_item45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jb_item45.setForeground(new java.awt.Color(255, 255, 255));
        jb_item45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_item45.setText("Whiskas");
        pn_atas10.add(jb_item45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 20));

        jb_item12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jb_item12.setForeground(new java.awt.Color(255, 255, 255));
        jb_item12.setText("$3");
        pn_atas10.add(jb_item12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 20));

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        pn_atas10.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        js_item4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        js_item4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        pn_atas10.add(js_item4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, -1));

        lb_price5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_price5.setForeground(new java.awt.Color(255, 255, 255));
        lb_price5.setText("Price:");
        pn_atas10.add(lb_price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 20));

        lb_quantty5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_quantty5.setForeground(new java.awt.Color(255, 255, 255));
        lb_quantty5.setText("Quantty:");
        pn_atas10.add(lb_quantty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 20));

        lb_purchese4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_purchese4.setForeground(new java.awt.Color(255, 255, 255));
        lb_purchese4.setText("Purchese:");
        pn_atas10.add(lb_purchese4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 20));

        lb_image3.setText("jLabel5");
        pn_atas10.add(lb_image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));

        pn_atas11.setBackground(new java.awt.Color(78, 19, 4));
        pn_atas11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_atas11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_item50.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jb_item50.setForeground(new java.awt.Color(255, 255, 255));
        jb_item50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_item50.setText("Whiskas");
        pn_atas11.add(jb_item50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 20));

        jb_item13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jb_item13.setForeground(new java.awt.Color(255, 255, 255));
        jb_item13.setText("$3");
        pn_atas11.add(jb_item13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 20));

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        pn_atas11.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        js_item5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        js_item5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        pn_atas11.add(js_item5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, -1));

        lb_price6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_price6.setForeground(new java.awt.Color(255, 255, 255));
        lb_price6.setText("Price:");
        pn_atas11.add(lb_price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 20));

        lb_quantty6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_quantty6.setForeground(new java.awt.Color(255, 255, 255));
        lb_quantty6.setText("Quantty:");
        pn_atas11.add(lb_quantty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 20));

        lb_purchese5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_purchese5.setForeground(new java.awt.Color(255, 255, 255));
        lb_purchese5.setText("Purchese:");
        pn_atas11.add(lb_purchese5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 20));

        lb_image4.setText("jLabel5");
        pn_atas11.add(lb_image4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));

        pn_atas12.setBackground(new java.awt.Color(78, 19, 4));
        pn_atas12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_atas12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_item55.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jb_item55.setForeground(new java.awt.Color(255, 255, 255));
        jb_item55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_item55.setText("Whiskas");
        pn_atas12.add(jb_item55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 20));

        jb_item56.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jb_item56.setForeground(new java.awt.Color(255, 255, 255));
        jb_item56.setText("$3");
        pn_atas12.add(jb_item56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 20));

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        pn_atas12.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        js_item6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        js_item6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        pn_atas12.add(js_item6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, -1));

        lb_price2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_price2.setForeground(new java.awt.Color(255, 255, 255));
        lb_price2.setText("Price:");
        pn_atas12.add(lb_price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 20));

        lb_quantty2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_quantty2.setForeground(new java.awt.Color(255, 255, 255));
        lb_quantty2.setText("Quantty:");
        pn_atas12.add(lb_quantty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 20));

        lb_purchese1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_purchese1.setForeground(new java.awt.Color(255, 255, 255));
        lb_purchese1.setText("Purchese:");
        pn_atas12.add(lb_purchese1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 20));

        lb_image5.setText("jLabel5");
        pn_atas12.add(lb_image5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Shop LuckyPaw PetShop");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jb_time.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(jb_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 90, 31));

        jb_date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(jb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 170, 31));

        javax.swing.GroupLayout pn_utamaLayout = new javax.swing.GroupLayout(pn_utama);
        pn_utama.setLayout(pn_utamaLayout);
        pn_utamaLayout.setHorizontalGroup(
            pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_utamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_utamaLayout.createSequentialGroup()
                        .addGroup(pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_utamaLayout.createSequentialGroup()
                                .addComponent(pn_atas10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pn_atas11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pn_atas12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_utamaLayout.createSequentialGroup()
                                .addComponent(pn_atas8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pn_atas7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pn_atas9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_utamaLayout.setVerticalGroup(
            pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_utamaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addGroup(pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_utamaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pn_atas8, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(pn_atas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_atas9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pn_atas11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_atas12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_atas10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(pn_utama);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        int qty = Integer.parseInt(js_item1.getValue().toString());
        if (!qtyIsZero(qty)) {
            }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

public void setTime() {
    new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(shop.class.getName()).log(Level.SEVERE, null, ex);
                }

                Date date = new Date();
                SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");

                String time = tf.format(date);
                String dateText = df.format(date);

                jb_time.setText(time);      // Untuk jam (misalnya: 7:20:35 PM)
                jb_date.setText(dateText);  // Untuk tanggal (misalnya: Kamis, 19-06-2025)
            }
        }
    }).start();
}

 
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JLabel jb_date;
    private javax.swing.JLabel jb_item10;
    private javax.swing.JLabel jb_item11;
    private javax.swing.JLabel jb_item12;
    private javax.swing.JLabel jb_item13;
    private javax.swing.JLabel jb_item45;
    private javax.swing.JLabel jb_item50;
    private javax.swing.JLabel jb_item55;
    private javax.swing.JLabel jb_item56;
    private javax.swing.JLabel jb_item9;
    private javax.swing.JLabel jb_time;
    private javax.swing.JSpinner js_item1;
    private javax.swing.JSpinner js_item2;
    private javax.swing.JSpinner js_item3;
    private javax.swing.JSpinner js_item4;
    private javax.swing.JSpinner js_item5;
    private javax.swing.JSpinner js_item6;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel lb_image1;
    private javax.swing.JLabel lb_image2;
    private javax.swing.JLabel lb_image3;
    private javax.swing.JLabel lb_image4;
    private javax.swing.JLabel lb_image5;
    private javax.swing.JLabel lb_item1;
    private javax.swing.JLabel lb_item2;
    private javax.swing.JLabel lb_item3;
    private javax.swing.JLabel lb_price1;
    private javax.swing.JLabel lb_price2;
    private javax.swing.JLabel lb_price3;
    private javax.swing.JLabel lb_price4;
    private javax.swing.JLabel lb_price5;
    private javax.swing.JLabel lb_price6;
    private javax.swing.JLabel lb_purchese;
    private javax.swing.JLabel lb_purchese1;
    private javax.swing.JLabel lb_purchese2;
    private javax.swing.JLabel lb_purchese3;
    private javax.swing.JLabel lb_purchese4;
    private javax.swing.JLabel lb_purchese5;
    private javax.swing.JLabel lb_quantty1;
    private javax.swing.JLabel lb_quantty2;
    private javax.swing.JLabel lb_quantty3;
    private javax.swing.JLabel lb_quantty4;
    private javax.swing.JLabel lb_quantty5;
    private javax.swing.JLabel lb_quantty6;
    private javax.swing.JPanel pn_atas10;
    private javax.swing.JPanel pn_atas11;
    private javax.swing.JPanel pn_atas12;
    private javax.swing.JPanel pn_atas7;
    private javax.swing.JPanel pn_atas8;
    private javax.swing.JPanel pn_atas9;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
