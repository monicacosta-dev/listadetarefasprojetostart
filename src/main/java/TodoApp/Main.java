
package TodoApp;

import java.sql.Connection;
import util.ConnectionFactory;

/**
 *
 * @author User
 */
public class Main {

    private static Connection Connection;
  
    public static void main(String[] args) {
           
        Connection c = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection(c);
                    
    }
    
}
