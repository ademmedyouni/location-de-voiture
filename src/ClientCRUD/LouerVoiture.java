/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ClientCRUD;
import Classes.Client;
import Classes.Location;
import com.sun.jdi.StackFrame;
import static java.lang.System.exit;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class LouerVoiture extends javax.swing.JInternalFrame {
    private javax.swing.JDesktopPane jDesktopPane1;
    private Connection con;
    private Client client;
    /**
     * Creates new form LouerVoiture
     */
    public LouerVoiture() {
        initComponents();
    }
    public LouerVoiture(javax.swing.JDesktopPane jDesktopPane1,Connection c,Client cl) {
        this.jDesktopPane1=jDesktopPane1;
        this.con=c;
        this.client=cl;
        initComponents();
        loadMarque();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DateDebut = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        DateFin = new com.toedter.calendar.JDateChooser();
        Marque = new javax.swing.JComboBox<>();
        Model = new javax.swing.JComboBox<>();
        reserverbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel1.setText("Marque = ");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel2.setText("Model = ");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel3.setText("Date Debut =");

        DateDebut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel4.setText("Date Fin =");

        DateFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DateFin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateFinPropertyChange(evt);
            }
        });

        Marque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Marque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarqueActionPerformed(evt);
            }
        });

        Model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        reserverbtn.setBackground(new java.awt.Color(255, 255, 102));
        reserverbtn.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        reserverbtn.setText("RESERVER");
        reserverbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reserverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserverbtnActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Best_cars\\images\\rentcar (1).png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 25)); // NOI18N
        jLabel6.setText("LOUER VOITURE :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Model, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Marque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(reserverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel5)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Marque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(reserverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarqueActionPerformed
    loadModel();
    }//GEN-LAST:event_MarqueActionPerformed

    private void DateFinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateFinPropertyChange
        verifydates();
    }//GEN-LAST:event_DateFinPropertyChange
    public String addlocation(String cin,String matricule , java.util.Date date_debut,java.util.Date date_fin){
        //ajouter une ligne dans la table de location et retourner l'ID de cette location comme String 
        String sql="INSERT INTO location (CIN,matricule,date_debut,date_fin) values (?,?,?,?)";
        java.sql.Date sqlDateDebut = new java.sql.Date(date_debut.getTime());
        java.sql.Date sqlDateFin = new java.sql.Date(date_fin.getTime());
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cin);
            stmt.setString(2, matricule);
            stmt.setDate(3,  sqlDateDebut);
            stmt.setDate(4, sqlDateFin);
            stmt.executeUpdate();
            System.out.println("Data inserted successfully into location table.");
            
            sql="SELECT ID FROM location WHERE cin = ? AND matricule = ? AND date_debut = ? and date_fin = ?";
            stmt.close();
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cin);
            stmt.setString(2, matricule);
            stmt.setDate(3, sqlDateDebut);
            stmt.setDate(4, sqlDateFin);

            
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                return res.getString("ID");
            }else{
                return "";
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LouerVoiture.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
        
    }
    public void resetbtn(){
        DateDebut.setDate(null);
        DateFin.setDate(null);
        
    }
    
    
    private void reserverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserverbtnActionPerformed
        if(!verifydates()){ 
            //verifier si les date sont correctes 
            //elle entre la si les date sont incorrectes
        }else{
        if(Marque.getSelectedItem()==null || Model.getSelectedItem()==null || DateDebut.getDate()== null || DateFin.getDate()==null ){
            JOptionPane.showMessageDialog(null, " veillez verifier tous les champs!!! ", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
            String marque=Marque.getSelectedItem().toString();
            String model=Model.getSelectedItem().toString();
            
            java.util.Date datedeb = DateDebut.getDate();
            java.util.Date datefin = DateFin.getDate();

            // Create a Calendar instance and set it to the datedeb
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(datedeb);
            // Subtract one day from the calendar
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            // Get the updated date from the calendar
            java.util.Date updatedDate = calendar.getTime();//  date debut - 1 day
            
            
            //to get datefin_new = datefin + 1 day
            // Create a Calendar instance and set it to the datedeb
            Calendar calendarfin = Calendar.getInstance();
            calendarfin.setTime(datefin);
            // Subtract one day from the calendar
            calendarfin.add(Calendar.DAY_OF_MONTH, +1);
            // Get the updated date from the calendar
            java.util.Date datefin_new = calendarfin.getTime();//  date fin +1 day

             // Define the date format pattern
            String pattern = "yyyy-MM-dd";

            // Create a SimpleDateFormat object with the pattern
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            String datedeb_initial = dateFormat.format(datedeb);// get a string valiue of datedebut inisial
            //  string datedebut = datedebut - 1 day
            // Format the date to a string
            String datedebut = dateFormat.format(updatedDate);
            String datefin_newstring = dateFormat.format(datefin_new);

            //ALGO DE RECHERCHE D'UNE VOITURE QUI FAVORISE LES VOITURES NOUVEAU (AUCUNE LOCATION AUPARAVANT)
            
            String sql = "SELECT V.matricule FROM voiture V LEFT JOIN location L on V.matricule = L.matricule WHERE V.marque ='"+marque+
                    "' and V.model = '"+model+"' AND V.disponibilite = 'disponible' AND V.etat='en marche' AND  L.id IS null ";
            try {
                Statement stmt = con.createStatement();
                ResultSet res = stmt.executeQuery(sql);
                
                if(res.next()){
                    String matricule_voiture = res.getString("matricule");
                    Location location = new Location(0,client.getCin(),matricule_voiture,datedeb,datefin,null,0,null,null);
                    String id_location =  addlocation(location.getCin(),location.getMatricule(),location.getDateDebut(),location.getDateFin());
                    if(!id_location.isEmpty()){
                        JOptionPane.showMessageDialog(null,"RESERVE AVEC SUCCEE "
                                + "NUM DE VOTRE LOCATION =  "+id_location);
                        resetbtn();
                        //LA RESERVATION EST TERMINE AVEC SUCCE
                    }else{
                        JOptionPane.showMessageDialog(null,"erreur de reservation   !!!");
                    }     
                }else{
                    //si il n y a pas des voitures nouneaux on CHERECHE LES VOITURES A ETAT ( en marche ) QUI SONT DISPONIBLES ENTRE LES DATES DE RESERVATION PRESISER PAR LE CLIENT 
                    //ON FAVORISE LES VOITURE DISPONIBLE QUE LES VOITURE LOUEE (V.disponibilite DESC)
                   sql = "SELECT V.matricule FROM voiture V LEFT JOIN location L on V.matricule = L.matricule WHERE V.marque ='"+marque+
                    "' and V.model = '"+model+
                           "' AND V.etat='en marche' AND  L.date_retour IS NULL  AND V.matricule NOT IN (SELECT L2.matricule FROM location L2 WHERE (L2.date_debut <= '"
                           +datedebut+"' AND '"+datedebut+"' <= L2.date_fin )  OR  ( L2.date_debut <= '"
                           +datefin_newstring+"' AND '"+datefin_newstring+"' <= L2.date_fin) OR (L2.date_debut <= '"
                           +datedebut+"' AND '"+datefin_newstring+"'<= L2.date_fin) OR(L2.date_debut >= '"
                           +datedebut+"' AND '"+datefin_newstring+"' >= L2.date_fin))  ORDER BY V.disponibilite DESC";
                   res.close();
                   //date_retour =  null
                   res= stmt.executeQuery(sql);
                   if(res.next()){
                        String matricule_voiture = res.getString("matricule");
                        Location location = new Location(0,client.getCin(),matricule_voiture,datedeb,datefin,null,0,null,null);
                        String id_location =  addlocation(location.getCin(),location.getMatricule(),location.getDateDebut(),location.getDateFin());
                        if(!id_location.isEmpty()){
                            JOptionPane.showMessageDialog(null,"RESERVE AVEC SUCCEE "
                                    + "NUM DE VOTRE LOCATION  =  "+id_location);
                            resetbtn();
                        }else{
                            JOptionPane.showMessageDialog(null,"erreur de reservation   !!!");
                        }
                    }else{                        
                        JOptionPane.showMessageDialog(null, " pas de voiture dispo pour le moment  desoleee !!! ", "Error", JOptionPane.ERROR_MESSAGE); 
                   }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LouerVoiture.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_reserverbtnActionPerformed
    public boolean verifydates() {
    java.util.Date datedeb = DateDebut.getDate();
    java.util.Date datefin = DateFin.getDate();
    java.util.Date currentDate = new Date();

    if (datefin != null && datedeb != null) {
        // Create Calendar instances
        Calendar currentCal = Calendar.getInstance();
        Calendar debCal = Calendar.getInstance();
        Calendar finCal = Calendar.getInstance();

        // Set time components to 0 for currentDate, datedeb, and datefin
        currentCal.setTime(currentDate);
        currentCal.set(Calendar.HOUR_OF_DAY, 0);
        currentCal.set(Calendar.MINUTE, 0);
        currentCal.set(Calendar.SECOND, 0);
        currentCal.set(Calendar.MILLISECOND, 0);

        debCal.setTime(datedeb);
        debCal.set(Calendar.HOUR_OF_DAY, 0);
        debCal.set(Calendar.MINUTE, 0);
        debCal.set(Calendar.SECOND, 0);
        debCal.set(Calendar.MILLISECOND, 0);

        if (datefin.before(datedeb) || currentCal.after(debCal)) {
            JOptionPane.showMessageDialog(null, "veillez verifier les dates !!!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        
    }

    return true;
}

    public void loadMarque(){
        String sql="SELECT DISTINCT(marque) FROM voiture ";
        
        Statement stmt;
        try {
            stmt = con.createStatement();
            
            ResultSet res = stmt.executeQuery(sql);
            
            while(res.next()){
                Marque.addItem(res.getString("marque"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LouerVoiture.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadModel(){
        Model.removeAllItems();
        String marque = Marque.getSelectedItem().toString();
        
        String sql = "SELECT DISTINCT(model) FROM voiture WHERE marque ='"+marque+"'";
        Statement stmt;
        try {
            stmt = con.createStatement();
            
            ResultSet res = stmt.executeQuery(sql);
            
            while(res.next()){
                Model.addItem(res.getString("model"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LouerVoiture.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateDebut;
    private com.toedter.calendar.JDateChooser DateFin;
    private javax.swing.JComboBox<String> Marque;
    private javax.swing.JComboBox<String> Model;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reserverbtn;
    // End of variables declaration//GEN-END:variables
}
/*
    JOptionPane.showMessageDialog(null,"Bienvenue.....");                     


/*
 SELECT *
 FROM voiture V LEFT JOIN location L on V.matricule = L.matricule 
 WHERE V.marque ='fouart' and V.model = 'madyouni' AND (V.etat = 'disponible' or V.etat = 'reserve')  AND CURDATE() < L.date_fin AND L.date_fin < '2024-04-05'
 and V.matricule not in (
	select L2.matricule
    from location L2
    where  (L2.date_debut <= '2024-04-05' and '2024-04-05' <= L2.date_fin) or (L2.date_debut <= '2024-04-08' and '2024-04-08'<= L2.date_fin)
)
order by V.etat desc;
*/