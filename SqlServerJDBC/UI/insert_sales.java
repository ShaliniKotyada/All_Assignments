package UI;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Scanner;

public class insert_sales {

    // DB connection method
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

        String sql = 
        "INSERT INTO sales (ProdId, Transdate, Qty, Amount) VALUES (?,?,?,?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.println("Enter Sale Transaction Details");

            System.out.print("Enter Product ID: ");
            int prodid = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Amount: ");
            String amtInput = sc.nextLine();
            BigDecimal amount = new BigDecimal(amtInput);

            // Set values
            ps.setInt(1, prodid);
            ps.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            ps.setInt(3, qty);
            ps.setBigDecimal(4, amount);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Sale transaction inserted successfully");
            }

        }
        catch (Exception e) {
            System.out.println("Error inserting sale transaction");
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
}
