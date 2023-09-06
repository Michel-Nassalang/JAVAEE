package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDB extends DataBase{
	
	
	

	public static UserDB isValidLogin( String pseudo, String mdp ) {
		
        try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
        		/*String strSql = "SELECT * FROM T_Users WHERE login='" 
                            + login + "' AND password='" + password + "'";*/
            String strSql = "SELECT * FROM Users WHERE pseudo=? AND mdp=?";
            try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
                statement.setString( 1, pseudo );
                statement.setString( 2, mdp );
                try ( ResultSet resultSet = statement.executeQuery() ) {
                    if ( resultSet.next() ) {
                        return new UserDB(
                        );
                    } else {
                        return null;
                    }
                }
            }
        } catch ( Exception exception ) {
            throw new RuntimeException( exception );
        }
    }

}
