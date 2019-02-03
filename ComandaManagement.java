/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.proiect.poo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author soare
 */
public class ComandaManagement extends javax.swing.JFrame {
     private OrdrManagement o;
     private FilaChitanta r;
    private String srcName;
    private String modName;
    private String modPrice;
    private String ModQuantity;
    private int pass;
    protected PlatiManagement b;
    private PrintWriter pw;
    /**
     * Creates new form OrderManagement
     */
    public ComandaManagement() {
        initComponents();
        performFileRelatedTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        modText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        reciptArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(204, 204, 204));
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        backButton.setText("Înapoi");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Plata");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        modifyButton.setText("Comanda");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        view.setText("Vezi");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Care este ID-ul ?");

        jLabel4.setText("Ce cantitate?");

        checkButton.setText("Adauga la Comanda");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(modText))
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(modText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkButton)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(view)
                .addGap(18, 18, 18)
                .addComponent(modifyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view)
                    .addComponent(modifyButton)
                    .addComponent(jButton1)
                    .addComponent(backButton))
                .addGap(23, 23, 23))
        );

        reciptArea.setBackground(new java.awt.Color(255, 153, 102));
        reciptArea.setColumns(20);
        reciptArea.setRows(5);
        jScrollPane2.setViewportView(reciptArea);

        jLabel2.setText("Nume");

        jLabel3.setText("Preț");

        jLabel5.setText("Cantitate");

        totalPriceField.setEditable(false);
        totalPriceField.setBackground(new java.awt.Color(255, 204, 51));

        jLabel6.setText("ID");

        jLabel8.setText("Pret");

        jLabel7.setText("Cantitate");

        jLabel10.setText("Nume");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalPriceField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private void performFileRelatedTask()
    {
        o = new OrdrManagement();
       
    }
    
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
            // TODO add your handling code here:
            o = new OrdrManagement();
            text.setText(o.getFullNames().toString());
        
    }//GEN-LAST:event_viewActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        
       // o.delete();
        PlatiManagement b = new PlatiManagement();
        this.dispose();
        b.setVisible(true);
        
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        RestaurantManagement im = new RestaurantManagement();
        im.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        
        b= new PlatiManagement();
        b.setVisible(true);
          this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
     public void reciptArea(){
         String n,q;
       try {
           Scanner sc= new Scanner(new FileInputStream("temp.txt"));
            while(sc.hasNextLine()){
                n=sc.nextLine();
                q =sc.nextLine();
               // setSrchName(n);
               // setQuantity(quantity);
                
              reciptArea.setText(n+"\t"+ q+"\n");
                
                
            
            }
            System.out.println("S-a citit fisierul temporar");
            sc.close();
        } catch (Exception e) {
        }
    }
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        srcName=modText.getText(); //ID
       // o.setSrchName(srcName);
        ModQuantity=mQuantity.getText(); // Quantity
        //o.setQuantity(ModQuantity);
        if(Integer.decode(ModQuantity)>o.checkQuantity(Integer.decode(srcName))){
        
        JOptionPane.showMessageDialog(this, "Ne pare rau, acest articol nu este în stock");
        mQuantity.setText("");
        
        } else {
            pass =Integer.decode(ModQuantity);
            o.temp(Integer.decode(srcName),pass);
            modText.setText("");

            mQuantity.setText("");
            System.out.println("va fi modificat "+srcName);
            System.out.println("va fi modificat "+pass);
            
           
             r = new FilaChitanta();
            reciptArea.setText(r.getFullNames().toString());
            totalPriceField.setText("Pret Total : "+r.getSum().toString());
            try {
               pw = new PrintWriter(new FileOutputStream("comanda.txt",true));
                pw.println(r.getName());
                pw.println(r.getQuantity());
                pw.println(r.getMulti());
                pw.close();
            } catch (Exception e) {
            }
            //JOptionPane.showMessageDialog(this, "Order ");
        //}
        
        
        
        
        
    }//GEN-LAST:event_checkButtonActionPerformed
    }
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
            java.util.logging.Logger.getLogger(ComandaManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComandaManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComandaManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComandaManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComandaManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mQuantity;
    private javax.swing.JTextField modText;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextArea reciptArea;
    private javax.swing.JTextArea text;
    private javax.swing.JTextField totalPriceField;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}



class OrdrManagement {
  //  protected OrderManagement o = new OrderManagement();
    private Scanner scan;
    private String srchName;
private int num=1;
   private String s1,s2;

    private String name;
    private int cngQuantity;
    
    private String price;
    private String quantity;
    private StringBuilder fullnames;
    private String itemName [];
    private StringBuilder reciptName;
    public OrdrManagement()
    {
        fullnames = new StringBuilder();
        openFile();
        readFile();
        
        closeFile();
        
    }
    
    public StringBuilder getFullNames()
    {
        return fullnames;
    }
    public StringBuilder getReciptName()
    {
        return reciptName ;
    }
    private void openFile()
    {
        try
        {
            scan = new Scanner(new File("articole.txt"));
            System.out.println("Fisierul a fost Gasit!");
        }
        
        catch(Exception e)
        {
            System.out.println("Fisierul nu a fost Gasit");
        }
    }
    
    public void setSrchName(String srchName) {
        this.srchName = srchName;
    }
     public String getSrchName() {
        return srchName;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getQuantity() {
        return quantity;
    }
    
    
    private void readFile()
            
    {
        try{
            while(scan.hasNextLine())
        {
            name = scan.nextLine();
            price = scan.nextLine();
            quantity=scan.nextLine();
            fullnames.append(num+"\t"+name + " \t" + price + " \t"+quantity+"\n");
            num++;
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void closeFile()
    {
        scan.close();
    }
    
    public  void ModifyItem(){
        String srcKey=getSrchName();
        System.out.println(srcKey +" va fi modificat ca si cantitate");
        
        System.out.println(srcKey+"va fi modificat");
        
        
        int c=0,track, cnt=0,temp=0;
        
        try{
            Scanner sc = new Scanner(new FileInputStream("articole.txt"));
            while(sc.hasNextLine()){
                cnt++;
                sc.nextLine();
                
            }
            itemName= new String[cnt];
            sc.close();
            sc = new Scanner(new FileInputStream("articole.txt"));
            while(sc.hasNextLine()){
                itemName[c]=sc.nextLine();
                if(itemName[c].equalsIgnoreCase(srcKey)){
                    temp=c;
                    System.out.println("Indexul va fi sters" +c);
                }
                c++;
                
            }
            
            
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("articole.txt"));
            for (int i = 0; i < c; i++) {
                if(i==temp+2){
                    cngQuantity= Integer.decode(itemName[i]);
                    
                    cngQuantity=cngQuantity-Integer.decode(getQuantity());
                    pw.println(cngQuantity);
                    System.out.println("Valoarea a fost schimbata ");
                    
                }
                else{
                    pw.println(itemName[i]);
                }
                
            }
            System.out.println("Articolul a fost șters.");
            pw.close();
        }
        catch (Exception e) {
        }
        
      
    }
    
    public int checkQuantity(int n){
        int i=1;
        int quantity;
        int count;
         try{
            Scanner sc = new Scanner(new FileInputStream("articole.txt"));
            while(sc.hasNextLine()){
                if(i==n){
                    sc.nextLine();sc.nextLine();
                    quantity=Integer.decode(sc.nextLine());
                    return quantity;
                } else {
                sc.nextLine();
                sc.nextLine();
                sc.nextLine();
            }
                i++;
            }
            sc.close();
            }
        catch(Exception e){
            System.out.println(e);
            
        }
         return 0;
    }
    public void temp(int n, int i) {
        
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("temp.txt",true));
            
         Scanner sc = new Scanner(new FileInputStream("articole.txt"));
            for(int j=1;sc.hasNextLine(); j++){
                if (j==n){
                 s1 = sc.nextLine();
                 pw.println(s1);
                 
                 s2 = sc.nextLine();
                 pw.println(i);
                 sc.nextLine();
                } else {sc.nextLine();sc.nextLine();sc.nextLine();}
            }
            sc.close();
            pw.close();
       /*         
        
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("temp.txt",true));
            pw.println(s1);
            pw.println(s2);
            pw.close();
            
        } catch (Exception e) {
            System.out.println("New File has been created with values ");
        }
               */
        
                    
        } catch (Exception e) {}
        //delete();
    }
    public void delete(){
        String name ="";
        String quantity="";
        try {
            Scanner sc= new Scanner(new FileInputStream("temp.txt"));
            while(sc.hasNextLine()){
                name=sc.nextLine();
                quantity =sc.nextLine();
                setSrchName(name);
                setQuantity(quantity);
                ModifyItem();
                
                
            
            }
            System.out.println("Am ajuns la finalul fisierului temporar");
            sc.close();
        } catch (Exception e) {
        }
    
    }
    
    public void readRecipt(){
        
        try{
            Scanner sc = new Scanner(new FileInputStream("temp.txt"));
            while(sc.hasNextLine())
            {
                name = sc.nextLine();
                //price = scan.nextLine();
                quantity=sc.nextLine(); // + " \t"+quantity+
                reciptName.append(name + " \t" + quantity +"\n");
            }
          sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
    
}

