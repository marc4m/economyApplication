/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author giuli
 */
public class AddPC extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    float pesoram;
    float pesogpu;
    float pesocpu;
    float pesoauto;
    float pesorum;
    float pesoschermo;
    /**
     * Creates new form AddPC
     */
    public AddPC() {
        initComponents();
        pesoram = 0.33f;   
        pesocpu= 0.54f;
        pesogpu = 0.13f;
        pesorum = 0.12f;
        pesoschermo = 0.42f;
        pesoauto = 0.46f;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        comboProcessore = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        comboGPU = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboRAM = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboPeso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboRumore = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        comboAutonomia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        textSchermo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textPrezzo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        scalaFuzzy = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        spinnerPeso = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        spinnerPrezzo = new javax.swing.JSpinner();
        spinnerEstetica = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        spinnerCPU = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        spinnerAutonomia = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        spinnerRAM = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        spinnerGPU = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        spinnerSchermo = new javax.swing.JSpinner();
        spinnerRumore = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        buttonCreatePC = new javax.swing.JButton();
        sfond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOME PC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        comboProcessore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "i3", "i5", "i7", "altro" }));
        getContentPane().add(comboProcessore, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PROCESSORE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 30));
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 30));

        comboGPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NVIDIA GeForce GTX 1080 SLI", "NVIDIA GTX 1060 – MSI X3G", "AMD Radeon RX 580", "AMD Radeon RX Vega Mobile", "Intel Iris Pro Graphics P580", "Intel Iris Pro Graphics 580", "Altro" }));
        getContentPane().add(comboGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RAM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 110, 30));

        comboRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 GB", "8 GB", "16 GB", "32 GB", "altro" }));
        getContentPane().add(comboRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SCHEDA GRAFICA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 110, 30));

        comboPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.8", "1", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2" }));
        getContentPane().add(comboPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 50, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PESO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Kg");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 30));

        comboRumore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASSO", "MEDIO", "ALTO" }));
        getContentPane().add(comboRumore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RUMORE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        comboAutonomia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 ore", "7 ore", "8 ore", "9 ore", "10 ore", "11 ore", "12 ore", ">12 ore" }));
        getContentPane().add(comboAutonomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("AUTONOMIA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 110, 30));
        getContentPane().add(textSchermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SCHERMO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, 30));
        getContentPane().add(textPrezzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PREZZO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 110, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VALUTAZIONI FUZZY");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 30));

        scalaFuzzy.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        scalaFuzzy.setForeground(new java.awt.Color(255, 0, 0));
        scalaFuzzy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scalaFuzzy.setText("SCALA FUZZY:  Molto Performante 90-100; Performante 70-90; Sufficiente 50-70; Scarso 30-50; Molto Scarso 0-30  ");
        getContentPane().add(scalaFuzzy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 650, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Peso");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 20));

        spinnerPeso.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Prezzo");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 20));

        spinnerPrezzo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerPrezzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 70, 20));

        spinnerEstetica.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerEstetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Estetica");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 20));

        spinnerCPU.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 70, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Prest. Tecnica");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 90, 30));

        spinnerAutonomia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerAutonomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 70, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Autonomia");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 70, 30));

        spinnerRAM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 70, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("RAM");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 90, 20));

        spinnerGPU.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 70, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("GPU");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 70, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CPU");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 70, 20));

        spinnerSchermo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerSchermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 70, 20));

        spinnerRumore.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinnerRumore, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 70, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Schermo");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 70, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Rumore");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 70, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Comfort");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 70, 30));

        buttonCreatePC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCreatePC.setText("AGGIUNGI!");
        buttonCreatePC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreatePCActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCreatePC, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, 40));

        sfond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Immagini/sfondo.jpg"))); // NOI18N
        getContentPane().add(sfond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreatePCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreatePCActionPerformed
           
        String sql = "SELECT MAX(ID)+1 FROM COMPUTER_FUZZY";
        int id  = 0;
        con = Database.getConnection();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next())
               id=rs.getInt(1);
          ps.close();
        
        Float peso = Float.parseFloat(spinnerPeso.getValue().toString());
        Float prezzo = Float.parseFloat(spinnerPrezzo.getValue().toString());
        Float ram= Float.parseFloat(spinnerRAM.getValue().toString());
        Float cpu = Float.parseFloat(spinnerCPU.getValue().toString());
        Float gpu = Float.parseFloat(spinnerGPU.getValue().toString());
        Float schermo = Float.parseFloat(spinnerSchermo.getValue().toString());
        Float autonomia = Float.parseFloat(spinnerPeso.getValue().toString());
        Float rumore= Float.parseFloat(spinnerPrezzo.getValue().toString());
        Float estetica = Float.parseFloat(spinnerPeso.getValue().toString());
        if(peso != 0 && prezzo != 0 && ram!=0 && cpu != 0 && gpu != 0 && schermo != 0 && autonomia != 0 && rumore != 0 && estetica != 0 && textNome.getText().trim().length()!= 0 && textSchermo.getText().trim().length() != 0 && textPrezzo.getText().trim().length()!=0)
        {
            String sql2 = "INSERT INTO COMPUTER_FUZZY VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
            ps = con.prepareStatement(sql2);
            ps.setInt(1,id);
            ps.setFloat(2,peso);
            ps.setFloat(3,prezzo);
            ps.setFloat(4,(ram*pesoram) + (cpu*pesocpu )+ (gpu*pesogpu));
            ps.setFloat(5,ram);
            ps.setFloat(6,cpu);
            ps.setFloat(7,gpu);
            ps.setFloat(8,(schermo*pesoschermo)+(autonomia*pesoauto)+(rumore*pesorum));
            ps.setFloat(9,schermo);
            ps.setFloat(10,autonomia);
            ps.setFloat(11,rumore);
            ps.setFloat(12,estetica);
            ps.setInt(13,id);
            ps.executeUpdate();
            ps.close();
        
      
            String nome = textNome.getText();
            Float peso2 = Float.parseFloat(comboPeso.getSelectedItem().toString());
            Float prezzo2 = Float.parseFloat(textPrezzo.getText());
            String ram2 = comboRAM.getSelectedItem().toString();
            String cpu2 = comboProcessore.getSelectedItem().toString();
            String gpu2 = comboGPU.getSelectedItem().toString();
            String schermo2 = textSchermo.getText();
            String autonomia2= comboAutonomia.getSelectedItem().toString();
            String rumore2 = comboRumore.getSelectedItem().toString();


            String sql3 = "Insert into computer values(?,?,?,?,?,?,?,?,?,?,?,?);";
            ps = con.prepareStatement(sql3);
            ps.setString(1,nome);
            ps.setFloat(2,peso2);
            ps.setFloat(3,prezzo2);
            ps.setString(4,ram2);
            ps.setString(5,cpu2);
            ps.setString(6,gpu2);
            ps.setString(7,schermo2);
            ps.setString(8,autonomia2);
            ps.setString(9,rumore2);
            ps.setInt(10,id); //da fare dentro fuzzy l'id
            ps.setInt(11,id);
            ps.executeUpdate();

            con.close();
            ps.close();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Errore : campi vuoti o settati a 0. Riprova inserendo valori valid","[ERRORE]",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(SQLException ex)
        {
            String msg = ex.getMessage();
           JOptionPane.showMessageDialog(this,"Errore: "+msg,"[ERRORE]",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCreatePCActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreatePC;
    private javax.swing.JComboBox<String> comboAutonomia;
    private javax.swing.JComboBox<String> comboGPU;
    private javax.swing.JComboBox<String> comboPeso;
    private javax.swing.JComboBox<String> comboProcessore;
    private javax.swing.JComboBox<String> comboRAM;
    private javax.swing.JComboBox<String> comboRumore;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel scalaFuzzy;
    private javax.swing.JLabel sfond;
    private javax.swing.JSpinner spinnerAutonomia;
    private javax.swing.JSpinner spinnerCPU;
    private javax.swing.JSpinner spinnerEstetica;
    private javax.swing.JSpinner spinnerGPU;
    private javax.swing.JSpinner spinnerPeso;
    private javax.swing.JSpinner spinnerPrezzo;
    private javax.swing.JSpinner spinnerRAM;
    private javax.swing.JSpinner spinnerRumore;
    private javax.swing.JSpinner spinnerSchermo;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPrezzo;
    private javax.swing.JTextField textSchermo;
    // End of variables declaration//GEN-END:variables
}
