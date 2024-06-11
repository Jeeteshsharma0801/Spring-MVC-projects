package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class interceptorController {
	
	//to use Interceptor , we made MyInterceptor.class and mapping in spring-servlet.xml of method and intefceptor class
	
	@RequestMapping("/home2")
	public String home2()
	{
		System.out.println("This is home2 controller");
		return "interceptHome";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name , Model m)
	{
		System.out.println("under welcome controller");
		m.addAttribute("name", name);
		return "welcomeInterceptor";
	}
	
	

}
