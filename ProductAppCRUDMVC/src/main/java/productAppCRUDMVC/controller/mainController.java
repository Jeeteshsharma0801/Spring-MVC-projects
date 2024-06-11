package productAppCRUDMVC.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productAppCRUDMVC.dao.ProductDao;
import productAppCRUDMVC.model.Product;

@Controller
public class mainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
		List<Product> products=productDao.getAllProducts();
		m.addAttribute("product", products);
		
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}
	
	@RequestMapping(value="/handle-product" , method =RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product , HttpServletRequest request)
	{
		RedirectView redirectView=new RedirectView();
		productDao.createProduct(product);
		redirectView.setUrl(request.getContextPath()+"/");
		System.out.println("path : "+request.getContextPath());
		System.out.println("product : "+product);
		return redirectView;
	}
	
	
	//delete product
	@RequestMapping("/delete/{productID}")
	public RedirectView deleteProduct(@PathVariable("productID") int id , HttpServletRequest request)
	{
		productDao.deleteProductById(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{id}")
	public String updateProductByID(@PathVariable("id") int id , HttpServletRequest request , Model m)
	{
		Product product = productDao.getProductbyId(id);
		m.addAttribute("product1", product);
		return "update_form";
	}
	

}
