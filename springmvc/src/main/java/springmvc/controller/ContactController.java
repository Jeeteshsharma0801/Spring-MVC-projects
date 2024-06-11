package springmvc.controller;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		System.out.println("under commonDataForModel");
		m.addAttribute("Header", "Welcome to My Registration page");
		m.addAttribute("desc", "Home for programmer !!!!");
	}
	
	@RequestMapping("/contact")
//	public String showForm(Model m)
	public String showForm()
	{
		System.out.println("under contact");
//		m.addAttribute("Header", "Welcome to My Registration page");
//		m.addAttribute("desc", "Home for programmer");
		return "contact";
	}
	
	
	/*
	//1)
	//1.1) This is the method , where we are fetching the value from our form by using new method i.e. @RequestParam 
	@RequestMapping(path= "/processform" , method = RequestMethod.POST)
	public String handleForm(@RequestParam("userName") String userName , 
			@RequestParam(name="email",required = true) String userEmail , 
			@RequestParam("password") String userPassword , Model model)
	{
		//bydefault the Requestparameter is mandatory , we can make it not required also
		
//		System.out.println("name : "+userName);
//		System.out.println("userEmail : "+userEmail);
//		System.out.println("password : "+userPassword);
		
		User user=new User();
		user.setEmail(userEmail);
		user.setPassword(userPassword);
		user.setUserName(userName);
		
		System.out.println(user);
		
//		model.addAttribute("name1", userName);
//		model.addAttribute("email1", userEmail );
//		model.addAttribute("password1", userPassword);
		
		//sent complete object instead of single-single value.
		model.addAttribute("user", user);
		
		
		return "success";
	}
	
		*/
	
	/*
	 //1.2) This is the method , where we are fetching the value from our form by using old method i.e. HttpServletRequest
	@RequestMapping(path= "/processform" , method = RequestMethod.POST)
	public String handleForm(HttpServletRequest request1)
	{
		String name1=request1.getParameter("userName");
		
		System.out.println("name is : "+name1);
		return "";
	}
	*/
	

	
	// 2)(EASY WAY) Now By using the ModelAttribute , we'll transfer the data from this controller to view page
	@RequestMapping(path= "/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user , Model model)
	{
		//@ModelAttribute User user , by this it will automatically fetch the data from form to here and it'll create 
		//the object of class User i.e. user and store all the form data in this object
		//but the fields name in User class should be same as in name tag of form.
		
		//i.e. this @ModelAttribute tag will automatically save data from form to the automatically created object and also
		//saving this data to Model and transfers to success.jsp page.
		
		
		if(user.getUserName().isEmpty())
		{
			System.out.println("username is empty , therefore returning to contact page");
			return "redirect:/contact";
		}
		System.out.println("name : "+user.getUserName());
		int id=this.userService.createUser(user);
		model.addAttribute("msg", "user created with ID : "+id);
		System.out.println(user);
		
		//No need to add in model , it'll be done by modelAttribute and will be transffer to next controller i..e success.jsp
		//model.addAttribute("user", user);
		
		
		return "success";
	}
	

}
