package Exceptions;

public class MMTProDBException extends MMTProException {
	public MMTProDBException(String message_)
	{
		super(message_);
	}
	public MMTProDBException(String message_, Throwable throw_)
	{
		super(message_, throw_);
	}
}
