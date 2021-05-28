package kodlamaio.hrms.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	//mesaj  döndürmeyelim only true or false
	public Result(boolean success) {
		this.success=success;//controllerda kullanılır
	}
	
	public Result(boolean success,String message) {
		this(success);
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
}

