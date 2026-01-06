package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class getCategoryDescription {

    // actual code
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         // trying for db connection

        try (Connection con= DriverManager.getConnection(DatabaseUtil.CONNECTION_STRING)){
             
             
             System.out.println("Enter Product_id: ");
             int prodid= sc.nextInt();

             String sql ="SELECT c.CatDesc, AVG(p.Price) AS AvgPrice " +
                         "FROM categories c " +
                         "JOIN products p ON c.CatCode = p.CatCode " +
                         "WHERE c.CatCode = (SELECT CatCode FROM products WHERE ProdId = ?) " +
                         "GROUP BY c.CatDesc";


            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, prodid);
           ResultSet rs = ps.executeQuery();

           // Using ResultSet
           if(rs.next()){

              String desc = rs.getString("CatDesc");
              double avgPrice = rs.getDouble("AvgPrice");

              System.out.println("Description: "+ desc);
              System.out.println("Average Price: "+avgPrice);

           }
           else{
            System.out.println("Product not found");
           }

           rs.close();
           ps.close();
           
            
        } catch (Exception e) {
             e.printStackTrace();
        }
       
sc.close();
       
    }
    }

