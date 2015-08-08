package Data;

public interface IData<T> {
	T get();
	default boolean isEmpty() { return true; }	
}
