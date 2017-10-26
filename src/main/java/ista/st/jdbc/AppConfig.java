package ista.st.jdbc;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	final static String URL = "jdbc:mariadb://localhost:3306/introjdbc?user=root&password=";
	2. final static String USER = "root";
	13. final static String PASSWD = "";
	final static String INSERT = "INSERT INTO PRODUITS(ID, NOM, CATEGORIE, PRIX, DESCRIPTION) VALUES (?, ?, ?, ?, ?)";
	final static String DELETE = "DELETE FROM PRODUITS";
	final static String SELECT = "SELECT ID, NOM, CATEGORIE, PRIX, DESCRIPTION FROM PRODUITS";
	final static String UPDATE = "UPDATE PRODUITS SET PRIX=PRIX*1.1 WHERE CATEGORIE=?";
	final static String INSERT2 = "INSERT INTO PRODUITS(ID, NOM, CATEGORIE, PRIX, DESCRIPTION) VALUES (100,'X',1,1,'x')";
	final static String DRIVER_CLASSNAME = "org.mariadb.jdbc.Driver";
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName(DRIVER_CLASSNAME);
		dataSource.setUrl(URL);
		dataSource.setInitialSize(1);
		return dataSource;
	}
	
}
