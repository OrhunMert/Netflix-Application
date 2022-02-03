/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfdeneme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author askilic
 */
public class Search extends javax.swing.JFrame {

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    DefaultTableModel model;
    /**
     * Creates new form Search
     */
    int uid;

    public Search() {
        initComponents();

        model = (DefaultTableModel) programTable.getModel();
        dateLabel.setText("date : " + dateFormat.format(date));
        initTable();
    }

    public Search(int uid) {
        initComponents();
        this.uid = uid;
        model = (DefaultTableModel) programTable.getModel();
        dateLabel.setText("date : " + dateFormat.format(date));
        initTable();
    }

    ArrayList<Integer> tpid;
    ArrayList<String> tpname, tptype, ttname;

    private void initTable() {
        try {
            URL url = new URL("http://80.211.50.23:4000/api/program");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine, result = "";
            while ((inputLine = in.readLine()) != null) {
                // System.out.println(inputLine);
                result += inputLine + "\n";
            }
            //System.out.println(result);

            in.close();

            ArrayList<String> pname = new ArrayList<>();
            ArrayList<String> ptype = new ArrayList<>();
            ArrayList<Integer> pid = new ArrayList<>();

            JSONParser jsp = new JSONParser();
            Object obj = jsp.parse(result);

            JSONArray jsa = (JSONArray) obj;

            int size;
            for (size = 0; size < jsa.size(); size++) {
                JSONObject jso = (JSONObject) jsa.get(size);
                int id = Integer.parseInt(jso.get("id").toString());
                String name = jso.get("name").toString();
                String tname = jso.get("tname").toString();

                pname.add(name);
                ptype.add(tname);
                pid.add(id);
            }

            /* for(int i = 0; i<size;i++){
                System.out.println(pid.get(i)+" - "+pname.get(i)+" - "+ptype.get(i));
            }*/
            //tname almaya çalış
            URL url2 = new URL("http://80.211.50.23:4000/api/ptype");
            URL url3 = new URL("http://80.211.50.23:4000/api/type");
            BufferedReader ptin = new BufferedReader(new InputStreamReader(url2.openStream()));
            BufferedReader tin = new BufferedReader(new InputStreamReader(url3.openStream()));

            String ptinputLine, ptresult = "";
            while ((ptinputLine = ptin.readLine()) != null) {
                // System.out.println(inputLine);
                ptresult += ptinputLine + "\n";
            }
            //System.out.println(result);

            ptin.close();

            String tinputLine, tresult = "";
            while ((tinputLine = tin.readLine()) != null) {
                // System.out.println(inputLine);
                tresult += tinputLine + "\n";
            }
            //System.out.println(result);

            tin.close();

            Object ptobj = jsp.parse(ptresult);
            Object tobj = jsp.parse(tresult);
            JSONArray ptjsa = (JSONArray) ptobj;
            JSONArray tjsa = (JSONArray) tobj;

            int[][] c = new int[74][4];
            int l = 0;
            for (int j = 0; j < 74; j++) {
                l = 0;
                for (int k = 0; k < ptjsa.size(); k++) {
                    JSONObject jo = (JSONObject) ptjsa.get(k);
                    int ptpid = Integer.parseInt(jo.get("pId").toString());
                    int pttid = Integer.parseInt(jo.get("tId").toString());
                    if ((j + 1) == ptpid) {
                        c[j][l] = pttid;
                        l++;
                    }
                }
            }

            /*for(int j=0;j<c.length;j++){
                for(int k=0;k<c[j].length;k++){
                    System.out.print(c[j][k]+"-");    
                }   
                System.out.println();
            }*/
            ArrayList<String> tname = new ArrayList<>();
            String s;
            for (int j = 0; j < c.length; j++) {
                s = "";
                for (int k = 0; k < c[j].length; k++) {
                    if (c[j][k] != 0) {
                        int ctid = c[j][k];

                        for (int h = 0; h < tjsa.size(); h++) {
                            JSONObject jo = (JSONObject) tjsa.get(h);
                            int ttid = Integer.parseInt(jo.get("id").toString());
                            if (ctid == ttid) {
                                String ttname = jo.get("tname").toString();
                                s += ttname + ",";
                            }
                        }
                    } else {
                        break;
                    }

                }
                tname.add(s);

            }

            /*for(int j = 0 ; j<tname.size();j++){
                System.out.println(tname.get(j));
            }*/
            // global atama
            tpid = pid;
            tpname = pname;
            tptype = ptype;
            ttname = tname;

            for (int j = 0; j < 74; j++) {
                model.insertRow(model.getRowCount(), new Object[]{
                    pid.get(j), pname.get(j), ptype.get(j), tname.get(j)
                });
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        programTable.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        tableScrollPane = new javax.swing.JScrollPane();
        programTable = new javax.swing.JTable();
        dateLabel = new javax.swing.JLabel();
        watchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchPanel.setBackground(new java.awt.Color(40, 36, 36));
        SearchPanel.setForeground(new java.awt.Color(40, 36, 36));
        SearchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setForeground(new java.awt.Color(232, 0, 19));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/backButton-48.png"))); // NOI18N
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        SearchPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        searchTextField.setBackground(new java.awt.Color(40, 36, 36));
        searchTextField.setFont(new java.awt.Font("FreeSerif", 1, 24)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(232, 0, 19));
        searchTextField.setText("search...");
        searchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextFieldMouseClicked(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });
        SearchPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 210, 35));

        programTable.setBackground(new java.awt.Color(40, 36, 36));
        programTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        programTable.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        programTable.setForeground(new java.awt.Color(232, 0, 19));
        programTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Program ID", "Program NAME", "Program TYPE", "Program KINDS"
            }
        ));
        tableScrollPane.setViewportView(programTable);

        SearchPanel.add(tableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 400));

        dateLabel.setBackground(new java.awt.Color(40, 36, 36));
        dateLabel.setFont(new java.awt.Font("FreeSerif", 1, 24)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(232, 0, 19));
        dateLabel.setText("date :");
        SearchPanel.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 220, -1));

        watchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/playButton-48.png"))); // NOI18N
        watchButton.setPreferredSize(new java.awt.Dimension(48, 48));
        watchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchButtonActionPerformed(evt);
            }
        });
        SearchPanel.add(watchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        getContentPane().add(SearchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextFieldMouseClicked
        // TODO add your handling code here:
        searchTextField.setText("");
    }//GEN-LAST:event_searchTextFieldMouseClicked

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
        String query = searchTextField.getText();
        filter(query);
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void watchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchButtonActionPerformed
        // TODO add your handling code here:
        String s = searchTextField.getText();
        if(s.equals("") || s.equals("search...")){
            int selectedRowIndex = programTable.getSelectedRow();
        System.out.println(model.getValueAt(selectedRowIndex, 0).toString());
        int pid = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        System.out.println(pid);
        new NetFlix(uid).SelectPic(pid);
        }
        else
            JOptionPane.showMessageDialog(null, "Filtrelenmiş şekilde play butonu çalışmaz");
        


    }//GEN-LAST:event_watchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTable programTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton watchButton;
    // End of variables declaration//GEN-END:variables
}
