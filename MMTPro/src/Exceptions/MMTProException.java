package Exceptions;

public class MMTProException extends Exception {
	public MMTProException(String message_)
	{
		super(message_);
	}
	
	public MMTProException(String message_, Throwable throw_)
	{
		super(message_, throw_);
	}
}
