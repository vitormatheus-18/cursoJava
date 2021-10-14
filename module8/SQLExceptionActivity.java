import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SQLExceptionActivity {

	public static void main(String[] args) {

			String url = "jdbc:mysql://localhost/activity1"; 
			String user = "root";
			String pass = "123456";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn = DriverManager.getConnection(url, user, pass);
                JOptionPane.showMessageDialog(null,  "Connection successfully established!", "verification", JOptionPane.PLAIN_MESSAGE);
				
				cn.close();
			} catch(ClassNotFoundException ex) {

			} catch (SQLException ex) {
				
			}

	}

}
