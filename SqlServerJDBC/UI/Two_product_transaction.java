 package UI;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Scanner;
   

public class Two_product_transaction {

    // DB connection
    public static Connection getConnection() throws Exception {

        String url = "jdbc:sqlserver://localhost:1433;"
                   + "databaseName=productSales;"
                   + "encrypt=true;"
                   + "trustServerCertificate=true";

        String user = "sa";
        String password = "ServerSql#876";
        return DriverManager.getConnection(url, user, password);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Connection con = null;

        String sql =
        "INSERT INTO sales (Prodid, Transdate, Qty, Amount) VALUES (?,?,?,?)";
             
        try {
            con = DriverManager.getConnection(DatabaseUtil.CONNECTION_STRING);

            // Disable auto-commit
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter details for Product 1");
            System.out.print("Product ID: ");
            int p1 = sc.nextInt();

            System.out.print("Quantity: ");
            int q1 = sc.nextInt();

            System.out.print("Amount: ");
            BigDecimal a1 = sc.nextBigDecimal();

            // Insert product 1
            ps.setInt(1, p1);
            ps.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            ps.setInt(3, q1);
            ps.setBigDecimal(4, a1);
            ps.executeUpdate();

            System.out.println("Enter details for Product 2");
            System.out.print("Product ID: ");
            int p2 = sc.nextInt();

            System.out.print("Quantity: ");
            int q2 = sc.nextInt();

            System.out.print("Amount: ");
            BigDecimal a2 = sc.nextBigDecimal();

            // Insert product 2
            ps.setInt(1, p2);
            ps.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            ps.setInt(3, q2);
            ps.setBigDecimal(4, a2);
            ps.executeUpdate();

            // If both inserts succeed
            con.commit();
            System.out.println(" Transaction committed successfully");

        }
        catch (Exception e) {

            System.out.println(" Error occurred, rolling back transaction");

            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }
        finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true);
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sc.close();
        }
    }
}


