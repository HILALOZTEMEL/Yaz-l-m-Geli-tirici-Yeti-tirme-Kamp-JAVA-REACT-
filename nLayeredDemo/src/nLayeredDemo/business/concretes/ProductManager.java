package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	private ProductDao productDao;//hibernate kullanmak istiyoruz ancak do�rudan newleyemeyizProductManager bu inteface i kullanaca��n� biliyor
	//contructer ile enjekte ederiz
	
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		//hibernate in referans�n� tutar:ProductDao productDao
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//i� kodlar�
		this.productDao.add(product);//hibernate e ba��ml�l���m yok
		this.loggerService.logToSystem("�r�n eklendi : "+product.getName());//gel main e 
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
