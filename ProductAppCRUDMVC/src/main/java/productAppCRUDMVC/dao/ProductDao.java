package productAppCRUDMVC.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productAppCRUDMVC.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//create
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//get all products
	public List<Product> getAllProducts()
	{
		List<Product> productList=this.hibernateTemplate.loadAll(Product.class);
		
		return productList;
	}
	
	
	//delete the single product
	@Transactional 
	public void deleteProductById(int pid)
	{
		Product p=this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
		
	}
	
	
	//get the single product
	public Product getProductbyId(int pID)
	{
		Product p=this.hibernateTemplate.get(Product.class, pID);
		return p;
	}
	
	
	

}
