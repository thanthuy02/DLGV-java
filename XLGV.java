/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;
import java.sql.*;
/**
 *
 * @author THANTHUY
 */
public class XLGV {
  
    
    public Connection getCon(){
        Connection conn = null;
            
         try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlgv2", "root", "");
            //System.out.println("Connected");
//            return conn;
        }
        catch (Exception ex){
            //System.out.println("Failed" + ex.getMessage());
            ex.printStackTrace();
        } 
        return conn;
    } 
    
    public void getGV(String Donvi,int SoCT){ 
        Connection con =  getCon();
        String query = "Select * from tbgiangvien2 where Donvi ='"+Donvi+"' and Soct = '"+SoCT+"'";
        
        try{
//            PreparedStatement pstm = con.prepareStatement(query);
//            pstm.setString(1, Donvi);
//            pstm.setInt(2, SoCT);
//            ResultSet rs = pstm.executeQuery();

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
//            Statement stmt = con.createStatement(); // Command
//            ResultSet rs = stmt.executeQuery(query); // Excute
            while(rs.next()){
                int maDD = rs.getInt("MaDD");
                String hoTen = rs.getString("Hoten");
                String gioiTinh = rs.getString("Gioitinh");
                String donVi = rs.getString("Donvi");
                int soCT = rs.getInt("Soct");
                
                System.out.println(maDD +"\t" + hoTen +"\t" + gioiTinh +"\t"+ donVi +"\t" + soCT);
            }
        }
         catch (Exception e) {
            System.out.println("Error." + e);
        }
     
    }
    
   
}
