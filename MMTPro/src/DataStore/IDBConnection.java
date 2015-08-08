package DataStore;

import Data.IData;
import Exceptions.MMTProDBException;

public interface IDBConnection<T> {
	void open() throws MMTProDBException;
	void close() throws MMTProDBException;
	IData<T> execute(String sql_) throws MMTProDBException;
}
