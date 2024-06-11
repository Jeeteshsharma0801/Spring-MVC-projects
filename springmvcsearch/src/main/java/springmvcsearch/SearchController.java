package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("going to home view !!!! ");
				
		return "home";
	}
	
	
	
//	with the help of @requestparam , we taken value of the text box of form to here in controller and with the help
//	of RedirectView , we redirected to google.com from this controller.
	@RequestMapping("/search") 
	public RedirectView search(@RequestParam("querybox") String query)
	{
		
		String url="https://www.google.com/search?q="+query;
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
	
	
	
	
	//use of @pathvariable annotation
	@RequestMapping("/user/{userid}/{username}")
	public String getUserDetails(@PathVariable("userid") int id , @PathVariable("username") String uname)
	{
		System.out.println("userid is : "+id);
		Integer.parseInt(uname);
		
		return "home";
	}
	
	
	/*
	
	//HANDLING EXCEPTION
	
	
	//METHOD 1 : handling 2,3 or all exceptions in single ExceptionHandler
	//@ExceptionHandler
	//public String exceptionHandlerNull() , this will handle all types of exception which occurs in this controller
	//@ExceptionHandler({NullPointerException.class , NumberFormatException.class})
	//this will handle only these mentioned types of exception , which occurs in this controller
	//public String exceptionHandlerNull1()
	//{
	//	return "null_page";
	//}
	
	
	
	//sending a status code also
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	//METHOD 2 : handling different-different exceptions in diff-diff controller
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHanderNull(Model m)
	{
		m.addAttribute("msg", "Null pointer exception occured !");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionhanderNumberFormat(Model m)
	{
		m.addAttribute("msg", "Number format exception has occured !");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	//if we dont know , later which type of exception can occur .
	//therefore we'll made a generic exception handler , this will handle all types of exception in this controller
	@ExceptionHandler(value = Exception.class)
	public String exceptionHanderGeneric(Model m)
	{
		m.addAttribute("msg", "Exception has occurred");
		return "null_page";
	}
	
	*/

}
