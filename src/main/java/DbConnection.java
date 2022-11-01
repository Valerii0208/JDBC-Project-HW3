import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    static Connection connection = null;
    public void connectDataBase() {
        try {
            connection = DriverManager.getConnection(JdbcConstants.URL, JdbcConstants.USERNAME, JdbcConstants.PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
}
