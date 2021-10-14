public class CustomExceptionActivity extends Exception{
	
	@Override
	public String getMessage() {
        
		return "You do not have permission";
	}
}