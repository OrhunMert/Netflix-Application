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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author askilic
 */
public class NetFlix extends javax.swing.JFrame {

    /**
     * Creates new form NetFlix
     */
    ArrayList<String> data;

    public NetFlix() {
        initComponents();
        setTitle("Netflix application");
    }
    int uid;

    public NetFlix(int id) {
        initComponents();
        setTitle("Netflix application");
        this.uid = id;
        setName();
        initRecommends();
        initKeepWatching();
    }

    String[] kinds = {"aksiyon ve macera,", "belgesel,", "drama,",
        "bilim kurgu ve fantastik yapim,", "romantik,", "bilim ve doga,",
        "cocuk ve aile,", "gerilim,", "komedi,", "korku,"};

    private String change(String s) {

        if (s.equals(kinds[0])) {
            s = "aksiyon"; // yok
        }
        if (s.equals(kinds[1])) {
            s = "belgesel"; // var
        }
        if (s.equals(kinds[2])) {
            s = "drama"; // var
        }
        if (s.equals(kinds[3])) {
            s = "bilimkurgu"; // yok 
        }
        if (s.equals(kinds[4])) {
            s = "romantizm"; // yok
        }
        if (s.equals(kinds[5])) {
            s = "bilimdoga"; // yok
        }
        if (s.equals(kinds[6])) {
            s = "cocukaile"; // yok 
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

    public ImageIcon getPic(int id) {
        ImageIcon gicon = new ImageIcon();
        switch (id) {
            case 1:
                gicon = (ImageIcon) p1PicLabel.getIcon();
                break;
            case 2:
                gicon = (ImageIcon) p2PicLabel.getIcon();
                break;
            case 3:
                gicon = (ImageIcon) p3PicLabel.getIcon();
                break;
            case 4:
                gicon = (ImageIcon) p4PicLabel.getIcon();
                break;
            case 5:
                gicon = (ImageIcon) p5PicLabel.getIcon();
                break;
            case 6:
                gicon = (ImageIcon) p6PicLabel.getIcon();
                break;
            case 7:
                gicon = (ImageIcon) p7PicLabel.getIcon();
                break;
            case 8:
                gicon = (ImageIcon) p8PicLabel.getIcon();
                break;
            case 9:
                gicon = (ImageIcon) p9PicLabel.getIcon();
                break;
            case 10:
                gicon = (ImageIcon) p10PicLabel.getIcon();
                break;
            case 11:
                gicon = (ImageIcon) p11PicLabel.getIcon();
                break;
            case 12:
                gicon = (ImageIcon) p12PicLabel.getIcon();
                break;
            case 13:
                gicon = (ImageIcon) p13PicLabel.getIcon();
                break;
            case 14:
                gicon = (ImageIcon) p14PicLabel.getIcon();
                break;
            case 15:
                gicon = (ImageIcon) p15PicLabel.getIcon();
                break;
            case 16:
                gicon = (ImageIcon) p16PicLabel.getIcon();
                break;
            case 17:
                gicon = (ImageIcon) p17PicLabel.getIcon();
                break;
            case 18:
                gicon = (ImageIcon) p18PicLabel.getIcon();
                break;
            case 19:
                gicon = (ImageIcon) p19PicLabel.getIcon();
                break;
            case 20:
                gicon = (ImageIcon) p20PicLabel.getIcon();
                break;
            case 21:
                gicon = (ImageIcon) p21PicLabel.getIcon();
                break;
            case 22:
                gicon = (ImageIcon) p22PicLabel.getIcon();
                break;
            case 23:
                gicon = (ImageIcon) p23PicLabel.getIcon();
                break;
            case 24:
                gicon = (ImageIcon) p24PicLabel.getIcon();
                break;
            case 25:
                gicon = (ImageIcon) p25PicLabel.getIcon();
                break;
            case 26:
                gicon = (ImageIcon) p26PicLabel.getIcon();
                break;
            case 27:
                gicon = (ImageIcon) p27PicLabel.getIcon();
                break;
            case 28:
                gicon = (ImageIcon) p28PicLabel.getIcon();
                break;
            case 29:
                gicon = (ImageIcon) p29PicLabel.getIcon();
                break;
            case 30:
                gicon = (ImageIcon) p30PicLabel.getIcon();
                break;
            case 31:
                gicon = (ImageIcon) p31PicLabel.getIcon();
                break;
            case 32:
                gicon = (ImageIcon) p32PicLabel.getIcon();
                break;
            case 33:
                gicon = (ImageIcon) p33PicLabel.getIcon();
                break;
            case 34:
                gicon = (ImageIcon) p34PicLabel.getIcon();
                break;
            case 35:
                gicon = (ImageIcon) p35PicLabel.getIcon();
                break;
            case 36:
                gicon = (ImageIcon) p36PicLabel.getIcon();
                break;
            case 37:
                gicon = (ImageIcon) p37PicLabel.getIcon();
                break;
            case 38:
                gicon = (ImageIcon) p38PicLabel.getIcon();
                break;
            case 39:
                gicon = (ImageIcon) p39PicLabel.getIcon();
                break;
            case 40:
                gicon = (ImageIcon) p40PicLabel.getIcon();
                break;
            case 41:
                gicon = (ImageIcon) p41PicLabel.getIcon();
                break;
            case 42:
                gicon = (ImageIcon) p42PicLabel.getIcon();
                break;
            case 43:
                gicon = (ImageIcon) p43PicLabel.getIcon();
                break;
            case 44:
                gicon = (ImageIcon) p44PicLabel.getIcon();
                break;
            case 45:
                gicon = (ImageIcon) p45PicLabel.getIcon();
                break;
            case 46:
                gicon = (ImageIcon) p46PicLabel.getIcon();
                break;
            case 47:
                gicon = (ImageIcon) p47PicLabel.getIcon();
                break;
            case 48:
                gicon = (ImageIcon) p48PicLabel.getIcon();
                break;
            case 49:
                gicon = (ImageIcon) p49PicLabel.getIcon();
                break;
            case 50:
                gicon = (ImageIcon) p50PicLabel.getIcon();
                break;
            case 51:
                gicon = (ImageIcon) p51PicLabel.getIcon();
                break;
            case 52:
                gicon = (ImageIcon) p52PicLabel.getIcon();
                break;
            case 53:
                gicon = (ImageIcon) p53PicLabel.getIcon();
                break;
            case 54:
                gicon = (ImageIcon) p54PicLabel.getIcon();
                break;
            case 55:
                gicon = (ImageIcon) p55PicLabel.getIcon();
                break;
            case 56:
                gicon = (ImageIcon) p56PicLabel.getIcon();
                break;
            case 57:
                gicon = (ImageIcon) p57PicLabel.getIcon();
                break;
            case 58:
                gicon = (ImageIcon) p58PicLabel.getIcon();
                break;
            case 59:
                gicon = (ImageIcon) p59PicLabel.getIcon();
                break;
            case 60:
                gicon = (ImageIcon) p60PicLabel.getIcon();
                break;
            case 61:
                gicon = (ImageIcon) p61PicLabel.getIcon();
                break;
            case 62:
                gicon = (ImageIcon) p62PicLabel.getIcon();
                break;
            case 63:
                gicon = (ImageIcon) p63PicLabel.getIcon();
                break;
            case 64:
                gicon = (ImageIcon) p64PicLabel.getIcon();
                break;
            case 65:
                gicon = (ImageIcon) p65PicLabel.getIcon();
                break;
            case 66:
                gicon = (ImageIcon) p66PicLabel.getIcon();
                break;
            case 67:
                gicon = (ImageIcon) p67PicLabel.getIcon();
                break;
            case 68:
                gicon = (ImageIcon) p68PicLabel.getIcon();
                break;
            case 69:
                gicon = (ImageIcon) p69PicLabel.getIcon();
                break;
            case 70:
                gicon = (ImageIcon) p70PicLabel.getIcon();
                break;
            case 71:
                gicon = (ImageIcon) p71PicLabel.getIcon();
                break;
            case 72:
                gicon = (ImageIcon) p72PicLabel.getIcon();
                break;
            case 73:
                gicon = (ImageIcon) p73PicLabel.getIcon();
                break;
            case 74:
                gicon = (ImageIcon) p74PicLabel.getIcon();
                break;
        }

        return gicon;
    }

    private String getName(int id) {
        String name = "";
        switch (id) {
            case 1:
                name = p1nameLabel.getText();
                break;
            case 2:
                name = p2nameLabel.getText();
                break;
            case 3:
                name = p3nameLabel.getText();
                break;
            case 4:
                name = p4nameLabel.getText();
                break;
            case 5:
                name = p5nameLabel.getText();
                break;
            case 6:
                name = p6nameLabel.getText();
                break;
            case 7:
                name = p7nameLabel.getText();
                break;
            case 8:
                name = p8nameLabel.getText();
                break;
            case 9:
                name = p9nameLabel.getText();
                break;
            case 10:
                name = p10nameLabel.getText();
                break;
            case 11:
                name = p11nameLabel.getText();
                break;
            case 12:
                name = p12nameLabel.getText();
                break;
            case 13:
                name = p13nameLabel.getText();
                break;
            case 14:
                name = p14nameLabel.getText();
                break;
            case 15:
                name = p15nameLabel.getText();
                break;
            case 16:
                name = p16nameLabel.getText();
                break;
            case 17:
                name = p17nameLabel.getText();
                break;
            case 18:
                name = p18nameLabel.getText();
                break;
            case 19:
                name = p19nameLabel.getText();
                break;
            case 20:
                name = p20nameLabel.getText();
                break;
            case 21:
                name = p21nameLabel.getText();
                break;
            case 22:
                name = p22nameLabel.getText();
                break;
            case 23:
                name = p23nameLabel.getText();
                break;
            case 24:
                name = p24nameLabel.getText();
                break;
            case 25:
                name = p25nameLabel.getText();
                break;
            case 26:
                name = p26nameLabel.getText();
                break;
            case 27:
                name = p27nameLabel.getText();
                break;
            case 28:
                name = p28nameLabel.getText();
                break;
            case 29:
                name = p29nameLabel.getText();
                break;
            case 30:
                name = p30nameLabel.getText();
                break;
            case 31:
                name = p31nameLabel.getText();
                break;
            case 32:
                name = p32nameLabel.getText();
                break;
            case 33:
                name = p33nameLabel.getText();
                break;
            case 34:
                name = p34nameLabel.getText();
                break;
            case 35:
                name = p35nameLabel.getText();
                break;
            case 36:
                name = p36nameLabel.getText();
                break;
            case 37:
                name = p37nameLabel.getText();
                break;
            case 38:
                name = p38nameLabel.getText();
                break;
            case 39:
                name = p39nameLabel.getText();
                break;
            case 40:
                name = p40nameLabel.getText();
                break;
            case 41:
                name = p41nameLabel.getText();
                break;
            case 42:
                name = p42nameLabel.getText();
                break;
            case 43:
                name = p43nameLabel.getText();
                break;
            case 44:
                name = p44nameLabel.getText();
                break;
            case 45:
                name = p45nameLabel.getText();
                break;
            case 46:
                name = p46nameLabel.getText();
                break;
            case 47:
                name = p47nameLabel.getText();
                break;
            case 48:
                name = p48nameLabel.getText();
                break;
            case 49:
                name = p49nameLabel.getText();
                break;
            case 50:
                name = p50nameLabel.getText();
                break;
            case 51:
                name = p51nameLabel.getText();
                break;
            case 52:
                name = p52nameLabel.getText();
                break;
            case 53:
                name = p53nameLabel.getText();
                break;
            case 54:
                name = p54nameLabel.getText();
                break;
            case 55:
                name = p55nameLabel.getText();
                break;
            case 56:
                name = p56nameLabel.getText();
                break;
            case 57:
                name = p57nameLabel.getText();
                break;
            case 58:
                name = p58nameLabel.getText();
                break;
            case 59:
                name = p59nameLabel.getText();
                break;
            case 60:
                name = p60nameLabel.getText();
                break;
            case 61:
                name = p61nameLabel.getText();
                break;
            case 62:
                name = p62nameLabel.getText();
                break;
            case 63:
                name = p63nameLabel.getText();
                break;
            case 64:
                name = p64nameLabel.getText();
                break;
            case 65:
                name = p65nameLabel.getText();
                break;
            case 66:
                name = p66nameLabel.getText();
                break;
            case 67:
                name = p67nameLabel.getText();
                break;
            case 68:
                name = p68nameLabel.getText();
                break;
            case 69:
                name = p69nameLabel.getText();
                break;
            case 70:
                name = p70nameLabel.getText();
                break;
            case 71:
                name = p71nameLabel.getText();
                break;
            case 72:
                name = p72nameLabel.getText();
                break;
            case 73:
                name = p73nameLabel.getText();
                break;
            case 74:
                name = p74nameLabel.getText();
                break;
        }

        return name;
    }

    private void initRecommends() {
        URL url2;
        try {
            url2 = new URL("http://80.211.50.23:4000/api/user");
            // user tablosundan favorileri türleri alınır

            BufferedReader in = new BufferedReader(new InputStreamReader(url2.openStream()));
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
            int i;
            for (i = 0; i < jsa.size(); i++) {
                JSONObject jso = (JSONObject) jsa.get(i);
                int pid = Integer.parseInt(jso.get("id").toString());
                if (uid == pid) {
                    break;
                }
            }
            
            JSONObject jso = (JSONObject) jsa.get(i);
            String fav = jso.get("fav").toString();
            String[] split = fav.split(",");
            //favori türleri type tablosuyla eşleşecek şekilde değiştirilir
            for (int j = 0; j < 3; j++) {
                split[j] = change(split[j]);
            }

            URL url = new URL("http://80.211.50.23:4000/api/type");
            //type tablosu okunmaya başlanır , type tablosundan tid çekilir
            BufferedReader sin = new BufferedReader(new InputStreamReader(url.openStream()));
            String sinputLine, kresult = "";
            while ((sinputLine = sin.readLine()) != null) {
                // System.out.println(inputLine);
                kresult += sinputLine + "\n";
            }
            //System.out.println(kresult);

            sin.close();

            Object obj2 = jsp.parse(kresult);
            JSONArray tjsa = (JSONArray) obj2;
            //tid'yi çekme işlemi
            int[] tid = new int[3];
            for (int k = 0; k < 3; k++) {
                for (int j = 0;j<tjsa.size();j++) {
                    JSONObject tjso = (JSONObject) tjsa.get(j);
                    String tname = tjso.get("tname").toString();
                    
                    if (split[k].equals(tname)) {
                        tid[k] = Integer.parseInt(tjso.get("id").toString());
                        j = tjsa.size();
                    }
                }
            }

            URL url3 = new URL("http://80.211.50.23:4000/api/ptype");
            //ptype tablosu okunur ptype tablosundan tid'leri uyuşan pid'ler çekilir
            BufferedReader in2 = new BufferedReader(new InputStreamReader(url3.openStream()));
            String inputLine2 , result2 = "";
            while ((inputLine2 = in2.readLine()) != null) {
                // System.out.println(inputLine);
                result2 += inputLine2 + "\n";
            }
            //System.out.println(kresult);

            in2.close();

            Object obj3 = jsp.parse(result2);
            JSONArray jsa2 = (JSONArray) obj3;
            //pid 'yi çekme işlemi
            ArrayList<Integer> pid0 = new ArrayList<>();
            ArrayList<Integer> pid1 = new ArrayList<>();
            ArrayList<Integer> pid2 = new ArrayList<>();

            // tid[0] == pid0 , tid[1] == pid1 , tid[2] == pid2;
            for (int j = 0; j < jsa2.size(); j++) {
                JSONObject tjso = (JSONObject) jsa2.get(j);
                int c = Integer.parseInt(tjso.get("tId").toString());
                if (tid[0] == c) {
                    int p = Integer.parseInt(tjso.get("pId").toString());
                    pid0.add(p);
                } else if (tid[1] == c) {
                    int p = Integer.parseInt(tjso.get("pId").toString());
                    pid1.add(p);
                } else if (tid[2] == c) {
                    int p = Integer.parseInt(tjso.get("pId").toString());
                    pid2.add(p);
                }
            }

            URL url4 = new URL("http://80.211.50.23:4000/api/program");
            // program dosyası okunur , puanlar karşılaştırılır en yüksek 2 paun çekilir
            BufferedReader in3 = new BufferedReader(new InputStreamReader(url4.openStream()));
            String inputLine3 , result3 = "";
            while ((inputLine3 = in3.readLine()) != null) {
                // System.out.println(inputLine);
                result3 += inputLine3 + "\n";
            }
            //System.out.println(kresult);

            in3.close();

            Object obj4 = jsp.parse(result3);
            JSONArray jsa3 = (JSONArray) obj4;

            //pid0 için
            int pid0max = Integer.MIN_VALUE, pid0max2 = Integer.MIN_VALUE;
            int pid0maxid = 0 , pid0max2id = 0;
            for (int k = 0; k < pid0.size(); k++) {
                for (int j = 0; j < jsa3.size(); j++) {
                    JSONObject tjso = (JSONObject) jsa3.get(j);
                    int pid = pid0.get(k);
                    int pId = Integer.parseInt(tjso.get("id").toString());
                    if (pid == pId) {
                        int max = Integer.parseInt(tjso.get("point").toString());
                        if (pid0max < max) {
                            pid0max = max;
                            pid0maxid = pId;
                        }
                    }
                }
            }

            for (int k = 0; k < pid0.size(); k++) {
                for (int j = 0; j < jsa3.size(); j++) {
                    JSONObject tjso = (JSONObject) jsa3.get(j);
                    int pid = pid0.get(k);
                    int pId = Integer.parseInt(tjso.get("id").toString());
                    if (pid == pId) {
                        int max = Integer.parseInt(tjso.get("point").toString());
                        if (pid0max2 < max && pid0maxid != pId) {
                            pid0max2 = max;
                            pid0max2id = pId;
                        }
                    }
                }
            }

            //pid1 için
            int pid1max = Integer.MIN_VALUE, pid1max2 = Integer.MIN_VALUE;
            int pid1maxid = 0 , pid1max2id = 0;
            for (int k = 0; k < pid1.size(); k++) {
                for (int j = 0; j < jsa3.size(); j++) {
                    JSONObject tjso = (JSONObject) jsa3.get(j);
                    int pid = pid1.get(k);
                    int pId = Integer.parseInt(tjso.get("id").toString());
                    if (pid == pId) {
                        int max = Integer.parseInt(tjso.get("point").toString());
                        if (pid1max < max) {
                            pid1max = max;
                            pid1maxid = pId;
                        }
                    }
                }
            }

            for (int k = 0; k < pid1.size(); k++) {
                for (int j = 0; j < jsa3.size(); j++) {
                    JSONObject tjso = (JSONObject) jsa3.get(j);
                    int pid = pid1.get(k);
                    int pId = Integer.parseInt(tjso.get("id").toString());
                    if (pid == pId) {
                        int max = Integer.parseInt(tjso.get("point").toString());
                        if (pid1max2 < max && pid1maxid != pId) {
                            pid1max2 = max;
                            pid1max2id = pId;
                        }
                    }
                }
            }

            //pid2 için
            int pid2max = Integer.MIN_VALUE, pid2max2 = Integer.MIN_VALUE;
            int pid2maxid = 0 , pid2max2id = 0;
            for (int k = 0; k < pid2.size(); k++) {
                for (int j = 0; j < jsa3.size(); j++) {
                    JSONObject tjso = (JSONObject) jsa3.get(j);
                    int pid = pid2.get(k);
                    int pId = Integer.parseInt(tjso.get("id").toString());
                    if (pid == pId) {
                        int max = Integer.parseInt(tjso.get("point").toString());
                        if (pid2max < max) {
                            pid2max = max;
                            pid2maxid = pId;
                        }
                    }
                }
            }

            for (int k = 0; k < pid2.size(); k++) {
                for (int j = 0; j < jsa3.size(); j++) {
                    JSONObject tjso = (JSONObject) jsa3.get(j);
                    int pid = pid2.get(k);
                    int pId = Integer.parseInt(tjso.get("id").toString());
                    if (pid == pId) {
                        int max = Integer.parseInt(tjso.get("point").toString());
                        if (pid2max2 < max && pid2maxid != pId) {
                            pid2max2 = max;
                            pid2max2id = pId;
                        }
                    }
                }
            }

// kazanılan : en yüksek 2 puanlı , seçilen türlerle eşleşen programların id'leri 
            //pid0 için pid0maxid , pid0max2id
            // pid1 için pid1maxid , pid1max2id
            //pid2 için pid2maxid , pid2max2id
            ImageIcon icon = getPic(pid0maxid);
            String rname = getName(pid0maxid);
            Recommend1PicLabel.setText("");
            Recommend1PicLabel.setIcon(icon);
            Recommend1nameLabel.setText(rname);

            icon = getPic(pid0max2id);
            rname = getName(pid0max2id);
            Recommend2PicLabel.setText("");
            Recommend2PicLabel.setIcon(icon);
            Recommend2nameLabel.setText(rname);

            icon = getPic(pid1maxid);
            rname = getName(pid1maxid);
            Recommend3PicLabel.setText("");
            Recommend3PicLabel.setIcon(icon);
            Recommend3nameLabel.setText(rname);

            icon = getPic(pid1max2id);
            rname = getName(pid1max2id);
            Recommend4PicLabel.setText("");
            Recommend4PicLabel.setIcon(icon);
            Recommend4nameLabel.setText(rname);

            icon = getPic(pid2maxid);
            rname = getName(pid2maxid);
            Recommend5PicLabel.setText("");
            Recommend5PicLabel.setIcon(icon);
            Recommend5nameLabel.setText(rname);

            icon = getPic(pid2max2id);
            rname = getName(pid2max2id);
            Recommend6PicLabel.setText("");
            Recommend6PicLabel.setIcon(icon);
            Recommend6nameLabel.setText(rname);

        } catch (MalformedURLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initKeepWatching(){
        try {
            URL url = new URL("http://80.211.50.23:4000/api/uprogram/all");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine, result = "";
            while ((inputLine = in.readLine()) != null) {
                // System.out.println(inputLine);
                result += inputLine + "\n";
                if (!result.equals("[]\n")){
                    JSONParser jsp = new JSONParser();
                Object obj = jsp.parse(result);

                JSONArray jsa = (JSONArray) obj;

                int i;
                ArrayList<Integer> pi = new ArrayList<>();
                for (i = 0; i < jsa.size(); i++) {
                    JSONObject jso = (JSONObject) jsa.get(i);
                    int u = Integer.parseInt(jso.get("uId").toString());
                    int p = Integer.parseInt(jso.get("pId").toString());
                    if(uid == u){
                        pi.add(p);
                    }
                }
                ImageIcon icon;
                String name ="";
                if(pi.size() >= 5){
                    int first = pi.get(pi.size()-5);
                    int second = pi.get(pi.size()-4);
                    int third = pi.get(pi.size()-3);
                    int fourth = pi.get(pi.size()-2);
                    int fifth = pi.get(pi.size()-1);
                    icon = getPic(fifth);
                    name = getName(fifth);
                    KeepWatching1PicLabel.setText("");
                    KeepWatching1PicLabel.setIcon(icon);
                    KeepWatching1nameLabel.setText(name);
                    icon = getPic(fourth);
                    name = getName(fourth);
                    KeepWatching2PicLabel.setText("");
                    KeepWatching2PicLabel.setIcon(icon);
                    KeepWatching2nameLabel.setText(name);
                    icon = getPic(third);
                    name = getName(third);
                    KeepWatching3PicLabel.setText("");
                    KeepWatching3PicLabel.setIcon(icon);
                    KeepWatching3nameLabel.setText(name); 
                    icon = getPic(second);
                    name = getName(second);
                    KeepWatching4PicLabel.setText("");
                    KeepWatching4PicLabel.setIcon(icon);
                    KeepWatching4nameLabel.setText(name); 
                    icon = getPic(first);
                    name = getName(first);
                    KeepWatching5PicLabel.setText("");
                    KeepWatching5PicLabel.setIcon(icon);
                    KeepWatching5nameLabel.setText(name);
                }
                else if(pi.size() == 4){
                    int first = pi.get(0);
                    int second = pi.get(1);
                    int third = pi.get(2);
                    int fourth = pi.get(3);
                    icon = getPic(fourth);
                    name = getName(fourth);
                    KeepWatching1PicLabel.setText("");
                    KeepWatching1PicLabel.setIcon(icon);
                    KeepWatching1nameLabel.setText(name);
                    icon = getPic(third);
                    name = getName(third);
                    KeepWatching2PicLabel.setText("");
                    KeepWatching2PicLabel.setIcon(icon);
                    KeepWatching2nameLabel.setText(name);
                    icon = getPic(second);
                    name = getName(second);
                    KeepWatching3PicLabel.setText("");
                    KeepWatching3PicLabel.setIcon(icon);
                    KeepWatching3nameLabel.setText(name);  
                    icon = getPic(first);
                    name = getName(first);
                    KeepWatching4PicLabel.setText("");
                    KeepWatching4PicLabel.setIcon(icon);
                    KeepWatching4nameLabel.setText(name); 
                    
                }
                else if(pi.size() == 3){
                    int first = pi.get(0);
                    int second = pi.get(1);
                    int third = pi.get(2);
                    icon = getPic(third);
                    name = getName(third);
                    KeepWatching1PicLabel.setText("");
                    KeepWatching1PicLabel.setIcon(icon);
                    KeepWatching1nameLabel.setText(name);
                    icon = getPic(second);
                    name = getName(second);
                    KeepWatching2PicLabel.setText("");
                    KeepWatching2PicLabel.setIcon(icon);
                    KeepWatching2nameLabel.setText(name);
                    icon = getPic(first);
                    name = getName(first);
                    KeepWatching3PicLabel.setText("");
                    KeepWatching3PicLabel.setIcon(icon);
                    KeepWatching3nameLabel.setText(name);           
                }
                else if(pi.size() == 2){
                    int first = pi.get(0);
                    int second = pi.get(1);
                    icon = getPic(second);
                    name = getName(second);
                    KeepWatching1PicLabel.setText("");
                    KeepWatching1PicLabel.setIcon(icon);
                    KeepWatching1nameLabel.setText(name);
                    icon = getPic(first);
                    name = getName(first);
                    KeepWatching2PicLabel.setText("");
                    KeepWatching2PicLabel.setIcon(icon);
                    KeepWatching2nameLabel.setText(name);   
                }
                else if(pi.size() == 1){
                    int first = pi.get(0);
                    icon = getPic(first);
                    name = getName(first);
                    KeepWatching1PicLabel.setText("");
                    KeepWatching1PicLabel.setIcon(icon);
                    KeepWatching1nameLabel.setText(name);
                }
                }
            }
            //System.out.println(result);
            in.close();
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(NetFlix.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(NetFlix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setName() {
        try {
            // TODO add your handling code here:
            URL url2 = new URL("http://80.211.50.23:4000/api/user");
            BufferedReader in = new BufferedReader(new InputStreamReader(url2.openStream()));
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
            int i;
            for (i = 0; i < jsa.size(); i++) {
                JSONObject jso = (JSONObject) jsa.get(i);
                int pid = Integer.parseInt(jso.get("id").toString());
                if (uid == pid) {
                    break;
                }
            }
            JSONObject jso = (JSONObject) jsa.get(i);
            String name = jso.get("name").toString();
            usernameLabel.setText(name);

        } catch (MalformedURLException ex) {
            Logger.getLogger(NetFlix.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(NetFlix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void SelectPic(int selected) {
        String name = "";
        ImageIcon gicon = new ImageIcon();
        switch (selected) {
            case 1:
                gicon = (ImageIcon) p1PicLabel.getIcon();
                name = p1nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 2:
                gicon = (ImageIcon) p2PicLabel.getIcon();
                name = p2nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 3:
                gicon = (ImageIcon) p3PicLabel.getIcon();
                name = p3nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 4:
                gicon = (ImageIcon) p4PicLabel.getIcon();
                name = p4nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 5:
                gicon = (ImageIcon) p5PicLabel.getIcon();
                name = p5nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 6:
                gicon = (ImageIcon) p6PicLabel.getIcon();
                name = p6nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 7:
                gicon = (ImageIcon) p7PicLabel.getIcon();
                name = p7nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 8:
                gicon = (ImageIcon) p8PicLabel.getIcon();
                name = p8nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 9:
                gicon = (ImageIcon) p9PicLabel.getIcon();
                name = p9nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 10:
                gicon = (ImageIcon) p10PicLabel.getIcon();
                name = p10nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 11:
                gicon = (ImageIcon) p11PicLabel.getIcon();
                name = p11nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 12:
                gicon = (ImageIcon) p12PicLabel.getIcon();
                name = p12nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 13:
                gicon = (ImageIcon) p13PicLabel.getIcon();
                name = p13nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 14:
                gicon = (ImageIcon) p14PicLabel.getIcon();
                name = p14nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 15:
                gicon = (ImageIcon) p15PicLabel.getIcon();
                name = p15nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 16:
                gicon = (ImageIcon) p16PicLabel.getIcon();
                name = p16nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 17:
                gicon = (ImageIcon) p17PicLabel.getIcon();
                name = p17nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 18:
                gicon = (ImageIcon) p18PicLabel.getIcon();
                name = p18nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 19:
                gicon = (ImageIcon) p19PicLabel.getIcon();
                name = p19nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 20:
                gicon = (ImageIcon) p20PicLabel.getIcon();
                name = p20nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 21:
                gicon = (ImageIcon) p21PicLabel.getIcon();
                name = p21nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 22:
                gicon = (ImageIcon) p22PicLabel.getIcon();
                name = p22nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 23:
                gicon = (ImageIcon) p23PicLabel.getIcon();
                name = p23nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 24:
                gicon = (ImageIcon) p24PicLabel.getIcon();
                name = p24nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 25:
                gicon = (ImageIcon) p25PicLabel.getIcon();
                name = p25nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 26:
                gicon = (ImageIcon) p26PicLabel.getIcon();
                name = p26nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 27:
                gicon = (ImageIcon) p27PicLabel.getIcon();
                name = p27nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 28:
                gicon = (ImageIcon) p28PicLabel.getIcon();
                name = p28nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 29:
                gicon = (ImageIcon) p29PicLabel.getIcon();
                name = p29nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 30:
                gicon = (ImageIcon) p30PicLabel.getIcon();
                name = p30nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 31:
                gicon = (ImageIcon) p31PicLabel.getIcon();
                name = p31nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 32:
                gicon = (ImageIcon) p32PicLabel.getIcon();
                name = p32nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 33:
                gicon = (ImageIcon) p33PicLabel.getIcon();
                name = p33nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 34:
                gicon = (ImageIcon) p34PicLabel.getIcon();
                name = p34nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 35:
                gicon = (ImageIcon) p35PicLabel.getIcon();
                name = p35nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 36:
                gicon = (ImageIcon) p36PicLabel.getIcon();
                name = p36nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 37:
                gicon = (ImageIcon) p37PicLabel.getIcon();
                name = p37nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 38:
                gicon = (ImageIcon) p38PicLabel.getIcon();
                name = p38nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 39:
                gicon = (ImageIcon) p39PicLabel.getIcon();
                name = p39nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 40:
                gicon = (ImageIcon) p40PicLabel.getIcon();
                name = p40nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 41:
                gicon = (ImageIcon) p41PicLabel.getIcon();
                name = p41nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 42:
                gicon = (ImageIcon) p42PicLabel.getIcon();
                name = p42nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 43:
                gicon = (ImageIcon) p43PicLabel.getIcon();
                name = p43nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 44:
                gicon = (ImageIcon) p44PicLabel.getIcon();
                name = p44nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 45:
                gicon = (ImageIcon) p45PicLabel.getIcon();
                name = p45nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 46:
                gicon = (ImageIcon) p46PicLabel.getIcon();
                name = p46nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 47:
                gicon = (ImageIcon) p47PicLabel.getIcon();
                name = p47nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 48:
                gicon = (ImageIcon) p48PicLabel.getIcon();
                name = p48nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 49:
                gicon = (ImageIcon) p49PicLabel.getIcon();
                name = p49nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 50:
                gicon = (ImageIcon) p50PicLabel.getIcon();
                name = p50nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 51:
                gicon = (ImageIcon) p51PicLabel.getIcon();
                name = p51nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 52:
                gicon = (ImageIcon) p52PicLabel.getIcon();
                name = p52nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 53:
                gicon = (ImageIcon) p53PicLabel.getIcon();
                name = p53nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 54:
                gicon = (ImageIcon) p54PicLabel.getIcon();
                name = p54nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 55:
                gicon = (ImageIcon) p55PicLabel.getIcon();
                name = p55nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 56:
                gicon = (ImageIcon) p56PicLabel.getIcon();
                name = p56nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 57:
                gicon = (ImageIcon) p57PicLabel.getIcon();
                name = p57nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 58:
                gicon = (ImageIcon) p58PicLabel.getIcon();
                name = p58nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 59:
                gicon = (ImageIcon) p59PicLabel.getIcon();
                name = p59nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 60:
                gicon = (ImageIcon) p60PicLabel.getIcon();
                name = p60nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 61:
                gicon = (ImageIcon) p61PicLabel.getIcon();
                name = p61nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 62:
                gicon = (ImageIcon) p62PicLabel.getIcon();
                name = p62nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 63:
                gicon = (ImageIcon) p63PicLabel.getIcon();
                name = p63nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 64:
                gicon = (ImageIcon) p64PicLabel.getIcon();
                name = p64nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 65:
                gicon = (ImageIcon) p65PicLabel.getIcon();
                name = p65nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 66:
                gicon = (ImageIcon) p66PicLabel.getIcon();
                name = p66nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 67:
                gicon = (ImageIcon) p67PicLabel.getIcon();
                name = p67nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 68:
                gicon = (ImageIcon) p68PicLabel.getIcon();
                name = p68nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 69:
                gicon = (ImageIcon) p69PicLabel.getIcon();
                name = p69nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 70:
                gicon = (ImageIcon) p70PicLabel.getIcon();
                name = p70nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 71:
                gicon = (ImageIcon) p71PicLabel.getIcon();
                name = p71nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 72:
                gicon = (ImageIcon) p72PicLabel.getIcon();
                name = p72nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 73:
                gicon = (ImageIcon) p73PicLabel.getIcon();
                name = p73nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            case 74:
                gicon = (ImageIcon) p74PicLabel.getIcon();
                name = p74nameLabel.getText();
                new Pwatch(gicon, selected, uid).setVisible(true);
                break;
            default:
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HEADERSplitPane = new javax.swing.JSplitPane();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        TVShowsLabel = new javax.swing.JLabel();
        HomePageLabel = new javax.swing.JLabel();
        MoviesLabel = new javax.swing.JLabel();
        SeriesLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usericonLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        PagesTabbedPane = new javax.swing.JTabbedPane();
        HomePageScrollPane = new javax.swing.JScrollPane();
        HomePagePanel = new javax.swing.JPanel();
        AllProgramsLabel = new javax.swing.JLabel();
        Recommend6PicLabel = new javax.swing.JLabel();
        KeepWatching1PicLabel = new javax.swing.JLabel();
        KeepWatching2PicLabel = new javax.swing.JLabel();
        KeepWatching3PicLabel = new javax.swing.JLabel();
        KeepWatching4PicLabel = new javax.swing.JLabel();
        KeepWatching5PicLabel = new javax.swing.JLabel();
        Recommend7Separator = new javax.swing.JSeparator();
        KeepWatching1Separator = new javax.swing.JSeparator();
        KeepWatching3Separator = new javax.swing.JSeparator();
        KeepWatching4Separator = new javax.swing.JSeparator();
        KeepWatching5Separator = new javax.swing.JSeparator();
        KeepWatching6Separator = new javax.swing.JSeparator();
        KeepWatching2Separator = new javax.swing.JSeparator();
        Recommend6nameLabel = new javax.swing.JLabel();
        KeepWatching1nameLabel = new javax.swing.JLabel();
        KeepWatching2nameLabel = new javax.swing.JLabel();
        KeepWatching3nameLabel = new javax.swing.JLabel();
        KeepWatching4nameLabel = new javax.swing.JLabel();
        KeepWatching5nameLabel = new javax.swing.JLabel();
        RecommendLabel = new javax.swing.JLabel();
        Recommend1Separator = new javax.swing.JSeparator();
        Recommend1PicLabel = new javax.swing.JLabel();
        Recommend1nameLabel = new javax.swing.JLabel();
        Recommend2Separator = new javax.swing.JSeparator();
        Recommend2PicLabel = new javax.swing.JLabel();
        Recommend2nameLabel = new javax.swing.JLabel();
        Recommend3Separator = new javax.swing.JSeparator();
        Recommend3PicLabel = new javax.swing.JLabel();
        Recommend3nameLabel = new javax.swing.JLabel();
        Recommend4Separator = new javax.swing.JSeparator();
        Recommend4PicLabel = new javax.swing.JLabel();
        Recommend4nameLabel = new javax.swing.JLabel();
        Recommend5Separator = new javax.swing.JSeparator();
        Recommend5PicLabel = new javax.swing.JLabel();
        Recommend5nameLabel = new javax.swing.JLabel();
        Recommend6Separator = new javax.swing.JSeparator();
        KeepWatchingLabel = new javax.swing.JLabel();
        p11Separator = new javax.swing.JSeparator();
        p1PicLabel = new javax.swing.JLabel();
        p1nameLabel = new javax.swing.JLabel();
        p12Separator = new javax.swing.JSeparator();
        p2PicLabel = new javax.swing.JLabel();
        p2nameLabel = new javax.swing.JLabel();
        p13Separator = new javax.swing.JSeparator();
        p3PicLabel = new javax.swing.JLabel();
        p3nameLabel = new javax.swing.JLabel();
        p14Separator = new javax.swing.JSeparator();
        p4PicLabel = new javax.swing.JLabel();
        p4nameLabel = new javax.swing.JLabel();
        p15Separator = new javax.swing.JSeparator();
        p5PicLabel = new javax.swing.JLabel();
        p5nameLabel = new javax.swing.JLabel();
        p16Separator = new javax.swing.JSeparator();
        p6PicLabel = new javax.swing.JLabel();
        p6nameLabel = new javax.swing.JLabel();
        p17Separator = new javax.swing.JSeparator();
        p7PicLabel = new javax.swing.JLabel();
        p21Separator = new javax.swing.JSeparator();
        p7nameLabel = new javax.swing.JLabel();
        p22Separator = new javax.swing.JSeparator();
        p8PicLabel = new javax.swing.JLabel();
        p8nameLabel = new javax.swing.JLabel();
        p23Separator = new javax.swing.JSeparator();
        p9PicLabel = new javax.swing.JLabel();
        p9nameLabel = new javax.swing.JLabel();
        p24Separator = new javax.swing.JSeparator();
        p10PicLabel = new javax.swing.JLabel();
        p10nameLabel = new javax.swing.JLabel();
        p25Separator = new javax.swing.JSeparator();
        p11PicLabel = new javax.swing.JLabel();
        p11nameLabel = new javax.swing.JLabel();
        p26Separator = new javax.swing.JSeparator();
        p12PicLabel = new javax.swing.JLabel();
        p12nameLabel = new javax.swing.JLabel();
        p27Separator = new javax.swing.JSeparator();
        p33Separator = new javax.swing.JSeparator();
        p34Separator = new javax.swing.JSeparator();
        p17nameLabel = new javax.swing.JLabel();
        p14nameLabel = new javax.swing.JLabel();
        p36Separator = new javax.swing.JSeparator();
        p35Separator = new javax.swing.JSeparator();
        p13nameLabel = new javax.swing.JLabel();
        p32Separator = new javax.swing.JSeparator();
        p17PicLabel = new javax.swing.JLabel();
        p16PicLabel = new javax.swing.JLabel();
        p16nameLabel = new javax.swing.JLabel();
        p15nameLabel = new javax.swing.JLabel();
        p31Separator = new javax.swing.JSeparator();
        p15PicLabel = new javax.swing.JLabel();
        p18PicLabel = new javax.swing.JLabel();
        p18nameLabel = new javax.swing.JLabel();
        p37Separator = new javax.swing.JSeparator();
        p13PicLabel = new javax.swing.JLabel();
        p14PicLabel = new javax.swing.JLabel();
        p44Separator = new javax.swing.JSeparator();
        p20PicLabel = new javax.swing.JLabel();
        p21PicLabel = new javax.swing.JLabel();
        p19PicLabel = new javax.swing.JLabel();
        p20nameLabel = new javax.swing.JLabel();
        p22PicLabel = new javax.swing.JLabel();
        p24PicLabel = new javax.swing.JLabel();
        p23nameLabel = new javax.swing.JLabel();
        p22nameLabel = new javax.swing.JLabel();
        p24nameLabel = new javax.swing.JLabel();
        p42Separator = new javax.swing.JSeparator();
        p41Separator = new javax.swing.JSeparator();
        p45Separator = new javax.swing.JSeparator();
        p21nameLabel = new javax.swing.JLabel();
        p19nameLabel = new javax.swing.JLabel();
        p23PicLabel = new javax.swing.JLabel();
        p43Separator = new javax.swing.JSeparator();
        p47Separator = new javax.swing.JSeparator();
        p46Separator = new javax.swing.JSeparator();
        p57Separator = new javax.swing.JSeparator();
        p25PicLabel = new javax.swing.JLabel();
        p52Separator = new javax.swing.JSeparator();
        p51Separator = new javax.swing.JSeparator();
        p30PicLabel = new javax.swing.JLabel();
        p29nameLabel = new javax.swing.JLabel();
        p27PicLabel = new javax.swing.JLabel();
        p28PicLabel = new javax.swing.JLabel();
        p29PicLabel = new javax.swing.JLabel();
        p30nameLabel = new javax.swing.JLabel();
        p25nameLabel = new javax.swing.JLabel();
        p54Separator = new javax.swing.JSeparator();
        p28nameLabel = new javax.swing.JLabel();
        p55Separator = new javax.swing.JSeparator();
        p56Separator = new javax.swing.JSeparator();
        p27nameLabel = new javax.swing.JLabel();
        p26PicLabel = new javax.swing.JLabel();
        p26nameLabel = new javax.swing.JLabel();
        p53Separator = new javax.swing.JSeparator();
        p66Separator = new javax.swing.JSeparator();
        p36PicLabel = new javax.swing.JLabel();
        p36nameLabel = new javax.swing.JLabel();
        p34nameLabel = new javax.swing.JLabel();
        p62Separator = new javax.swing.JSeparator();
        p33nameLabel = new javax.swing.JLabel();
        p65Separator = new javax.swing.JSeparator();
        p32nameLabel = new javax.swing.JLabel();
        p35nameLabel = new javax.swing.JLabel();
        p31nameLabel = new javax.swing.JLabel();
        p33PicLabel = new javax.swing.JLabel();
        p61Separator = new javax.swing.JSeparator();
        p35PicLabel = new javax.swing.JLabel();
        p32PicLabel = new javax.swing.JLabel();
        p64Separator = new javax.swing.JSeparator();
        p67Separator = new javax.swing.JSeparator();
        p34PicLabel = new javax.swing.JLabel();
        p63Separator = new javax.swing.JSeparator();
        p31PicLabel = new javax.swing.JLabel();
        p37PicLabel = new javax.swing.JLabel();
        p37nameLabel = new javax.swing.JLabel();
        p71Separator = new javax.swing.JSeparator();
        p72Separator = new javax.swing.JSeparator();
        p38PicLabel = new javax.swing.JLabel();
        p38nameLabel = new javax.swing.JLabel();
        p73Separator = new javax.swing.JSeparator();
        p39PicLabel = new javax.swing.JLabel();
        p39nameLabel = new javax.swing.JLabel();
        p74Separator = new javax.swing.JSeparator();
        p40PicLabel = new javax.swing.JLabel();
        p40nameLabel = new javax.swing.JLabel();
        p75Separator = new javax.swing.JSeparator();
        p41PicLabel = new javax.swing.JLabel();
        p41nameLabel = new javax.swing.JLabel();
        p76Separator = new javax.swing.JSeparator();
        p42PicLabel = new javax.swing.JLabel();
        p42nameLabel = new javax.swing.JLabel();
        p77Separator = new javax.swing.JSeparator();
        p45nameLabel = new javax.swing.JLabel();
        p84Separator = new javax.swing.JSeparator();
        p44nameLabel = new javax.swing.JLabel();
        p83Separator = new javax.swing.JSeparator();
        p47PicLabel = new javax.swing.JLabel();
        p85Separator = new javax.swing.JSeparator();
        p48nameLabel = new javax.swing.JLabel();
        p46nameLabel = new javax.swing.JLabel();
        p86Separator = new javax.swing.JSeparator();
        p44PicLabel = new javax.swing.JLabel();
        p43PicLabel = new javax.swing.JLabel();
        p45PicLabel = new javax.swing.JLabel();
        p87Separator = new javax.swing.JSeparator();
        p81Separator = new javax.swing.JSeparator();
        p48PicLabel = new javax.swing.JLabel();
        p82Separator = new javax.swing.JSeparator();
        p47nameLabel = new javax.swing.JLabel();
        p46PicLabel = new javax.swing.JLabel();
        p43nameLabel = new javax.swing.JLabel();
        p92Separator = new javax.swing.JSeparator();
        p94Separator = new javax.swing.JSeparator();
        p51nameLabel = new javax.swing.JLabel();
        p49nameLabel = new javax.swing.JLabel();
        p95Separator = new javax.swing.JSeparator();
        p91Separator = new javax.swing.JSeparator();
        p54nameLabel = new javax.swing.JLabel();
        p50nameLabel = new javax.swing.JLabel();
        p96Separator = new javax.swing.JSeparator();
        p54PicLabel = new javax.swing.JLabel();
        p53nameLabel = new javax.swing.JLabel();
        p97Separator = new javax.swing.JSeparator();
        p53PicLabel = new javax.swing.JLabel();
        p49PicLabel = new javax.swing.JLabel();
        p51PicLabel = new javax.swing.JLabel();
        p93Separator = new javax.swing.JSeparator();
        p50PicLabel = new javax.swing.JLabel();
        p52PicLabel = new javax.swing.JLabel();
        p52nameLabel = new javax.swing.JLabel();
        p60PicLabel = new javax.swing.JLabel();
        p59nameLabel = new javax.swing.JLabel();
        p56PicLabel = new javax.swing.JLabel();
        p102Separator = new javax.swing.JSeparator();
        p58PicLabel = new javax.swing.JLabel();
        p56nameLabel = new javax.swing.JLabel();
        p106Separator = new javax.swing.JSeparator();
        p57nameLabel = new javax.swing.JLabel();
        p55nameLabel = new javax.swing.JLabel();
        p60nameLabel = new javax.swing.JLabel();
        p59PicLabel = new javax.swing.JLabel();
        p101Separator = new javax.swing.JSeparator();
        p107Separator = new javax.swing.JSeparator();
        p105Separator = new javax.swing.JSeparator();
        p55PicLabel = new javax.swing.JLabel();
        p58nameLabel = new javax.swing.JLabel();
        p103Separator = new javax.swing.JSeparator();
        p104Separator = new javax.swing.JSeparator();
        p57PicLabel = new javax.swing.JLabel();
        p112Separator = new javax.swing.JSeparator();
        p63nameLabel = new javax.swing.JLabel();
        p65PicLabel = new javax.swing.JLabel();
        p114Separator = new javax.swing.JSeparator();
        p64PicLabel = new javax.swing.JLabel();
        p117Separator = new javax.swing.JSeparator();
        p61PicLabel = new javax.swing.JLabel();
        p65nameLabel = new javax.swing.JLabel();
        p62PicLabel = new javax.swing.JLabel();
        p113Separator = new javax.swing.JSeparator();
        p62nameLabel = new javax.swing.JLabel();
        p116Separator = new javax.swing.JSeparator();
        p63PicLabel = new javax.swing.JLabel();
        p66PicLabel = new javax.swing.JLabel();
        p111Separator = new javax.swing.JSeparator();
        p61nameLabel = new javax.swing.JLabel();
        p66nameLabel = new javax.swing.JLabel();
        p115Separator = new javax.swing.JSeparator();
        p64nameLabel = new javax.swing.JLabel();
        p125Separator = new javax.swing.JSeparator();
        p124Separator = new javax.swing.JSeparator();
        p70nameLabel = new javax.swing.JLabel();
        p67nameLabel = new javax.swing.JLabel();
        p70PicLabel = new javax.swing.JLabel();
        p121Separator = new javax.swing.JSeparator();
        p71nameLabel = new javax.swing.JLabel();
        p72nameLabel = new javax.swing.JLabel();
        p122Separator = new javax.swing.JSeparator();
        p69nameLabel = new javax.swing.JLabel();
        p72PicLabel = new javax.swing.JLabel();
        p68nameLabel = new javax.swing.JLabel();
        p123Separator = new javax.swing.JSeparator();
        p127Separator = new javax.swing.JSeparator();
        p69PicLabel = new javax.swing.JLabel();
        p68PicLabel = new javax.swing.JLabel();
        p67PicLabel = new javax.swing.JLabel();
        p71PicLabel = new javax.swing.JLabel();
        p126Separator = new javax.swing.JSeparator();
        p73PicLabel = new javax.swing.JLabel();
        p73nameLabel = new javax.swing.JLabel();
        p131Separator = new javax.swing.JSeparator();
        p132Separator = new javax.swing.JSeparator();
        p74PicLabel = new javax.swing.JLabel();
        p74nameLabel = new javax.swing.JLabel();
        p133Separator = new javax.swing.JSeparator();
        MoviesScrollPane = new javax.swing.JScrollPane();
        MoviesPanel = new javax.swing.JPanel();
        MoviesPageLabel = new javax.swing.JLabel();
        m1PicLabel = new javax.swing.JLabel();
        m11Separator = new javax.swing.JSeparator();
        m12Separator = new javax.swing.JSeparator();
        m3nameLabel = new javax.swing.JLabel();
        m4PicLabel = new javax.swing.JLabel();
        m1nameLabel = new javax.swing.JLabel();
        m3PicLabel = new javax.swing.JLabel();
        m2PicLabel = new javax.swing.JLabel();
        m2nameLabel = new javax.swing.JLabel();
        m4nameLabel = new javax.swing.JLabel();
        m13Separator = new javax.swing.JSeparator();
        m14Separator = new javax.swing.JSeparator();
        m17Separator = new javax.swing.JSeparator();
        m5PicLabel = new javax.swing.JLabel();
        m5nameLabel = new javax.swing.JLabel();
        m16Separator = new javax.swing.JSeparator();
        m6PicLabel = new javax.swing.JLabel();
        m6nameLabel = new javax.swing.JLabel();
        m15Separator = new javax.swing.JSeparator();
        m21Separator = new javax.swing.JSeparator();
        m7PicLabel = new javax.swing.JLabel();
        m7nameLabel = new javax.swing.JLabel();
        m22Separator = new javax.swing.JSeparator();
        m8PicLabel = new javax.swing.JLabel();
        m8nameLabel = new javax.swing.JLabel();
        m23Separator = new javax.swing.JSeparator();
        m9PicLabel = new javax.swing.JLabel();
        m9nameLabel = new javax.swing.JLabel();
        m24Separator = new javax.swing.JSeparator();
        m10PicLabel = new javax.swing.JLabel();
        m10nameLabel = new javax.swing.JLabel();
        m25Separator = new javax.swing.JSeparator();
        m11PicLabel = new javax.swing.JLabel();
        m11nameLabel = new javax.swing.JLabel();
        m26Separator = new javax.swing.JSeparator();
        m12PicLabel = new javax.swing.JLabel();
        m12nameLabel = new javax.swing.JLabel();
        m27Separator = new javax.swing.JSeparator();
        m32Separator = new javax.swing.JSeparator();
        m36Separator = new javax.swing.JSeparator();
        m18PicLabel = new javax.swing.JLabel();
        m35Separator = new javax.swing.JSeparator();
        m17PicLabel = new javax.swing.JLabel();
        m15nameLabel = new javax.swing.JLabel();
        m17nameLabel = new javax.swing.JLabel();
        m34Separator = new javax.swing.JSeparator();
        m13PicLabel = new javax.swing.JLabel();
        m18nameLabel = new javax.swing.JLabel();
        m16nameLabel = new javax.swing.JLabel();
        m13nameLabel = new javax.swing.JLabel();
        m14nameLabel = new javax.swing.JLabel();
        m33Separator = new javax.swing.JSeparator();
        m16PicLabel = new javax.swing.JLabel();
        m31Separator = new javax.swing.JSeparator();
        m14PicLabel = new javax.swing.JLabel();
        m15PicLabel = new javax.swing.JLabel();
        m37Separator = new javax.swing.JSeparator();
        m22PicLabel = new javax.swing.JLabel();
        m41Separator = new javax.swing.JSeparator();
        m24PicLabel = new javax.swing.JLabel();
        m23nameLabel = new javax.swing.JLabel();
        m21nameLabel = new javax.swing.JLabel();
        m47Separator = new javax.swing.JSeparator();
        m19PicLabel = new javax.swing.JLabel();
        m21PicLabel = new javax.swing.JLabel();
        m22nameLabel = new javax.swing.JLabel();
        m24nameLabel = new javax.swing.JLabel();
        m19nameLabel = new javax.swing.JLabel();
        m45Separator = new javax.swing.JSeparator();
        m42Separator = new javax.swing.JSeparator();
        m23PicLabel = new javax.swing.JLabel();
        m20nameLabel = new javax.swing.JLabel();
        m20PicLabel = new javax.swing.JLabel();
        m44Separator = new javax.swing.JSeparator();
        m43Separator = new javax.swing.JSeparator();
        m46Separator = new javax.swing.JSeparator();
        m53Separator = new javax.swing.JSeparator();
        m26nameLabel = new javax.swing.JLabel();
        m29nameLabel = new javax.swing.JLabel();
        m25nameLabel = new javax.swing.JLabel();
        m56Separator = new javax.swing.JSeparator();
        m27nameLabel = new javax.swing.JLabel();
        m26PicLabel = new javax.swing.JLabel();
        m51Separator = new javax.swing.JSeparator();
        m25PicLabel = new javax.swing.JLabel();
        m54Separator = new javax.swing.JSeparator();
        m30nameLabel = new javax.swing.JLabel();
        m30PicLabel = new javax.swing.JLabel();
        m28PicLabel = new javax.swing.JLabel();
        m29PicLabel = new javax.swing.JLabel();
        m57Separator = new javax.swing.JSeparator();
        m55Separator = new javax.swing.JSeparator();
        m27PicLabel = new javax.swing.JLabel();
        m52Separator = new javax.swing.JSeparator();
        m28nameLabel = new javax.swing.JLabel();
        m35nameLabel = new javax.swing.JLabel();
        m61Separator = new javax.swing.JSeparator();
        m63Separator = new javax.swing.JSeparator();
        m67Separator = new javax.swing.JSeparator();
        m33nameLabel = new javax.swing.JLabel();
        m64Separator = new javax.swing.JSeparator();
        m31PicLabel = new javax.swing.JLabel();
        m36nameLabel = new javax.swing.JLabel();
        m31nameLabel = new javax.swing.JLabel();
        m34nameLabel = new javax.swing.JLabel();
        m33PicLabel = new javax.swing.JLabel();
        m65Separator = new javax.swing.JSeparator();
        m66Separator = new javax.swing.JSeparator();
        m62Separator = new javax.swing.JSeparator();
        m32nameLabel = new javax.swing.JLabel();
        m34PicLabel = new javax.swing.JLabel();
        m35PicLabel = new javax.swing.JLabel();
        m32PicLabel = new javax.swing.JLabel();
        m36PicLabel = new javax.swing.JLabel();
        m37PicLabel = new javax.swing.JLabel();
        m76Separator = new javax.swing.JSeparator();
        m40PicLabel = new javax.swing.JLabel();
        m41PicLabel = new javax.swing.JLabel();
        m39nameLabel = new javax.swing.JLabel();
        m42nameLabel = new javax.swing.JLabel();
        m38nameLabel = new javax.swing.JLabel();
        m42PicLabel = new javax.swing.JLabel();
        m37nameLabel = new javax.swing.JLabel();
        m73Separator = new javax.swing.JSeparator();
        m39PicLabel = new javax.swing.JLabel();
        m41nameLabel = new javax.swing.JLabel();
        m77Separator = new javax.swing.JSeparator();
        m74Separator = new javax.swing.JSeparator();
        m75Separator = new javax.swing.JSeparator();
        m40nameLabel = new javax.swing.JLabel();
        m72Separator = new javax.swing.JSeparator();
        m71Separator = new javax.swing.JSeparator();
        m38PicLabel = new javax.swing.JLabel();
        m44nameLabel = new javax.swing.JLabel();
        m48nameLabel = new javax.swing.JLabel();
        m87Separator = new javax.swing.JSeparator();
        m81Separator = new javax.swing.JSeparator();
        m45nameLabel = new javax.swing.JLabel();
        m84Separator = new javax.swing.JSeparator();
        m86Separator = new javax.swing.JSeparator();
        m43PicLabel = new javax.swing.JLabel();
        m46nameLabel = new javax.swing.JLabel();
        m45PicLabel = new javax.swing.JLabel();
        m47PicLabel = new javax.swing.JLabel();
        m48PicLabel = new javax.swing.JLabel();
        m46PicLabel = new javax.swing.JLabel();
        m85Separator = new javax.swing.JSeparator();
        m43nameLabel = new javax.swing.JLabel();
        m83Separator = new javax.swing.JSeparator();
        m47nameLabel = new javax.swing.JLabel();
        m82Separator = new javax.swing.JSeparator();
        m44PicLabel = new javax.swing.JLabel();
        m92Separator = new javax.swing.JSeparator();
        m49PicLabel = new javax.swing.JLabel();
        m49nameLabel = new javax.swing.JLabel();
        m91Separator = new javax.swing.JSeparator();
        SeriesScrollPane = new javax.swing.JScrollPane();
        SeriesPagePanel = new javax.swing.JPanel();
        SeriesPageLabel = new javax.swing.JLabel();
        s7nameLabel = new javax.swing.JLabel();
        s21Separator = new javax.swing.JSeparator();
        s7PicLabel = new javax.swing.JLabel();
        s8PicLabel = new javax.swing.JLabel();
        s22Separator = new javax.swing.JSeparator();
        s8nameLabel = new javax.swing.JLabel();
        s23Separator = new javax.swing.JSeparator();
        s9PicLabel = new javax.swing.JLabel();
        s9nameLabel = new javax.swing.JLabel();
        s24Separator = new javax.swing.JSeparator();
        s10PicLabel = new javax.swing.JLabel();
        s10nameLabel = new javax.swing.JLabel();
        s12PicLabel = new javax.swing.JLabel();
        s12nameLabel = new javax.swing.JLabel();
        s27Separator = new javax.swing.JSeparator();
        s26Separator = new javax.swing.JSeparator();
        s11PicLabel = new javax.swing.JLabel();
        s11nameLabel = new javax.swing.JLabel();
        s25Separator = new javax.swing.JSeparator();
        s37Separator = new javax.swing.JSeparator();
        s18PicLabel = new javax.swing.JLabel();
        s18nameLabel = new javax.swing.JLabel();
        s36Separator = new javax.swing.JSeparator();
        s17PicLabel = new javax.swing.JLabel();
        s17nameLabel = new javax.swing.JLabel();
        s35Separator = new javax.swing.JSeparator();
        s16PicLabel = new javax.swing.JLabel();
        s16nameLabel = new javax.swing.JLabel();
        s34Separator = new javax.swing.JSeparator();
        s15PicLabel = new javax.swing.JLabel();
        s15nameLabel = new javax.swing.JLabel();
        s33Separator = new javax.swing.JSeparator();
        s14PicLabel = new javax.swing.JLabel();
        s14nameLabel = new javax.swing.JLabel();
        s32Separator = new javax.swing.JSeparator();
        s13PicLabel = new javax.swing.JLabel();
        s13nameLabel = new javax.swing.JLabel();
        s31Separator = new javax.swing.JSeparator();
        s11Separator = new javax.swing.JSeparator();
        s1PicLabel = new javax.swing.JLabel();
        s12Separator = new javax.swing.JSeparator();
        s2PicLabel = new javax.swing.JLabel();
        s13Separator = new javax.swing.JSeparator();
        s3PicLabel = new javax.swing.JLabel();
        s14Separator = new javax.swing.JSeparator();
        s4PicLabel = new javax.swing.JLabel();
        s17Separator = new javax.swing.JSeparator();
        s6PicLabel = new javax.swing.JLabel();
        s16Separator = new javax.swing.JSeparator();
        s5PicLabel = new javax.swing.JLabel();
        s15Separator = new javax.swing.JSeparator();
        s1nameLabel = new javax.swing.JLabel();
        s2nameLabel = new javax.swing.JLabel();
        s3nameLabel = new javax.swing.JLabel();
        s4nameLabel = new javax.swing.JLabel();
        s5nameLabel = new javax.swing.JLabel();
        s6nameLabel = new javax.swing.JLabel();
        s41Separator = new javax.swing.JSeparator();
        s19PicLabel = new javax.swing.JLabel();
        s19nameLabel = new javax.swing.JLabel();
        s42Separator = new javax.swing.JSeparator();
        TvShowsScrollPane = new javax.swing.JScrollPane();
        TvShowsPagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ts2nameLabel = new javax.swing.JLabel();
        ts11Separator = new javax.swing.JSeparator();
        ts1PicLabel = new javax.swing.JLabel();
        ts2PicLabel = new javax.swing.JLabel();
        ts1nameLabel = new javax.swing.JLabel();
        ts13Separator = new javax.swing.JSeparator();
        ts3nameLabel = new javax.swing.JLabel();
        ts12Separator = new javax.swing.JSeparator();
        ts14Separator = new javax.swing.JSeparator();
        ts3PicLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HEADERSplitPane.setBorder(null);
        HEADERSplitPane.setPreferredSize(new java.awt.Dimension(1366, 80));

        logoPanel.setBackground(new java.awt.Color(40, 36, 36));
        logoPanel.setForeground(new java.awt.Color(40, 36, 36));
        logoPanel.setPreferredSize(new java.awt.Dimension(250, 80));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/netflix-240.png"))); // NOI18N
        logoLabel.setPreferredSize(new java.awt.Dimension(240, 70));
        logoPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        HEADERSplitPane.setLeftComponent(logoPanel);

        headerPanel.setBackground(new java.awt.Color(40, 36, 36));
        headerPanel.setForeground(new java.awt.Color(40, 36, 36));
        headerPanel.setPreferredSize(new java.awt.Dimension(1116, 70));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TVShowsLabel.setBackground(new java.awt.Color(40, 36, 36));
        TVShowsLabel.setFont(new java.awt.Font("Garuda", 1, 16)); // NOI18N
        TVShowsLabel.setForeground(new java.awt.Color(232, 0, 19));
        TVShowsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/tvShow-64.png"))); // NOI18N
        TVShowsLabel.setText("TV-Shows");
        TVShowsLabel.setPreferredSize(new java.awt.Dimension(152, 64));
        TVShowsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TVShowsLabelMouseClicked(evt);
            }
        });
        headerPanel.add(TVShowsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 6, 140, -1));

        HomePageLabel.setBackground(new java.awt.Color(40, 36, 36));
        HomePageLabel.setFont(new java.awt.Font("Garuda", 1, 16)); // NOI18N
        HomePageLabel.setForeground(new java.awt.Color(232, 0, 19));
        HomePageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/home-page-64.png"))); // NOI18N
        HomePageLabel.setText("HomePage");
        HomePageLabel.setPreferredSize(new java.awt.Dimension(152, 64));
        HomePageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePageLabelMouseClicked(evt);
            }
        });
        headerPanel.add(HomePageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        MoviesLabel.setBackground(new java.awt.Color(40, 36, 36));
        MoviesLabel.setFont(new java.awt.Font("Garuda", 1, 16)); // NOI18N
        MoviesLabel.setForeground(new java.awt.Color(232, 0, 19));
        MoviesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/movies-64.png"))); // NOI18N
        MoviesLabel.setText("Movies");
        MoviesLabel.setPreferredSize(new java.awt.Dimension(152, 64));
        MoviesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoviesLabelMouseClicked(evt);
            }
        });
        headerPanel.add(MoviesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 6, -1, -1));

        SeriesLabel.setBackground(new java.awt.Color(40, 36, 36));
        SeriesLabel.setFont(new java.awt.Font("Garuda", 1, 16)); // NOI18N
        SeriesLabel.setForeground(new java.awt.Color(232, 0, 19));
        SeriesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/series-64.png"))); // NOI18N
        SeriesLabel.setText("Series");
        SeriesLabel.setPreferredSize(new java.awt.Dimension(152, 64));
        SeriesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeriesLabelMouseClicked(evt);
            }
        });
        headerPanel.add(SeriesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 6, -1, -1));

        SearchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/search-64.png"))); // NOI18N
        SearchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchLabelMouseClicked(evt);
            }
        });
        headerPanel.add(SearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 60));

        usernameLabel.setBackground(new java.awt.Color(40, 36, 36));
        usernameLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(232, 0, 19));
        usernameLabel.setText("username");
        usernameLabel.setPreferredSize(new java.awt.Dimension(60, 20));
        headerPanel.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 160, -1));

        usericonLabel.setBackground(new java.awt.Color(40, 36, 36));
        usericonLabel.setForeground(new java.awt.Color(40, 36, 36));
        usericonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/user-48.png"))); // NOI18N
        usericonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usericonLabelMouseClicked(evt);
            }
        });
        headerPanel.add(usericonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, 48));

        logoutLabel.setBackground(new java.awt.Color(40, 36, 36));
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/logout-button-32.png"))); // NOI18N
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });
        headerPanel.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        HEADERSplitPane.setRightComponent(headerPanel);

        getContentPane().add(HEADERSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PagesTabbedPane.setPreferredSize(new java.awt.Dimension(1366, 695));

        HomePageScrollPane.setPreferredSize(new java.awt.Dimension(1366, 650));

        HomePagePanel.setBackground(new java.awt.Color(40, 36, 36));
        HomePagePanel.setPreferredSize(new java.awt.Dimension(1920, 3720));
        HomePagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AllProgramsLabel.setBackground(new java.awt.Color(40, 36, 36));
        AllProgramsLabel.setFont(new java.awt.Font("Garuda", 1, 28)); // NOI18N
        AllProgramsLabel.setForeground(new java.awt.Color(232, 0, 19));
        AllProgramsLabel.setText("ALL PROGRAMS : ");
        AllProgramsLabel.setPreferredSize(new java.awt.Dimension(350, 50));
        HomePagePanel.add(AllProgramsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        Recommend6PicLabel.setText("burası dinamik olacak , önerilen foto");
        Recommend6PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(Recommend6PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1585, 70, -1, -1));

        KeepWatching1PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        KeepWatching1PicLabel.setText("dinamik , en son izlenen foto");
        KeepWatching1PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(KeepWatching1PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        KeepWatching2PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        KeepWatching2PicLabel.setText("dinamik , en son izlenen foto");
        KeepWatching2PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(KeepWatching2PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        KeepWatching3PicLabel.setText("dinamik , en son izlenen foto");
        KeepWatching3PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(KeepWatching3PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, -1, -1));

        KeepWatching4PicLabel.setText("dinamik , en son izlenen foto");
        KeepWatching4PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(KeepWatching4PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, -1, -1));

        KeepWatching5PicLabel.setText("dinamik , en son izlenen foto");
        KeepWatching5PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(KeepWatching5PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 380, -1, -1));

        Recommend7Separator.setForeground(new java.awt.Color(232, 0, 19));
        Recommend7Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Recommend7Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        Recommend7Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(Recommend7Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1855, 70, -1, -1));

        KeepWatching1Separator.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching1Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        KeepWatching1Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        KeepWatching1Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(KeepWatching1Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        KeepWatching3Separator.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching3Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        KeepWatching3Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        KeepWatching3Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(KeepWatching3Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        KeepWatching4Separator.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching4Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        KeepWatching4Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        KeepWatching4Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(KeepWatching4Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, -1, -1));

        KeepWatching5Separator.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching5Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        KeepWatching5Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        KeepWatching5Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(KeepWatching5Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 380, -1, -1));

        KeepWatching6Separator.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching6Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        KeepWatching6Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        KeepWatching6Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(KeepWatching6Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 380, -1, -1));

        KeepWatching2Separator.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching2Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        KeepWatching2Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        KeepWatching2Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(KeepWatching2Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        Recommend6nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        Recommend6nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        Recommend6nameLabel.setText("RECOMMEND6 NAME");
        Recommend6nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(Recommend6nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1585, 250, -1, -1));

        KeepWatching1nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        KeepWatching1nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching1nameLabel.setText("LAST WATCHED NAME");
        KeepWatching1nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(KeepWatching1nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        KeepWatching2nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        KeepWatching2nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching2nameLabel.setText("LAST WATCHED NAME");
        KeepWatching2nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(KeepWatching2nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        KeepWatching3nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        KeepWatching3nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching3nameLabel.setText("LAST WATCHED NAME");
        KeepWatching3nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(KeepWatching3nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, -1, -1));

        KeepWatching4nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        KeepWatching4nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching4nameLabel.setText("LAST WATCHED NAME");
        KeepWatching4nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(KeepWatching4nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 560, -1, -1));

        KeepWatching5nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        KeepWatching5nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatching5nameLabel.setText("LAST WATCHED NAME");
        KeepWatching5nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(KeepWatching5nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 560, -1, -1));

        RecommendLabel.setBackground(new java.awt.Color(40, 36, 36));
        RecommendLabel.setFont(new java.awt.Font("Garuda", 1, 28)); // NOI18N
        RecommendLabel.setForeground(new java.awt.Color(232, 0, 19));
        RecommendLabel.setText("RECOMMEND FOR YOU : ");
        RecommendLabel.setPreferredSize(new java.awt.Dimension(350, 50));
        HomePagePanel.add(RecommendLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Recommend1Separator.setForeground(new java.awt.Color(232, 0, 19));
        Recommend1Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Recommend1Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        Recommend1Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(Recommend1Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 70, -1, -1));

        Recommend1PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        Recommend1PicLabel.setText("burası dinamik olacak , önerilen foto");
        Recommend1PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(Recommend1PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 70, -1, -1));

        Recommend1nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        Recommend1nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        Recommend1nameLabel.setText("RECOMMEND1 NAME");
        Recommend1nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(Recommend1nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 250, -1, -1));

        Recommend2Separator.setForeground(new java.awt.Color(232, 0, 19));
        Recommend2Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Recommend2Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        Recommend2Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(Recommend2Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 70, -1, -1));

        Recommend2PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        Recommend2PicLabel.setText("burası dinamik olacak , önerilen foto");
        Recommend2PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(Recommend2PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 70, -1, -1));

        Recommend2nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        Recommend2nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        Recommend2nameLabel.setText("RECOMMEND2 NAME");
        Recommend2nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(Recommend2nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 250, -1, -1));

        Recommend3Separator.setForeground(new java.awt.Color(232, 0, 19));
        Recommend3Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Recommend3Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        Recommend3Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(Recommend3Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 70, -1, -1));

        Recommend3PicLabel.setText("burası dinamik olacak , önerilen foto");
        Recommend3PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(Recommend3PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 70, -1, -1));

        Recommend3nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        Recommend3nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        Recommend3nameLabel.setText("RECOMMEND3 NAME");
        Recommend3nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(Recommend3nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 250, -1, -1));

        Recommend4Separator.setForeground(new java.awt.Color(232, 0, 19));
        Recommend4Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Recommend4Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        Recommend4Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(Recommend4Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 70, -1, -1));

        Recommend4PicLabel.setText("burası dinamik olacak , önerilen foto");
        Recommend4PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(Recommend4PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 70, -1, -1));

        Recommend4nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        Recommend4nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        Recommend4nameLabel.setText("RECOMMEND4 NAME");
        Recommend4nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(Recommend4nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 250, -1, -1));

        Recommend5Separator.setForeground(new java.awt.Color(232, 0, 19));
        Recommend5Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Recommend5Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        Recommend5Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(Recommend5Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 70, -1, -1));

        Recommend5PicLabel.setText("burası dinamik olacak , önerilen foto");
        Recommend5PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        HomePagePanel.add(Recommend5PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1285, 70, -1, -1));

        Recommend5nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        Recommend5nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        Recommend5nameLabel.setText("RECOMMEND5 NAME");
        Recommend5nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(Recommend5nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1285, 250, -1, -1));

        Recommend6Separator.setForeground(new java.awt.Color(232, 0, 19));
        Recommend6Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Recommend6Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        Recommend6Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(Recommend6Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1555, 70, -1, -1));

        KeepWatchingLabel.setBackground(new java.awt.Color(40, 36, 36));
        KeepWatchingLabel.setFont(new java.awt.Font("Garuda", 1, 28)); // NOI18N
        KeepWatchingLabel.setForeground(new java.awt.Color(232, 0, 19));
        KeepWatchingLabel.setText("KEEP WATCHING : ");
        KeepWatchingLabel.setPreferredSize(new java.awt.Dimension(350, 50));
        HomePagePanel.add(KeepWatchingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        p11Separator.setForeground(new java.awt.Color(232, 0, 19));
        p11Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p11Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p11Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p11Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

        p1PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p1PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/recepivedik6.png"))); // NOI18N
        p1PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p1PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p1PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, -1, -1));

        p1nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p1nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p1nameLabel.setText("RECEP IVEDIK 6");
        p1nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p1nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 870, -1, -1));

        p12Separator.setForeground(new java.awt.Color(232, 0, 19));
        p12Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p12Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p12Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p12Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 690, -1, -1));

        p2PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p2PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/assasinscreed.png"))); // NOI18N
        p2PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p2PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p2PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 690, -1, -1));

        p2nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p2nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p2nameLabel.setText("ASSASSIN'S CREED");
        p2nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p2nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 870, -1, -1));

        p13Separator.setForeground(new java.awt.Color(232, 0, 19));
        p13Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p13Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p13Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p13Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 690, -1, -1));

        p3PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/alacakaranlik.png"))); // NOI18N
        p3PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p3PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p3PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 690, -1, -1));

        p3nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p3nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p3nameLabel.setText("ALACAKARANLIK");
        p3nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p3nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 870, -1, -1));

        p14Separator.setForeground(new java.awt.Color(232, 0, 19));
        p14Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p14Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p14Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p14Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 690, -1, -1));

        p4PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/YuzuklerinEfendisi2Kule.png"))); // NOI18N
        p4PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p4PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p4PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 690, -1, -1));

        p4nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p4nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p4nameLabel.setText("YUZUKLERIN EFENDISI IKI KULE");
        p4nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p4nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 870, -1, -1));

        p15Separator.setForeground(new java.awt.Color(232, 0, 19));
        p15Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p15Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p15Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p15Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 690, -1, -1));

        p5PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/maske.png"))); // NOI18N
        p5PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p5PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p5PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 690, -1, -1));

        p5nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p5nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p5nameLabel.setText("MASKE");
        p5nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p5nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 870, -1, -1));

        p16Separator.setForeground(new java.awt.Color(232, 0, 19));
        p16Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p16Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p16Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p16Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 690, -1, -1));

        p6PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BatmanKaraSovalye.png"))); // NOI18N
        p6PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p6PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p6PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 690, -1, -1));

        p6nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p6nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p6nameLabel.setText("BATMAN - KARA SOVALYE");
        p6nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p6nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 870, -1, -1));

        p17Separator.setForeground(new java.awt.Color(232, 0, 19));
        p17Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p17Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p17Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p17Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 690, -1, -1));

        p7PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p7PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SherlockHolmes.png"))); // NOI18N
        p7PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p7PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p7PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 910, -1, -1));

        p21Separator.setForeground(new java.awt.Color(232, 0, 19));
        p21Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p21Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p21Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p21Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 910, -1, -1));

        p7nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p7nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p7nameLabel.setText("SHERLOCK HOLMES");
        p7nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p7nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1090, -1, -1));

        p22Separator.setForeground(new java.awt.Color(232, 0, 19));
        p22Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p22Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p22Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p22Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 910, -1, -1));

        p8PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p8PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/YuzuklerinEfendisi-KralınDonusu.png"))); // NOI18N
        p8PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p8PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p8PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 910, -1, -1));

        p8nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p8nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p8nameLabel.setText("YUZUKLERIN EFENDISI KRALIN DONUSU");
        p8nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p8nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1090, 260, -1));

        p23Separator.setForeground(new java.awt.Color(232, 0, 19));
        p23Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p23Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p23Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p23Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 910, -1, -1));

        p9PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Transformers-KayıpCag.png"))); // NOI18N
        p9PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p9PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p9PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 910, -1, -1));

        p9nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p9nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p9nameLabel.setText("TRANSFORMERS 4 KAYIP CAG ");
        p9nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p9nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1090, -1, -1));

        p24Separator.setForeground(new java.awt.Color(232, 0, 19));
        p24Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p24Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p24Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p24Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 910, -1, -1));

        p10PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Inception.png"))); // NOI18N
        p10PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p10PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p10PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p10PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 910, -1, -1));

        p10nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p10nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p10nameLabel.setText("BASLANGIC (INCEPTION)");
        p10nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p10nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1090, -1, -1));

        p25Separator.setForeground(new java.awt.Color(232, 0, 19));
        p25Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p25Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p25Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p25Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 910, -1, -1));

        p11PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/InterStellar.png"))); // NOI18N
        p11PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p11PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p11PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p11PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 910, -1, -1));

        p11nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p11nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p11nameLabel.setText("INTERSTELLAR");
        p11nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p11nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1090, -1, -1));

        p26Separator.setForeground(new java.awt.Color(232, 0, 19));
        p26Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p26Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p26Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p26Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 910, -1, -1));

        p12PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/HarryPotter-OlumYadigarlari.png"))); // NOI18N
        p12PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p12PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p12PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p12PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 910, -1, -1));

        p12nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p12nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p12nameLabel.setText("HARRY POTTER OLUM YADIGARLARI");
        p12nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p12nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1090, -1, -1));

        p27Separator.setForeground(new java.awt.Color(232, 0, 19));
        p27Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p27Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p27Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p27Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 910, -1, -1));

        p33Separator.setForeground(new java.awt.Color(232, 0, 19));
        p33Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p33Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p33Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p33Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1140, -1, -1));

        p34Separator.setForeground(new java.awt.Color(232, 0, 19));
        p34Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p34Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p34Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p34Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1140, -1, -1));

        p17nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p17nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p17nameLabel.setText("MISSION BLUE");
        p17nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p17nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1320, -1, -1));

        p14nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p14nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p14nameLabel.setText("FANTASTIK CANAVARLAR");
        p14nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p14nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1320, -1, -1));

        p36Separator.setForeground(new java.awt.Color(232, 0, 19));
        p36Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p36Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p36Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p36Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1140, -1, -1));

        p35Separator.setForeground(new java.awt.Color(232, 0, 19));
        p35Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p35Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p35Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p35Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1140, -1, -1));

        p13nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p13nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p13nameLabel.setText("JURASSIC WORLD");
        p13nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p13nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1320, -1, -1));

        p32Separator.setForeground(new java.awt.Color(232, 0, 19));
        p32Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p32Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p32Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p32Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1140, -1, -1));

        p17PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MıssıonBlue.png"))); // NOI18N
        p17PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p17PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p17PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p17PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1140, -1, -1));

        p16PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KuslarlaDans.png"))); // NOI18N
        p16PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p16PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p16PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p16PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1140, -1, -1));

        p16nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p16nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p16nameLabel.setText("KUSLARLA DANS ");
        p16nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p16nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1320, -1, -1));

        p15nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p15nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p15nameLabel.setText("NINJA KAPLUMBAGALAR");
        p15nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p15nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1320, -1, -1));

        p31Separator.setForeground(new java.awt.Color(232, 0, 19));
        p31Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p31Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p31Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p31Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1140, -1, -1));

        p15PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/NinjaKaplumbagalar.png"))); // NOI18N
        p15PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p15PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p15PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p15PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1140, -1, -1));

        p18PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MercanPesinde.png"))); // NOI18N
        p18PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p18PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p18PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p18PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1140, -1, -1));

        p18nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p18nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p18nameLabel.setText("MERCAN PESINDE");
        p18nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p18nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1320, -1, -1));

        p37Separator.setForeground(new java.awt.Color(232, 0, 19));
        p37Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p37Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p37Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p37Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1140, -1, -1));

        p13PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p13PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/JurrasicWorld.png"))); // NOI18N
        p13PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p13PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p13PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p13PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1140, -1, -1));

        p14PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p14PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/FantastikCanavarlar.png"))); // NOI18N
        p14PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p14PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p14PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p14PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1140, -1, -1));

        p44Separator.setForeground(new java.awt.Color(232, 0, 19));
        p44Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p44Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p44Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p44Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1370, -1, -1));

        p20PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p20PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/AydakiSonAdam.png"))); // NOI18N
        p20PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p20PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p20PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p20PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1370, -1, -1));

        p21PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/PlastikOkyanus.png"))); // NOI18N
        p21PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p21PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p21PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p21PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1370, -1, -1));

        p19PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p19PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DreamBig.png"))); // NOI18N
        p19PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p19PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p19PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p19PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1370, -1, -1));

        p20nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p20nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p20nameLabel.setText("AY'DAKI SON ADAM");
        p20nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p20nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1550, -1, -1));

        p22PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/RakamlarlaTahmin.png"))); // NOI18N
        p22PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p22PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p22PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p22PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1370, -1, -1));

        p24PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/ArifV216.png"))); // NOI18N
        p24PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p24PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p24PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p24PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1370, -1, -1));

        p23nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p23nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p23nameLabel.setText("BEN EFSANEYIM");
        p23nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p23nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1550, -1, -1));

        p22nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p22nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p22nameLabel.setText("RAKAMLARLA TAHMIN");
        p22nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p22nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1550, -1, -1));

        p24nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p24nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p24nameLabel.setText("ARIF V 216 ");
        p24nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p24nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1550, -1, -1));

        p42Separator.setForeground(new java.awt.Color(232, 0, 19));
        p42Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p42Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p42Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p42Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1370, -1, -1));

        p41Separator.setForeground(new java.awt.Color(232, 0, 19));
        p41Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p41Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p41Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p41Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1370, -1, -1));

        p45Separator.setForeground(new java.awt.Color(232, 0, 19));
        p45Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p45Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p45Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p45Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1370, -1, -1));

        p21nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p21nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p21nameLabel.setText("PLASTIK OKYANUS");
        p21nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p21nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1550, -1, -1));

        p19nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p19nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p19nameLabel.setText("DREAM BIG");
        p19nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p19nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1550, -1, -1));

        p23PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BenEfsaneyim.png"))); // NOI18N
        p23PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p23PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p23PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p23PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1370, -1, -1));

        p43Separator.setForeground(new java.awt.Color(232, 0, 19));
        p43Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p43Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p43Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p43Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1370, -1, -1));

        p47Separator.setForeground(new java.awt.Color(232, 0, 19));
        p47Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p47Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p47Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p47Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1370, -1, -1));

        p46Separator.setForeground(new java.awt.Color(232, 0, 19));
        p46Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p46Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p46Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p46Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1370, -1, -1));

        p57Separator.setForeground(new java.awt.Color(232, 0, 19));
        p57Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p57Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p57Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p57Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1600, -1, -1));

        p25PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p25PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/PK.png"))); // NOI18N
        p25PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p25PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p25PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p25PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1600, -1, -1));

        p52Separator.setForeground(new java.awt.Color(232, 0, 19));
        p52Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p52Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p52Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p52Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1600, -1, -1));

        p51Separator.setForeground(new java.awt.Color(232, 0, 19));
        p51Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p51Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p51Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p51Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1600, -1, -1));

        p30PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/72sevimliHayvan.png"))); // NOI18N
        p30PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p30PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p30PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p30PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1600, -1, -1));

        p29nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p29nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p29nameLabel.setText("GEZEGENIMIZ");
        p29nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p29nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1780, -1, -1));

        p27PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/JurassicPark.png"))); // NOI18N
        p27PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p27PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p27PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p27PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1600, -1, -1));

        p28PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Frankestein.png"))); // NOI18N
        p28PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p28PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p28PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p28PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1600, -1, -1));

        p29PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Gezegenimiz.png"))); // NOI18N
        p29PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p29PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p29PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p29PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1600, -1, -1));

        p30nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p30nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p30nameLabel.setText("72 SEVIMLI HAYVAN");
        p30nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p30nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1780, -1, -1));

        p25nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p25nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p25nameLabel.setText("PK");
        p25nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p25nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1780, -1, -1));

        p54Separator.setForeground(new java.awt.Color(232, 0, 19));
        p54Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p54Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p54Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p54Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1600, -1, -1));

        p28nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p28nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p28nameLabel.setText("FRANKESTEIN");
        p28nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p28nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1780, -1, -1));

        p55Separator.setForeground(new java.awt.Color(232, 0, 19));
        p55Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p55Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p55Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p55Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1600, -1, -1));

        p56Separator.setForeground(new java.awt.Color(232, 0, 19));
        p56Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p56Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p56Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p56Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1600, -1, -1));

        p27nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p27nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p27nameLabel.setText("JURASSIC PARK ");
        p27nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p27nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1780, -1, -1));

        p26PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p26PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/OrumcekAdam.png"))); // NOI18N
        p26PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p26PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p26PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p26PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1600, -1, -1));

        p26nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p26nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p26nameLabel.setText("ORUMCEK ADAM");
        p26nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p26nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1780, -1, -1));

        p53Separator.setForeground(new java.awt.Color(232, 0, 19));
        p53Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p53Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p53Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p53Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1600, -1, -1));

        p66Separator.setForeground(new java.awt.Color(232, 0, 19));
        p66Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p66Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p66Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p66Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1830, -1, -1));

        p36PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/CharlieninCikolataFabrikasi.png"))); // NOI18N
        p36PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p36PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p36PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p36PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1830, -1, -1));

        p36nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p36nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p36nameLabel.setText("CHARLIE'NIN CIKOLATA FABRIKASI");
        p36nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p36nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2010, -1, -1));

        p34nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p34nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p34nameLabel.setText("POKEMON");
        p34nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p34nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2010, -1, -1));

        p62Separator.setForeground(new java.awt.Color(232, 0, 19));
        p62Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p62Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p62Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p62Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1830, -1, -1));

        p33nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p33nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p33nameLabel.setText("PANDAMIC");
        p33nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p33nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2010, -1, -1));

        p65Separator.setForeground(new java.awt.Color(232, 0, 19));
        p65Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p65Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p65Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p65Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1830, -1, -1));

        p32nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p32nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p32nameLabel.setText("MARSTA KESIF");
        p32nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p32nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2010, -1, -1));

        p35nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p35nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p35nameLabel.setText("SIRINLER");
        p35nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p35nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2010, -1, -1));

        p31nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p31nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p31nameLabel.setText("KUSCULAR");
        p31nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p31nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2010, -1, -1));

        p33PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Pandemic.png"))); // NOI18N
        p33PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p33PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p33PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p33PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1830, -1, -1));

        p61Separator.setForeground(new java.awt.Color(232, 0, 19));
        p61Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p61Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p61Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p61Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1830, -1, -1));

        p35PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Sirinler.png"))); // NOI18N
        p35PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p35PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p35PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p35PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1830, -1, -1));

        p32PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p32PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MarstaKesif.png"))); // NOI18N
        p32PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p32PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p32PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p32PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1830, -1, -1));

        p64Separator.setForeground(new java.awt.Color(232, 0, 19));
        p64Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p64Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p64Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p64Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1830, -1, -1));

        p67Separator.setForeground(new java.awt.Color(232, 0, 19));
        p67Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p67Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p67Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p67Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1830, -1, -1));

        p34PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Pokemon.png"))); // NOI18N
        p34PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p34PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p34PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p34PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1830, -1, -1));

        p63Separator.setForeground(new java.awt.Color(232, 0, 19));
        p63Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p63Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p63Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p63Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1830, -1, -1));

        p31PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p31PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Kuscular.png"))); // NOI18N
        p31PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p31PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p31PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p31PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1830, -1, -1));

        p37PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p37PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Alvin&Sincaplar.png"))); // NOI18N
        p37PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p37PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p37PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p37PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2060, -1, -1));

        p37nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p37nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p37nameLabel.setText("ALVIN VE SINCAPLAR");
        p37nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p37nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2240, -1, -1));

        p71Separator.setForeground(new java.awt.Color(232, 0, 19));
        p71Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p71Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p71Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p71Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2060, -1, -1));

        p72Separator.setForeground(new java.awt.Color(232, 0, 19));
        p72Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p72Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p72Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p72Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2060, -1, -1));

        p38PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p38PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Scooby-Doo.png"))); // NOI18N
        p38PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p38PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p38PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p38PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2060, -1, -1));

        p38nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p38nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p38nameLabel.setText("SCOOBY-DOO");
        p38nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p38nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2240, -1, -1));

        p73Separator.setForeground(new java.awt.Color(232, 0, 19));
        p73Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p73Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p73Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p73Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 2060, -1, -1));

        p39PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KungFuPanda.png"))); // NOI18N
        p39PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p39PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p39PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p39PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2060, -1, -1));

        p39nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p39nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p39nameLabel.setText("KUNG-FU PANDA");
        p39nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p39nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2240, -1, -1));

        p74Separator.setForeground(new java.awt.Color(232, 0, 19));
        p74Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p74Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p74Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p74Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 2060, -1, -1));

        p40PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MrBeanTatilde.png"))); // NOI18N
        p40PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p40PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p40PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p40PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2060, -1, -1));

        p40nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p40nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p40nameLabel.setText("MR.BEAN TATILDE");
        p40nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p40nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2240, -1, -1));

        p75Separator.setForeground(new java.awt.Color(232, 0, 19));
        p75Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p75Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p75Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p75Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 2060, -1, -1));

        p41PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Shrek.png"))); // NOI18N
        p41PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p41PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p41PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p41PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2060, -1, -1));

        p41nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p41nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p41nameLabel.setText("SHREK");
        p41nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p41nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2240, -1, -1));

        p76Separator.setForeground(new java.awt.Color(232, 0, 19));
        p76Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p76Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p76Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p76Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 2060, -1, -1));

        p42PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MegaZeka.png"))); // NOI18N
        p42PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p42PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p42PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p42PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2060, -1, -1));

        p42nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p42nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p42nameLabel.setText("MEGA ZEKA");
        p42nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p42nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2240, -1, -1));

        p77Separator.setForeground(new java.awt.Color(232, 0, 19));
        p77Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p77Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p77Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p77Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 2060, -1, -1));

        p45nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p45nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p45nameLabel.setText("KARDESIM BENIM");
        p45nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p45nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2470, -1, -1));

        p84Separator.setForeground(new java.awt.Color(232, 0, 19));
        p84Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p84Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p84Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p84Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 2290, -1, -1));

        p44nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p44nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p44nameLabel.setText("DELI BAL");
        p44nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p44nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2470, -1, -1));

        p83Separator.setForeground(new java.awt.Color(232, 0, 19));
        p83Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p83Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p83Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p83Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 2290, -1, -1));

        p47PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/YerCekimi.png"))); // NOI18N
        p47PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p47PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p47PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p47PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2290, -1, -1));

        p85Separator.setForeground(new java.awt.Color(232, 0, 19));
        p85Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p85Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p85Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p85Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 2290, -1, -1));

        p48nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p48nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p48nameLabel.setText("JAWS");
        p48nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p48nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2470, -1, -1));

        p46nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p46nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p46nameLabel.setText("DANGAL");
        p46nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p46nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2470, -1, -1));

        p86Separator.setForeground(new java.awt.Color(232, 0, 19));
        p86Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p86Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p86Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p86Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 2290, -1, -1));

        p44PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p44PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DeliBal.png"))); // NOI18N
        p44PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p44PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p44PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p44PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2290, -1, -1));

        p43PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p43PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BiziHatirla.png"))); // NOI18N
        p43PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p43PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p43PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p43PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2290, -1, -1));

        p45PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KardesimBenim.png"))); // NOI18N
        p45PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p45PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p45PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p45PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2290, -1, -1));

        p87Separator.setForeground(new java.awt.Color(232, 0, 19));
        p87Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p87Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p87Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p87Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 2290, -1, -1));

        p81Separator.setForeground(new java.awt.Color(232, 0, 19));
        p81Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p81Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p81Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p81Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2290, -1, -1));

        p48PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Jaws.png"))); // NOI18N
        p48PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p48PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p48PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p48PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2290, -1, -1));

        p82Separator.setForeground(new java.awt.Color(232, 0, 19));
        p82Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p82Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p82Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p82Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2290, -1, -1));

        p47nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p47nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p47nameLabel.setText("YERCEKIMI");
        p47nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p47nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2470, -1, -1));

        p46PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Dangal.png"))); // NOI18N
        p46PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p46PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p46PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p46PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2290, -1, -1));

        p43nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p43nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p43nameLabel.setText("BIZI HATIRLA");
        p43nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p43nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2470, -1, -1));

        p92Separator.setForeground(new java.awt.Color(232, 0, 19));
        p92Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p92Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p92Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p92Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2520, -1, -1));

        p94Separator.setForeground(new java.awt.Color(232, 0, 19));
        p94Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p94Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p94Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p94Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 2520, -1, -1));

        p51nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p51nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p51nameLabel.setText("EJDERHALAR");
        p51nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p51nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2700, -1, -1));

        p49nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p49nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p49nameLabel.setText("DA-VINCI SIFRESI");
        p49nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p49nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2700, -1, -1));

        p95Separator.setForeground(new java.awt.Color(232, 0, 19));
        p95Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p95Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p95Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p95Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 2520, -1, -1));

        p91Separator.setForeground(new java.awt.Color(232, 0, 19));
        p91Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p91Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p91Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p91Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2520, -1, -1));

        p54nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p54nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p54nameLabel.setText("HOW I MET YOUR MOTHER ");
        p54nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p54nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2700, -1, -1));

        p50nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p50nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p50nameLabel.setText("MARVEL'S IRON FIST");
        p50nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p50nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2700, -1, -1));

        p96Separator.setForeground(new java.awt.Color(232, 0, 19));
        p96Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p96Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p96Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p96Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 2520, -1, -1));

        p54PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/HowImetYourMother.png"))); // NOI18N
        p54PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p54PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p54PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p54PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2520, -1, -1));

        p53nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p53nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p53nameLabel.setText("TROL AVCILARI : ARCADIA HIKAYELERI");
        p53nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p53nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2700, 260, -1));

        p97Separator.setForeground(new java.awt.Color(232, 0, 19));
        p97Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p97Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p97Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p97Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 2520, -1, -1));

        p53PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TrolAvcıları-ArcadiaHikayeler.png"))); // NOI18N
        p53PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p53PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p53PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p53PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2520, -1, -1));

        p49PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p49PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DaVinciSifresi.png"))); // NOI18N
        p49PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p49PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p49PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p49PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2520, -1, -1));

        p51PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Ejderhalar.png"))); // NOI18N
        p51PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p51PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p51PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p51PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2520, -1, -1));

        p93Separator.setForeground(new java.awt.Color(232, 0, 19));
        p93Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p93Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p93Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p93Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 2520, -1, -1));

        p50PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p50PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/IronFist.png"))); // NOI18N
        p50PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p50PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p50PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p50PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2520, -1, -1));

        p52PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DirilisErtugrul.png"))); // NOI18N
        p52PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p52PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p52PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p52PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2520, -1, -1));

        p52nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p52nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p52nameLabel.setText("DIRILIS ERTUGRUL");
        p52nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p52nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2700, -1, -1));

        p60PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SungerBob.png"))); // NOI18N
        p60PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p60PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p60PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p60PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2750, -1, -1));

        p59nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p59nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p59nameLabel.setText("MASA VE KOCA AYI ");
        p59nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p59nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2930, -1, -1));

        p56PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p56PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BeniBoyleSev.png"))); // NOI18N
        p56PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p56PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p56PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p56PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2750, -1, -1));

        p102Separator.setForeground(new java.awt.Color(232, 0, 19));
        p102Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p102Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p102Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p102Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2750, -1, -1));

        p58PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Atiye.png"))); // NOI18N
        p58PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p58PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p58PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p58PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2750, -1, -1));

        p56nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p56nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p56nameLabel.setText("BENI BOYLE SEV ");
        p56nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p56nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2930, -1, -1));

        p106Separator.setForeground(new java.awt.Color(232, 0, 19));
        p106Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p106Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p106Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p106Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 2750, -1, -1));

        p57nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p57nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p57nameLabel.setText("PATRON BEBEK IS BASINDA");
        p57nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p57nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2930, -1, -1));

        p55nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p55nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p55nameLabel.setText("LEYLA ILE MECNUN ");
        p55nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p55nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2930, -1, -1));

        p60nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p60nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p60nameLabel.setText("SUNGER BOB");
        p60nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p60nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2930, -1, -1));

        p59PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Masa&KocaAyi.png"))); // NOI18N
        p59PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p59PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p59PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p59PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2750, -1, -1));

        p101Separator.setForeground(new java.awt.Color(232, 0, 19));
        p101Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p101Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p101Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p101Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2750, -1, -1));

        p107Separator.setForeground(new java.awt.Color(232, 0, 19));
        p107Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p107Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p107Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p107Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 2750, -1, -1));

        p105Separator.setForeground(new java.awt.Color(232, 0, 19));
        p105Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p105Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p105Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p105Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 2750, -1, -1));

        p55PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p55PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/LeylaIleMecnun.png"))); // NOI18N
        p55PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p55PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p55PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p55PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2750, -1, -1));

        p58nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p58nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p58nameLabel.setText("ATIYE");
        p58nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p58nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2930, -1, -1));

        p103Separator.setForeground(new java.awt.Color(232, 0, 19));
        p103Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p103Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p103Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p103Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 2750, -1, -1));

        p104Separator.setForeground(new java.awt.Color(232, 0, 19));
        p104Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p104Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p104Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p104Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 2750, -1, -1));

        p57PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/PatronBebekYineIsBasinda.png"))); // NOI18N
        p57PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p57PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p57PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p57PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2750, -1, -1));

        p112Separator.setForeground(new java.awt.Color(232, 0, 19));
        p112Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p112Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p112Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p112Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2980, -1, -1));

        p63nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p63nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p63nameLabel.setText("ANGRY BIRDS");
        p63nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p63nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3160, -1, -1));

        p65PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Beyblade.png"))); // NOI18N
        p65PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p65PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p65PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p65PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 2980, -1, -1));

        p114Separator.setForeground(new java.awt.Color(232, 0, 19));
        p114Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p114Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p114Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p114Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 2980, -1, -1));

        p64PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Criminal.png"))); // NOI18N
        p64PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p64PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p64PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p64PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 2980, -1, -1));

        p117Separator.setForeground(new java.awt.Color(232, 0, 19));
        p117Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p117Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p117Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p117Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 2980, -1, -1));

        p61PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p61PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/StrangerThings.png"))); // NOI18N
        p61PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p61PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p61PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p61PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2980, -1, -1));

        p65nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p65nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p65nameLabel.setText("BEYBLADE");
        p65nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p65nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 3160, -1, -1));

        p62PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p62PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TheOriginals.png"))); // NOI18N
        p62PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p62PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p62PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p62PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2980, -1, -1));

        p113Separator.setForeground(new java.awt.Color(232, 0, 19));
        p113Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p113Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p113Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p113Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 2980, -1, -1));

        p62nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p62nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p62nameLabel.setText("THE ORIGINALS");
        p62nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p62nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 3160, -1, -1));

        p116Separator.setForeground(new java.awt.Color(232, 0, 19));
        p116Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p116Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p116Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p116Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 2980, -1, -1));

        p63PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/AngryBirds.png"))); // NOI18N
        p63PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p63PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p63PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p63PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 2980, -1, -1));

        p66PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SonicX.png"))); // NOI18N
        p66PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p66PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p66PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p66PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 2980, -1, -1));

        p111Separator.setForeground(new java.awt.Color(232, 0, 19));
        p111Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p111Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p111Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p111Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2980, -1, -1));

        p61nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p61nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p61nameLabel.setText("STRANGER THINGS");
        p61nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p61nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3160, -1, -1));

        p66nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p66nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p66nameLabel.setText("SONIC X");
        p66nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p66nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 3160, -1, -1));

        p115Separator.setForeground(new java.awt.Color(232, 0, 19));
        p115Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p115Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p115Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p115Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 2980, -1, -1));

        p64nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p64nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p64nameLabel.setText("CRIMINAL");
        p64nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p64nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 3160, -1, -1));

        p125Separator.setForeground(new java.awt.Color(232, 0, 19));
        p125Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p125Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p125Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p125Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 3210, -1, -1));

        p124Separator.setForeground(new java.awt.Color(232, 0, 19));
        p124Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p124Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p124Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p124Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 3210, -1, -1));

        p70nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p70nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p70nameLabel.setText("CAR MASTERS");
        p70nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p70nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 3390, -1, -1));

        p67nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p67nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p67nameLabel.setText("KUNG-FU PANDA MUHTESEM SIRLAR");
        p67nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p67nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3390, -1, -1));

        p70PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/CarMasters.png"))); // NOI18N
        p70PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p70PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p70PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p70PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 3210, -1, -1));

        p121Separator.setForeground(new java.awt.Color(232, 0, 19));
        p121Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p121Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p121Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p121Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3210, -1, -1));

        p71nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p71nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p71nameLabel.setText("BUYUK TASARIMLAR");
        p71nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p71nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 3390, -1, -1));

        p72nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p72nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p72nameLabel.setText("BASKETBALL OR NOTHING");
        p72nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p72nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 3390, -1, -1));

        p122Separator.setForeground(new java.awt.Color(232, 0, 19));
        p122Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p122Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p122Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p122Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3210, -1, -1));

        p69nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p69nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p69nameLabel.setText("DUNYANIN EN SIRADISI EVLERI");
        p69nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p69nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3390, -1, -1));

        p72PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BasketballOrNothing.png"))); // NOI18N
        p72PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p72PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p72PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p72PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 3210, -1, -1));

        p68nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p68nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p68nameLabel.setText("THE BLACKLIST");
        p68nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p68nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 3390, -1, -1));

        p123Separator.setForeground(new java.awt.Color(232, 0, 19));
        p123Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p123Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p123Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p123Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 3210, -1, -1));

        p127Separator.setForeground(new java.awt.Color(232, 0, 19));
        p127Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p127Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p127Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p127Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 3210, -1, -1));

        p69PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DunyaninEnSiraDisiEvleri.png"))); // NOI18N
        p69PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p69PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p69PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p69PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3210, -1, -1));

        p68PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p68PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TheBlackList.png"))); // NOI18N
        p68PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p68PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p68PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p68PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 3210, -1, -1));

        p67PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p67PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KungFuPanda-MuhtesemSırlar.png"))); // NOI18N
        p67PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p67PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p67PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p67PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3210, -1, -1));

        p71PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BuyukTasarimlar.png"))); // NOI18N
        p71PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p71PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p71PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p71PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 3210, -1, -1));

        p126Separator.setForeground(new java.awt.Color(232, 0, 19));
        p126Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p126Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p126Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p126Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 3210, -1, -1));

        p73PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p73PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TheBigFamilyCooking.png"))); // NOI18N
        p73PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p73PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p73PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p73PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3440, -1, -1));

        p73nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p73nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p73nameLabel.setText("THE BIG FAMILY COOKING");
        p73nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p73nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3620, -1, -1));

        p131Separator.setForeground(new java.awt.Color(232, 0, 19));
        p131Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p131Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p131Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p131Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3440, -1, -1));

        p132Separator.setForeground(new java.awt.Color(232, 0, 19));
        p132Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p132Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p132Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p132Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3440, -1, -1));

        p74PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        p74PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SiraDisiKulubeler.png"))); // NOI18N
        p74PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        p74PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p74PicLabelMouseClicked(evt);
            }
        });
        HomePagePanel.add(p74PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 3440, -1, -1));

        p74nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        p74nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        p74nameLabel.setText("SIRADISI KULUBELER");
        p74nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        HomePagePanel.add(p74nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 3620, -1, -1));

        p133Separator.setForeground(new java.awt.Color(232, 0, 19));
        p133Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p133Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        p133Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        HomePagePanel.add(p133Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 3440, -1, -1));

        HomePageScrollPane.setViewportView(HomePagePanel);

        PagesTabbedPane.addTab("tab1", HomePageScrollPane);

        MoviesScrollPane.setBackground(new java.awt.Color(40, 36, 36));
        MoviesScrollPane.setPreferredSize(new java.awt.Dimension(1366, 690));

        MoviesPanel.setBackground(new java.awt.Color(40, 36, 36));
        MoviesPanel.setForeground(new java.awt.Color(40, 36, 36));
        MoviesPanel.setPreferredSize(new java.awt.Dimension(1920, 3720));
        MoviesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MoviesPageLabel.setBackground(new java.awt.Color(40, 36, 36));
        MoviesPageLabel.setFont(new java.awt.Font("Garuda", 1, 36)); // NOI18N
        MoviesPageLabel.setForeground(new java.awt.Color(232, 0, 19));
        MoviesPageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/movies-64.png"))); // NOI18N
        MoviesPageLabel.setText(" MOVIES : ");
        MoviesPageLabel.setPreferredSize(new java.awt.Dimension(250, 60));
        MoviesPanel.add(MoviesPageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        m1PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m1PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m1PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/recepivedik6.png"))); // NOI18N
        m1PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m1PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m1PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m1PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        m11Separator.setForeground(new java.awt.Color(232, 0, 19));
        m11Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m11Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m11Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m11Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        m12Separator.setForeground(new java.awt.Color(232, 0, 19));
        m12Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m12Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m12Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m12Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        m3nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m3nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m3nameLabel.setText("ALACAKARANLIK");
        m3nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m3nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        m4PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m4PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m4PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/YuzuklerinEfendisi2Kule.png"))); // NOI18N
        m4PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m4PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m4PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m4PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, -1));

        m1nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m1nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m1nameLabel.setText("RECEP IVEDIK6");
        m1nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m1nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        m3PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m3PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m3PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/alacakaranlik.png"))); // NOI18N
        m3PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m3PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m3PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m3PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        m2PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m2PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m2PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/assasinscreed.png"))); // NOI18N
        m2PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m2PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m2PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m2PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        m2nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m2nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m2nameLabel.setText("ASSASIN'S CREED");
        m2nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m2nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        m4nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m4nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m4nameLabel.setText("YUZUKLERIN EFENDISI IKI KULE");
        m4nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m4nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, -1, -1));

        m13Separator.setForeground(new java.awt.Color(232, 0, 19));
        m13Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m13Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m13Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m13Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        m14Separator.setForeground(new java.awt.Color(232, 0, 19));
        m14Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m14Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m14Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m14Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        m17Separator.setForeground(new java.awt.Color(232, 0, 19));
        m17Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m17Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m17Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m17Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 100, -1, -1));

        m5PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m5PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m5PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/maske.png"))); // NOI18N
        m5PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m5PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m5PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m5PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 100, -1, -1));

        m5nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m5nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m5nameLabel.setText("MASKE");
        m5nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m5nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 280, -1, -1));

        m16Separator.setForeground(new java.awt.Color(232, 0, 19));
        m16Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m16Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m16Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m16Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 100, -1, -1));

        m6PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m6PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m6PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BatmanKaraSovalye.png"))); // NOI18N
        m6PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m6PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m6PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m6PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 100, -1, -1));

        m6nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m6nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m6nameLabel.setText("BATMAN KARA SOVALYE");
        m6nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m6nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 280, -1, -1));

        m15Separator.setForeground(new java.awt.Color(232, 0, 19));
        m15Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m15Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m15Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m15Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 100, -1, -1));

        m21Separator.setForeground(new java.awt.Color(232, 0, 19));
        m21Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m21Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m21Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m21Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        m7PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m7PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m7PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SherlockHolmes.png"))); // NOI18N
        m7PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m7PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m7PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m7PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        m7nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m7nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m7nameLabel.setText("SHERLOCK HOLMES");
        m7nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m7nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        m22Separator.setForeground(new java.awt.Color(232, 0, 19));
        m22Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m22Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m22Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m22Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        m8PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m8PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m8PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/YuzuklerinEfendisi-KralınDonusu.png"))); // NOI18N
        m8PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m8PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m8PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m8PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        m8nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m8nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m8nameLabel.setText("YUZUKLERIN EFENDISI KRALIN DONUSU");
        m8nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m8nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 260, -1));

        m23Separator.setForeground(new java.awt.Color(232, 0, 19));
        m23Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m23Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m23Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m23Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        m9PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m9PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m9PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Transformers-KayıpCag.png"))); // NOI18N
        m9PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m9PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m9PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m9PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        m9nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m9nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m9nameLabel.setText("TRANSFORMERS 4 KAYIP CAG ");
        m9nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m9nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, -1, -1));

        m24Separator.setForeground(new java.awt.Color(232, 0, 19));
        m24Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m24Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m24Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m24Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, -1, -1));

        m10PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m10PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m10PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Inception.png"))); // NOI18N
        m10PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m10PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m10PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m10PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, -1, -1));

        m10nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m10nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m10nameLabel.setText("BASLANGIC");
        m10nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m10nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, -1, -1));

        m25Separator.setForeground(new java.awt.Color(232, 0, 19));
        m25Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m25Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m25Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m25Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 330, -1, -1));

        m11PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m11PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m11PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/InterStellar.png"))); // NOI18N
        m11PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m11PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m11PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m11PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 330, -1, -1));

        m11nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m11nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m11nameLabel.setText("INTERSTELLAR");
        m11nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m11nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 510, -1, -1));

        m26Separator.setForeground(new java.awt.Color(232, 0, 19));
        m26Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m26Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m26Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m26Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 330, -1, -1));

        m12PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m12PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m12PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/HarryPotter-OlumYadigarlari.png"))); // NOI18N
        m12PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m12PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m12PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m12PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 330, -1, -1));

        m12nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m12nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m12nameLabel.setText("HARRY POTTER VE OLUM YADIGARLARI");
        m12nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m12nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 510, 260, -1));

        m27Separator.setForeground(new java.awt.Color(232, 0, 19));
        m27Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m27Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m27Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m27Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 330, -1, -1));

        m32Separator.setForeground(new java.awt.Color(232, 0, 19));
        m32Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m32Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m32Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m32Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, -1, -1));

        m36Separator.setForeground(new java.awt.Color(232, 0, 19));
        m36Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m36Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m36Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m36Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 560, -1, -1));

        m18PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m18PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m18PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MercanPesinde.png"))); // NOI18N
        m18PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m18PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m18PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m18PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 560, -1, -1));

        m35Separator.setForeground(new java.awt.Color(232, 0, 19));
        m35Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m35Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m35Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m35Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 560, -1, -1));

        m17PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m17PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m17PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MıssıonBlue.png"))); // NOI18N
        m17PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m17PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m17PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m17PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 560, -1, -1));

        m15nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m15nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m15nameLabel.setText("NINJA KAPLUMBAGALAR");
        m15nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m15nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, -1, -1));

        m17nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m17nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m17nameLabel.setText("MISSION BLUE");
        m17nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m17nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 740, -1, -1));

        m34Separator.setForeground(new java.awt.Color(232, 0, 19));
        m34Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m34Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m34Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m34Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, -1, -1));

        m13PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m13PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m13PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/JurrasicWorld.png"))); // NOI18N
        m13PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m13PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m13PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m13PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        m18nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m18nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m18nameLabel.setText("MERCAN PESINDE");
        m18nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m18nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 740, -1, -1));

        m16nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m16nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m16nameLabel.setText("KUSLARLAR DANS");
        m16nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m16nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 740, -1, -1));

        m13nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m13nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m13nameLabel.setText("JURASSIC WORLD");
        m13nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m13nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        m14nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m14nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m14nameLabel.setText("FANTASTIK CANAVARLAR");
        m14nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m14nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 740, -1, -1));

        m33Separator.setForeground(new java.awt.Color(232, 0, 19));
        m33Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m33Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m33Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m33Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, -1, -1));

        m16PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m16PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m16PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KuslarlaDans.png"))); // NOI18N
        m16PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m16PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m16PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m16PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, -1, -1));

        m31Separator.setForeground(new java.awt.Color(232, 0, 19));
        m31Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m31Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m31Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m31Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        m14PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m14PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m14PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/FantastikCanavarlar.png"))); // NOI18N
        m14PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m14PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m14PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m14PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        m15PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m15PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m15PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/NinjaKaplumbagalar.png"))); // NOI18N
        m15PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m15PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m15PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m15PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, -1, -1));

        m37Separator.setForeground(new java.awt.Color(232, 0, 19));
        m37Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m37Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m37Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m37Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 560, -1, -1));

        m22PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m22PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m22PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/RakamlarlaTahmin.png"))); // NOI18N
        m22PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m22PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m22PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m22PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, -1, -1));

        m41Separator.setForeground(new java.awt.Color(232, 0, 19));
        m41Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m41Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m41Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m41Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 790, -1, -1));

        m24PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m24PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m24PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/ArifV216.png"))); // NOI18N
        m24PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m24PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m24PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m24PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 790, -1, -1));

        m23nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m23nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m23nameLabel.setText("BEN EFSANEYIM");
        m23nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m23nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 970, -1, -1));

        m21nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m21nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m21nameLabel.setText("PLASTIK OKYANUS");
        m21nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m21nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 970, -1, -1));

        m47Separator.setForeground(new java.awt.Color(232, 0, 19));
        m47Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m47Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m47Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m47Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 790, -1, -1));

        m19PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m19PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m19PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DreamBig.png"))); // NOI18N
        m19PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m19PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m19PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m19PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 790, -1, -1));

        m21PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m21PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m21PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/PlastikOkyanus.png"))); // NOI18N
        m21PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m21PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m21PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m21PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 790, -1, -1));

        m22nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m22nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m22nameLabel.setText("RAKAMLARLA TAHMIN");
        m22nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m22nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 970, -1, -1));

        m24nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m24nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m24nameLabel.setText("ARIF V 216");
        m24nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m24nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 970, -1, -1));

        m19nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m19nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m19nameLabel.setText("DREAM BIG");
        m19nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m19nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 970, -1, -1));

        m45Separator.setForeground(new java.awt.Color(232, 0, 19));
        m45Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m45Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m45Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m45Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 790, -1, -1));

        m42Separator.setForeground(new java.awt.Color(232, 0, 19));
        m42Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m42Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m42Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m42Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 790, -1, -1));

        m23PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m23PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m23PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BenEfsaneyim.png"))); // NOI18N
        m23PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m23PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m23PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m23PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 790, -1, -1));

        m20nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m20nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m20nameLabel.setText("AY'DAKI SON ADAM");
        m20nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m20nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 970, -1, -1));

        m20PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m20PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m20PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/AydakiSonAdam.png"))); // NOI18N
        m20PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m20PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m20PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m20PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, -1, -1));

        m44Separator.setForeground(new java.awt.Color(232, 0, 19));
        m44Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m44Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m44Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m44Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 790, -1, -1));

        m43Separator.setForeground(new java.awt.Color(232, 0, 19));
        m43Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m43Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m43Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m43Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 790, -1, -1));

        m46Separator.setForeground(new java.awt.Color(232, 0, 19));
        m46Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m46Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m46Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m46Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 790, -1, -1));

        m53Separator.setForeground(new java.awt.Color(232, 0, 19));
        m53Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m53Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m53Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m53Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1020, -1, -1));

        m26nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m26nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m26nameLabel.setText("ORUMCEK ADAM");
        m26nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m26nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1200, -1, -1));

        m29nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m29nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m29nameLabel.setText("GEZEGENIMIZ");
        m29nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m29nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1200, -1, -1));

        m25nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m25nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m25nameLabel.setText("PK");
        m25nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m25nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1200, -1, -1));

        m56Separator.setForeground(new java.awt.Color(232, 0, 19));
        m56Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m56Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m56Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m56Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1020, -1, -1));

        m27nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m27nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m27nameLabel.setText("JURASSIC PARK");
        m27nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m27nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1200, -1, -1));

        m26PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m26PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m26PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/OrumcekAdam.png"))); // NOI18N
        m26PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m26PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m26PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m26PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1020, -1, -1));

        m51Separator.setForeground(new java.awt.Color(232, 0, 19));
        m51Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m51Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m51Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m51Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1020, -1, -1));

        m25PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m25PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m25PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/PK.png"))); // NOI18N
        m25PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m25PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m25PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m25PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1020, -1, -1));

        m54Separator.setForeground(new java.awt.Color(232, 0, 19));
        m54Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m54Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m54Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m54Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1020, -1, -1));

        m30nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m30nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m30nameLabel.setText("72 SEVIMLI HAYVAN");
        m30nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m30nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1200, -1, -1));

        m30PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m30PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m30PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/72sevimliHayvan.png"))); // NOI18N
        m30PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m30PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m30PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m30PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1020, -1, -1));

        m28PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m28PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m28PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Frankestein.png"))); // NOI18N
        m28PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m28PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m28PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m28PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1020, -1, -1));

        m29PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m29PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m29PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Gezegenimiz.png"))); // NOI18N
        m29PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m29PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m29PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m29PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1020, -1, -1));

        m57Separator.setForeground(new java.awt.Color(232, 0, 19));
        m57Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m57Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m57Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m57Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1020, -1, -1));

        m55Separator.setForeground(new java.awt.Color(232, 0, 19));
        m55Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m55Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m55Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m55Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1020, -1, -1));

        m27PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m27PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m27PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/JurassicPark.png"))); // NOI18N
        m27PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m27PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m27PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m27PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1020, -1, -1));

        m52Separator.setForeground(new java.awt.Color(232, 0, 19));
        m52Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m52Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m52Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m52Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1020, -1, -1));

        m28nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m28nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m28nameLabel.setText("FRANKESTEIN");
        m28nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m28nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1200, -1, -1));

        m35nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m35nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m35nameLabel.setText("SIRINLER");
        m35nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m35nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1430, -1, -1));

        m61Separator.setForeground(new java.awt.Color(232, 0, 19));
        m61Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m61Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m61Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m61Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1250, -1, -1));

        m63Separator.setForeground(new java.awt.Color(232, 0, 19));
        m63Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m63Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m63Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m63Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1250, -1, -1));

        m67Separator.setForeground(new java.awt.Color(232, 0, 19));
        m67Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m67Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m67Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m67Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1250, -1, -1));

        m33nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m33nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m33nameLabel.setText("PANDEMIC");
        m33nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m33nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1430, -1, -1));

        m64Separator.setForeground(new java.awt.Color(232, 0, 19));
        m64Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m64Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m64Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m64Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1250, -1, -1));

        m31PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m31PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m31PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Kuscular.png"))); // NOI18N
        m31PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m31PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m31PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m31PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1250, -1, -1));

        m36nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m36nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m36nameLabel.setText("CHARLIE'NIN CIKOLATA FABRIKASI");
        m36nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m36nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1430, -1, -1));

        m31nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m31nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m31nameLabel.setText("KUSCULAR");
        m31nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m31nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1430, -1, -1));

        m34nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m34nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m34nameLabel.setText("POKEMON");
        m34nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m34nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1430, -1, -1));

        m33PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m33PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m33PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Pandemic.png"))); // NOI18N
        m33PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m33PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m33PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m33PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1250, -1, -1));

        m65Separator.setForeground(new java.awt.Color(232, 0, 19));
        m65Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m65Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m65Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m65Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1250, -1, -1));

        m66Separator.setForeground(new java.awt.Color(232, 0, 19));
        m66Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m66Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m66Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m66Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1250, -1, -1));

        m62Separator.setForeground(new java.awt.Color(232, 0, 19));
        m62Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m62Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m62Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m62Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1250, -1, -1));

        m32nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m32nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m32nameLabel.setText("MARSTA KESIF");
        m32nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m32nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1430, -1, -1));

        m34PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m34PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m34PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Pokemon.png"))); // NOI18N
        m34PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m34PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m34PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m34PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1250, -1, -1));

        m35PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m35PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m35PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Sirinler.png"))); // NOI18N
        m35PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m35PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m35PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m35PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1250, -1, -1));

        m32PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m32PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m32PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MarstaKesif.png"))); // NOI18N
        m32PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m32PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m32PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m32PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1250, -1, -1));

        m36PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m36PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m36PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/CharlieninCikolataFabrikasi.png"))); // NOI18N
        m36PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m36PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m36PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m36PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1250, -1, -1));

        m37PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m37PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m37PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Alvin&Sincaplar.png"))); // NOI18N
        m37PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m37PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m37PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m37PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1480, -1, -1));

        m76Separator.setForeground(new java.awt.Color(232, 0, 19));
        m76Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m76Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m76Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m76Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1480, -1, -1));

        m40PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m40PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m40PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MrBeanTatilde.png"))); // NOI18N
        m40PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m40PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m40PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m40PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1480, -1, -1));

        m41PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m41PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m41PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Shrek.png"))); // NOI18N
        m41PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m41PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m41PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m41PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1480, -1, -1));

        m39nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m39nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m39nameLabel.setText("KUNG-FU PANDA");
        m39nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m39nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1660, -1, -1));

        m42nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m42nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m42nameLabel.setText("MEGA ZEKA");
        m42nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m42nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1660, -1, -1));

        m38nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m38nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m38nameLabel.setText("SCOOBY-DOO");
        m38nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m38nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1660, -1, -1));

        m42PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m42PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m42PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/MegaZeka.png"))); // NOI18N
        m42PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m42PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m42PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m42PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1480, -1, -1));

        m37nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m37nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m37nameLabel.setText("ALVIN VE SINCAPLAR");
        m37nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m37nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1660, -1, -1));

        m73Separator.setForeground(new java.awt.Color(232, 0, 19));
        m73Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m73Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m73Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m73Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1480, -1, -1));

        m39PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m39PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m39PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KungFuPanda.png"))); // NOI18N
        m39PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m39PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m39PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m39PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1480, -1, -1));

        m41nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m41nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m41nameLabel.setText("SHREK");
        m41nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m41nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1660, -1, -1));

        m77Separator.setForeground(new java.awt.Color(232, 0, 19));
        m77Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m77Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m77Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m77Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1480, -1, -1));

        m74Separator.setForeground(new java.awt.Color(232, 0, 19));
        m74Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m74Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m74Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m74Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1480, -1, -1));

        m75Separator.setForeground(new java.awt.Color(232, 0, 19));
        m75Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m75Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m75Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m75Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1480, -1, -1));

        m40nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m40nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m40nameLabel.setText("MR.BEAN TATILDE");
        m40nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m40nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1660, -1, -1));

        m72Separator.setForeground(new java.awt.Color(232, 0, 19));
        m72Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m72Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m72Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m72Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1480, -1, -1));

        m71Separator.setForeground(new java.awt.Color(232, 0, 19));
        m71Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m71Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m71Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m71Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1480, -1, -1));

        m38PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m38PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m38PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Scooby-Doo.png"))); // NOI18N
        m38PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m38PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m38PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m38PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1480, -1, -1));

        m44nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m44nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m44nameLabel.setText("DELIBAL");
        m44nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m44nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1890, -1, -1));

        m48nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m48nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m48nameLabel.setText("JAWS");
        m48nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m48nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1890, -1, -1));

        m87Separator.setForeground(new java.awt.Color(232, 0, 19));
        m87Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m87Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m87Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m87Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 1710, -1, -1));

        m81Separator.setForeground(new java.awt.Color(232, 0, 19));
        m81Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m81Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m81Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m81Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1710, -1, -1));

        m45nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m45nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m45nameLabel.setText("KARDESIM BENIM");
        m45nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m45nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1890, -1, -1));

        m84Separator.setForeground(new java.awt.Color(232, 0, 19));
        m84Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m84Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m84Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m84Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1710, -1, -1));

        m86Separator.setForeground(new java.awt.Color(232, 0, 19));
        m86Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m86Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m86Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m86Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1710, -1, -1));

        m43PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m43PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m43PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BiziHatirla.png"))); // NOI18N
        m43PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m43PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m43PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m43PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1710, -1, -1));

        m46nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m46nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m46nameLabel.setText("DANGAL");
        m46nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m46nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1890, -1, -1));

        m45PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m45PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m45PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KardesimBenim.png"))); // NOI18N
        m45PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m45PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m45PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m45PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1710, -1, -1));

        m47PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m47PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m47PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/YerCekimi.png"))); // NOI18N
        m47PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m47PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m47PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m47PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1710, -1, -1));

        m48PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m48PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m48PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Jaws.png"))); // NOI18N
        m48PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m48PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m48PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m48PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1710, -1, -1));

        m46PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m46PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m46PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Dangal.png"))); // NOI18N
        m46PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m46PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m46PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m46PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1710, -1, -1));

        m85Separator.setForeground(new java.awt.Color(232, 0, 19));
        m85Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m85Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m85Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m85Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1710, -1, -1));

        m43nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m43nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m43nameLabel.setText("BIZI HATIRLA");
        m43nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m43nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1890, -1, -1));

        m83Separator.setForeground(new java.awt.Color(232, 0, 19));
        m83Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m83Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m83Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m83Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1710, -1, -1));

        m47nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m47nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m47nameLabel.setText("YERCEKIMI");
        m47nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m47nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1890, -1, -1));

        m82Separator.setForeground(new java.awt.Color(232, 0, 19));
        m82Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m82Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m82Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m82Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1710, -1, -1));

        m44PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m44PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m44PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DeliBal.png"))); // NOI18N
        m44PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m44PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m44PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m44PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1710, -1, -1));

        m92Separator.setForeground(new java.awt.Color(232, 0, 19));
        m92Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m92Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m92Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m92Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1940, -1, -1));

        m49PicLabel.setBackground(new java.awt.Color(40, 36, 36));
        m49PicLabel.setForeground(new java.awt.Color(40, 36, 36));
        m49PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DaVinciSifresi.png"))); // NOI18N
        m49PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        m49PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m49PicLabelMouseClicked(evt);
            }
        });
        MoviesPanel.add(m49PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1940, -1, -1));

        m49nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        m49nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        m49nameLabel.setText("DA-VINCI SIFRESI");
        m49nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        MoviesPanel.add(m49nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2120, -1, -1));

        m91Separator.setForeground(new java.awt.Color(232, 0, 19));
        m91Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        m91Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        m91Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        MoviesPanel.add(m91Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1940, -1, -1));

        MoviesScrollPane.setViewportView(MoviesPanel);

        PagesTabbedPane.addTab("tab2", MoviesScrollPane);

        SeriesScrollPane.setPreferredSize(new java.awt.Dimension(1366, 650));

        SeriesPagePanel.setBackground(new java.awt.Color(40, 36, 36));
        SeriesPagePanel.setForeground(new java.awt.Color(40, 36, 36));
        SeriesPagePanel.setPreferredSize(new java.awt.Dimension(1920, 3720));
        SeriesPagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeriesPageLabel.setBackground(new java.awt.Color(40, 36, 36));
        SeriesPageLabel.setFont(new java.awt.Font("Garuda", 1, 36)); // NOI18N
        SeriesPageLabel.setForeground(new java.awt.Color(232, 0, 19));
        SeriesPageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/series-64.png"))); // NOI18N
        SeriesPageLabel.setText("SERIES : ");
        SeriesPageLabel.setPreferredSize(new java.awt.Dimension(250, 60));
        SeriesPagePanel.add(SeriesPageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        s7nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s7nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s7nameLabel.setText("BENI BOYLE SEV");
        s7nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s7nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        s21Separator.setForeground(new java.awt.Color(232, 0, 19));
        s21Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s21Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s21Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s21Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        s7PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        s7PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BeniBoyleSev.png"))); // NOI18N
        s7PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s7PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s7PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s7PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        s8PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        s8PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/PatronBebekYineIsBasinda.png"))); // NOI18N
        s8PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s8PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s8PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s8PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        s22Separator.setForeground(new java.awt.Color(232, 0, 19));
        s22Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s22Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s22Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s22Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        s8nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s8nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s8nameLabel.setText("PATRON BEBEK YINE IS BASINDA");
        s8nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s8nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        s23Separator.setForeground(new java.awt.Color(232, 0, 19));
        s23Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s23Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s23Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s23Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        s9PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Atiye.png"))); // NOI18N
        s9PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s9PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s9PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s9PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        s9nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s9nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s9nameLabel.setText("ATIYE");
        s9nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s9nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));

        s24Separator.setForeground(new java.awt.Color(232, 0, 19));
        s24Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s24Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s24Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s24Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, -1, -1));

        s10PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Masa&KocaAyi.png"))); // NOI18N
        s10PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s10PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s10PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s10PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, -1, -1));

        s10nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s10nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s10nameLabel.setText("MASA VE KOCA AYI");
        s10nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s10nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, -1, -1));

        s12PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/StrangerThings.png"))); // NOI18N
        s12PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s12PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s12PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s12PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 330, -1, -1));

        s12nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s12nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s12nameLabel.setText("STRANGER THINGS");
        s12nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s12nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 510, -1, -1));

        s27Separator.setForeground(new java.awt.Color(232, 0, 19));
        s27Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s27Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s27Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s27Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 330, -1, -1));

        s26Separator.setForeground(new java.awt.Color(232, 0, 19));
        s26Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s26Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s26Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s26Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 330, -1, -1));

        s11PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SungerBob.png"))); // NOI18N
        s11PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s11PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s11PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s11PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 330, -1, -1));

        s11nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s11nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s11nameLabel.setText("SUNGER-BOB");
        s11nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s11nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 510, -1, -1));

        s25Separator.setForeground(new java.awt.Color(232, 0, 19));
        s25Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s25Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s25Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s25Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 330, -1, -1));

        s37Separator.setForeground(new java.awt.Color(232, 0, 19));
        s37Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s37Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s37Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s37Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 560, -1, -1));

        s18PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/KungFuPanda-MuhtesemSırlar.png"))); // NOI18N
        s18PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s18PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s18PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s18PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 560, -1, -1));

        s18nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s18nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s18nameLabel.setText("KUNG-FU PANDA MUHTESEM SIRLAR");
        s18nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s18nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 740, -1, -1));

        s36Separator.setForeground(new java.awt.Color(232, 0, 19));
        s36Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s36Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s36Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s36Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 560, -1, -1));

        s17PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SonicX.png"))); // NOI18N
        s17PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s17PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s17PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s17PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 560, -1, -1));

        s17nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s17nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s17nameLabel.setText("SONIC X");
        s17nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s17nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 740, -1, -1));

        s35Separator.setForeground(new java.awt.Color(232, 0, 19));
        s35Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s35Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s35Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s35Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, -1, -1));

        s16PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Beyblade.png"))); // NOI18N
        s16PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s16PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s16PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s16PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, -1, -1));

        s16nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s16nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s16nameLabel.setText("BEYBLADE");
        s16nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s16nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, -1, -1));

        s34Separator.setForeground(new java.awt.Color(232, 0, 19));
        s34Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s34Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s34Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s34Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, -1, -1));

        s15PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Criminal.png"))); // NOI18N
        s15PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s15PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s15PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s15PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        s15nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s15nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s15nameLabel.setText("CRIMINAL");
        s15nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s15nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 740, -1, -1));

        s33Separator.setForeground(new java.awt.Color(232, 0, 19));
        s33Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s33Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s33Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s33Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        s14PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        s14PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/AngryBirds.png"))); // NOI18N
        s14PicLabel.setToolTipText("");
        s14PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s14PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s14PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s14PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));

        s14nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s14nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s14nameLabel.setText("ANGRY BIRDS");
        s14nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s14nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 740, -1, -1));

        s32Separator.setForeground(new java.awt.Color(232, 0, 19));
        s32Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s32Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s32Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s32Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        s13PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        s13PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TheOriginals.png"))); // NOI18N
        s13PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s13PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s13PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s13PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        s13nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s13nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s13nameLabel.setText("THE ORIGINALS");
        s13nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s13nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 740, -1, -1));

        s31Separator.setForeground(new java.awt.Color(232, 0, 19));
        s31Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s31Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s31Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s31Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        s11Separator.setForeground(new java.awt.Color(232, 0, 19));
        s11Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s11Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s11Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s11Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        s1PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        s1PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/IronFist.png"))); // NOI18N
        s1PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s1PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s1PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        s12Separator.setForeground(new java.awt.Color(232, 0, 19));
        s12Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s12Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s12Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s12Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        s2PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        s2PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/Ejderhalar.png"))); // NOI18N
        s2PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s2PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s2PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        s13Separator.setForeground(new java.awt.Color(232, 0, 19));
        s13Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s13Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s13Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s13Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        s3PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/DirilisErtugrul.png"))); // NOI18N
        s3PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s3PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s3PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s3PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        s14Separator.setForeground(new java.awt.Color(232, 0, 19));
        s14Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s14Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s14Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s14Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, -1, -1));

        s4PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TrolAvcıları-ArcadiaHikayeler.png"))); // NOI18N
        s4PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s4PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s4PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s4PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, -1));

        s17Separator.setForeground(new java.awt.Color(232, 0, 19));
        s17Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s17Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s17Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s17Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 100, -1, -1));

        s6PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/LeylaIleMecnun.png"))); // NOI18N
        s6PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s6PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s6PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s6PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 100, -1, -1));

        s16Separator.setForeground(new java.awt.Color(232, 0, 19));
        s16Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s16Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s16Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s16Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 100, -1, -1));

        s5PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/HowImetYourMother.png"))); // NOI18N
        s5PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s5PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s5PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s5PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 100, -1, -1));

        s15Separator.setForeground(new java.awt.Color(232, 0, 19));
        s15Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s15Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s15Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s15Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 100, -1, -1));

        s1nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s1nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s1nameLabel.setText("MARVEL'S IRON FIST");
        s1nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s1nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        s2nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s2nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s2nameLabel.setText("EJDERHALAR");
        s2nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s2nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        s3nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s3nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s3nameLabel.setText("DIRILIS ERTUGRUL");
        s3nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s3nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        s4nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s4nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s4nameLabel.setText("TROL AVCILARI : ARCADIA HIKAYELERI");
        s4nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s4nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, -1, -1));

        s5nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s5nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s5nameLabel.setText("HOW I MET YOUR MOTHER");
        s5nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s5nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 280, -1, -1));

        s6nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s6nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s6nameLabel.setText("LEYLA ILE MECNUN");
        s6nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s6nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 280, -1, -1));

        s41Separator.setForeground(new java.awt.Color(232, 0, 19));
        s41Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s41Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s41Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s41Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 790, -1, -1));

        s19PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        s19PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TheBlackList.png"))); // NOI18N
        s19PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        s19PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s19PicLabelMouseClicked(evt);
            }
        });
        SeriesPagePanel.add(s19PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 790, -1, -1));

        s19nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        s19nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        s19nameLabel.setText("THE BLACKLIST");
        s19nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        SeriesPagePanel.add(s19nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 970, -1, -1));

        s42Separator.setForeground(new java.awt.Color(232, 0, 19));
        s42Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        s42Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        s42Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        SeriesPagePanel.add(s42Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 790, -1, -1));

        SeriesScrollPane.setViewportView(SeriesPagePanel);

        PagesTabbedPane.addTab("tab3", SeriesScrollPane);

        TvShowsScrollPane.setPreferredSize(new java.awt.Dimension(1366, 650));

        TvShowsPagePanel.setBackground(new java.awt.Color(40, 36, 36));
        TvShowsPagePanel.setForeground(new java.awt.Color(40, 36, 36));
        TvShowsPagePanel.setPreferredSize(new java.awt.Dimension(1920, 3720));
        TvShowsPagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garuda", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 0, 19));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/tvShow-64.png"))); // NOI18N
        jLabel1.setText("TV-SHOWS : ");
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 60));
        TvShowsPagePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        ts2nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        ts2nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        ts2nameLabel.setText("THE BIG FAMILY COOKING");
        ts2nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        TvShowsPagePanel.add(ts2nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        ts11Separator.setForeground(new java.awt.Color(232, 0, 19));
        ts11Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ts11Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        ts11Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        TvShowsPagePanel.add(ts11Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        ts1PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        ts1PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/BasketballOrNothing.png"))); // NOI18N
        ts1PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        ts1PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ts1PicLabelMouseClicked(evt);
            }
        });
        TvShowsPagePanel.add(ts1PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        ts2PicLabel.setBackground(new java.awt.Color(232, 0, 19));
        ts2PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/TheBigFamilyCooking.png"))); // NOI18N
        ts2PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        ts2PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ts2PicLabelMouseClicked(evt);
            }
        });
        TvShowsPagePanel.add(ts2PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        ts1nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        ts1nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        ts1nameLabel.setText("BASKETBALL OR NOTHING");
        ts1nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        TvShowsPagePanel.add(ts1nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        ts13Separator.setForeground(new java.awt.Color(232, 0, 19));
        ts13Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ts13Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        ts13Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        TvShowsPagePanel.add(ts13Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        ts3nameLabel.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        ts3nameLabel.setForeground(new java.awt.Color(232, 0, 19));
        ts3nameLabel.setText("SIRADISI KULUBELER");
        ts3nameLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        TvShowsPagePanel.add(ts3nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        ts12Separator.setForeground(new java.awt.Color(232, 0, 19));
        ts12Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ts12Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        ts12Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        TvShowsPagePanel.add(ts12Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        ts14Separator.setForeground(new java.awt.Color(232, 0, 19));
        ts14Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ts14Separator.setFont(new java.awt.Font("Garuda", 1, 48)); // NOI18N
        ts14Separator.setPreferredSize(new java.awt.Dimension(10, 200));
        TvShowsPagePanel.add(ts14Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        ts3PicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nfdeneme/programsIcons/SiraDisiKulubeler.png"))); // NOI18N
        ts3PicLabel.setPreferredSize(new java.awt.Dimension(250, 150));
        ts3PicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ts3PicLabelMouseClicked(evt);
            }
        });
        TvShowsPagePanel.add(ts3PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        TvShowsScrollPane.setViewportView(TvShowsPagePanel);

        PagesTabbedPane.addTab("tab4", TvShowsScrollPane);

        getContentPane().add(PagesTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomePageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageLabelMouseClicked
        // TODO add your handling code here:
        PagesTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_HomePageLabelMouseClicked

    private void MoviesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoviesLabelMouseClicked
        // TODO add your handling code here:
        PagesTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_MoviesLabelMouseClicked

    private void SeriesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesLabelMouseClicked
        // TODO add your handling code here:
        PagesTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_SeriesLabelMouseClicked

    private void TVShowsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TVShowsLabelMouseClicked
        // TODO add your handling code here:
        PagesTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_TVShowsLabelMouseClicked

    private void ts1PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts1PicLabelMouseClicked
        // TODO add your handling code here:
        // not tıkladığımız resmin bilgilerini bu adrese göndereceğiz
        SelectPic(72);
    }//GEN-LAST:event_ts1PicLabelMouseClicked

    private void p1PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(1);
    }//GEN-LAST:event_p1PicLabelMouseClicked

    private void p2PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(2);
    }//GEN-LAST:event_p2PicLabelMouseClicked

    private void p3PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(3);
    }//GEN-LAST:event_p3PicLabelMouseClicked

    private void p4PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(4);
    }//GEN-LAST:event_p4PicLabelMouseClicked

    private void p5PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(5);
    }//GEN-LAST:event_p5PicLabelMouseClicked

    private void p6PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(6);
    }//GEN-LAST:event_p6PicLabelMouseClicked

    private void p7PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(7);
    }//GEN-LAST:event_p7PicLabelMouseClicked

    private void p8PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(8);
    }//GEN-LAST:event_p8PicLabelMouseClicked

    private void p9PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(9);
    }//GEN-LAST:event_p9PicLabelMouseClicked

    private void p10PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(10);
    }//GEN-LAST:event_p10PicLabelMouseClicked

    private void p11PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(11);
    }//GEN-LAST:event_p11PicLabelMouseClicked

    private void p12PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(12);
    }//GEN-LAST:event_p12PicLabelMouseClicked

    private void p13PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(13);
    }//GEN-LAST:event_p13PicLabelMouseClicked

    private void p14PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p14PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(14);
    }//GEN-LAST:event_p14PicLabelMouseClicked

    private void p15PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p15PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(15);
    }//GEN-LAST:event_p15PicLabelMouseClicked

    private void p16PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p16PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(16);
    }//GEN-LAST:event_p16PicLabelMouseClicked

    private void p17PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p17PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(17);
    }//GEN-LAST:event_p17PicLabelMouseClicked

    private void p18PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p18PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(18);
    }//GEN-LAST:event_p18PicLabelMouseClicked

    private void p19PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p19PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(19);
    }//GEN-LAST:event_p19PicLabelMouseClicked

    private void p20PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p20PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(20);
    }//GEN-LAST:event_p20PicLabelMouseClicked

    private void p21PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p21PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(21);
    }//GEN-LAST:event_p21PicLabelMouseClicked

    private void p22PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p22PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(22);
    }//GEN-LAST:event_p22PicLabelMouseClicked

    private void p23PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p23PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(23);
    }//GEN-LAST:event_p23PicLabelMouseClicked

    private void p24PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p24PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(24);
    }//GEN-LAST:event_p24PicLabelMouseClicked

    private void p25PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p25PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(25);
    }//GEN-LAST:event_p25PicLabelMouseClicked

    private void p26PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p26PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(26);
    }//GEN-LAST:event_p26PicLabelMouseClicked

    private void p27PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p27PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(27);
    }//GEN-LAST:event_p27PicLabelMouseClicked

    private void p28PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p28PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(28);
    }//GEN-LAST:event_p28PicLabelMouseClicked

    private void p29PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p29PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(29);
    }//GEN-LAST:event_p29PicLabelMouseClicked

    private void p30PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p30PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(30);
    }//GEN-LAST:event_p30PicLabelMouseClicked

    private void p31PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p31PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(31);
    }//GEN-LAST:event_p31PicLabelMouseClicked

    private void p32PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p32PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(32);
    }//GEN-LAST:event_p32PicLabelMouseClicked

    private void p33PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p33PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(33);
    }//GEN-LAST:event_p33PicLabelMouseClicked

    private void p34PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p34PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(34);
    }//GEN-LAST:event_p34PicLabelMouseClicked

    private void p35PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p35PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(35);
    }//GEN-LAST:event_p35PicLabelMouseClicked

    private void p36PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p36PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(36);
    }//GEN-LAST:event_p36PicLabelMouseClicked

    private void p37PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p37PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(37);
    }//GEN-LAST:event_p37PicLabelMouseClicked

    private void p38PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p38PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(38);
    }//GEN-LAST:event_p38PicLabelMouseClicked

    private void p39PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p39PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(39);
    }//GEN-LAST:event_p39PicLabelMouseClicked

    private void p40PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p40PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(40);
    }//GEN-LAST:event_p40PicLabelMouseClicked

    private void p41PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p41PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(41);
    }//GEN-LAST:event_p41PicLabelMouseClicked

    private void p42PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p42PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(42);
    }//GEN-LAST:event_p42PicLabelMouseClicked

    private void p43PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p43PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(43);
    }//GEN-LAST:event_p43PicLabelMouseClicked

    private void p44PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p44PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(44);
    }//GEN-LAST:event_p44PicLabelMouseClicked

    private void p45PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p45PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(45);
    }//GEN-LAST:event_p45PicLabelMouseClicked

    private void p46PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p46PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(46);
    }//GEN-LAST:event_p46PicLabelMouseClicked

    private void p47PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p47PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(47);
    }//GEN-LAST:event_p47PicLabelMouseClicked

    private void p48PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p48PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(48);
    }//GEN-LAST:event_p48PicLabelMouseClicked

    private void p49PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p49PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(49);
    }//GEN-LAST:event_p49PicLabelMouseClicked

    private void p50PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p50PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(50);
    }//GEN-LAST:event_p50PicLabelMouseClicked

    private void p51PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p51PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(51);
    }//GEN-LAST:event_p51PicLabelMouseClicked

    private void p52PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p52PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(52);
    }//GEN-LAST:event_p52PicLabelMouseClicked

    private void p53PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p53PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(53);
    }//GEN-LAST:event_p53PicLabelMouseClicked

    private void p54PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p54PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(54);
    }//GEN-LAST:event_p54PicLabelMouseClicked

    private void p55PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p55PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(55);
    }//GEN-LAST:event_p55PicLabelMouseClicked

    private void p56PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p56PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(56);
    }//GEN-LAST:event_p56PicLabelMouseClicked

    private void p57PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p57PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(57);
    }//GEN-LAST:event_p57PicLabelMouseClicked

    private void p58PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p58PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(58);
    }//GEN-LAST:event_p58PicLabelMouseClicked

    private void p59PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p59PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(59);
    }//GEN-LAST:event_p59PicLabelMouseClicked

    private void p60PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p60PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(60);
    }//GEN-LAST:event_p60PicLabelMouseClicked

    private void p61PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p61PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(61);
    }//GEN-LAST:event_p61PicLabelMouseClicked

    private void p62PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p62PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(62);
    }//GEN-LAST:event_p62PicLabelMouseClicked

    private void p63PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p63PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(63);
    }//GEN-LAST:event_p63PicLabelMouseClicked

    private void p64PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p64PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(64);
    }//GEN-LAST:event_p64PicLabelMouseClicked

    private void p65PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p65PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(65);
    }//GEN-LAST:event_p65PicLabelMouseClicked

    private void p66PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p66PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(66);
    }//GEN-LAST:event_p66PicLabelMouseClicked

    private void p67PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p67PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(67);
    }//GEN-LAST:event_p67PicLabelMouseClicked

    private void p68PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p68PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(68);
    }//GEN-LAST:event_p68PicLabelMouseClicked

    private void p69PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p69PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(69);
    }//GEN-LAST:event_p69PicLabelMouseClicked

    private void p70PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p70PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(70);
    }//GEN-LAST:event_p70PicLabelMouseClicked

    private void p71PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p71PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(71);
    }//GEN-LAST:event_p71PicLabelMouseClicked

    private void p72PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p72PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(72);
    }//GEN-LAST:event_p72PicLabelMouseClicked

    private void p73PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p73PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(73);
    }//GEN-LAST:event_p73PicLabelMouseClicked

    private void p74PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p74PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(74);
    }//GEN-LAST:event_p74PicLabelMouseClicked

    private void m1PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(1);
    }//GEN-LAST:event_m1PicLabelMouseClicked

    private void m2PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(2);
    }//GEN-LAST:event_m2PicLabelMouseClicked

    private void m3PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m3PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(3);
    }//GEN-LAST:event_m3PicLabelMouseClicked

    private void m4PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m4PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(4);
    }//GEN-LAST:event_m4PicLabelMouseClicked

    private void m5PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m5PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(5);
    }//GEN-LAST:event_m5PicLabelMouseClicked

    private void m6PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m6PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(6);
    }//GEN-LAST:event_m6PicLabelMouseClicked

    private void m7PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m7PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(7);
    }//GEN-LAST:event_m7PicLabelMouseClicked

    private void m8PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m8PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(8);
    }//GEN-LAST:event_m8PicLabelMouseClicked

    private void m9PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m9PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(9);
    }//GEN-LAST:event_m9PicLabelMouseClicked

    private void m10PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m10PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(10);
    }//GEN-LAST:event_m10PicLabelMouseClicked

    private void m11PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m11PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(11);
    }//GEN-LAST:event_m11PicLabelMouseClicked

    private void m12PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m12PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(12);
    }//GEN-LAST:event_m12PicLabelMouseClicked

    private void m13PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m13PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(13);
    }//GEN-LAST:event_m13PicLabelMouseClicked

    private void m14PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m14PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(14);
    }//GEN-LAST:event_m14PicLabelMouseClicked

    private void m15PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m15PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(15);
    }//GEN-LAST:event_m15PicLabelMouseClicked

    private void m16PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m16PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(16);
    }//GEN-LAST:event_m16PicLabelMouseClicked

    private void m17PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m17PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(17);
    }//GEN-LAST:event_m17PicLabelMouseClicked

    private void m18PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m18PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(18);
    }//GEN-LAST:event_m18PicLabelMouseClicked

    private void m19PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m19PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(19);
    }//GEN-LAST:event_m19PicLabelMouseClicked

    private void m20PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m20PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(20);
    }//GEN-LAST:event_m20PicLabelMouseClicked

    private void m21PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m21PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(21);
    }//GEN-LAST:event_m21PicLabelMouseClicked

    private void m22PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m22PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(22);
    }//GEN-LAST:event_m22PicLabelMouseClicked

    private void m23PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m23PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(23);
    }//GEN-LAST:event_m23PicLabelMouseClicked

    private void m24PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m24PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(24);
    }//GEN-LAST:event_m24PicLabelMouseClicked

    private void m25PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m25PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(25);
    }//GEN-LAST:event_m25PicLabelMouseClicked

    private void m26PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m26PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(26);
    }//GEN-LAST:event_m26PicLabelMouseClicked

    private void m27PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m27PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(27);
    }//GEN-LAST:event_m27PicLabelMouseClicked

    private void m28PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m28PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(28);
    }//GEN-LAST:event_m28PicLabelMouseClicked

    private void m29PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m29PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(29);
    }//GEN-LAST:event_m29PicLabelMouseClicked

    private void m30PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m30PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(30);
    }//GEN-LAST:event_m30PicLabelMouseClicked

    private void m31PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m31PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(31);
    }//GEN-LAST:event_m31PicLabelMouseClicked

    private void m32PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m32PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(32);
    }//GEN-LAST:event_m32PicLabelMouseClicked

    private void m33PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m33PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(33);
    }//GEN-LAST:event_m33PicLabelMouseClicked

    private void m34PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m34PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(34);
    }//GEN-LAST:event_m34PicLabelMouseClicked

    private void m35PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m35PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(35);
    }//GEN-LAST:event_m35PicLabelMouseClicked

    private void m36PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m36PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(36);
    }//GEN-LAST:event_m36PicLabelMouseClicked

    private void m37PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m37PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(37);
    }//GEN-LAST:event_m37PicLabelMouseClicked

    private void m38PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m38PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(38);
    }//GEN-LAST:event_m38PicLabelMouseClicked

    private void m39PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m39PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(39);
    }//GEN-LAST:event_m39PicLabelMouseClicked

    private void m40PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m40PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(40);
    }//GEN-LAST:event_m40PicLabelMouseClicked

    private void m41PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m41PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(41);
    }//GEN-LAST:event_m41PicLabelMouseClicked

    private void m42PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m42PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(42);
    }//GEN-LAST:event_m42PicLabelMouseClicked

    private void m43PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m43PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(43);
    }//GEN-LAST:event_m43PicLabelMouseClicked

    private void m44PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m44PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(44);
    }//GEN-LAST:event_m44PicLabelMouseClicked

    private void m45PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m45PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(45);
    }//GEN-LAST:event_m45PicLabelMouseClicked

    private void m46PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m46PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(46);
    }//GEN-LAST:event_m46PicLabelMouseClicked

    private void m47PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m47PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(47);
    }//GEN-LAST:event_m47PicLabelMouseClicked

    private void m48PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m48PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(48);
    }//GEN-LAST:event_m48PicLabelMouseClicked

    private void m49PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m49PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(49);
    }//GEN-LAST:event_m49PicLabelMouseClicked

    private void s1PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(50);
    }//GEN-LAST:event_s1PicLabelMouseClicked

    private void s2PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(51);
    }//GEN-LAST:event_s2PicLabelMouseClicked

    private void s3PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s3PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(52);
    }//GEN-LAST:event_s3PicLabelMouseClicked

    private void s4PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s4PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(53);
    }//GEN-LAST:event_s4PicLabelMouseClicked

    private void s5PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s5PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(54);
    }//GEN-LAST:event_s5PicLabelMouseClicked

    private void s6PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s6PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(55);
    }//GEN-LAST:event_s6PicLabelMouseClicked

    private void s7PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s7PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(56);
    }//GEN-LAST:event_s7PicLabelMouseClicked

    private void s8PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s8PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(57);
    }//GEN-LAST:event_s8PicLabelMouseClicked

    private void s9PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s9PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(58);
    }//GEN-LAST:event_s9PicLabelMouseClicked

    private void s10PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s10PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(59);
    }//GEN-LAST:event_s10PicLabelMouseClicked

    private void s11PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s11PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(60);
    }//GEN-LAST:event_s11PicLabelMouseClicked

    private void s12PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s12PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(61);
    }//GEN-LAST:event_s12PicLabelMouseClicked

    private void s13PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s13PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(62);
    }//GEN-LAST:event_s13PicLabelMouseClicked

    private void s14PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s14PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(63);
    }//GEN-LAST:event_s14PicLabelMouseClicked

    private void s15PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s15PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(64);
    }//GEN-LAST:event_s15PicLabelMouseClicked

    private void s16PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s16PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(65);
    }//GEN-LAST:event_s16PicLabelMouseClicked

    private void s17PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s17PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(66);
    }//GEN-LAST:event_s17PicLabelMouseClicked

    private void s18PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s18PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(67);
    }//GEN-LAST:event_s18PicLabelMouseClicked

    private void s19PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s19PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(68);
    }//GEN-LAST:event_s19PicLabelMouseClicked

    private void ts2PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts2PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(73);
    }//GEN-LAST:event_ts2PicLabelMouseClicked

    private void ts3PicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts3PicLabelMouseClicked
        // TODO add your handling code here:
        SelectPic(74);
    }//GEN-LAST:event_ts3PicLabelMouseClicked

    private void usericonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonLabelMouseClicked
        try {
            // TODO add your handling code here:
            URL url2 = new URL("http://80.211.50.23:4000/api/user");
            BufferedReader in = new BufferedReader(new InputStreamReader(url2.openStream()));
            String inputLine, result = "";
            while ((inputLine = in.readLine()) != null) {
                // System.out.println(inputLine);
                result += inputLine + "\n";
            }
            System.out.println(result);

            in.close();

            JSONParser jsp = new JSONParser();
            Object obj = jsp.parse(result);

            JSONArray jsa = (JSONArray) obj;
            int i, k = -1;
            for (i = 0; i < jsa.size(); i++) {
                JSONObject jso = (JSONObject) jsa.get(i);
                int pid = Integer.parseInt(jso.get("id").toString());
                if (uid == pid) {
                    break;
                }
                k++;

            }
            JSONObject jso = (JSONObject) jsa.get(i);

            String name = jso.get("name").toString();
            String mail = jso.get("email").toString();
            String bornDate = jso.get("date").toString();
            String Selected = jso.get("fav").toString();
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Name : " + name + "\n" + "Mail : " + mail + "\n"
                        + "Birhday : " + bornDate + "\n" + "Favorite : \n" + Selected);
            } else {
                String[] SelectedKinds = Selected.split(",");
                JOptionPane.showMessageDialog(null, "Name : " + name + "\n" + "Mail : " + mail + "\n"
                        + "Birhday : " + bornDate + "\n" + "Favorite : \n" + SelectedKinds[0] + "\n"
                        + SelectedKinds[1] + "\n" + SelectedKinds[2]);
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(NetFlix.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NetFlix.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(NetFlix.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_usericonLabelMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        SignIn s = new SignIn();
        s.setVisible(true);
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void SearchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchLabelMouseClicked
        // TODO add your handling code here:
        Search s = new Search(uid);
        s.setVisible(true);
    }//GEN-LAST:event_SearchLabelMouseClicked

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
            java.util.logging.Logger.getLogger(NetFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NetFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NetFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NetFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NetFlix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllProgramsLabel;
    private javax.swing.JSplitPane HEADERSplitPane;
    private javax.swing.JLabel HomePageLabel;
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JScrollPane HomePageScrollPane;
    private javax.swing.JLabel KeepWatching1PicLabel;
    private javax.swing.JSeparator KeepWatching1Separator;
    private javax.swing.JLabel KeepWatching1nameLabel;
    private javax.swing.JLabel KeepWatching2PicLabel;
    private javax.swing.JSeparator KeepWatching2Separator;
    private javax.swing.JLabel KeepWatching2nameLabel;
    private javax.swing.JLabel KeepWatching3PicLabel;
    private javax.swing.JSeparator KeepWatching3Separator;
    private javax.swing.JLabel KeepWatching3nameLabel;
    private javax.swing.JLabel KeepWatching4PicLabel;
    private javax.swing.JSeparator KeepWatching4Separator;
    private javax.swing.JLabel KeepWatching4nameLabel;
    private javax.swing.JLabel KeepWatching5PicLabel;
    private javax.swing.JSeparator KeepWatching5Separator;
    private javax.swing.JLabel KeepWatching5nameLabel;
    private javax.swing.JSeparator KeepWatching6Separator;
    private javax.swing.JLabel KeepWatchingLabel;
    private javax.swing.JLabel MoviesLabel;
    private javax.swing.JLabel MoviesPageLabel;
    private javax.swing.JPanel MoviesPanel;
    private javax.swing.JScrollPane MoviesScrollPane;
    private javax.swing.JTabbedPane PagesTabbedPane;
    private javax.swing.JLabel Recommend1PicLabel;
    private javax.swing.JSeparator Recommend1Separator;
    private javax.swing.JLabel Recommend1nameLabel;
    private javax.swing.JLabel Recommend2PicLabel;
    private javax.swing.JSeparator Recommend2Separator;
    private javax.swing.JLabel Recommend2nameLabel;
    private javax.swing.JLabel Recommend3PicLabel;
    private javax.swing.JSeparator Recommend3Separator;
    private javax.swing.JLabel Recommend3nameLabel;
    private javax.swing.JLabel Recommend4PicLabel;
    private javax.swing.JSeparator Recommend4Separator;
    private javax.swing.JLabel Recommend4nameLabel;
    private javax.swing.JLabel Recommend5PicLabel;
    private javax.swing.JSeparator Recommend5Separator;
    private javax.swing.JLabel Recommend5nameLabel;
    private javax.swing.JLabel Recommend6PicLabel;
    private javax.swing.JSeparator Recommend6Separator;
    private javax.swing.JLabel Recommend6nameLabel;
    private javax.swing.JSeparator Recommend7Separator;
    private javax.swing.JLabel RecommendLabel;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JLabel SeriesLabel;
    private javax.swing.JLabel SeriesPageLabel;
    private javax.swing.JPanel SeriesPagePanel;
    private javax.swing.JScrollPane SeriesScrollPane;
    private javax.swing.JLabel TVShowsLabel;
    private javax.swing.JPanel TvShowsPagePanel;
    private javax.swing.JScrollPane TvShowsScrollPane;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel m10PicLabel;
    private javax.swing.JLabel m10nameLabel;
    private javax.swing.JLabel m11PicLabel;
    private javax.swing.JSeparator m11Separator;
    private javax.swing.JLabel m11nameLabel;
    private javax.swing.JLabel m12PicLabel;
    private javax.swing.JSeparator m12Separator;
    private javax.swing.JLabel m12nameLabel;
    private javax.swing.JLabel m13PicLabel;
    private javax.swing.JSeparator m13Separator;
    private javax.swing.JLabel m13nameLabel;
    private javax.swing.JLabel m14PicLabel;
    private javax.swing.JSeparator m14Separator;
    private javax.swing.JLabel m14nameLabel;
    private javax.swing.JLabel m15PicLabel;
    private javax.swing.JSeparator m15Separator;
    private javax.swing.JLabel m15nameLabel;
    private javax.swing.JLabel m16PicLabel;
    private javax.swing.JSeparator m16Separator;
    private javax.swing.JLabel m16nameLabel;
    private javax.swing.JLabel m17PicLabel;
    private javax.swing.JSeparator m17Separator;
    private javax.swing.JLabel m17nameLabel;
    private javax.swing.JLabel m18PicLabel;
    private javax.swing.JLabel m18nameLabel;
    private javax.swing.JLabel m19PicLabel;
    private javax.swing.JLabel m19nameLabel;
    private javax.swing.JLabel m1PicLabel;
    private javax.swing.JLabel m1nameLabel;
    private javax.swing.JLabel m20PicLabel;
    private javax.swing.JLabel m20nameLabel;
    private javax.swing.JLabel m21PicLabel;
    private javax.swing.JSeparator m21Separator;
    private javax.swing.JLabel m21nameLabel;
    private javax.swing.JLabel m22PicLabel;
    private javax.swing.JSeparator m22Separator;
    private javax.swing.JLabel m22nameLabel;
    private javax.swing.JLabel m23PicLabel;
    private javax.swing.JSeparator m23Separator;
    private javax.swing.JLabel m23nameLabel;
    private javax.swing.JLabel m24PicLabel;
    private javax.swing.JSeparator m24Separator;
    private javax.swing.JLabel m24nameLabel;
    private javax.swing.JLabel m25PicLabel;
    private javax.swing.JSeparator m25Separator;
    private javax.swing.JLabel m25nameLabel;
    private javax.swing.JLabel m26PicLabel;
    private javax.swing.JSeparator m26Separator;
    private javax.swing.JLabel m26nameLabel;
    private javax.swing.JLabel m27PicLabel;
    private javax.swing.JSeparator m27Separator;
    private javax.swing.JLabel m27nameLabel;
    private javax.swing.JLabel m28PicLabel;
    private javax.swing.JLabel m28nameLabel;
    private javax.swing.JLabel m29PicLabel;
    private javax.swing.JLabel m29nameLabel;
    private javax.swing.JLabel m2PicLabel;
    private javax.swing.JLabel m2nameLabel;
    private javax.swing.JLabel m30PicLabel;
    private javax.swing.JLabel m30nameLabel;
    private javax.swing.JLabel m31PicLabel;
    private javax.swing.JSeparator m31Separator;
    private javax.swing.JLabel m31nameLabel;
    private javax.swing.JLabel m32PicLabel;
    private javax.swing.JSeparator m32Separator;
    private javax.swing.JLabel m32nameLabel;
    private javax.swing.JLabel m33PicLabel;
    private javax.swing.JSeparator m33Separator;
    private javax.swing.JLabel m33nameLabel;
    private javax.swing.JLabel m34PicLabel;
    private javax.swing.JSeparator m34Separator;
    private javax.swing.JLabel m34nameLabel;
    private javax.swing.JLabel m35PicLabel;
    private javax.swing.JSeparator m35Separator;
    private javax.swing.JLabel m35nameLabel;
    private javax.swing.JLabel m36PicLabel;
    private javax.swing.JSeparator m36Separator;
    private javax.swing.JLabel m36nameLabel;
    private javax.swing.JLabel m37PicLabel;
    private javax.swing.JSeparator m37Separator;
    private javax.swing.JLabel m37nameLabel;
    private javax.swing.JLabel m38PicLabel;
    private javax.swing.JLabel m38nameLabel;
    private javax.swing.JLabel m39PicLabel;
    private javax.swing.JLabel m39nameLabel;
    private javax.swing.JLabel m3PicLabel;
    private javax.swing.JLabel m3nameLabel;
    private javax.swing.JLabel m40PicLabel;
    private javax.swing.JLabel m40nameLabel;
    private javax.swing.JLabel m41PicLabel;
    private javax.swing.JSeparator m41Separator;
    private javax.swing.JLabel m41nameLabel;
    private javax.swing.JLabel m42PicLabel;
    private javax.swing.JSeparator m42Separator;
    private javax.swing.JLabel m42nameLabel;
    private javax.swing.JLabel m43PicLabel;
    private javax.swing.JSeparator m43Separator;
    private javax.swing.JLabel m43nameLabel;
    private javax.swing.JLabel m44PicLabel;
    private javax.swing.JSeparator m44Separator;
    private javax.swing.JLabel m44nameLabel;
    private javax.swing.JLabel m45PicLabel;
    private javax.swing.JSeparator m45Separator;
    private javax.swing.JLabel m45nameLabel;
    private javax.swing.JLabel m46PicLabel;
    private javax.swing.JSeparator m46Separator;
    private javax.swing.JLabel m46nameLabel;
    private javax.swing.JLabel m47PicLabel;
    private javax.swing.JSeparator m47Separator;
    private javax.swing.JLabel m47nameLabel;
    private javax.swing.JLabel m48PicLabel;
    private javax.swing.JLabel m48nameLabel;
    private javax.swing.JLabel m49PicLabel;
    private javax.swing.JLabel m49nameLabel;
    private javax.swing.JLabel m4PicLabel;
    private javax.swing.JLabel m4nameLabel;
    private javax.swing.JSeparator m51Separator;
    private javax.swing.JSeparator m52Separator;
    private javax.swing.JSeparator m53Separator;
    private javax.swing.JSeparator m54Separator;
    private javax.swing.JSeparator m55Separator;
    private javax.swing.JSeparator m56Separator;
    private javax.swing.JSeparator m57Separator;
    private javax.swing.JLabel m5PicLabel;
    private javax.swing.JLabel m5nameLabel;
    private javax.swing.JSeparator m61Separator;
    private javax.swing.JSeparator m62Separator;
    private javax.swing.JSeparator m63Separator;
    private javax.swing.JSeparator m64Separator;
    private javax.swing.JSeparator m65Separator;
    private javax.swing.JSeparator m66Separator;
    private javax.swing.JSeparator m67Separator;
    private javax.swing.JLabel m6PicLabel;
    private javax.swing.JLabel m6nameLabel;
    private javax.swing.JSeparator m71Separator;
    private javax.swing.JSeparator m72Separator;
    private javax.swing.JSeparator m73Separator;
    private javax.swing.JSeparator m74Separator;
    private javax.swing.JSeparator m75Separator;
    private javax.swing.JSeparator m76Separator;
    private javax.swing.JSeparator m77Separator;
    private javax.swing.JLabel m7PicLabel;
    private javax.swing.JLabel m7nameLabel;
    private javax.swing.JSeparator m81Separator;
    private javax.swing.JSeparator m82Separator;
    private javax.swing.JSeparator m83Separator;
    private javax.swing.JSeparator m84Separator;
    private javax.swing.JSeparator m85Separator;
    private javax.swing.JSeparator m86Separator;
    private javax.swing.JSeparator m87Separator;
    private javax.swing.JLabel m8PicLabel;
    private javax.swing.JLabel m8nameLabel;
    private javax.swing.JSeparator m91Separator;
    private javax.swing.JSeparator m92Separator;
    private javax.swing.JLabel m9PicLabel;
    private javax.swing.JLabel m9nameLabel;
    private javax.swing.JSeparator p101Separator;
    private javax.swing.JSeparator p102Separator;
    private javax.swing.JSeparator p103Separator;
    private javax.swing.JSeparator p104Separator;
    private javax.swing.JSeparator p105Separator;
    private javax.swing.JSeparator p106Separator;
    private javax.swing.JSeparator p107Separator;
    private javax.swing.JLabel p10PicLabel;
    private javax.swing.JLabel p10nameLabel;
    private javax.swing.JSeparator p111Separator;
    private javax.swing.JSeparator p112Separator;
    private javax.swing.JSeparator p113Separator;
    private javax.swing.JSeparator p114Separator;
    private javax.swing.JSeparator p115Separator;
    private javax.swing.JSeparator p116Separator;
    private javax.swing.JSeparator p117Separator;
    private javax.swing.JLabel p11PicLabel;
    private javax.swing.JSeparator p11Separator;
    private javax.swing.JLabel p11nameLabel;
    private javax.swing.JSeparator p121Separator;
    private javax.swing.JSeparator p122Separator;
    private javax.swing.JSeparator p123Separator;
    private javax.swing.JSeparator p124Separator;
    private javax.swing.JSeparator p125Separator;
    private javax.swing.JSeparator p126Separator;
    private javax.swing.JSeparator p127Separator;
    private javax.swing.JLabel p12PicLabel;
    private javax.swing.JSeparator p12Separator;
    private javax.swing.JLabel p12nameLabel;
    private javax.swing.JSeparator p131Separator;
    private javax.swing.JSeparator p132Separator;
    private javax.swing.JSeparator p133Separator;
    private javax.swing.JLabel p13PicLabel;
    private javax.swing.JSeparator p13Separator;
    private javax.swing.JLabel p13nameLabel;
    private javax.swing.JLabel p14PicLabel;
    private javax.swing.JSeparator p14Separator;
    private javax.swing.JLabel p14nameLabel;
    private javax.swing.JLabel p15PicLabel;
    private javax.swing.JSeparator p15Separator;
    private javax.swing.JLabel p15nameLabel;
    private javax.swing.JLabel p16PicLabel;
    private javax.swing.JSeparator p16Separator;
    private javax.swing.JLabel p16nameLabel;
    private javax.swing.JLabel p17PicLabel;
    private javax.swing.JSeparator p17Separator;
    private javax.swing.JLabel p17nameLabel;
    private javax.swing.JLabel p18PicLabel;
    private javax.swing.JLabel p18nameLabel;
    private javax.swing.JLabel p19PicLabel;
    private javax.swing.JLabel p19nameLabel;
    private javax.swing.JLabel p1PicLabel;
    private javax.swing.JLabel p1nameLabel;
    private javax.swing.JLabel p20PicLabel;
    private javax.swing.JLabel p20nameLabel;
    private javax.swing.JLabel p21PicLabel;
    private javax.swing.JSeparator p21Separator;
    private javax.swing.JLabel p21nameLabel;
    private javax.swing.JLabel p22PicLabel;
    private javax.swing.JSeparator p22Separator;
    private javax.swing.JLabel p22nameLabel;
    private javax.swing.JLabel p23PicLabel;
    private javax.swing.JSeparator p23Separator;
    private javax.swing.JLabel p23nameLabel;
    private javax.swing.JLabel p24PicLabel;
    private javax.swing.JSeparator p24Separator;
    private javax.swing.JLabel p24nameLabel;
    private javax.swing.JLabel p25PicLabel;
    private javax.swing.JSeparator p25Separator;
    private javax.swing.JLabel p25nameLabel;
    private javax.swing.JLabel p26PicLabel;
    private javax.swing.JSeparator p26Separator;
    private javax.swing.JLabel p26nameLabel;
    private javax.swing.JLabel p27PicLabel;
    private javax.swing.JSeparator p27Separator;
    private javax.swing.JLabel p27nameLabel;
    private javax.swing.JLabel p28PicLabel;
    private javax.swing.JLabel p28nameLabel;
    private javax.swing.JLabel p29PicLabel;
    private javax.swing.JLabel p29nameLabel;
    private javax.swing.JLabel p2PicLabel;
    private javax.swing.JLabel p2nameLabel;
    private javax.swing.JLabel p30PicLabel;
    private javax.swing.JLabel p30nameLabel;
    private javax.swing.JLabel p31PicLabel;
    private javax.swing.JSeparator p31Separator;
    private javax.swing.JLabel p31nameLabel;
    private javax.swing.JLabel p32PicLabel;
    private javax.swing.JSeparator p32Separator;
    private javax.swing.JLabel p32nameLabel;
    private javax.swing.JLabel p33PicLabel;
    private javax.swing.JSeparator p33Separator;
    private javax.swing.JLabel p33nameLabel;
    private javax.swing.JLabel p34PicLabel;
    private javax.swing.JSeparator p34Separator;
    private javax.swing.JLabel p34nameLabel;
    private javax.swing.JLabel p35PicLabel;
    private javax.swing.JSeparator p35Separator;
    private javax.swing.JLabel p35nameLabel;
    private javax.swing.JLabel p36PicLabel;
    private javax.swing.JSeparator p36Separator;
    private javax.swing.JLabel p36nameLabel;
    private javax.swing.JLabel p37PicLabel;
    private javax.swing.JSeparator p37Separator;
    private javax.swing.JLabel p37nameLabel;
    private javax.swing.JLabel p38PicLabel;
    private javax.swing.JLabel p38nameLabel;
    private javax.swing.JLabel p39PicLabel;
    private javax.swing.JLabel p39nameLabel;
    private javax.swing.JLabel p3PicLabel;
    private javax.swing.JLabel p3nameLabel;
    private javax.swing.JLabel p40PicLabel;
    private javax.swing.JLabel p40nameLabel;
    private javax.swing.JLabel p41PicLabel;
    private javax.swing.JSeparator p41Separator;
    private javax.swing.JLabel p41nameLabel;
    private javax.swing.JLabel p42PicLabel;
    private javax.swing.JSeparator p42Separator;
    private javax.swing.JLabel p42nameLabel;
    private javax.swing.JLabel p43PicLabel;
    private javax.swing.JSeparator p43Separator;
    private javax.swing.JLabel p43nameLabel;
    private javax.swing.JLabel p44PicLabel;
    private javax.swing.JSeparator p44Separator;
    private javax.swing.JLabel p44nameLabel;
    private javax.swing.JLabel p45PicLabel;
    private javax.swing.JSeparator p45Separator;
    private javax.swing.JLabel p45nameLabel;
    private javax.swing.JLabel p46PicLabel;
    private javax.swing.JSeparator p46Separator;
    private javax.swing.JLabel p46nameLabel;
    private javax.swing.JLabel p47PicLabel;
    private javax.swing.JSeparator p47Separator;
    private javax.swing.JLabel p47nameLabel;
    private javax.swing.JLabel p48PicLabel;
    private javax.swing.JLabel p48nameLabel;
    private javax.swing.JLabel p49PicLabel;
    private javax.swing.JLabel p49nameLabel;
    private javax.swing.JLabel p4PicLabel;
    private javax.swing.JLabel p4nameLabel;
    private javax.swing.JLabel p50PicLabel;
    private javax.swing.JLabel p50nameLabel;
    private javax.swing.JLabel p51PicLabel;
    private javax.swing.JSeparator p51Separator;
    private javax.swing.JLabel p51nameLabel;
    private javax.swing.JLabel p52PicLabel;
    private javax.swing.JSeparator p52Separator;
    private javax.swing.JLabel p52nameLabel;
    private javax.swing.JLabel p53PicLabel;
    private javax.swing.JSeparator p53Separator;
    private javax.swing.JLabel p53nameLabel;
    private javax.swing.JLabel p54PicLabel;
    private javax.swing.JSeparator p54Separator;
    private javax.swing.JLabel p54nameLabel;
    private javax.swing.JLabel p55PicLabel;
    private javax.swing.JSeparator p55Separator;
    private javax.swing.JLabel p55nameLabel;
    private javax.swing.JLabel p56PicLabel;
    private javax.swing.JSeparator p56Separator;
    private javax.swing.JLabel p56nameLabel;
    private javax.swing.JLabel p57PicLabel;
    private javax.swing.JSeparator p57Separator;
    private javax.swing.JLabel p57nameLabel;
    private javax.swing.JLabel p58PicLabel;
    private javax.swing.JLabel p58nameLabel;
    private javax.swing.JLabel p59PicLabel;
    private javax.swing.JLabel p59nameLabel;
    private javax.swing.JLabel p5PicLabel;
    private javax.swing.JLabel p5nameLabel;
    private javax.swing.JLabel p60PicLabel;
    private javax.swing.JLabel p60nameLabel;
    private javax.swing.JLabel p61PicLabel;
    private javax.swing.JSeparator p61Separator;
    private javax.swing.JLabel p61nameLabel;
    private javax.swing.JLabel p62PicLabel;
    private javax.swing.JSeparator p62Separator;
    private javax.swing.JLabel p62nameLabel;
    private javax.swing.JLabel p63PicLabel;
    private javax.swing.JSeparator p63Separator;
    private javax.swing.JLabel p63nameLabel;
    private javax.swing.JLabel p64PicLabel;
    private javax.swing.JSeparator p64Separator;
    private javax.swing.JLabel p64nameLabel;
    private javax.swing.JLabel p65PicLabel;
    private javax.swing.JSeparator p65Separator;
    private javax.swing.JLabel p65nameLabel;
    private javax.swing.JLabel p66PicLabel;
    private javax.swing.JSeparator p66Separator;
    private javax.swing.JLabel p66nameLabel;
    private javax.swing.JLabel p67PicLabel;
    private javax.swing.JSeparator p67Separator;
    private javax.swing.JLabel p67nameLabel;
    private javax.swing.JLabel p68PicLabel;
    private javax.swing.JLabel p68nameLabel;
    private javax.swing.JLabel p69PicLabel;
    private javax.swing.JLabel p69nameLabel;
    private javax.swing.JLabel p6PicLabel;
    private javax.swing.JLabel p6nameLabel;
    private javax.swing.JLabel p70PicLabel;
    private javax.swing.JLabel p70nameLabel;
    private javax.swing.JLabel p71PicLabel;
    private javax.swing.JSeparator p71Separator;
    private javax.swing.JLabel p71nameLabel;
    private javax.swing.JLabel p72PicLabel;
    private javax.swing.JSeparator p72Separator;
    private javax.swing.JLabel p72nameLabel;
    private javax.swing.JLabel p73PicLabel;
    private javax.swing.JSeparator p73Separator;
    private javax.swing.JLabel p73nameLabel;
    private javax.swing.JLabel p74PicLabel;
    private javax.swing.JSeparator p74Separator;
    private javax.swing.JLabel p74nameLabel;
    private javax.swing.JSeparator p75Separator;
    private javax.swing.JSeparator p76Separator;
    private javax.swing.JSeparator p77Separator;
    private javax.swing.JLabel p7PicLabel;
    private javax.swing.JLabel p7nameLabel;
    private javax.swing.JSeparator p81Separator;
    private javax.swing.JSeparator p82Separator;
    private javax.swing.JSeparator p83Separator;
    private javax.swing.JSeparator p84Separator;
    private javax.swing.JSeparator p85Separator;
    private javax.swing.JSeparator p86Separator;
    private javax.swing.JSeparator p87Separator;
    private javax.swing.JLabel p8PicLabel;
    private javax.swing.JLabel p8nameLabel;
    private javax.swing.JSeparator p91Separator;
    private javax.swing.JSeparator p92Separator;
    private javax.swing.JSeparator p93Separator;
    private javax.swing.JSeparator p94Separator;
    private javax.swing.JSeparator p95Separator;
    private javax.swing.JSeparator p96Separator;
    private javax.swing.JSeparator p97Separator;
    private javax.swing.JLabel p9PicLabel;
    private javax.swing.JLabel p9nameLabel;
    private javax.swing.JLabel s10PicLabel;
    private javax.swing.JLabel s10nameLabel;
    private javax.swing.JLabel s11PicLabel;
    private javax.swing.JSeparator s11Separator;
    private javax.swing.JLabel s11nameLabel;
    private javax.swing.JLabel s12PicLabel;
    private javax.swing.JSeparator s12Separator;
    private javax.swing.JLabel s12nameLabel;
    private javax.swing.JLabel s13PicLabel;
    private javax.swing.JSeparator s13Separator;
    private javax.swing.JLabel s13nameLabel;
    private javax.swing.JLabel s14PicLabel;
    private javax.swing.JSeparator s14Separator;
    private javax.swing.JLabel s14nameLabel;
    private javax.swing.JLabel s15PicLabel;
    private javax.swing.JSeparator s15Separator;
    private javax.swing.JLabel s15nameLabel;
    private javax.swing.JLabel s16PicLabel;
    private javax.swing.JSeparator s16Separator;
    private javax.swing.JLabel s16nameLabel;
    private javax.swing.JLabel s17PicLabel;
    private javax.swing.JSeparator s17Separator;
    private javax.swing.JLabel s17nameLabel;
    private javax.swing.JLabel s18PicLabel;
    private javax.swing.JLabel s18nameLabel;
    private javax.swing.JLabel s19PicLabel;
    private javax.swing.JLabel s19nameLabel;
    private javax.swing.JLabel s1PicLabel;
    private javax.swing.JLabel s1nameLabel;
    private javax.swing.JSeparator s21Separator;
    private javax.swing.JSeparator s22Separator;
    private javax.swing.JSeparator s23Separator;
    private javax.swing.JSeparator s24Separator;
    private javax.swing.JSeparator s25Separator;
    private javax.swing.JSeparator s26Separator;
    private javax.swing.JSeparator s27Separator;
    private javax.swing.JLabel s2PicLabel;
    private javax.swing.JLabel s2nameLabel;
    private javax.swing.JSeparator s31Separator;
    private javax.swing.JSeparator s32Separator;
    private javax.swing.JSeparator s33Separator;
    private javax.swing.JSeparator s34Separator;
    private javax.swing.JSeparator s35Separator;
    private javax.swing.JSeparator s36Separator;
    private javax.swing.JSeparator s37Separator;
    private javax.swing.JLabel s3PicLabel;
    private javax.swing.JLabel s3nameLabel;
    private javax.swing.JSeparator s41Separator;
    private javax.swing.JSeparator s42Separator;
    private javax.swing.JLabel s4PicLabel;
    private javax.swing.JLabel s4nameLabel;
    private javax.swing.JLabel s5PicLabel;
    private javax.swing.JLabel s5nameLabel;
    private javax.swing.JLabel s6PicLabel;
    private javax.swing.JLabel s6nameLabel;
    private javax.swing.JLabel s7PicLabel;
    private javax.swing.JLabel s7nameLabel;
    private javax.swing.JLabel s8PicLabel;
    private javax.swing.JLabel s8nameLabel;
    private javax.swing.JLabel s9PicLabel;
    private javax.swing.JLabel s9nameLabel;
    private javax.swing.JSeparator ts11Separator;
    private javax.swing.JSeparator ts12Separator;
    private javax.swing.JSeparator ts13Separator;
    private javax.swing.JSeparator ts14Separator;
    private javax.swing.JLabel ts1PicLabel;
    private javax.swing.JLabel ts1nameLabel;
    private javax.swing.JLabel ts2PicLabel;
    private javax.swing.JLabel ts2nameLabel;
    private javax.swing.JLabel ts3PicLabel;
    private javax.swing.JLabel ts3nameLabel;
    private javax.swing.JLabel usericonLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
