package SQLiteDataStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import DataStore.IDBConnection;
import DataStore.IData;
import Exceptions.MMTProDBException;

public class SQLiteDBConnection implements IDBConnection<SQLiteData> {
	private Connection _conn = null;
	private String _fileName;
	
	public SQLiteDBConnection(String fileName_)
	{
		_fileName = fileName_;
	}
	@Override
	public void open() throws MMTProDBException {
		try
		{
			Class.forName("org.sqlite.JDBC");
			_conn = DriverManager.getConnection("jdbc:sqlite:" + _fileName);
		}
		catch(SQLException e)
		{
			throw new MMTProDBException("Error Opening connection: " + e.getMessage(), e);
		}
		catch(ClassNotFoundException e)
		{
			throw new MMTProDBException("Error Loading Class: " + e.getMessage(), e);
		}
	}

	@Override
	public void close() throws MMTProDBException {
		try
		{
			_conn.close();
		}
		catch(SQLException e)
		{
			throw new MMTProDBException("Error Opening connection: " + e.getMessage(), e);
		}
	}
	
	@Override
	public IData<SQLiteData> execute(String sql_) throws MMTProDBException {
		try 
		{
			Statement stmt = _conn.createStatement();;
			stmt.executeUpdate(sql_);
		    stmt.close();
		}
		catch(SQLException e)
		{
			throw new MMTProDBException("Error running statement: " + e.getMessage(), e);
		}
		return null;
	}

}
