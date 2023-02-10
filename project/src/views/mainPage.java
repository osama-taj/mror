
package views;

import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;////

public class mainPage extends javax.swing.JFrame{
     void cleartype(){t_breachNO.setText("");t_breachName.setText("");t_breachM.setText("");}
     void clearuser(){t_u_no.setText("");t_u_name.setText("");t_u_usaeName.setText("");t_u_passWprd.setText("");t_u_phone.setText("");}
     void clearofficer(){t_of_no.setText("");t_of_name.setText("");t_of_work.setText("");t_of_phone.setText("");}
     void clearbay(){t_pay_no.setText("");t_pay_name.setText("");}
     void clearbreaches(){
     t_no_p.setText("");
     t_pla_no.setText("");
     t_user_name_b.setText("");
     c_type_breach.setSelectedItem("");
     c_officer_name.setSelectedItem("");
     }
    ////////to make the textfiled accept alphabets
     void justChar(java.awt.event.KeyEvent evt){
     char c=evt.getKeyChar();
     int x=0;
        if(!(Character.isAlphabetic(c)||(c==KeyEvent.VK_BACK_SPACE)|| (c==KeyEvent.VK_DELETE) ||(c==KeyEvent.VK_SPACE)))
        { evt.consume();x=1;}
         if(x==1)
        {JOptionPane.showMessageDialog(null,"just enter alphabet");}
      }
     //////////to make the text filed accept numbers
      void justNumber(java.awt.event.KeyEvent evt){
         char c=evt.getKeyChar();int x=0;
        if (Character.isLetter(c)&& !evt.isAltDown())
        {evt.consume();x=1;}
     
      if(x==1)
        {JOptionPane.showMessageDialog(null,"jast enter number");}
      }
     
    public mainPage() throws SQLException {
        this.co = new conic();
        initComponents();
        pa_typebreach.setVisible(false);
        pa_user.setVisible(false);
        pa_officers.setVisible(false);
        pa_breach.setVisible(false);
        pa_paybreach.setVisible(false);
        t_u_m.setText("dfd");
     }
    public mainPage(int no,String name ,String type) throws SQLException {
        
        initComponents();
        this.co = new conic();
        pa_typebreach.setVisible(false);
        pa_user.setVisible(false);
        pa_officers.setVisible(false);
        pa_breach.setVisible(false);
        pa_paybreach.setVisible(false);
        t_u_m.setText(name);
        t_u_nn.setText(no+"");
        t_u_tt.setText(type);
        AutoCompleteDecorator.decorate(c_type_breach);
        AutoCompleteDecorator.decorate(c_officer_name);
        ////
        t_u_tt.setVisible(false);
        t_u_nn.setVisible(false);
        /////للتفريق بين المستخدم و الادمن
           Object user="user";
        if(t_u_tt.getText().equals(user))
        {
          b_add.setEnabled(false);
          b_change.setEnabled(false);
          b_delete.setEnabled(false);
          b_save.setEnabled(false);
          b_user_add.setEnabled(false);
          b_user_edit.setEnabled(false);
          b_user_delete.setEnabled(false);
          b_user_save.setEnabled(false);
          b_officer_add.setEnabled(false);
          b_officer_edit.setEnabled(false);
          b_officer_delete.setEnabled(false);
          b_officer_save.setEnabled(false);
          b_breach_edit.setEnabled(false);
         // b_breach_delete.setEnabled(false);
        }
        //////////
        b_breach_edit.setVisible(false);
        
    }
 conic co;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b_user = new javax.swing.JButton();
        b_typebreach = new javax.swing.JButton();
        b_breach = new javax.swing.JButton();
        b_bay = new javax.swing.JButton();
        b_officer = new javax.swing.JButton();
        t_u_m = new javax.swing.JLabel();
        t_u_nn = new javax.swing.JLabel();
        t_u_tt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pa_typebreach = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        b_add = new javax.swing.JButton();
        b_change = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        t_breachNO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_breachName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_breachM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_save = new javax.swing.JButton();
        c_search_type = new javax.swing.JComboBox();
        b_search_type = new javax.swing.JButton();
        pa_user = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        b_user_add = new javax.swing.JButton();
        b_user_edit = new javax.swing.JButton();
        b_user_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t_u_no = new javax.swing.JTextField();
        t_u_usaeName = new javax.swing.JTextField();
        t_u_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_u_passWprd = new javax.swing.JTextField();
        c_u_type = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_u_phone = new javax.swing.JTextField();
        b_user_save = new javax.swing.JButton();
        c_search_user = new javax.swing.JComboBox();
        pa_officers = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        b_officer_add = new javax.swing.JButton();
        b_officer_delete = new javax.swing.JButton();
        b_officer_edit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t_of_no = new javax.swing.JTextField();
        t_of_name = new javax.swing.JTextField();
        t_of_work = new javax.swing.JTextField();
        t_of_phone = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        b_officer_save = new javax.swing.JButton();
        c_offi_name = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        pa_breach = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        t_no_p = new javax.swing.JTextField();
        t_pla_no = new javax.swing.JTextField();
        t_user_name_b = new javax.swing.JTextField();
        c_type_breach = new javax.swing.JComboBox();
        c_officer_name = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        t_search_breach = new javax.swing.JTextField();
        b_breach_save = new javax.swing.JButton();
        b_breach_add = new javax.swing.JButton();
        b_breach_edit = new javax.swing.JButton();
        c_b_s = new javax.swing.JComboBox();
        b_date = new com.toedter.calendar.JDateChooser();
        b_breach_delete1 = new javax.swing.JButton();
        pa_paybreach = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        t_pay_no = new javax.swing.JTextField();
        t_pay_name = new javax.swing.JTextField();
        b_pay_save = new javax.swing.JButton();
        d_pay = new com.toedter.calendar.JDateChooser();
        jButton12 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 79, 107));

        titel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        titel.setForeground(new java.awt.Color(255, 255, 255));
        titel.setText("نظام مراقبة المخالفات");

        jPanel2.setBackground(new java.awt.Color(9, 65, 82));

        b_user.setText("المستخدمين");
        b_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_userActionPerformed(evt);
            }
        });

        b_typebreach.setText("انواع المخالفات");
        b_typebreach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_typebreachActionPerformed(evt);
            }
        });

        b_breach.setText("المخالفات");
        b_breach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_breachActionPerformed(evt);
            }
        });

        b_bay.setText("دفع مخالفة");
        b_bay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bayActionPerformed(evt);
            }
        });

        b_officer.setText("الضباط");
        b_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_officerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(b_officer, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(b_bay, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(b_breach, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_user, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(b_typebreach, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_user)
                    .addComponent(b_breach)
                    .addComponent(b_bay)
                    .addComponent(b_officer)
                    .addComponent(b_typebreach))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        t_u_m.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_u_m.setForeground(new java.awt.Color(255, 255, 255));
        t_u_m.setText("user");

        t_u_nn.setText("jLabel21");

        t_u_tt.setText("jLabel22");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(t_u_m, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(t_u_nn)
                .addGap(54, 54, 54)
                .addComponent(t_u_tt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titel)
                .addGap(441, 441, 441))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_u_m)
                        .addComponent(t_u_nn)
                        .addComponent(t_u_tt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(191, 198, 200));

        jPanel4.setBackground(new java.awt.Color(191, 198, 200));
        jPanel4.setForeground(new java.awt.Color(49, 64, 95));

        b_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_add.setText("add");
        b_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addActionPerformed(evt);
            }
        });

        b_change.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_change.setText("edit");
        b_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_changeActionPerformed(evt);
            }
        });

        b_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_delete.setText("delete");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_change, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(b_add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(b_change, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "number", "name ", "money"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        t_breachNO.setEditable(false);
        t_breachNO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_breachNO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_breachNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_breachNOActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("رقم المخالفه");

        t_breachName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_breachName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_breachName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_breachNameActionPerformed(evt);
            }
        });
        t_breachName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_breachNameKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("اسم المخالفه");

        t_breachM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t_breachM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_breachM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_breachMActionPerformed(evt);
            }
        });
        t_breachM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_breachMKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("مبلغ المخالفه");

        b_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_save.setText("save");
        b_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_breachNO, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(t_breachName)
                            .addComponent(t_breachM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(t_breachNO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_breachName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_breachM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        c_search_type.setEditable(true);

        b_search_type.setText("search");
        b_search_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_search_typeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa_typebreachLayout = new javax.swing.GroupLayout(pa_typebreach);
        pa_typebreach.setLayout(pa_typebreachLayout);
        pa_typebreachLayout.setHorizontalGroup(
            pa_typebreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_typebreachLayout.createSequentialGroup()
                .addGroup(pa_typebreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_typebreachLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_typebreachLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_search_type, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(c_search_type, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pa_typebreachLayout.setVerticalGroup(
            pa_typebreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_typebreachLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pa_typebreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_search_type, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_search_type, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pa_typebreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pa_typebreachLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(pa_typebreachLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel5.setBackground(new java.awt.Color(191, 198, 200));

        b_user_add.setText("add");
        b_user_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_user_addActionPerformed(evt);
            }
        });

        b_user_edit.setText("Edit");
        b_user_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_user_editActionPerformed(evt);
            }
        });

        b_user_delete.setText("delete");
        b_user_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_user_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_user_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_user_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_user_add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(b_user_add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(b_user_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_user_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "number", "name", "phone", "type"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton11.setText("search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("الرقم التسلسالي");

        t_u_no.setEditable(false);
        t_u_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t_u_usaeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t_u_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_u_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_u_nameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("اسم المستخدم");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("userName");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("passWord");

        t_u_passWprd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_u_passWprd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_u_passWprdActionPerformed(evt);
            }
        });

        c_u_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "user", "admin" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("نوع المستخدم");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("الهاتف");

        t_u_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_u_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_u_phoneKeyTyped(evt);
            }
        });

        b_user_save.setText("save");
        b_user_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_user_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(t_u_no, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(c_u_type, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t_u_name)
                                            .addComponent(t_u_usaeName)
                                            .addComponent(t_u_passWprd)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(t_u_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel8))))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)))))
                                .addGap(9, 9, 9)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(b_user_save, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_u_no, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_u_usaeName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(t_u_passWprd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_u_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_u_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addComponent(b_user_save, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        c_search_user.setEditable(true);

        javax.swing.GroupLayout pa_userLayout = new javax.swing.GroupLayout(pa_user);
        pa_user.setLayout(pa_userLayout);
        pa_userLayout.setHorizontalGroup(
            pa_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_userLayout.createSequentialGroup()
                .addGroup(pa_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pa_userLayout.createSequentialGroup()
                        .addContainerGap(123, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(c_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))
                    .addGroup(pa_userLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pa_userLayout.setVerticalGroup(
            pa_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pa_userLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pa_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(c_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pa_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(191, 198, 200));

        b_officer_add.setText("add");
        b_officer_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_officer_addActionPerformed(evt);
            }
        });

        b_officer_delete.setText("delete");
        b_officer_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_officer_deleteActionPerformed(evt);
            }
        });

        b_officer_edit.setText("edit");
        b_officer_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_officer_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_officer_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_officer_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_officer_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(b_officer_add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(b_officer_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(b_officer_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("الرقم التسلسلي");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("اسم الضابط");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("منطقه العمل");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("الهاتف");

        t_of_no.setEditable(false);
        t_of_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t_of_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_of_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_of_nameKeyTyped(evt);
            }
        });

        t_of_work.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t_of_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_of_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_of_phoneKeyTyped(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "number", "officer name", "phone", "place"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        b_officer_save.setText("save");
        b_officer_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_officer_saveActionPerformed(evt);
            }
        });

        c_offi_name.setEditable(true);

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa_officersLayout = new javax.swing.GroupLayout(pa_officers);
        pa_officers.setLayout(pa_officersLayout);
        pa_officersLayout.setHorizontalGroup(
            pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_officersLayout.createSequentialGroup()
                .addGap(0, 114, Short.MAX_VALUE)
                .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_officersLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(c_offi_name, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_officersLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t_of_no)
                            .addComponent(t_of_name)
                            .addComponent(t_of_work)
                            .addComponent(t_of_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(pa_officersLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_officersLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(33, 33, 33))))
                    .addGroup(pa_officersLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(b_officer_save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pa_officersLayout.setVerticalGroup(
            pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pa_officersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_offi_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_officersLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pa_officersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(t_of_no, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(t_of_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(t_of_work, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(t_of_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(b_officer_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("الرقم التسلسلس");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("رقم اللوحه");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("نوع المخالفه");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("اسم الضابط");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("حاله المخالفه");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("اسم المستخدم");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("تاريخ المخالفه");

        t_no_p.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_no_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_no_pActionPerformed(evt);
            }
        });
        t_no_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_no_pKeyTyped(evt);
            }
        });

        t_pla_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_pla_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pla_noActionPerformed(evt);
            }
        });
        t_pla_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_pla_noKeyTyped(evt);
            }
        });

        t_user_name_b.setEditable(false);
        t_user_name_b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_user_name_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_user_name_bActionPerformed(evt);
            }
        });

        c_type_breach.setEditable(true);

        c_officer_name.setEditable(true);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "plata number", "date", "breacher type", "money", "user", "officer", "stat"
            }
        ));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        t_search_breach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_search_breachKeyReleased(evt);
            }
        });

        b_breach_save.setText("save");
        b_breach_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_breach_saveActionPerformed(evt);
            }
        });

        b_breach_add.setText("add");
        b_breach_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_breach_addActionPerformed(evt);
            }
        });

        b_breach_edit.setText("edit");
        b_breach_edit.setBorder(new javax.swing.border.MatteBorder(null));
        b_breach_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_breach_editActionPerformed(evt);
            }
        });

        c_b_s.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "false", "true" }));

        b_breach_delete1.setText("search");
        b_breach_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_breach_delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa_breachLayout = new javax.swing.GroupLayout(pa_breach);
        pa_breach.setLayout(pa_breachLayout);
        pa_breachLayout.setHorizontalGroup(
            pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_breachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pa_breachLayout.createSequentialGroup()
                        .addComponent(b_breach_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(t_search_breach, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_breachLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(b_breach_save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pa_breachLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(t_no_p, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(pa_breachLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_breachLayout.createSequentialGroup()
                                .addComponent(t_user_name_b, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_breachLayout.createSequentialGroup()
                                .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pa_breachLayout.createSequentialGroup()
                                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c_type_breach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(c_officer_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(c_b_s, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(4, 4, 4))
                                    .addGroup(pa_breachLayout.createSequentialGroup()
                                        .addComponent(b_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pa_breachLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)))
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_breachLayout.createSequentialGroup()
                                .addComponent(t_pla_no, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(20, 20, 20))))
                    .addGroup(pa_breachLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(b_breach_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_breach_add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pa_breachLayout.setVerticalGroup(
            pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_breachLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_breach_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_breach_add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_search_breach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_breach_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_breachLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(t_no_p, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(t_pla_no, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(28, 28, 28)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(c_type_breach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(c_officer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_b_s, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(pa_breachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(t_user_name_b, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(b_breach_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pa_breachLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("الرقم التسلسلي للمخالفه");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("تاريخ الدفع");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("اسم المستخدم");

        t_pay_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_pay_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_pay_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_pay_noKeyTyped(evt);
            }
        });

        t_pay_name.setEditable(false);
        t_pay_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_pay_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_pay_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pay_nameActionPerformed(evt);
            }
        });

        b_pay_save.setText("save");
        b_pay_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pay_saveActionPerformed(evt);
            }
        });

        d_pay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t_pay_name)
                            .addComponent(t_pay_no, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d_pay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(21, 21, 21))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel22))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(b_pay_save, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_pay_no, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(d_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_pay_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(b_pay_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jButton12.setText("دفع مخالفه");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "number", "date", "money", "user name"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout pa_paybreachLayout = new javax.swing.GroupLayout(pa_paybreach);
        pa_paybreach.setLayout(pa_paybreachLayout);
        pa_paybreachLayout.setHorizontalGroup(
            pa_paybreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_paybreachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pa_paybreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_paybreachLayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_paybreachLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        pa_paybreachLayout.setVerticalGroup(
            pa_paybreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_paybreachLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pa_paybreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_paybreachLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(pa_paybreachLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pa_typebreach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pa_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pa_officers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pa_breach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pa_paybreach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pa_typebreach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pa_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pa_officers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pa_breach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pa_paybreach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_breachNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_breachNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_breachNameActionPerformed

    private void t_breachNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_breachNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_breachNOActionPerformed

    private void t_breachMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_breachMActionPerformed

    }//GEN-LAST:event_t_breachMActionPerformed

    private void b_typebreachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_typebreachActionPerformed
        // TODO add your handling code here:
        pa_typebreach.setVisible(true);
        pa_user.setVisible(false);
        pa_officers.setVisible(false);
        pa_breach.setVisible(false);
        pa_paybreach.setVisible(false);
        titel.setText("انواع المخالفات");
        ////add the data from table breach type to the jtable
         AutoCompleteDecorator.decorate(c_search_type);
        c_search_type.removeAllItems();
         DefaultTableModel model =(DefaultTableModel)jTable1.getModel(); 
        model.setRowCount(0);
        try{
        //conic co =new conic();
        String sql ="select * from breach_type";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next()){
            if(co.rs.getInt(1)==0)
            {continue;}
         Object ary[]={co.rs.getInt(1),co.rs.getString(2),co.rs.getInt(3)};
         model.addRow(ary);
        c_search_type.addItem(co.rs.getString(2));}
         
         }
            catch(SQLException e ){JOptionPane.showMessageDialog(null,"erorr"+e);}
        //////اضافه انواع المخالفات الى combobox
    }//GEN-LAST:event_b_typebreachActionPerformed

    private void b_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_userActionPerformed
        // TODO add your handling code here:
         pa_typebreach.setVisible(false);
        pa_user.setVisible(true);
        pa_officers.setVisible(false);
        pa_breach.setVisible(false);
        pa_paybreach.setVisible(false);
        titel.setText("المستخدمين");
        /////////////// add the data to the jtable and combobox
         AutoCompleteDecorator.decorate(c_search_user);
        c_search_user.removeAllItems();
        
        DefaultTableModel model =(DefaultTableModel)jTable2.getModel(); 
        model.setRowCount(0);
        try{
        //conic co =new conic();
        String sql ="select * from users";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next()){
         Object ary[]={co.rs.getInt(1),co.rs.getString(2),co.rs.getInt(5),co.rs.getString(6)};
         model.addRow(ary);
        c_search_user.addItem(co.rs.getString(2));//add to the combobox
        }
         }
         catch(SQLException e ){JOptionPane.showMessageDialog(null,"erorr"+e);}
        ////////////////
        
        
    }//GEN-LAST:event_b_userActionPerformed

    private void b_officerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_officerActionPerformed
         pa_typebreach.setVisible(false);
        pa_user.setVisible(false);
        pa_officers.setVisible(true);
        pa_breach.setVisible(false);
        pa_paybreach.setVisible(false);
        titel.setText("الضباط");
        ///////
         AutoCompleteDecorator.decorate(c_offi_name);
        c_offi_name.removeAllItems();
         DefaultTableModel model =(DefaultTableModel)jTable3.getModel(); 
        model.setRowCount(0);
        try{
        //conic co =new conic();
        String sql ="select * from officers";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next()){
            if(co.rs.getInt(1)==0)
            {continue;}
         Object ary[]={co.rs.getInt(1),co.rs.getString(2),co.rs.getInt(3),co.rs.getString(4)};
         model.addRow(ary);
        c_offi_name.addItem(co.rs.getString(2));
                        }
        }
         catch(SQLException e ){JOptionPane.showMessageDialog(null,"erorr"+e);}
        
    }//GEN-LAST:event_b_officerActionPerformed

    private void t_pla_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pla_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_pla_noActionPerformed

    private void t_user_name_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_user_name_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_user_name_bActionPerformed

    private void b_breachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_breachActionPerformed
        // TODO add your handling code here:
        pa_typebreach.setVisible(false);
        pa_user.setVisible(false);
        pa_officers.setVisible(false);
        pa_breach.setVisible(true);
        pa_paybreach.setVisible(false);
        titel.setText("المخالفات");
        ////////// add the breach type to the combobox
        c_type_breach.removeAllItems();
        try{
        conic co =new conic();
        String sql ="select * from breach_type";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next())
        {   int n=co.rs.getInt(1);
            String type=co.rs.getString(2);
             if(n==0)
             {continue;}
        c_type_breach.addItem(type);
        }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
       /////////// add the officer name to the combo box
        c_officer_name.removeAllItems();
        try{
        conic co =new conic();
        String sql ="select * from officers";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next())
        {
            int n=co.rs.getInt(1);
        String name=co.rs.getString(2);
        if(n==0)
        {continue;}
        c_officer_name.addItem(name);
        }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
        c_officer_name.setSelectedItem("");
        c_type_breach.setSelectedItem("");
        //////اضافه المخالفات الى الحدول
         DefaultTableModel model =(DefaultTableModel)jTable4.getModel(); 
        model.setRowCount(0);
        try{
        conic co =new conic();
        String sql ="SELECT  breaches.no_s, breaches.stata, breaches.plate_no, breaches.date, breach_type.type_name, breach_type.money, users.user_name, officers.officer_name FROM breach_type  INNER JOIN breaches ON breach_type.type_no = breaches.breach_no INNER JOIN officers ON breaches.officer_no = officers.officer_no INNER JOIN users ON breaches.user_no = users.user_no" ;
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next()){
         Object ary[]={co.rs.getInt("no_s"),co.rs.getInt("plate_no"),co.rs.getDate("date"),co.rs.getString("type_name"),co.rs.getInt("money"),co.rs.getString("user_name"),co.rs.getString("officer_name"),co.rs.getBoolean("stata")};
           model.addRow(ary);
                            }
            }  
         catch(SQLException e ){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_breachActionPerformed

    private void b_user_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_user_addActionPerformed
        //code for make auto number
        try {
               String sql ="select * from users";
               co.rs =co.stmt.executeQuery(sql);               
               int nn=0;
               while(co.rs.next()){
                nn=co.rs.getInt(1);
               }
               nn=nn+1;
               t_u_no.setText(nn+"");
               System.out.println(nn);
           } catch (SQLException e) {JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_user_addActionPerformed

    private void b_user_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_user_saveActionPerformed
        String sql ="insert into users values (?,?,?,?,?,?) ";
try{
           co.pst=co.con.prepareStatement(sql);
           co.pst.setInt(1,parseInt(t_u_no.getText()));
           co.pst.setString(2,t_u_name.getText());
           co.pst.setString(3,t_u_usaeName.getText());
           co.pst.setString(4,t_u_passWprd.getText());
           co.pst.setInt(5,parseInt(t_u_phone.getText()));
           co.pst.setString(6, (String) c_u_type.getItemAt(c_u_type.getSelectedIndex()));
           co.pst.execute();
            JOptionPane.showMessageDialog(null,"Data is saved successfully");}
catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_user_saveActionPerformed

    private void b_user_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_user_deleteActionPerformed
        // code for delete user from the DataBase
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
        String sql ="delete from users where user_no =? ";
         try{
            co.pst=co.con.prepareStatement(sql);
            co.pst.setInt(1,parseInt(t_u_no.getText()));
            co.pst.execute();
            JOptionPane.showMessageDialog(null,"Record Deleted");
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
             }
    }//GEN-LAST:event_b_user_deleteActionPerformed

    private void b_user_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_user_editActionPerformed
       //code for Edit the user information in the DataBase
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update record?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
            int v1=parseInt(t_u_no.getText());
            String v2=t_u_name.getText();
            String v3=t_u_usaeName.getText();
            String v4=t_u_passWprd.getText();
            int v5=parseInt(t_u_phone.getText());
            String v6;
           v6 = (String) c_u_type.getItemAt(c_u_type.getSelectedIndex());
         try{
             String sql= "update OS.USERS set USER_NAME='"+v2+"', USERNAME='"+v3+"', USERPASS='"+v4+"',PHONE="+v5+" ,USER_TYPE='"+ v6+"'where USER_NO="+v1+" ";        
            co.pst=co.con.prepareStatement(sql);
            co.pst.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");
            
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_b_user_editActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         String s=(String) c_search_user.getItemAt(c_search_user.getSelectedIndex());
        try{
        conic co =new conic();
        String sql ="select * from users where user_name='"+s+"'";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next())
        {   t_u_no.setText(co.rs.getInt(1)+"");
            t_u_name.setText(co.rs.getString(2));
            t_u_phone.setText(co.rs.getInt(5)+"");
            c_u_type.setSelectedItem(co.rs.getString(6));
            
        }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
        

// ///////
        /*
           try {
               conic coo =new conic();
               String sql ="select * from user where user_name like '"+t_search_user.getText()+"%'";
               String sql ="select *from user";
              coo.pst=coo.con.prepareStatement(sql);
                co.pst.setString(1,t_search_user.getText());
                coo.rs=coo.pst.executeQuery();
            t_u_no.setText(coo.rs.getInt(1)+"");
            t_u_name.setText(coo.rs.getString(2));
            t_u_phone.setText(coo.rs.getInt(5)+"");
            c_u_type.setToolTipText(co.rs.getString(6));
            
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erorr"+ex);
           }*/
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void b_bayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_bayActionPerformed
        pa_typebreach.setVisible(false);
        pa_user.setVisible(false);
        pa_officers.setVisible(false);
        pa_breach.setVisible(false);
        pa_paybreach.setVisible(true);
        titel.setText("دفع مخالفه");
        /////////////////////////////////add to the table 
        DefaultTableModel model =(DefaultTableModel)jTable5.getModel(); 
        model.setRowCount(0);
        try{
        conic co =new conic();
        String sql ="SELECT breach_bay.no_s, breach_bay.bay_data, breach_type.money, users.user_name FROM breach_bay INNER JOIN breaches ON breach_bay.no_s = breaches.no_s INNER JOIN breach_type ON breaches.breach_no = breach_type.type_no INNER JOIN users ON breach_bay.user_no = users.user_no AND breaches.user_no = users.user_no";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next()){
            if(co.rs.getInt(1)==0)
            {continue;}
         Object ary[]={co.rs.getInt("no_s"),co.rs.getDate("bay_data"),co.rs.getInt("money"),co.rs.getString("user_name")};
         model.addRow(ary);
        c_offi_name.addItem(co.rs.getString(2));
        }
         }
            catch(SQLException e ){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_bayActionPerformed

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed

        try {
               String sql ="select * from OS.BREACH_TYPE";               
               co.rs =co.stmt.executeQuery(sql);               
               int nn=0;
               while(co.rs.next()){
                nn=co.rs.getInt(1);
               }
               nn=nn+1;
               t_breachNO.setText(nn+"");
               System.out.println(nn);
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erorr"+ex);
           }
    }//GEN-LAST:event_b_addActionPerformed

    private void b_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveActionPerformed
        
          String sql ="insert into breach_type values (?,?,?) ";
try{
           co.pst=co.con.prepareStatement(sql);
           co.pst.setInt(1,parseInt(t_breachNO.getText()));
           co.pst.setString(2,t_breachName.getText());
           co.pst.setString(3,t_breachM.getText());
           co.pst.execute();
            JOptionPane.showMessageDialog(null,"Data is saved successfully");
    cleartype();
    }
catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_saveActionPerformed

    private void b_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_changeActionPerformed
        // TODO add your handling code here:
          int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update record?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
            int v1=parseInt(t_breachNO.getText());
            String v2=t_breachName.getText();
              int v3=parseInt(t_breachM.getText());
            
         try{
             String sql= "update OS.breach_type set type_name='"+v2+"', money="+v3+"where type_no="+v1+" ";        
            co.pst=co.con.prepareStatement(sql);
            co.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated");
            
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_b_changeActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
        String sql ="delete from breach_type where type_no =? ";
         try{
            co.pst=co.con.prepareStatement(sql);
            co.pst.setInt(1,parseInt(t_breachNO.getText()));
            co.pst.execute();
            JOptionPane.showMessageDialog(null,"Record Deleted");
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_officer_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_officer_addActionPerformed
     /////auto number
          try {
               String sql ="select * from officers";
               co.rs =co.stmt.executeQuery(sql);               
               int nn=0;
               while(co.rs.next()){
                nn=co.rs.getInt(1);
               }
               nn=nn+1;
               t_of_no.setText(nn+"");
               System.out.println(nn);
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erorr"+ex);
           }
    }//GEN-LAST:event_b_officer_addActionPerformed

    private void b_officer_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_officer_saveActionPerformed
        // TODO add your handling code here:
             String sql ="insert into officers values (?,?,?,?) ";
            try{
           co.pst=co.con.prepareStatement(sql);
           co.pst.setInt(1,parseInt(t_of_no.getText()));
           co.pst.setString(2,t_of_name.getText());
           co.pst.setInt(3,parseInt(t_of_phone.getText()));
           co.pst.setString(4,t_of_work.getText());
           co.pst.execute();
            JOptionPane.showMessageDialog(null,"Data is saved successfully");
            clearofficer();}
            catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_officer_saveActionPerformed

    private void b_officer_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_officer_editActionPerformed
        // TODO add your handling code here:
          int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update record?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
            int v1=parseInt(t_of_no.getText());
            String v2=t_of_name.getText();
            String v3=t_of_phone.getText();
            String v4=t_of_work.getText();
         try{
             String sql= "update OS.officers set officer_name='"+v2+"', officer_phone="+v3+", work_place='"+v4+"'where officer_no="+v1+" ";        
            co.pst=co.con.prepareStatement(sql);
            co.pst.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");
            
        }catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_b_officer_editActionPerformed

    private void b_officer_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_officer_deleteActionPerformed
        // TODO add your handling code here:
          int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
        String sql ="delete from officers where officer_no =? ";
         try{
            co.pst=co.con.prepareStatement(sql);
            co.pst.setInt(1,parseInt(t_of_no.getText()));
            co.pst.execute();
           JOptionPane.showMessageDialog(null,"Record Deleted");
            
            
        }catch(Exception e){JOptionPane.showMessageDialog(null,"erorr"+e);}
        }
    }//GEN-LAST:event_b_officer_deleteActionPerformed

    private void b_breach_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_breach_addActionPerformed
        // TODO add your handling code here:
        t_user_name_b.setText(t_u_m.getText());
            
    }//GEN-LAST:event_b_breach_addActionPerformed

    private void b_breach_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_breach_saveActionPerformed
            int officerNO=0,breachNO=0,userNO;
            userNO=parseInt(t_u_nn.getText());
        ///get the number of the officer
        String n=(String) c_officer_name.getItemAt(c_officer_name.getSelectedIndex());
         try {
               String sql ="select * from officers where officer_name ='"+n+"'";
               
               co.rs =co.stmt.executeQuery(sql);               
               int nn=0;
               while(co.rs.next()){
                nn=co.rs.getInt(1);
               }
               officerNO=nn;
               System.out.println(n+"  "+nn);
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erorr"+ex);
           }
        /////get the number of the breach
         n=(String) c_type_breach.getItemAt(c_type_breach.getSelectedIndex());
        try {
               String sql ="select * from breach_type where type_name ='"+n+"'";
               co.rs =co.stmt.executeQuery(sql);               
               int nn=0;
               while(co.rs.next()){
                nn=co.rs.getInt(1);
               }
               breachNO=nn;
               System.out.println(n+"   "+nn);
           } catch (SQLException ex) {      
              JOptionPane.showMessageDialog(null,"erorr"+ex);
           }
        ///////////
        SimpleDateFormat df;
           df = new SimpleDateFormat("yyyy-MM-dd");
        String d=df.format(b_date.getDate());
        System.out.println(d);
          String sql ="insert into breaches values (?,?,?,?,?,?,?) ";
try{
           co.pst=co.con.prepareStatement(sql);
           co.pst.setInt(1,parseInt(t_no_p.getText()));
           co.pst.setInt(2,parseInt(t_pla_no.getText()));
           co.pst.setString(3,d);
           co.pst.setInt(4,breachNO);
           co.pst.setInt(5,officerNO);
           co.pst.setString(6, "false");
           co.pst.setInt(7,userNO);
           co.pst.execute();
            JOptionPane.showMessageDialog(null,"Data is saved successfully");
            clearbreaches();}
catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
        
    }//GEN-LAST:event_b_breach_saveActionPerformed

    private void t_u_passWprdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_u_passWprdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_u_passWprdActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         Date date=new Date();
        d_pay.setDate(date);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String d = df.format(d_pay.getDate());
        t_pay_name.setText(t_u_m.getText());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void b_search_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_search_typeActionPerformed
        String s=(String) c_search_type.getItemAt(c_search_type.getSelectedIndex());
        try{
        conic co =new conic();
        String sql ="select * from breach_type where type_name='"+s+"'";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next())
        {   t_breachNO.setText(co.rs.getInt(1)+"");
            t_breachName.setText(co.rs.getString(2));
            t_breachM.setText(co.rs.getInt(3)+"");    
        }
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_search_typeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String s=(String) c_offi_name.getItemAt(c_offi_name.getSelectedIndex());
        try{
        conic co =new conic();
        String sql ="select * from officers where officer_name='"+s+"'";
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next())
        {   t_of_no.setText(co.rs.getInt(1)+"");
            t_of_name.setText(co.rs.getString(2));
            t_of_phone.setText(co.rs.getInt(3)+"");
            t_of_work.setText(co.rs.getString(4));
        }
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_breach_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_breach_delete1ActionPerformed
        int plate= parseInt(t_search_breach.getText());
         DefaultTableModel model =(DefaultTableModel)jTable4.getModel(); 
        model.setRowCount(0);
        try{
        conic co =new conic();
        String sql ="SELECT  breaches.no_s, breaches.stata, breaches.plate_no, breaches.date, breach_type.type_name, breach_type.money, users.user_name, officers.officer_name FROM breach_type  INNER JOIN breaches ON breach_type.type_no = breaches.breach_no INNER JOIN officers ON breaches.officer_no = officers.officer_no INNER JOIN users ON breaches.user_no = users.user_no where plate_no="+plate+"and stata=false" ;
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next()){
         Object ary[]={co.rs.getInt("no_s"),co.rs.getInt("plate_no"),co.rs.getDate("date"),co.rs.getString("type_name"),co.rs.getInt("money"),co.rs.getString("user_name"),co.rs.getString("officer_name"),co.rs.getBoolean("stata")};
           model.addRow(ary);
                            }
            }  
         catch(SQLException e ){JOptionPane.showMessageDialog(null,"erorr"+e);}
        
        
        
        
        
    }//GEN-LAST:event_b_breach_delete1ActionPerformed

    private void t_search_breachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_search_breachKeyReleased
          /*int plate= parseInt(t_search_breach.getText());
         DefaultTableModel model =(DefaultTableModel)jTable4.getModel(); 
        model.setRowCount(0);
        try{
        conic co =new conic();
        String sql ="SELECT  breaches.no_s, breaches.stata, breaches.plate_no, breaches.date, breach_type.type_name, breach_type.money, users.user_name, officers.officer_name FROM breach_type  INNER JOIN breaches ON breach_type.type_no = breaches.breach_no INNER JOIN officers ON breaches.officer_no = officers.officer_no INNER JOIN users ON breaches.user_no = users.user_no where plate_no like "+plate+"" ;
        co.pst=co.con.prepareStatement(sql);
        co.rs=co.pst.executeQuery();
        while(co.rs.next()){
         Object ary[]={co.rs.getInt("no_s"),co.rs.getInt("plate_no"),co.rs.getDate("date"),co.rs.getString("type_name"),co.rs.getInt("money"),co.rs.getString("user_name"),co.rs.getString("officer_name"),co.rs.getBoolean("stata")};
           model.addRow(ary);
                            }
            }  
         catch(SQLException e ){JOptionPane.showMessageDialog(null,"erorr"+e);}*/
        
    }//GEN-LAST:event_t_search_breachKeyReleased

    private void b_pay_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pay_saveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df;
           df = new SimpleDateFormat("yyyy-MM-dd");
        String d=df.format(d_pay.getDate());
        String sql ="insert into breach_bay values (?,?,?) ";
try{
           co.pst=co.con.prepareStatement(sql);
           co.pst.setInt(1,parseInt(t_pay_no.getText()));
           co.pst.setString(2,d);
           co.pst.setInt(3,parseInt(t_u_nn.getText()));
           co.pst.execute();
           JOptionPane.showMessageDialog(null,"Data is saved successfully");
           
           ///تعديل جدول المخالفات
            String sql1= "update OS.breaches set stata='true' where no_s="+parseInt(t_pay_no.getText())+"";        
            co.pst=co.con.prepareStatement(sql1);
            co.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated");

clearbay();
}
catch(SQLException e){JOptionPane.showMessageDialog(null,"erorr"+e);}
    }//GEN-LAST:event_b_pay_saveActionPerformed

    private void t_pay_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pay_nameActionPerformed

    }//GEN-LAST:event_t_pay_nameActionPerformed

    private void t_no_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_no_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_no_pActionPerformed

    private void b_breach_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_breach_editActionPerformed
        // TODO add your handling code here:
         int officerNO=0,breachNO=0,userNO;
            userNO=parseInt(t_u_nn.getText());
        ///get the number of the officer
        String n=(String) c_officer_name.getItemAt(c_officer_name.getSelectedIndex());
         try {
               String sql ="select * from officers where officer_name ='"+n+"'";
               co.rs =co.stmt.executeQuery(sql);               
               int nn=0;
               while(co.rs.next()){
                nn=co.rs.getInt(1);
               }
               officerNO=nn;
               System.out.println(n+"  "+nn);
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erorr"+ex);
           }
        /////get the number of the breach
         n=(String) c_type_breach.getItemAt(c_type_breach.getSelectedIndex());
        try {
               String sql ="select * from breach_type where type_name ='"+n+"'";
               co.rs =co.stmt.executeQuery(sql);               
               int nn=0;
               while(co.rs.next()){
                nn=co.rs.getInt(1);
               }
               breachNO=nn;
               System.out.println(n+"   "+nn);
           } catch (SQLException ex) {      
              JOptionPane.showMessageDialog(null,"erorr"+ex);
           }
            //////////////////////        ////
        /*SimpleDateFormat df;
           df = new SimpleDateFormat("yyyy-MM-dd");
        String d=df.format(b_date.getDate());
        System.out.println(d);*/
        /////////////
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update record?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
            int v1=parseInt(t_u_no.getText());
            int v2=parseInt(t_pla_no.getText());
          //  String v3=d;
            int v4=breachNO;
            int v5=officerNO;
            
         try{
             String sql= "update breraches set plate_no="+v2+", breach_no="+v4+",officer_no="+v5+" ,user_no="+ userNO+"where no_s="+v1+" ";        
            co.pst=co.con.prepareStatement(sql);
             System.err.println("ok");
            co.pst.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");
            
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null,"not "+ e);
        }
        }
        
        
    }//GEN-LAST:event_b_breach_editActionPerformed

    private void t_breachNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_breachNameKeyTyped
        justChar(evt);
    }//GEN-LAST:event_t_breachNameKeyTyped

    private void t_breachMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_breachMKeyTyped
            justNumber(evt);
    }//GEN-LAST:event_t_breachMKeyTyped

    private void t_u_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_u_nameKeyTyped
        justChar(evt);
    }//GEN-LAST:event_t_u_nameKeyTyped

    private void t_u_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_u_phoneKeyTyped
        justNumber(evt);
    }//GEN-LAST:event_t_u_phoneKeyTyped

    private void t_of_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_of_nameKeyTyped
        justChar(evt);
    }//GEN-LAST:event_t_of_nameKeyTyped

    private void t_of_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_of_phoneKeyTyped
        justNumber(evt);
    }//GEN-LAST:event_t_of_phoneKeyTyped

    private void t_no_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_no_pKeyTyped
        justNumber(evt);
    }//GEN-LAST:event_t_no_pKeyTyped

    private void t_pla_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_pla_noKeyTyped
        justNumber(evt);
    }//GEN-LAST:event_t_pla_noKeyTyped

    private void t_pay_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_pay_noKeyTyped
        justNumber(evt);
    }//GEN-LAST:event_t_pay_noKeyTyped

    
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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainPage().setVisible(true);
                    //pa_typebreach.setVisible(false);
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"erorr"+ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_add;
    private javax.swing.JButton b_bay;
    private javax.swing.JButton b_breach;
    private javax.swing.JButton b_breach_add;
    private javax.swing.JButton b_breach_delete1;
    private javax.swing.JButton b_breach_edit;
    private javax.swing.JButton b_breach_save;
    private javax.swing.JButton b_change;
    private com.toedter.calendar.JDateChooser b_date;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_officer;
    private javax.swing.JButton b_officer_add;
    private javax.swing.JButton b_officer_delete;
    private javax.swing.JButton b_officer_edit;
    private javax.swing.JButton b_officer_save;
    private javax.swing.JButton b_pay_save;
    private javax.swing.JButton b_save;
    private javax.swing.JButton b_search_type;
    private javax.swing.JButton b_typebreach;
    private javax.swing.JButton b_user;
    private javax.swing.JButton b_user_add;
    private javax.swing.JButton b_user_delete;
    private javax.swing.JButton b_user_edit;
    private javax.swing.JButton b_user_save;
    private javax.swing.JComboBox c_b_s;
    private javax.swing.JComboBox c_offi_name;
    private javax.swing.JComboBox c_officer_name;
    private javax.swing.JComboBox c_search_type;
    private javax.swing.JComboBox c_search_user;
    private javax.swing.JComboBox c_type_breach;
    private javax.swing.JComboBox c_u_type;
    private com.toedter.calendar.JDateChooser d_pay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JPanel pa_breach;
    private javax.swing.JPanel pa_officers;
    private javax.swing.JPanel pa_paybreach;
    private javax.swing.JPanel pa_typebreach;
    private javax.swing.JPanel pa_user;
    private javax.swing.JTextField t_breachM;
    private javax.swing.JTextField t_breachNO;
    private javax.swing.JTextField t_breachName;
    private javax.swing.JTextField t_no_p;
    private javax.swing.JTextField t_of_name;
    private javax.swing.JTextField t_of_no;
    private javax.swing.JTextField t_of_phone;
    private javax.swing.JTextField t_of_work;
    private javax.swing.JTextField t_pay_name;
    private javax.swing.JTextField t_pay_no;
    private javax.swing.JTextField t_pla_no;
    private javax.swing.JTextField t_search_breach;
    private javax.swing.JLabel t_u_m;
    private javax.swing.JTextField t_u_name;
    private javax.swing.JLabel t_u_nn;
    private javax.swing.JTextField t_u_no;
    private javax.swing.JTextField t_u_passWprd;
    private javax.swing.JTextField t_u_phone;
    private javax.swing.JLabel t_u_tt;
    private javax.swing.JTextField t_u_usaeName;
    private javax.swing.JTextField t_user_name_b;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
