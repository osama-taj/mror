/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
class conic {
    public PreparedStatement pst=null;
      public String host="jdbc:derby://localhost:1527/projectDB";
      public String uname="os";
      public String upass="os";
      public Connection con =DriverManager.getConnection(host, uname, upass);
      public ResultSet rs;
      public Statement stmt;
     

    public conic() throws SQLException {
        this.stmt = con.createStatement();
    }
}
