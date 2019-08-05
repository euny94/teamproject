package day04_03;

import java.sql.Connection;

public interface ConnectionProvider {

	public Connection getConnection();
}
