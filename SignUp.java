/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfdeneme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author askilic
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String name, mail, pass, bornDate, SelectKinds;

    public SignUp() {
        initComponents();
        setTitle("Netflix application");
    }
    
    public boolean haveEmail(String em){
        try {
            URL url2 = new URL("http://80.211.50.23:4000/api/user");
            BufferedReader in = new BufferedReader(new InputStreamReader(url2.openStream()));
            String inputLine, result = "";
            while ((inputLine = in.readLine()) != null) {
                // System.out.println(inputLine);
                result += inputLine + "\n";                
            }
           // System.out.println(result);
            
            in.close();
            
            JSONParser jsp = new JSONParser();
            Object obj = jsp.parse(result);
            
            JSONArray jsa = (JSONArray) obj;
            String email = null;
            String pass = null;
            for(int i = 0;i<jsa.size();i++){
                JSONObject jso = (JSONObject) jsa.get(i);
                email =  jso.get("email").toString();
                if(em.equals(email)){
                        return false;
                }
            }
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    

    int selectControl() {
        int selectControl = 0;
        if (natureRadioButton.isSelected()) {
            selectControl++;
        }
        if (romanceRadioButton.isSelected()) {
            selectControl++;
        }
        if (scienceFRadioButton.isSelected()) {
            selectControl++;
        }
        if (dramaRadioButton.isSelected()) {
            selectControl++;
        }
        if (documentaryRadioButton.isSelected()) {
            selectControl++;
        }
        if (actionRadioButton.isSelected()) {
            selectControl++;
        }
        if (thrillerRadioButton.isSelected()) {
            selectControl++;
        }
        if (horrorRadioButton.isSelected()) {
            selectControl++;
        }
        if (kidsRadioButton.isSelected()) {
            selectControl++;
        }
        if (comedyRadioButton.isSelected()) {
            selectControl++;
        }

        return selectControl;

    }

    String takeSelectedKinds() {
        String SelectedKinds = "";

        if (actionRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "aksiyon ve macera,";
        }
        if (documentaryRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "belgesel,";
        }
        if (dramaRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "drama,";
        }
        if (scienceFRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "bilim kurgu ve fantastik yapim,";
        }
        if (romanceRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "romantik,";
        }
        if (natureRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "bilim ve doga,";
        }
        if (kidsRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "cocuk ve aile,";
        }
        if (thrillerRadioButton.isSelected()) {
            SelectedKinds = SelectedKinds + "gerilim,";
        }
        if (comedyRadioButton.isSelected()) {
            SelectedKinds += "komedi,";
        }
        if (horrorRadioButton.isSelected()) {
            SelectedKinds += "korku,";
        }

        return SelectedKinds;
    }
    boolean isNumber(String s){
        int i;
        for(i=0;i<s.length();i++){
            if(!(Character.isDigit(s.charAt(i)))){
                JOptionPane.showMessageDialog(null,"Date of birth must be number");
                return false;
            }
        }
        return true;
    }
    boolean takeCorrectDate(){
        int day = Integer.parseInt(dayTextField.getText());
        int month = Integer.parseInt(monthTextField.getText());
        int year = Integer.parseInt(yearTextField.getText());
        int c = 0;
        if(day >30 || day < 1) c++;
        if(month<1 || month > 12) c++;
        if(year >2020 || year <1850) c++;
        if(c != 0) return false;
        return true;
    }
    boolean check() {
        int c = 0;
        if ("".equals(nameTextField.getText())) {
            JOptionPane.showMessageDialog(null, "name isn't filled!!");
            return false;
        }  if ("".equals(surnameTextField.getText())) {
            JOptionPane.showMessageDialog(null, "surname isn't filled !!!");
            return false;
        }  if ("".equals(mailTextField.getText())) {
            JOptionPane.showMessageDialog(null, "mail isn't filled!!!");
            return false;
        }  if ("".equals(passwordTextField.getText())) {
            JOptionPane.showMessageDialog(null, "password isn't filled");
            return false;
        }  if ("".equals(dayTextField.getText())) {
            JOptionPane.showMessageDialog(null, "day isn't filled");
            return false;
        }  if ("".equals(monthTextField.getText())) {
            JOptionPane.showMessageDialog(null, "month isn't filled");
            return false;
        }  if ("".equals(yearTextField.getText())) {
            JOptionPane.showMessageDialog(null, "year isn't filled");
            return false;
        }if(isNumber(dayTextField.getText()) == false){
            return false;
        }if(isNumber(monthTextField.getText()) == false){
            return false;
        }if(isNumber(yearTextField.getText()) == false){
            return false;
        }if(takeCorrectDate() == false){
            JOptionPane.showMessageDialog(null,"Wrong date numbers\n"+
                    "day can be [1-30]\n"+"month can be [1-12]\n"+
                        "year can be [1850-2020]");
            return false;
        }if (selectControl() < 3) {
            JOptionPane.showMessageDialog(null, "not enough program kinds selected !!");
            return false;
        }
        
        return true;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoPanel = new javax.swing.JPanel();
        logoNameLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        SignUpPanel = new javax.swing.JPanel();
        signUpLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        surnameTextField = new javax.swing.JTextField();
        mailLabel = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        borndateLabel = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        monthTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        mTyLabel = new javax.swing.JLabel();
        dTmLabel = new javax.swing.JLabel();
        programLabel = new javax.swing.JLabel();
        actionRadioButton = new javax.swing.JRadioButton();
        documentaryRadioButton = new javax.swing.JRadioButton();
        scienceFRadioButton = new javax.swing.JRadioButton();
        natureRadioButton = new javax.swing.JRadioButton();
        kidsRadioButton = new javax.swing.JRadioButton();
        dramaRadioButton = new javax.swing.JRadioButton();
        thrillerRadioButton = new javax.swing.JRadioButton();
        comedyRadioButton = new javax.swing.JRadioButton();
        horrorRadioButton = new javax.swing.JRadioButton();
        romanceRadioButton = new javax.swing.JRadioButton();
        pWarningLabel = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        signInLabel = new javax.swing.JLabel();
        mailSeparator = new javax.swing.JSeparator();
        nameSeparator = new javax.swing.JSeparator();
        yearSeparator = new javax.swing.JSeparator();
        surnameSeparator = new javax.swing.JSeparator();
        daySeparator = new javax.swing.JSeparator();
        monthSeparator = new javax.swing.JSeparator();
        passwordSeparator = new javax.swing.JSeparator();
        programSeparator = new javax.swing.JSeparator();
        pEndSeparator = new javax.swing.JSeparator();
        pBeginSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoPanel.setBackground(new java.awt.Color(40, 36, 36));
        LogoPanel.setForeground(new java.awt.Color(40, 36, 36));
        LogoPanel.setPreferredSize(new java.awt.Dimension(520, 490));
        LogoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/netflix-240.png"))); // NOI18N
        LogoPanel.add(logoNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 250, 70));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/netflix.png"))); // NOI18N
        LogoPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

        getContentPane().add(LogoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        SignUpPanel.setBackground(new java.awt.Color(164, 0, 19));
        SignUpPanel.setForeground(new java.awt.Color(164, 0, 19));
        SignUpPanel.setPreferredSize(new java.awt.Dimension(312, 502));
        SignUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/Signup-account-64.png"))); // NOI18N
        SignUpPanel.add(signUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -5, 70, 70));

        nameLabel.setBackground(new java.awt.Color(164, 0, 19));
        nameLabel.setFont(new java.awt.Font("Garuda", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(40, 36, 36));
        nameLabel.setText("Name : ");
        SignUpPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 20));

        nameTextField.setBackground(new java.awt.Color(164, 0, 19));
        nameTextField.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(40, 36, 36));
        nameTextField.setText("Name...");
        nameTextField.setBorder(null);
        nameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameTextFieldMousePressed(evt);
            }
        });
        SignUpPanel.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 85, 110, 30));

        surnameTextField.setBackground(new java.awt.Color(164, 0, 19));
        surnameTextField.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        surnameTextField.setForeground(new java.awt.Color(40, 36, 36));
        surnameTextField.setText("Surname...");
        surnameTextField.setBorder(null);
        surnameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                surnameTextFieldMousePressed(evt);
            }
        });
        surnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTextFieldActionPerformed(evt);
            }
        });
        SignUpPanel.add(surnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 85, 110, 30));

        mailLabel.setBackground(new java.awt.Color(164, 0, 19));
        mailLabel.setFont(new java.awt.Font("Garuda", 1, 18)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(40, 36, 36));
        mailLabel.setText("Mail :");
        SignUpPanel.add(mailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 60, 20));

        mailTextField.setBackground(new java.awt.Color(164, 0, 19));
        mailTextField.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        mailTextField.setForeground(new java.awt.Color(40, 36, 36));
        mailTextField.setText("Mail...");
        mailTextField.setBorder(null);
        mailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mailTextFieldMousePressed(evt);
            }
        });
        SignUpPanel.add(mailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 135, 250, 30));

        passwordLabel.setBackground(new java.awt.Color(164, 0, 19));
        passwordLabel.setFont(new java.awt.Font("Garuda", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(40, 36, 36));
        passwordLabel.setText("Password :");
        SignUpPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 20));

        passwordTextField.setBackground(new java.awt.Color(164, 0, 19));
        passwordTextField.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(40, 36, 36));
        passwordTextField.setText("jPasswordField1");
        passwordTextField.setBorder(null);
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTextFieldMousePressed(evt);
            }
        });
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        SignUpPanel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, 210, 30));

        borndateLabel.setBackground(new java.awt.Color(164, 0, 19));
        borndateLabel.setFont(new java.awt.Font("Garuda", 1, 18)); // NOI18N
        borndateLabel.setForeground(new java.awt.Color(40, 36, 36));
        borndateLabel.setText("Borndate :");
        SignUpPanel.add(borndateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, 20));

        dayTextField.setBackground(new java.awt.Color(164, 0, 19));
        dayTextField.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        dayTextField.setForeground(new java.awt.Color(40, 36, 36));
        dayTextField.setText("Day");
        dayTextField.setBorder(null);
        dayTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dayTextFieldMousePressed(evt);
            }
        });
        dayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayTextFieldActionPerformed(evt);
            }
        });
        SignUpPanel.add(dayTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, 30, 30));

        monthTextField.setBackground(new java.awt.Color(164, 0, 19));
        monthTextField.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        monthTextField.setForeground(new java.awt.Color(40, 36, 36));
        monthTextField.setText("Month");
        monthTextField.setBorder(null);
        monthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                monthTextFieldMousePressed(evt);
            }
        });
        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });
        SignUpPanel.add(monthTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 225, 60, 30));

        yearTextField.setBackground(new java.awt.Color(164, 0, 19));
        yearTextField.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        yearTextField.setForeground(new java.awt.Color(40, 36, 36));
        yearTextField.setText("Year");
        yearTextField.setBorder(null);
        yearTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yearTextFieldMousePressed(evt);
            }
        });
        SignUpPanel.add(yearTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 225, 50, 30));

        mTyLabel.setFont(new java.awt.Font("Garuda", 1, 18)); // NOI18N
        mTyLabel.setForeground(new java.awt.Color(40, 36, 36));
        mTyLabel.setText("-");
        SignUpPanel.add(mTyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 10, -1));

        dTmLabel.setBackground(new java.awt.Color(164, 0, 19));
        dTmLabel.setFont(new java.awt.Font("Garuda", 1, 18)); // NOI18N
        dTmLabel.setForeground(new java.awt.Color(40, 36, 36));
        dTmLabel.setText("-");
        SignUpPanel.add(dTmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 10, -1));

        programLabel.setBackground(new java.awt.Color(164, 0, 19));
        programLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        programLabel.setForeground(new java.awt.Color(40, 36, 36));
        programLabel.setText("what kind of programs interest you :");
        SignUpPanel.add(programLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        actionRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        actionRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        actionRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        actionRadioButton.setText("Action & Adventure");
        actionRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(actionRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 323, 80, 20));

        documentaryRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        documentaryRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        documentaryRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        documentaryRadioButton.setText("Documentary");
        documentaryRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentaryRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(documentaryRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 325, -1, 20));

        scienceFRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        scienceFRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        scienceFRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        scienceFRadioButton.setText("Science fiction & fantastic production");
        scienceFRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scienceFRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(scienceFRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 353, 150, 20));

        natureRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        natureRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        natureRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        natureRadioButton.setText("Science & Nature");
        natureRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natureRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(natureRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 383, -1, 20));

        kidsRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        kidsRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        kidsRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        kidsRadioButton.setText("Kids & Family");
        kidsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(kidsRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 383, -1, 20));

        dramaRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        dramaRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        dramaRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        dramaRadioButton.setText("Dramas");
        dramaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dramaRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(dramaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 323, -1, 20));

        thrillerRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        thrillerRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        thrillerRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        thrillerRadioButton.setText("Thriller ");
        thrillerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thrillerRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(thrillerRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 413, -1, 20));

        comedyRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        comedyRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        comedyRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        comedyRadioButton.setText("Comedy");
        comedyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comedyRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(comedyRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 413, -1, 20));

        horrorRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        horrorRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        horrorRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        horrorRadioButton.setText("Horror");
        horrorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horrorRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(horrorRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 413, 80, 20));

        romanceRadioButton.setBackground(new java.awt.Color(164, 0, 19));
        romanceRadioButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        romanceRadioButton.setForeground(new java.awt.Color(40, 36, 36));
        romanceRadioButton.setText("Romance");
        romanceRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanceRadioButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(romanceRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 353, -1, 20));

        pWarningLabel.setBackground(new java.awt.Color(164, 0, 19));
        pWarningLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        pWarningLabel.setForeground(new java.awt.Color(40, 36, 36));
        pWarningLabel.setText("Only choose 3 programs pls");
        SignUpPanel.add(pWarningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 20));

        signUpButton.setBackground(new java.awt.Color(164, 0, 19));
        signUpButton.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(40, 36, 36));
        signUpButton.setText("Sign-up");
        signUpButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        SignUpPanel.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, 20));

        loginLabel.setBackground(new java.awt.Color(164, 0, 19));
        loginLabel.setFont(new java.awt.Font("Garuda", 3, 14)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(241, 233, 233));
        loginLabel.setText("Already have an account ?");
        SignUpPanel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 20));

        warningLabel.setBackground(new java.awt.Color(164, 0, 19));
        warningLabel.setFont(new java.awt.Font("Garuda", 3, 14)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(241, 233, 233));
        warningLabel.setText("Click on icon to go to the login page :");
        SignUpPanel.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 20));

        signInLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/Signin-account-32.png"))); // NOI18N
        signInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLabelMouseClicked(evt);
            }
        });
        SignUpPanel.add(signInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 465, -1, 40));

        mailSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(mailSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 250, 10));

        nameSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, 10));

        yearSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(yearSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 50, 10));

        surnameSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(surnameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 110, 10));

        daySeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(daySeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 30, 10));

        monthSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(monthSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 60, 10));

        passwordSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, 10));

        programSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(programSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 230, 10));

        pEndSeparator.setBackground(new java.awt.Color(40, 36, 36));
        pEndSeparator.setForeground(new java.awt.Color(40, 36, 36));
        pEndSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(pEndSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 310, -1));

        pBeginSeparator.setBackground(new java.awt.Color(40, 36, 36));
        pBeginSeparator.setForeground(new java.awt.Color(40, 36, 36));
        pBeginSeparator.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        SignUpPanel.add(pBeginSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 310, 10));

        getContentPane().add(SignUpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 310, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void surnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameTextFieldActionPerformed

    private void dayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayTextFieldActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTextFieldActionPerformed

    private void kidsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            kidsRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_kidsRadioButtonActionPerformed

    private void horrorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horrorRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            horrorRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_horrorRadioButtonActionPerformed

    private void thrillerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thrillerRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            thrillerRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_thrillerRadioButtonActionPerformed

    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        SignIn n = new SignIn();
        n.setVisible(true);
    }//GEN-LAST:event_signInLabelMouseClicked

    private void actionRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            actionRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_actionRadioButtonActionPerformed

    private void documentaryRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentaryRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            documentaryRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_documentaryRadioButtonActionPerformed

    private void dramaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dramaRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            dramaRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_dramaRadioButtonActionPerformed

    private void scienceFRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scienceFRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            scienceFRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_scienceFRadioButtonActionPerformed

    private void romanceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanceRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            romanceRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_romanceRadioButtonActionPerformed

    private void natureRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natureRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            natureRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_natureRadioButtonActionPerformed

    private void comedyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comedyRadioButtonActionPerformed
        // TODO add your handling code here:
        int selectControl = selectControl();
        if (selectControl > 3) {
            comedyRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_comedyRadioButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        name = nameTextField.getText() + " " + surnameTextField.getText();
        mail = mailTextField.getText();
        pass = passwordTextField.getText();
        //System.out.println(pass);
        bornDate = yearTextField.getText() + "-" + monthTextField.getText()
                + "-" + dayTextField.getText();
        SelectKinds = takeSelectedKinds();
        this.setVisible(false);
        if(check() == true){
               if(haveEmail(mail)){
                   
                   try {
                      URL url2 = new URL("http://80.211.50.23:4000/api/register");
                       URLConnection con = url2.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("POST"); // PUT is another valid option
            http.setDoOutput(true);
            
            JSONObject jsuseradd = new JSONObject();
            jsuseradd.put("name",name);
            jsuseradd.put("email", mail);
            jsuseradd.put("pass", pass);
            jsuseradd.put("fav", SelectKinds);
            jsuseradd.put("date", bornDate);
            
            
            
            byte[] out = jsuseradd.toString().getBytes(StandardCharsets.UTF_8);
            int length = out.length;
            http.setFixedLengthStreamingMode(length);
            http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            http.connect();
            
            
            try(OutputStream os = http.getOutputStream()) {
                os.write(jsuseradd.toString().getBytes(StandardCharsets.UTF_8));
            }          
                   } catch (MalformedURLException ex) {
                       Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                   } catch (ProtocolException ex) {
                       Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                   } catch (IOException ex) {
                       Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                   }
            
                    SignIn sg = new SignIn();
                    sg.setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null, "bu email coktan kaydedilmistir");
                   this.setVisible(true);
               }
                   
       
        }
        else{
            this.setVisible(true);
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void nameTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextFieldMousePressed
        // TODO add your handling code here:
        nameTextField.setText("");
    }//GEN-LAST:event_nameTextFieldMousePressed

    private void surnameTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surnameTextFieldMousePressed
        // TODO add your handling code here:
        surnameTextField.setText("");
    }//GEN-LAST:event_surnameTextFieldMousePressed

    private void mailTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTextFieldMousePressed
        // TODO add your handling code here:
        mailTextField.setText("");
    }//GEN-LAST:event_mailTextFieldMousePressed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void passwordTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMousePressed
        // TODO add your handling code here:
        passwordTextField.setText("");
    }//GEN-LAST:event_passwordTextFieldMousePressed

    private void dayTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayTextFieldMousePressed
        // TODO add your handling code here:
        dayTextField.setText("");
    }//GEN-LAST:event_dayTextFieldMousePressed

    private void monthTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthTextFieldMousePressed
        // TODO add your handling code here:
        monthTextField.setText("");
    }//GEN-LAST:event_monthTextFieldMousePressed

    private void yearTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearTextFieldMousePressed
        // TODO add your handling code here:
        yearTextField.setText("");
    }//GEN-LAST:event_yearTextFieldMousePressed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JRadioButton actionRadioButton;
    private javax.swing.JLabel borndateLabel;
    private javax.swing.JRadioButton comedyRadioButton;
    private javax.swing.JLabel dTmLabel;
    private javax.swing.JSeparator daySeparator;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JRadioButton documentaryRadioButton;
    private javax.swing.JRadioButton dramaRadioButton;
    private javax.swing.JRadioButton horrorRadioButton;
    private javax.swing.JRadioButton kidsRadioButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoNameLabel;
    private javax.swing.JLabel mTyLabel;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JSeparator mailSeparator;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JSeparator monthSeparator;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton natureRadioButton;
    private javax.swing.JSeparator pBeginSeparator;
    private javax.swing.JSeparator pEndSeparator;
    private javax.swing.JLabel pWarningLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel programLabel;
    private javax.swing.JSeparator programSeparator;
    private javax.swing.JRadioButton romanceRadioButton;
    private javax.swing.JRadioButton scienceFRadioButton;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JSeparator surnameSeparator;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JRadioButton thrillerRadioButton;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JSeparator yearSeparator;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
