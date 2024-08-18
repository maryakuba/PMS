package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author oseikwameHans
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            // st.executeUpdate("create table appuser(appuser_pk INT AUTO_INCREMENT PRIMARY KEY,userRole VARCHAR(200),name VARCHAR(200),dob VARCHAR(50),mobileNumber VARCHAR(50),email VARCHAR(200),username VARCHAR(200),password VARCHAR(50),address VARCHAR(200))");
            // st.executeUpdate("insert into appuser(userRole, name, dob, mobileNumber, email, username, password, address) VALUES ('Admin', 'Admin', '18-06-2024', '0000111122', 'admin@gmail.com', 'admin', 'admin', 'Ghana')");
            //st.executeUpdate("CREATE TABLE medicine (medicine_pk INT AUTO_INCREMENT PRIMARY KEY,uniqueId VARCHAR(200),name VARCHAR(200),supplierName VARCHAR(200),quantity BIGINT,price BIGINT)");
            st.executeUpdate("CREATE TABLE bill (bill_pk INT AUTO_INCREMENT PRIMARY KEY,billId VARCHAR(200),billDate VARCHAR(50),totalPaid BIGINT,generatedBy VARCHAR(50))");
            JOptionPane.showMessageDialog(null, "Tables Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

// Create appuser table
/*  String createAppUserTableSQL = "CREATE TABLE appuser ("
                    + "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "userRole VARCHAR(200), "
                    + "name VARCHAR(200), "
                    + "dob VARCHAR(50), "
                    + "mobileNumber VARCHAR(50), "
                    + "email VARCHAR(200), "
                    + "username VARCHAR(200), "
                    + "password VARCHAR(50), "
                    + "address VARCHAR(200))"; */
// Create medicine table
/* String createMedicineTableSQL = "CREATE TABLE medicine ("
                    + "medicine_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "uniqueId VARCHAR(200), "
                    + "name VARCHAR(200), "
                    + "supplierName VARCHAR(200), "
                    + "quantity BIGINT, "
                    + "price BIGINT)"; */
// Create Bill Table
/*   String createBillTableSQL = "CREATE TABLE bill ("
                    + "bill_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "billId VARCHAR(200), "
                    + "billDate VARCHAR(50), "
                    + "totalPaid BIGINT, "
                    + "generatedBy VARCHAR(50) )";
            st.executeUpdate(createBillTableSQL); */
// Uncomment and modify the insert statement if needed
// String insertSQL = "INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) "
//             + "VALUES ('Admin', 'Admin', '18-06-2024', '0000111122', 'admin@gmail.com', 'admin', 'admin', 'Ghana')";
// st.executeUpdate(insertSQL);

/*      JOptionPane.showMessageDialog(null, "Tables Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
 */
