package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	private ProductDao productDao;//hibernate kullanmak istiyoruz ancak doðrudan newleyemeyizProductManager bu inteface i kullanacaðýný biliyor
	//contructer ile enjekte ederiz
	
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		//hibernate in referansýný tutar:ProductDao productDao
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//iþ kodlarý
		this.productDao.add(product);//hibernate e baðýmlýlýðým yok
		this.loggerService.logToSystem("Ürün eklendi : "+product.getName());//gel main e 
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
