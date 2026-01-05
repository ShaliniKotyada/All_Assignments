package UI;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insert_product {

    public static Connection getConnection() throws Exception{
        String url = "jdbc:sqlserver://localhost:1433;"
                   + "databaseName=productSales;"
                   + "encrypt=true;"
                   + "trustServerCertificate=true";

        String user = "sa";
        String password = "ServerSql#876";
        return DriverManager.getConnection(url, user, password);
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        try(Connection con= getConnection()){
        
        System.out.println("Enter Product Details");


        System.out.println("Enter Product Name: ");
        String prodName = sc.nextLine();

        System.out.println("Enter Product price: ");
        BigDecimal prodPrice = sc.nextBigDecimal();
        sc.nextLine();

        System.out.println("Enter Product Qoh: ");
        int prodQoh = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product Remarks: ");
        String prodRemarks= sc.nextLine();

        System.out.println("Enter Product CatCode: ");
        String prodCatCode= sc.nextLine();

        String sql= "INSERT INTO products (ProdName, Price, Qoh, Remarks, CatCode) VALUES(?,?,?,?,?)";

        PreparedStatement ps= con.prepareStatement(sql);
        ps.setString(1,prodName);
        ps.setBigDecimal(2, prodPrice);
        ps.setInt(3, prodQoh);
        ps.setString(4, prodRemarks);
        ps.setString(5, prodCatCode);

        int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Product updated successfully");
            } else {
                System.out.println("Cannot update Product");
            }
        }

        
        
        catch(Exception e){
            e.printStackTrace();
        }
    }

    }
