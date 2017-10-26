package ista.st.jdbc;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class IntroJDBC01 {
	final static String insert = "INSERT INTO PRODUITS(ID, NOM, CATEGORIE, PRIX, DESCRIPTION) VALUES (?, ?, ?, ?, ?)";
	final static String delete = "DELETE FROM PRODUITS";
	final static String select = "SELECT ID, NOM, CATEGORIE, PRIX, DESCRIPTION FROM PRODUITS";
	final static String update = "UPDATE PRODUITS SET PRIX=PRIX*1.1 WHERE CATEGORIE=?";
	final static String insert2 = "INSERT INTO PRODUITS(ID, NOM, CATEGORIE, PRIX, DESCRIPTION) VALUES (100,'X',1,1,'x')";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
		// traiter l'exception
			System.out.println("Class not found");
		}
		Connection connect = null;
	    Statement statement = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    try {
	    	connect = DriverManager.getConnection("jdbc:mariadb://localhost:3306/introjdbc?user=root&password=");
	    	connect.setAutoCommit(false);
	    	connect.setReadOnly(true);
	    	preparedStatement = connect.prepareStatement("SELECT ID, NOM, CATEGORIE, PRIX, DESCRIPTION FROM PRODUITS");
	    	resultSet = preparedStatement.executeQuery();
	    	System.out.println("Liste des produits : ");
	    	while (resultSet.next()) {
	    		System.out.println(new Produit(resultSet.getInt(1), resultSet.getInt(3), resultSet.getString(5), resultSet.getString(2),
	    				resultSet.getDouble(4)));
	    	}
	    }catch (SQLException e1) {
	    	System.out.println(e1.getMessage());
	    }finally {
	    	if (connect != null) {
	    		try {
	    			connect.close();
	    		}catch (SQLException e1) {
	    	    	System.out.println(e1.getMessage());
	    	    }
	    	}
	    }

	}
	private static void delete() {
		
	}
	private static void insert() {
		
	}
	private static void update() {
		
	}
	private static void insert2() {
		
	}
	private static void select() {
		
	}

}
