package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	//arama yapcaz
	Product get(int id);//bir �r�n�
	List<Product> getAll();//�ok �r�n
}
