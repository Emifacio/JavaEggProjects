/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package guia15;
import java.sql.*;
//import javax.xml.bind.DatatypeConverter;
import java.util.*;
//import java.security.*;
/**
 *
 * @author Wendy
 */
public class Guia15 {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/guia15";
    private static final String DB_USER = "usuarioguia15";
    private static final String DB_PASSWORD = "rootguia15";
            
    public static void main(String[] args) throws SQLException {
        Scanner leer = new Scanner(System.in);
        Connection conn = null;
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        //System.out.println("Conexión exitosa");
        
//        while (resultSet.next()) {
//            String nombre_empresa = resultSet.getString("nombre_empresa");
//            String cant_empleados = resultSet.getString("cant_empleados");
//            System.out.println("La empresa " + nombre_empresa + " cuenta con " + cant_empleados + " empleados.");
//        }
        System.out.println("");
        
        String query2 = "INSERT INTO empresa (nombre_empresa, cant_empleados) VALUES ('Establecimiento 1890',150)";
        PreparedStatement statement2 = conn.prepareStatement(query2);
        statement2.executeUpdate();
        String query = "SELECT * FROM empresa";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            String nombre_empresa = resultSet.getString("nombre_empresa");
            String cant_empleados = resultSet.getString("cant_empleados");
            System.out.println("La empresa " + nombre_empresa + " cuenta con " + cant_empleados + " empleados.");
        }
        
        System.out.println("Ingrese nombre de la base de datos");
        String empresa = leer.next();
                System.out.println("Ingrese cantidad mínima de empleados de la empresa buscada");
        String cant = leer.next();
        String sql = "SELECT * FROM ? WHERE cant_empleados > ?";
        PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, empresa);
            pst.setString(2, cant);
        
        ResultSet rst = pst.executeQuery();
        while (rst.next()) {
            String nombre_empresa = rst.getString("nombre_empresa");
            String cant_empleados = rst.getString("cant_empleados");
            System.out.println("La empresa " + nombre_empresa + " cuenta con " + cant_empleados + " empleados.");
            
        }
            
    }
    
}
//String sql = "SELECT ID" +
//              " FROM some_table" +
//             " WHERE col1 " + (entry1 != null ? "= ?" : "IS NULL") +
//               " AND col2 " + (entry2 != null ? "= ?" : "IS NULL") +
//               " AND col3 " + (entry3 != null ? "= ?" : "IS NULL");
//try (PreparedStatement pst = con.prepareStatement(sql)) {
//    int paramIdx = 0;
//    if (entry1 != null)
//        pst.setString(++paramIdx, entry1);
//    if (entry2 != null)
//        pst.setString(++paramIdx, entry2);
//    if (entry3 != null)
//        pst.setString(++paramIdx, entry3);
//    try (ResultSet rs = pst.executeQuery()) {
//        ...
//    }
//}
//pst.setString(1, entry1);
//pst.setString(2, entry2);
//pst.setString(3, entry3)