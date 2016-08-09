package klassen;

public class TunenException extends RuntimeException{
	
	public TunenException(){
	}
	
	public TunenException(String msg){
		super(msg);
	}
	
	public TunenException(Throwable t){
		super(t);
	}
	
	public TunenException(String msg, Throwable t){
		super(msg, t);
	}

}
