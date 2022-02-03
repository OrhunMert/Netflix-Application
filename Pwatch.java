/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfdeneme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.Thread.sleep;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author askilic
 */
public class Pwatch extends javax.swing.JFrame {

    /**
     * Creates new form Pwatch
     */
    ImageIcon icon;

    public Pwatch() {
        initComponents();
        setTitle("Netflix application");
        clock();
        progress();
    }

    //buradan aşağısını veri çekiminden sonra kullanmak için yaptım
    int pid, uid;
    static int uppoint = 0;

    public Pwatch(ImageIcon icon, int pid, int uid) {
        initComponents();
        setTitle("Netflix application");
        clock();
        progress();
        this.pid = pid;
        this.uid = uid;
        pPicLabel.setIcon(icon);
        PidLabel.setText(pid + " -)");
        initPwatch();
        initProgresBar();

    }

    private boolean checkUpdate() {
        try {
            URL url = new URL("http://80.211.50.23:4000/api/uprogram/all");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine, result = "";
            while ((inputLine = in.readLine()) != null) {
                // System.out.println(inputLine);
                result += inputLine + "\n";
            }
            //System.out.println(result);
            in.close();

            if (!result.equals("[]\n")) {
                JSONParser jsp = new JSONParser();
                Object obj = jsp.parse(result);

                JSONArray jsa = (JSONArray) obj;

                int i;
                for (i = 0; i < jsa.size(); i++) {
                    JSONObject jso = (JSONObject) jsa.get(i);
                    int u = Integer.parseInt(jso.get("uId").toString());
                    int p = Integer.parseInt(jso.get("pId").toString());
                    if (pid == p && uid == u) {
                        return false; // false ise daha önceden eklenmiştir , durumu güncellenecek
                        // update'i çağır  
                    }
                }
            } else {
                return true;
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true; // true ise ilk kez ekleniyor , insert çağır 
    }

    int ep, ept; //final değerleri yani totel episode sayısı ile total etime
    String[] kinds = {"aksiyon", "belgesel", "drama",
        "bilimkurgu", "romantizm", "bilimdoga",
        "cocukaile", "gerilim", "komedi", "korku,"};

    private String change(String s) {
        if (s.equals(kinds[0])) {
            s = "aksiyon ve macera"; //yok
        }
        if (s.equals(kinds[1])) {
            s = "belgesel"; // var
        }
        if (s.equals(kinds[2])) {
            s = "drama"; // var
        }
        if (s.equals(kinds[3])) {
            s = "bilim kurgu ve fantastik yapim"; //yok
        }
        if (s.equals(kinds[4])) {
            s = "romantik"; // yok
        }
        if (s.equals(kinds[5])) {
            s = "bilim ve doga"; // yok
        }
        if (s.equals(kinds[6])) {
            s = "cocuk ve aile"; // yok 
        }
        if (s.equals(kinds[7])) {
            s = "gerilim"; // var 
        }
        if (s.equals(kinds[8])) {
            s = "komedi"; // var 
        }
        if (s.equals(kinds[9])) {
            s = "korku"; // var 
        }
        return s;
    }

    private void initPwatch() {
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

            JSONParser jsp = new JSONParser();
            Object obj = jsp.parse(result);

            JSONArray jsa = (JSONArray) obj;

            int k;
            for (k = 0; k < jsa.size(); k++) {
                JSONObject jso = (JSONObject) jsa.get(k);
                int id = Integer.parseInt(jso.get("id").toString());
                if (pid == id) {
                    break;
                }
            }

            JSONObject jso = (JSONObject) jsa.get(k);
            String pname = jso.get("name").toString();
            String tname = jso.get("tname").toString();
            int episode = Integer.parseInt(jso.get("episode").toString());
            ep = episode;
            int etime = Integer.parseInt(jso.get("etime").toString());
            ept = etime;
            PnameLabel.setText(pname);
            PtypeLabel.setText(tname);
            PepisodeLabel.setText(episode + "");
            PtimeLabel.setText(etime + "");

            //type id 'yi çekmek için 
            URL url2 = new URL("http://80.211.50.23:4000/api/ptype");
            BufferedReader ptin = new BufferedReader(new InputStreamReader(url2.openStream()));
            String ptinputLine, ptresult = "";
            while ((ptinputLine = ptin.readLine()) != null) {
                // System.out.println(inputLine);
                ptresult += ptinputLine + "\n";
            }
            ptin.close();

            Object ptobj = jsp.parse(ptresult);

            JSONArray ptjsa = (JSONArray) ptobj;

            int l;
            ArrayList<Integer> tid = new ArrayList<>();
            for (l = 0; l < ptjsa.size(); l++) {
                JSONObject ptjso = (JSONObject) ptjsa.get(l);
                int ptpid = Integer.parseInt(ptjso.get("pId").toString());
                if (pid == ptpid) {
                    tid.add(Integer.parseInt(ptjso.get("tId").toString()));
                    //System.out.println(tid.size());
                }
            }

            //type ismini çekmek için 
            URL url3 = new URL("http://80.211.50.23:4000/api/type");
            BufferedReader tin = new BufferedReader(new InputStreamReader(url3.openStream()));
            String tinputLine, tresult = "";
            while ((tinputLine = tin.readLine()) != null) {
                // System.out.println(inputLine);
                tresult += tinputLine + "\n";
            }
            tin.close();

            Object tobj = jsp.parse(tresult);

            JSONArray tjsa = (JSONArray) tobj;

            ArrayList<String> kindName = new ArrayList<>();
            for (int c = 0; c < tid.size(); c++) {
                for (l = 0; l < tjsa.size(); l++) {
                    JSONObject tjso = (JSONObject) tjsa.get(l);

                    int ttid = Integer.parseInt(tjso.get("id").toString());
                    if (ttid == tid.get(c)) {
                        kindName.add(tjso.get("tname").toString());
                    }
                }
            }

            String kname = "";
            String[] t = new String[kindName.size()];
            for (l = 0; l < kindName.size(); l++) {
                t[l] = kindName.get(l);
                t[l] = change(t[l]);
                kname += t[l] + "\n";
            }
            PkindTextArea.setText(kname);
            
            // Kullanıcı verdiği puanı görebilmesi için
            URL url4 = new URL("http://80.211.50.23:4000/api/uprogram/all");
            BufferedReader upin = new BufferedReader(new InputStreamReader(url4.openStream()));
            String upinputLine , upresult ="";
            while ((upinputLine = upin.readLine()) != null) {
                // System.out.println(inputLine);
                upresult += upinputLine + "\n";
            }
            //System.out.println(upresult);
            upin.close();
            
            if(!upresult.equals("[]\n")){
                JSONParser upjsp = new JSONParser();
                Object upObject = upjsp.parse(upresult);
                JSONArray upjsa = (JSONArray) upObject;
                JSONObject upjso = (JSONObject) upjsa.get(0);
                int h;
                for(h=0;h<upjsa.size();h++){
                   int pId = Integer.parseInt(upjso.get("pId").toString());
                   int uId = Integer.parseInt(upjso.get("uId").toString());
                   if (pid == pId && uid == uId) {
                     break;
                    }
                }
                int point = Integer.parseInt(upjso.get("uppoint").toString());
                upLabel.setText(point+"");
                uppoint = point;
                
                
            }
            else
                upLabel.setText("0");

        } catch (MalformedURLException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int locep, locept; //o an çalıştırdığındaki bulunduğu episode sayısı ve etime

    private void initProgresBar() {
        try {
            URL url = new URL("http://80.211.50.23:4000/api/uprogram/all");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine, result = "";
            while ((inputLine = in.readLine()) != null) {
                // System.out.println(inputLine);
                result += inputLine + "\n";
            }
            //System.out.println(result);
            in.close();

            if (!result.equals("[]\n")) {
                JSONParser jsp = new JSONParser();
                Object obj = jsp.parse(result);

                JSONArray jsa = (JSONArray) obj;
                int k;
                int ch = -1;
                JSONObject jso = (JSONObject) jsa.get(0);
                for (k = 0; k < jsa.size(); k++) {
                     jso = (JSONObject) jsa.get(k);
                    int pId = Integer.parseInt(jso.get("pId").toString());
                    int uId = Integer.parseInt(jso.get("uId").toString());
                    if (pid == pId && uid == uId) {
                        ch++;
                        break;
                    }
                }
                if(ch != -1){
                    int episode = Integer.parseInt(jso.get("upepisode").toString());
                    int etime = Integer.parseInt(jso.get("upetime").toString());
                    locep = episode;
                    locept = etime;
                }
                else{
                    locep = 1;
                    locept = 0;
                }
                
            } else {
                locep = 1;
                locept = 0;
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private ActionListener a1;
    private Timer t;

    private void progress() {
        a1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (locep == ep && locept == ept) {
                    t.stop();
                    JOptionPane.showMessageDialog(null, "program bitti");
                    locep = 1;
                    locept = 0;
                }
                else if (locept == ept) {
                    locep++;
                    locept = 0;
                    watchingTimeProgressBar.setValue(0);
                    watchingTimeProgressBar.repaint();
                }
                else if (watchingTimeProgressBar.getValue() <= ept) {
                    watchingTimeProgressBar.setValue(locept);
                    locept += 1;

                }
            }
        };

        t = new Timer(1000, a1);

    } // ---> buradaki progress işlemini veri çekimini başarıyla yapabilseydim kullanacaktım

    private void clock() {

        Thread clock;
        clock = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);

                        int seconds = cal.get(Calendar.SECOND);
                        int minutes = cal.get(Calendar.MINUTE);
                        int hours = cal.get(Calendar.HOUR);
                        String tt = hours + ":" + minutes + ":" + seconds;
                        String dt = day + "/" + month + "/" + year;

                        //System.out.println(dt);
                        TimeLabel.setText(tt);
                        DateLabel1.setText(dt);
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        watchPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        TimeLabel = new javax.swing.JLabel();
        pPicLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        downSeparator = new javax.swing.JSeparator();
        rightSeparator = new javax.swing.JSeparator();
        upSeparator = new javax.swing.JSeparator();
        PtypeLabel = new javax.swing.JLabel();
        PepisodeLabel = new javax.swing.JLabel();
        PtimeLabel = new javax.swing.JLabel();
        ETIMELabel = new javax.swing.JLabel();
        EPISODELabel = new javax.swing.JLabel();
        TYPELabel = new javax.swing.JLabel();
        leftSeparator = new javax.swing.JSeparator();
        KINDLabel1 = new javax.swing.JLabel();
        PkindTextArea = new javax.swing.JTextArea();
        PlayButton = new javax.swing.JButton();
        DateLabel1 = new javax.swing.JLabel();
        PauseButton = new javax.swing.JButton();
        PidLabel = new javax.swing.JLabel();
        PnameLabel = new javax.swing.JLabel();
        watchingTimeProgressBar = new javax.swing.JProgressBar();
        Star2Label = new javax.swing.JLabel();
        Star1Label = new javax.swing.JLabel();
        Star4Label = new javax.swing.JLabel();
        Star3Label = new javax.swing.JLabel();
        Star8Label = new javax.swing.JLabel();
        Star7Label = new javax.swing.JLabel();
        Star6Label = new javax.swing.JLabel();
        Star5Label = new javax.swing.JLabel();
        Star9Label = new javax.swing.JLabel();
        Star10Label = new javax.swing.JLabel();
        userPointLabel = new javax.swing.JLabel();
        upLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        watchPanel.setBackground(new java.awt.Color(40, 36, 36));
        watchPanel.setForeground(new java.awt.Color(40, 36, 36));
        watchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(40, 36, 36));
        BackButton.setFont(new java.awt.Font("FreeSerif", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(232, 0, 19));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/backButton-48.png"))); // NOI18N
        BackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        watchPanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        TimeLabel.setBackground(new java.awt.Color(40, 36, 36));
        TimeLabel.setFont(new java.awt.Font("Tlwg Typo", 1, 24)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(232, 0, 19));
        TimeLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        watchPanel.add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 120, 30));

        pPicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        watchPanel.add(pPicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        infoPanel.setBackground(new java.awt.Color(40, 36, 36));
        infoPanel.setForeground(new java.awt.Color(40, 36, 36));
        infoPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        downSeparator.setBackground(new java.awt.Color(232, 0, 19));
        downSeparator.setForeground(new java.awt.Color(232, 0, 19));
        downSeparator.setFont(new java.awt.Font("FreeSerif", 1, 48)); // NOI18N
        infoPanel.add(downSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 455, 10));

        rightSeparator.setBackground(new java.awt.Color(232, 0, 19));
        rightSeparator.setForeground(new java.awt.Color(232, 0, 19));
        rightSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        rightSeparator.setFont(new java.awt.Font("FreeSerif", 1, 48)); // NOI18N
        infoPanel.add(rightSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 10, 255));

        upSeparator.setBackground(new java.awt.Color(232, 0, 19));
        upSeparator.setForeground(new java.awt.Color(232, 0, 19));
        upSeparator.setFont(new java.awt.Font("FreeSerif", 1, 48)); // NOI18N
        infoPanel.add(upSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 10));

        PtypeLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        PtypeLabel.setForeground(new java.awt.Color(232, 0, 19));
        PtypeLabel.setText("pTYPE dinamik");
        PtypeLabel.setPreferredSize(new java.awt.Dimension(200, 20));
        infoPanel.add(PtypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 240, -1));

        PepisodeLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        PepisodeLabel.setForeground(new java.awt.Color(232, 0, 19));
        PepisodeLabel.setText("pEPISODE dinamik");
        PepisodeLabel.setPreferredSize(new java.awt.Dimension(200, 20));
        infoPanel.add(PepisodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 240, -1));

        PtimeLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        PtimeLabel.setForeground(new java.awt.Color(232, 0, 19));
        PtimeLabel.setText("pTIME dinamik");
        PtimeLabel.setPreferredSize(new java.awt.Dimension(200, 20));
        infoPanel.add(PtimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 240, -1));

        ETIMELabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        ETIMELabel.setForeground(new java.awt.Color(232, 0, 19));
        ETIMELabel.setText("ONE EPISODE TIME > ");
        infoPanel.add(ETIMELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        EPISODELabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        EPISODELabel.setForeground(new java.awt.Color(232, 0, 19));
        EPISODELabel.setText("EPISODE NUMBER > ");
        infoPanel.add(EPISODELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        TYPELabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        TYPELabel.setForeground(new java.awt.Color(232, 0, 19));
        TYPELabel.setText("PROGRAM TYPE > ");
        infoPanel.add(TYPELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        leftSeparator.setBackground(new java.awt.Color(232, 0, 19));
        leftSeparator.setForeground(new java.awt.Color(232, 0, 19));
        leftSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        leftSeparator.setFont(new java.awt.Font("FreeSerif", 1, 48)); // NOI18N
        infoPanel.add(leftSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 255));

        KINDLabel1.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        KINDLabel1.setForeground(new java.awt.Color(232, 0, 19));
        KINDLabel1.setText("PROGRAM KINDS > ");
        infoPanel.add(KINDLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        PkindTextArea.setEditable(false);
        PkindTextArea.setBackground(new java.awt.Color(30, 30, 40));
        PkindTextArea.setColumns(20);
        PkindTextArea.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        PkindTextArea.setForeground(new java.awt.Color(232, 0, 19));
        PkindTextArea.setRows(5);
        PkindTextArea.setText("pKINDS dinamik");
        PkindTextArea.setBorder(null);
        PkindTextArea.setCaretColor(new java.awt.Color(30, 30, 40));
        PkindTextArea.setDisabledTextColor(new java.awt.Color(232, 0, 19));
        PkindTextArea.setSelectedTextColor(new java.awt.Color(232, 0, 19));
        PkindTextArea.setSelectionColor(new java.awt.Color(30, 31, 41));
        infoPanel.add(PkindTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 110));

        watchPanel.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 470, 270));

        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/playButton-48.png"))); // NOI18N
        PlayButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });
        watchPanel.add(PlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 50, 40));

        DateLabel1.setBackground(new java.awt.Color(40, 36, 36));
        DateLabel1.setFont(new java.awt.Font("Tlwg Typo", 1, 18)); // NOI18N
        DateLabel1.setForeground(new java.awt.Color(232, 0, 19));
        DateLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        watchPanel.add(DateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 120, 30));

        PauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/pause-48.png"))); // NOI18N
        PauseButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseButtonActionPerformed(evt);
            }
        });
        watchPanel.add(PauseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 50, 40));

        PidLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        PidLabel.setForeground(new java.awt.Color(232, 0, 19));
        PidLabel.setText("pID -)");
        PidLabel.setPreferredSize(new java.awt.Dimension(200, 20));
        watchPanel.add(PidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, -1));

        PnameLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        PnameLabel.setForeground(new java.awt.Color(232, 0, 19));
        PnameLabel.setText("pNAME dinamik");
        PnameLabel.setPreferredSize(new java.awt.Dimension(200, 20));
        watchPanel.add(PnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 280, -1));

        watchingTimeProgressBar.setBackground(new java.awt.Color(40, 36, 36));
        watchingTimeProgressBar.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        watchingTimeProgressBar.setForeground(new java.awt.Color(232, 0, 19));
        watchingTimeProgressBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        watchingTimeProgressBar.setPreferredSize(new java.awt.Dimension(200, 30));
        watchingTimeProgressBar.setStringPainted(true);
        watchPanel.add(watchingTimeProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        Star2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star2Label.setPreferredSize(new java.awt.Dimension(24, 24));
        Star2Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star2LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Star1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star1Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star1LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        Star4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star4Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star4LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        Star3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star3Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star3LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        Star8Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star8Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star8LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star8Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        Star7Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star7Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star7LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star7Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        Star6Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star6Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star6LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star6Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        Star5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star5Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star5LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        Star9Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star9Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star9LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star9Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        Star10Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/star-24.png"))); // NOI18N
        Star10Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star10LabelMouseClicked(evt);
            }
        });
        watchPanel.add(Star10Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        userPointLabel.setBackground(new java.awt.Color(40, 36, 36));
        userPointLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        userPointLabel.setForeground(new java.awt.Color(232, 0, 19));
        userPointLabel.setText("userPoint :");
        userPointLabel.setPreferredSize(new java.awt.Dimension(50, 20));
        watchPanel.add(userPointLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 80, 20));

        upLabel.setBackground(new java.awt.Color(40, 36, 36));
        upLabel.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        upLabel.setForeground(new java.awt.Color(232, 0, 19));
        upLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        watchPanel.add(upLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        getContentPane().add(watchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        // TODO add your handling code here:
        watchingTimeProgressBar.setMaximum(ept);
        //watchingTimeProgressBar.setMinimum(locept);
        t.start();

    }//GEN-LAST:event_PlayButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        t.stop();
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        String date = year + "-" + month + "-" + day;
        if (checkUpdate()) {
             try {
            URL url = new URL("http://80.211.50.23:4000/api/uprogram/insert");
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("POST"); // PUT is another valid option
            http.setDoOutput(true);
            
            JSONObject jsuseradd = new JSONObject();
            jsuseradd.put("pId",pid);
            jsuseradd.put("uId", uid);
            jsuseradd.put("upepisode", locep);
            jsuseradd.put("upetime", locept );
            jsuseradd.put("update", date);
            jsuseradd.put("uppoint",uppoint);
            
            byte[] out = jsuseradd.toString().getBytes(StandardCharsets.UTF_8);
            int length = out.length;
            http.setFixedLengthStreamingMode(length);
            http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            http.connect();
            
            
            try(OutputStream os = http.getOutputStream()) {
                os.write(jsuseradd.toString().getBytes(StandardCharsets.UTF_8));
            }
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            try {
                URL url = new URL("http://80.211.50.23:4000/api/uprogram/update");
                URLConnection con = url.openConnection();
                HttpURLConnection http = (HttpURLConnection) con;
                http.setRequestMethod("POST"); // PUT is another valid option
                http.setDoOutput(true);

                JSONObject jsuseradd = new JSONObject();
                jsuseradd.put("uId", uid);
                jsuseradd.put("pId", pid);
                jsuseradd.put("upepisode", locep);
                jsuseradd.put("upetime", locept);
                jsuseradd.put("update", date);
                jsuseradd.put("uppoint", uppoint);

                byte[] out = jsuseradd.toString().getBytes(StandardCharsets.UTF_8);
                int length = out.length;
                http.setFixedLengthStreamingMode(length);
                http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                http.connect();

                try (OutputStream os = http.getOutputStream()) {
                    os.write(jsuseradd.toString().getBytes(StandardCharsets.UTF_8));
                }

            } catch (MalformedURLException ex) {
                Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ProtocolException ex) {
                Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Pwatch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseButtonActionPerformed
        // TODO add your handling code here:
        t.stop();
    }//GEN-LAST:event_PauseButtonActionPerformed

    private void Star1LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star1LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("1");
        uppoint = 1;
    }//GEN-LAST:event_Star1LabelMouseClicked

    private void Star2LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star2LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("2");
        uppoint = 2;
    }//GEN-LAST:event_Star2LabelMouseClicked

    private void Star3LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star3LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("3");
        uppoint = 3;
    }//GEN-LAST:event_Star3LabelMouseClicked

    private void Star4LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star4LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("4");
        uppoint = 4;
    }//GEN-LAST:event_Star4LabelMouseClicked

    private void Star5LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star5LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("5");
        uppoint = 5;
    }//GEN-LAST:event_Star5LabelMouseClicked

    private void Star6LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star6LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("6");
        uppoint = 6;
    }//GEN-LAST:event_Star6LabelMouseClicked

    private void Star7LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star7LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("7");
        uppoint = 7;
    }//GEN-LAST:event_Star7LabelMouseClicked

    private void Star8LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star8LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("8");
        uppoint = 8;
    }//GEN-LAST:event_Star8LabelMouseClicked

    private void Star9LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star9LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("9");
        uppoint = 9;
    }//GEN-LAST:event_Star9LabelMouseClicked

    private void Star10LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star10LabelMouseClicked
        // TODO add your handling code here:
        upLabel.setText("10");
        uppoint = 10;
    }//GEN-LAST:event_Star10LabelMouseClicked

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
            java.util.logging.Logger.getLogger(Pwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pwatch().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel DateLabel1;
    private javax.swing.JLabel EPISODELabel;
    private javax.swing.JLabel ETIMELabel;
    private javax.swing.JLabel KINDLabel1;
    private javax.swing.JButton PauseButton;
    private javax.swing.JLabel PepisodeLabel;
    private javax.swing.JLabel PidLabel;
    private javax.swing.JTextArea PkindTextArea;
    private javax.swing.JButton PlayButton;
    private javax.swing.JLabel PnameLabel;
    private javax.swing.JLabel PtimeLabel;
    private javax.swing.JLabel PtypeLabel;
    private javax.swing.JLabel Star10Label;
    private javax.swing.JLabel Star1Label;
    private javax.swing.JLabel Star2Label;
    private javax.swing.JLabel Star3Label;
    private javax.swing.JLabel Star4Label;
    private javax.swing.JLabel Star5Label;
    private javax.swing.JLabel Star6Label;
    private javax.swing.JLabel Star7Label;
    private javax.swing.JLabel Star8Label;
    private javax.swing.JLabel Star9Label;
    private javax.swing.JLabel TYPELabel;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JSeparator downSeparator;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JSeparator leftSeparator;
    private javax.swing.JLabel pPicLabel;
    private javax.swing.JSeparator rightSeparator;
    private javax.swing.JLabel upLabel;
    private javax.swing.JSeparator upSeparator;
    private javax.swing.JLabel userPointLabel;
    private javax.swing.JPanel watchPanel;
    private javax.swing.JProgressBar watchingTimeProgressBar;
    // End of variables declaration//GEN-END:variables
}
