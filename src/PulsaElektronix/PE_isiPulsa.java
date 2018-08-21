package PulsaElektronix;

import java.awt.*;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import javax.swing.*;

/**
 * @author Wiguna Ramadhan
 * @kelas X - RPL 2
 * @sekolah SMKN 1 CIBINONG
 */
public class PE_isiPulsa extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static LinkedList<PE_data> link = new LinkedList<PE_data>();
    Iterator<PE_data> itr = link.iterator();
    
    String provider, jumlah, harga;
    
    int i = 0;
    int saldo = 0;
    int timeRun = 0;
    
    
    public void add(String provider, String jumlah, String harga){
        link.add (new PE_data (provider, jumlah, harga));
        
    }
    
    void data() {
        output_harga.setText(link.get(i).getharga());
    }
    
    public PE_isiPulsa() {
        initComponents();
        setIcon();
        
        new Thread(){
            @Override
            public void run(){
                while(timeRun == 0){
                        Calendar cal = new GregorianCalendar();
                        
                        int day = cal.get(Calendar.DAY_OF_WEEK);
                        String hari = "";
                        switch (day) {
                            case 1:
                                hari = "Minggu";
                                break;
                            case 2:
                                hari = "Senin";
                                break;
                            case 3:
                                hari = "Selasa";
                                break;
                            case 4:
                                hari = "Rabu";
                                break;
                            case 5:
                                hari = "Kamis";
                                break;
                            case 6:
                                hari = "Jum'at";
                                break;
                            default:
                                hari = "Sabtu";
                                break;
                        }
                        int tanggal = cal.get(Calendar.DATE);
                        int tahun = cal.get(Calendar.YEAR);
                        int jam = cal.get(Calendar.HOUR_OF_DAY);
                        int menit = cal.get(Calendar.MINUTE);
                        int detik = cal.get(Calendar.SECOND);
                        int AM_PM = cal.get(Calendar.AM_PM);
                        String siang_malam = "";
                        if(AM_PM == 0){
                            siang_malam = "AM";
                        }else{
                            siang_malam = "PM";
                        }
                        
                        String time = hari + "," + " " + tanggal + " " + tahun + " || " + jam + ":" + menit + ":" + detik + " " + siang_malam;
                        timeDate.setText(time);
                    
                }
            }
        }.start();
        
        link.add(new PE_data("Telkomsel", "Rp 5000", "Rp 6500"));
        link.add(new PE_data("Telkomsel", "Rp 10.000", "Rp 12.000"));
        link.add(new PE_data("Telkomsel", "Rp 25.000", "Rp 27.000"));
        link.add(new PE_data("Telkomsel", "Rp 50.000", "Rp 52.000"));
        link.add(new PE_data("Telkomsel", "Rp 100.000", "Rp 102.000"));
        link.add(new PE_data("Indosat", "Rp 5000", "Rp 6500"));
        link.add(new PE_data("Indosat", "Rp 10.000", "Rp 11.500"));
        link.add(new PE_data("Indosat", "Rp 25.000", "Rp 26.500"));
        link.add(new PE_data("Indosat", "Rp 50.000", "Rp 51.500"));
        link.add(new PE_data("Indosat", "Rp 100.000", "Rp 101.500"));
        link.add(new PE_data("XL", "Rp 5000", "Rp 6500"));
        link.add(new PE_data("XL", "Rp 10.000", "Rp 11.000"));
        link.add(new PE_data("XL", "Rp 25.000", "Rp 26.000"));
        link.add(new PE_data("XL", "Rp 50.000", "Rp 51.000"));
        link.add(new PE_data("XL", "Rp 100.000", "Rp 101.000"));
        link.add(new PE_data("Axis", "Rp 5000", "Rp 6500"));
        link.add(new PE_data("Axis", "Rp 10.000", "Rp 11.500"));
        link.add(new PE_data("Axis", "Rp 25.000", "Rp 26.000"));
        link.add(new PE_data("Axis", "Rp 50.000", "Rp 51.500"));
        link.add(new PE_data("Axis", "Rp 100.000", "Rp 102.500"));
        link.add(new PE_data("Smartfren", "Rp 5000", "Rp 6500"));
        link.add(new PE_data("Smartfren", "Rp 10.000", "Rp 11.000"));
        link.add(new PE_data("Smartfren", "Rp 25.000", "Rp 25.500"));
        link.add(new PE_data("Smartfren", "Rp 50.000", "Rp 51.000"));
        link.add(new PE_data("Smartfren", "Rp 100.000", "Rp 101.000"));
    }
   
    public void CurrentDate(){
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        label_operator = new javax.swing.JLabel();
        operator = new javax.swing.JComboBox();
        label_nominal = new javax.swing.JLabel();
        jumlah_nominal = new javax.swing.JComboBox();
        label_nomor_tujuan = new javax.swing.JLabel();
        nomor_tujuan = new javax.swing.JTextField();
        button_kirim = new javax.swing.JButton();
        label_harga = new javax.swing.JLabel();
        output_harga = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasil_kirim = new javax.swing.JTextArea();
        button_back = new javax.swing.JButton();
        timeDate = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pulsa Elektronix || Isi Pulsa");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel1.setText("ISI PULSA");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label_operator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_operator.setText("Operator");

        operator.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Telkomsel", "Indosat", "XL", "Axis", "Smartfren" }));
        operator.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                operatorPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        operator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operatorMouseClicked(evt);
            }
        });
        operator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorActionPerformed(evt);
            }
        });

        label_nominal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nominal.setText("Jumlah Nominal :");

        jumlah_nominal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rp 5000", "Rp 10.000", "Rp 25.000", "Rp 50.000", "Rp 100.000" }));
        jumlah_nominal.setToolTipText("");
        jumlah_nominal.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jumlah_nominalPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jumlah_nominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_nominalActionPerformed(evt);
            }
        });

        label_nomor_tujuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nomor_tujuan.setText("Nomor Tujuan : ");
        label_nomor_tujuan.setToolTipText("");

        nomor_tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomor_tujuanActionPerformed(evt);
            }
        });

        button_kirim.setText("Kirim");
        button_kirim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kirimActionPerformed(evt);
            }
        });

        label_harga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_harga.setText("Harga :");

        output_harga.setEditable(false);
        output_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output_hargaActionPerformed(evt);
            }
        });

        hasil_kirim.setEditable(false);
        hasil_kirim.setColumns(20);
        hasil_kirim.setRows(5);
        jScrollPane2.setViewportView(hasil_kirim);

        button_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PulsaElektronix/back.png"))); // NOI18N
        button_back.setText("BACK");
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });

        timeDate.setFont(new java.awt.Font("DS-Digital", 0, 24)); // NOI18N
        timeDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(104, 110, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jumlah_nominal, javax.swing.GroupLayout.Alignment.LEADING, 0, 113, Short.MAX_VALUE)
                                    .addComponent(operator, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_nominal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_operator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label_nomor_tujuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomor_tujuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(output_harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_kirim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_operator, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(operator, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(output_harga))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nomor_tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jumlah_nominal, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(nomor_tujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_kirim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jumlah_nominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_nominalActionPerformed
        
    }//GEN-LAST:event_jumlah_nominalActionPerformed

    private void nomor_tujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomor_tujuanActionPerformed
        
    }//GEN-LAST:event_nomor_tujuanActionPerformed

    private void operatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorActionPerformed
        
    }//GEN-LAST:event_operatorActionPerformed

    private void button_kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kirimActionPerformed
        try{
        if( output_harga.getText().isEmpty() == true && nomor_tujuan.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Isi Nomor Tujuan!");
        } else {
            String sql = "INSERT into db_epulsa.tbl_kirim(id, provider, jumlah_nominal, harga, nomor_tujuan) VALUES(null,'"+(link.get(i).getprovider())+"','"+(link.get(i).getjumlah())+"','"+(link.get(i).getharga())+"','"+nomor_tujuan.getText()+"')";
            pst = conn.prepareStatement(sql);
        
            JOptionPane.showMessageDialog(null, "Data Berhasil Masuk Ke Database");
            pst.execute();
            
            hasil_kirim.setText("Berhasil Mengirim Pulsa ke Nomor "+nomor_tujuan.getText()+" Melalui COEG CELL\n"+(link.get(i).getprovider())+"\nJumlah Nominal : "+(link.get(i).getjumlah())+"\nTotal Harga : "+(link.get(i).getharga()));
            operator.setSelectedItem(0);
            jumlah_nominal.setSelectedItem(0);
            output_harga.setText(null);
            nomor_tujuan.setText("+62");
            
        }
        }catch(SQLException ex){    
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        /* try{
        String sql = "SELECT from admin where username=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, input_username.getText()); //username from PKL_login.java.
        rs = pst.executeQuery();
        if(rs.next()){
            int saldo_java, saldo_mysql, total;
            
            saldo_java = Integer.parseInt(link.get(i).getsaldo());
            saldo_mysql = Integer.parseInt(rs.getString("saldo"));
            
            total = saldo_mysql - saldo_java;
            
            String update_saldo = "UPDATE admin set saldo='"+total+"'";
            pst = conn.prepareStatement(update_saldo);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sisa Saldo Anda : '"+rs.getString("saldo")+"'");
        }else{
            JOptionPane.showMessageDialog(null, "Cannot Update Your Balance");
        }
        }catch(SQLException | NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }*/
    }//GEN-LAST:event_button_kirimActionPerformed

    private void output_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output_hargaActionPerformed

    }//GEN-LAST:event_output_hargaActionPerformed

    private void operatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operatorMouseClicked
       
    }//GEN-LAST:event_operatorMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = MySQLConnection.ConnectDb();
    }//GEN-LAST:event_formWindowOpened

    private void operatorPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_operatorPopupMenuWillBecomeInvisible
        try{
        output_harga.setText(link.get(i).getharga());
        int x = operator.getSelectedIndex();
        int y = jumlah_nominal.getSelectedIndex();
        nomor_tujuan.setText("+62");
        //Kombinasi 2 jComboBox
        if (x==0 && y==0){
            i = 0;
            saldo = 5000;
            data();
        }
        else if (x==0 && y==1){
            i =1;
            saldo = 10000;
            data();
        }
        else if (x==0 && y==2){
            i =2;
            saldo = 25000;
            data();
        }
        else if (x==0 && y==3){
            i =3;
            saldo = 50000;
            data();
        }
        else if (x==0 && y==4){
            i =4;
            saldo = 100000;
            data();
        }
        else if (x==1 && y==0){
            i =5;
            saldo = 5000;
            data();
        }
        else if (x==1 && y==1){
            i =6;
            saldo = 10000;
            data();
        }
        else if (x==1 && y==2){
            i =7;
            saldo = 25000;
            data();
        }
        else if (x==1 && y==3){
            i =8;
            saldo = 50000;
            data();
        }
        else if (x==1 && y==4){
            i =9;
            saldo = 100000;
            data();
        }
        else if (x==2 && y==0){
            i =10;
            saldo = 5000;
            data();
        }
        else if (x==2 && y==1){
            i =11;
            saldo = 10000;
            data();
        }
        else if (x==2 && y==2){
            i =12;
            saldo = 25000;
            data();
        }
        else if (x==2 && y==3){
            i =13;
            saldo = 50000;
            data();
        }
        else if (x==2 && y==4){
            i =14;
            saldo = 100000;
            data();
        }
        else if (x==3 && y==0){
            i =15;
            saldo = 5000;
            data();
        }
        else if (x==3 && y==1){
            i =16;
            saldo = 10000;
            data();
        }
        else if (x==3 && y==2){
            i =17;
            saldo = 25000;
            data();
        }
        else if (x==3 && y==3){
            i =18;
            saldo = 50000;
            data();
        }
        else if (x==3 && y==4){
            i =19;
            saldo = 100000;
            data();
        }
        else if (x==4 && y==0){
            i =20;
            saldo = 5000;
            data();
        }
        else if (x==4 && y==1){
            i =21;
            saldo = 10000;
            data();
        }
        else if (x==4 && y==2){
            i =22;
            saldo = 25000;
            data();
        }
        else if (x==4 && y==3){
            i =23;
            saldo = 50000;
            data();
        }
        else if (x==4 && y==4){
            i =24;
            saldo = 100000;
            data();
        }else {
            JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan/Terjadi Kesalahan");
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_operatorPopupMenuWillBecomeInvisible

    private void jumlah_nominalPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jumlah_nominalPopupMenuWillBecomeInvisible
        try{
        output_harga.setText(link.get(i).getharga());
        int x = operator.getSelectedIndex();
        int y = jumlah_nominal.getSelectedIndex();
        nomor_tujuan.setText("+62");
        //Kombinasi 2 jComboBox
        if (x==0 && y==0){
            i = 0;
            saldo = 5000;
            data();
        }
        else if (x==0 && y==1){
            i =1;
            saldo = 10000;
            data();
        }
        else if (x==0 && y==2){
            i =2;
            saldo = 25000;
            data();
        }
        else if (x==0 && y==3){
            i =3;
            saldo = 50000;
            data();
        }
        else if (x==0 && y==4){
            i =4;
            saldo = 100000;
            data();
        }
        else if (x==1 && y==0){
            i =5;
            saldo = 5000;
            data();
        }
        else if (x==1 && y==1){
            i =6;
            saldo = 10000;
            data();
        }
        else if (x==1 && y==2){
            i =7;
            saldo = 25000;
            data();
        }
        else if (x==1 && y==3){
            i =8;
            saldo = 50000;
            data();
        }
        else if (x==1 && y==4){
            i =9;
            saldo = 100000;
            data();
        }
        else if (x==2 && y==0){
            i =10;
            saldo = 5000;
            data();
        }
        else if (x==2 && y==1){
            i =11;
            saldo = 10000;
            data();
        }
        else if (x==2 && y==2){
            i =12;
            saldo = 25000;
            data();
        }
        else if (x==2 && y==3){
            i =13;
            saldo = 50000;
            data();
        }
        else if (x==2 && y==4){
            i =14;
            saldo = 100000;
            data();
        }
        else if (x==3 && y==0){
            i =15;
            saldo = 5000;
            data();
        }
        else if (x==3 && y==1){
            i =16;
            saldo = 10000;
            data();
        }
        else if (x==3 && y==2){
            i =17;
            saldo = 25000;
            data();
        }
        else if (x==3 && y==3){
            i =18;
            saldo = 50000;
            data();
        }
        else if (x==3 && y==4){
            i =19;
            saldo = 100000;
            data();
        }
        else if (x==4 && y==0){
            i =20;
            saldo = 5000;
            data();
        }
        else if (x==4 && y==1){
            i =21;
            saldo = 10000;
            data();
        }
        else if (x==4 && y==2){
            i =22;
            saldo = 25000;
            data();
        }
        else if (x==4 && y==3){
            i =23;
            saldo = 50000;
            data();
        }
        else if (x==4 && y==4){
            i =24;
            saldo = 100000;
            data();
        }else {
            JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan/Terjadi Kesalahan");
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jumlah_nominalPopupMenuWillBecomeInvisible

    private void button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
            new PE_welcome().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_button_backActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_back;
    private javax.swing.JButton button_kirim;
    private javax.swing.JTextArea hasil_kirim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jumlah_nominal;
    private javax.swing.JLabel label_harga;
    private javax.swing.JLabel label_nominal;
    private javax.swing.JLabel label_nomor_tujuan;
    private javax.swing.JLabel label_operator;
    private javax.swing.JTextField nomor_tujuan;
    private javax.swing.JComboBox operator;
    private javax.swing.JTextField output_harga;
    private javax.swing.JLabel timeDate;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}