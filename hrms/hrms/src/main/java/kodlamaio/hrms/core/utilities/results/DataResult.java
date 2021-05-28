package kodlamaio.hrms.core.utilities.results;

//... data'yı göndermek istiyorum dedimiz result türü

public class DataResult<T>  extends Result{
	T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);//base sınıfın constructionunu set eder.yeni Result ın contructionu
		this.data=data;
		
	}
	public DataResult(T data,boolean success) {
		super(success);//base sınıfın constructionunu set eder.yeni Result ın contructionu
		this.data=data;
		
	}
	public T getData() {
		return this.data;
	}
	
	//DataResult için iki durum Söz konusu 1. başarılı olma durumu 2. başarısız olma durumu
	//bunun içi iki farklı class yazarız

}
