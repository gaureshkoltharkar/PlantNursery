/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.plant;

import com.controller.DbConfig;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author amaan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);   //jframe to center
        this.setBackground(new Color(0, 0, 0, 0));       //jframe to transparent background
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        panel_signin = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_signin = new javax.swing.JLabel();
        lbl_signup = new javax.swing.JLabel();
        kButton_login = new com.k33ptoo.components.KButton();
        jLabel_exitsignin = new javax.swing.JLabel();
        txtuser_in = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_minin = new javax.swing.JLabel();
        panel_signup = new com.k33ptoo.components.KGradientPanel();
        lbl_signin1 = new javax.swing.JLabel();
        lbl_signup1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtenpass_up = new javax.swing.JPasswordField();
        txtrepass_up = new javax.swing.JPasswordField();
        txtemail_up = new javax.swing.JTextField();
        txtuser_up = new javax.swing.JTextField();
        kButton_register = new com.k33ptoo.components.KButton();
        txtname_up = new javax.swing.JTextField();
        jLabel_minup = new javax.swing.JLabel();
        jLabel_exitsignup = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        panel_signin.setBackground(new Color(0,0,0,0));
        panel_signin.setkBorderRadius(75);
        panel_signin.setkEndColor(new java.awt.Color(250, 185, 148));
        panel_signin.setkGradientFocus(700);
        panel_signin.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel2.setText("Password");

        lbl_signin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_signin.setText("SignIn");

        lbl_signup.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_signup.setText("SignUp");
        lbl_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_signupMousePressed(evt);
            }
        });

        kButton_login.setBorder(null);
        kButton_login.setText("Log In");
        kButton_login.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        kButton_login.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton_login.setkBorderRadius(50);
        kButton_login.setkEndColor(new java.awt.Color(226, 154, 103));
        kButton_login.setkHoverEndColor(new java.awt.Color(250, 185, 148));
        kButton_login.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton_login.setkHoverStartColor(new java.awt.Color(151, 81, 34));
        kButton_login.setkPressedColor(new java.awt.Color(0, 204, 255));
        kButton_login.setkStartColor(new java.awt.Color(235, 184, 143));
        kButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton_loginActionPerformed(evt);
            }
        });

        jLabel_exitsignin.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel_exitsignin.setForeground(new java.awt.Color(255, 0, 102));
        jLabel_exitsignin.setText("X");
        jLabel_exitsignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_exitsigninMousePressed(evt);
            }
        });

        txtuser_in.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtuser_in.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel_minin.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel_minin.setForeground(new java.awt.Color(0, 204, 0));
        jLabel_minin.setText("-");
        jLabel_minin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_mininMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_signinLayout = new javax.swing.GroupLayout(panel_signin);
        panel_signin.setLayout(panel_signinLayout);
        panel_signinLayout.setHorizontalGroup(
            panel_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_signinLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_signin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_signup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_minin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_exitsignin)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_signinLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(kButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(panel_signinLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(panel_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtuser_in, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_signinLayout.setVerticalGroup(
            panel_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_signinLayout.createSequentialGroup()
                .addGroup(panel_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_signinLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_signup)
                            .addComponent(lbl_signin)))
                    .addGroup(panel_signinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_minin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_exitsignin))))
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(kButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jLayeredPane1.add(panel_signin, "card2");

        panel_signup.setBackground(new Color(0,0,0,0));
        panel_signup.setkBorderRadius(75);
        panel_signup.setkEndColor(new java.awt.Color(255, 255, 255));
        panel_signup.setkGradientFocus(700);
        panel_signup.setkStartColor(new java.awt.Color(250, 185, 148));

        lbl_signin1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_signin1.setText("SignUp");

        lbl_signup1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_signup1.setText("SignIn");
        lbl_signup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_signup1MousePressed(evt);
            }
        });

        jLabel3.setBackground(new Color(0,0,0,0));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel3.setText("Enter Name:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel4.setText("Enter Email:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel5.setText("Enter Username:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel6.setText("Enter Password:");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel7.setText("Re-Enter Password:");

        txtenpass_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txtenpass_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtrepass_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txtrepass_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtemail_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txtemail_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtuser_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txtuser_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        kButton_register.setBorder(null);
        kButton_register.setText("Register");
        kButton_register.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        kButton_register.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton_register.setkBorderRadius(50);
        kButton_register.setkEndColor(new java.awt.Color(250, 185, 148));
        kButton_register.setkHoverEndColor(new java.awt.Color(226, 154, 103));
        kButton_register.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton_register.setkHoverStartColor(new java.awt.Color(235, 184, 143));
        kButton_register.setkPressedColor(new java.awt.Color(0, 153, 51));
        kButton_register.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton_register.setkStartColor(new java.awt.Color(151, 81, 34));
        kButton_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton_registerActionPerformed(evt);
            }
        });

        txtname_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txtname_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtname_up.setName(""); // NOI18N

        jLabel_minup.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel_minup.setForeground(new java.awt.Color(0, 204, 0));
        jLabel_minup.setText("-");
        jLabel_minup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_minupMousePressed(evt);
            }
        });

        jLabel_exitsignup.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel_exitsignup.setForeground(new java.awt.Color(255, 0, 102));
        jLabel_exitsignup.setText("X");
        jLabel_exitsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_exitsignupMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_signupLayout = new javax.swing.GroupLayout(panel_signup);
        panel_signup.setLayout(panel_signupLayout);
        panel_signupLayout.setHorizontalGroup(
            panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_signupLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(kButton_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_signupLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbl_signup1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuser_up, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtname_up, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail_up, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(txtrepass_up, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtenpass_up, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_signupLayout.createSequentialGroup()
                        .addComponent(lbl_signin1)
                        .addGap(218, 218, 218)
                        .addComponent(jLabel_minup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_exitsignup)))
                .addGap(21, 21, 21))
        );
        panel_signupLayout.setVerticalGroup(
            panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_signupLayout.createSequentialGroup()
                .addGroup(panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_signupLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_signin1)
                            .addComponent(lbl_signup1)))
                    .addGroup(panel_signupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_exitsignup)
                            .addComponent(jLabel_minup, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname_up, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemail_up, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser_up, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(txtenpass_up, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrepass_up, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton_register, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        jLayeredPane1.add(panel_signup, "card2");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 540, 690));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/loginImage.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 400));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText(" Designed & Developed by : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Gauresh, Glavin, Prathamesh, Amaan");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Co-powered by Java Mini Project");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void loginUser() {
        String username = txtuser_in.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        txtuser_up.setText(username);
        txtenpass_up.setText(password);
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Some Fields Are Empty", "Error", 1);
        } else {

            try {
                Connection con = DbConfig.getConnection();
                //Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
                PreparedStatement smt = con.prepareStatement("select * from userdata where ud_username =? and ud_password =?");
                smt.setString(1, username);
                smt.setString(2, password);
                ResultSet st = smt.executeQuery();
                if (st.next()) {
                    JOptionPane.showMessageDialog(null, "You are Successfully logged in");
                    JFrame frame1 = new Login();
                    frame1.setVisible(false);
                    JFrame frame = new Home();
                    frame.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login Credentials");
                }
                con.close();
                st.close();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void kButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton_loginActionPerformed
        // TODO add your handling code here:
        loginUser();
    }//GEN-LAST:event_kButton_loginActionPerformed

    public static boolean isEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

    void registerUser() {
        String name = txtname_up.getText();
        String email = txtemail_up.getText();
        String username = txtuser_up.getText();
        String pass1 = String.valueOf(txtenpass_up.getPassword());
        String pass2 = String.valueOf(txtrepass_up.getPassword());

        if (isEmail(email) && pass1.equals(pass2) && !pass1.isEmpty() && !pass2.isEmpty() && !username.isEmpty() && !name.isEmpty()) {
            try {
                Connection con = DbConfig.getConnection();
                PreparedStatement smt = (PreparedStatement) con.prepareStatement("insert into userdata(ud_name,ud_email,ud_username,ud_password)values(?,?,?,?)");
                smt.setString(1, name);
                smt.setString(2, email);
                smt.setString(3, username);
                smt.setString(4, pass1);
                int res = smt.executeUpdate();
                if (res != 0) {
                    JOptionPane.showMessageDialog(null, "You are registered successfully");
                    panel_signin.setVisible(true);
                    panel_signup.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
                con.close();
                smt.close();
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill all the details correctly");
        }
    }

    private void kButton_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton_registerActionPerformed
        // TODO add your handling code here:
        registerUser();
    }//GEN-LAST:event_kButton_registerActionPerformed

    private void lbl_signupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signupMousePressed
        // TODO add your handling code here:
        panel_signin.setVisible(false);
        panel_signup.setVisible(true);
    }//GEN-LAST:event_lbl_signupMousePressed

    private void lbl_signup1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signup1MousePressed
        // TODO add your handling code here:
        panel_signin.setVisible(true);
        panel_signup.setVisible(false);
    }//GEN-LAST:event_lbl_signup1MousePressed

    private void jLabel_exitsigninMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitsigninMousePressed
        // TODO add your handling code here:
        System.exit(0); //for exut jframe
    }//GEN-LAST:event_jLabel_exitsigninMousePressed

    private void jLabel_mininMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_mininMousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);       //for minimize jframe
    }//GEN-LAST:event_jLabel_mininMousePressed

    private void jLabel_minupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minupMousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);       //for minimize jframe
    }//GEN-LAST:event_jLabel_minupMousePressed

    private void jLabel_exitsignupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitsignupMousePressed
        // TODO add your handling code here:
        System.exit(0); //for exut jframe
    }//GEN-LAST:event_jLabel_exitsignupMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel_exitsignin;
    private javax.swing.JLabel jLabel_exitsignup;
    private javax.swing.JLabel jLabel_minin;
    private javax.swing.JLabel jLabel_minup;
    private javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JPasswordField jPasswordField1;
    public com.k33ptoo.components.KButton kButton_login;
    public com.k33ptoo.components.KButton kButton_register;
    private javax.swing.JLabel lbl_signin;
    private javax.swing.JLabel lbl_signin1;
    private javax.swing.JLabel lbl_signup;
    private javax.swing.JLabel lbl_signup1;
    private com.k33ptoo.components.KGradientPanel panel_signin;
    private com.k33ptoo.components.KGradientPanel panel_signup;
    public javax.swing.JTextField txtemail_up;
    public javax.swing.JPasswordField txtenpass_up;
    public javax.swing.JTextField txtname_up;
    public javax.swing.JPasswordField txtrepass_up;
    public javax.swing.JTextField txtuser_in;
    public javax.swing.JTextField txtuser_up;
    // End of variables declaration//GEN-END:variables
}
