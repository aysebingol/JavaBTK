package throwDemo;

public class BalanceInsufficentException extends Exception{
	String message;
	public BalanceInsufficentException(String messsage) {
		this.message = messsage;
	}
	@Override
	public String getMessage() {
		return this.message;
	}	
}
