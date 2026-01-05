package UI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update_product_name {

    // Reusable connection method
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

        try (Connection con = getConnection()) {

            System.out.print("Enter Product ID: ");
            int prodid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            String sql = "UPDATE products SET ProdName= ? WHERE Prodid = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, prodid);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Product updated successfully");
            } else {
                System.out.println("Product ID not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
