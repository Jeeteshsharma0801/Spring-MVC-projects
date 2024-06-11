package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("This is Home URL !! ");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("Its about URL Called !!!!");
		return "about";
	}
	
	//video6
	//using Model to send the the data from controller to view and use it dynamically.
	@RequestMapping("/dynamicData")
	public String dynamic(Model model)
	{
		
		//model.addAttribute("String", object); //it gives object when we get it anywhere , so we need to typecast it .
		model.addAttribute("name","jeetesh sharma");
		
		model.addAttribute("ID",7357);
		
		List<String> friends=new ArrayList<String>();
		friends.add("avi rajput");
		friends.add("Vandana");
		friends.add("anuradha");
		friends.add("Akshay ji");
		model.addAttribute("f", friends);
		
		return "dynamicPage";
	}
	
	//video7
	//use of ModelAndView to send data from controller to our view page
	@RequestMapping("/modelandview")
	public ModelAndView modelandview()
	{
		ModelAndView modelandview=new ModelAndView();
		modelandview.addObject("name", "Jeetesh Sharma Billionarie");
		modelandview.addObject("rollNumber", 405156);
		
		LocalDateTime now=LocalDateTime.now();
		modelandview.addObject("time",now );
		
		modelandview.setViewName("modelandview");
		
		System.out.println("it's under modelandview controller !!!!");
		return modelandview;
	}
	
	//video8
	//shortcut of getting any data from controller to view w/o using request.getParameter() function
	//@RequestMapping("/shortcut")
	@RequestMapping(path="/shortcut",method = RequestMethod.GET)
	public ModelAndView shortcut()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("name", "jeetesh sharma Newgen");
		model.setViewName("shortcut");
		System.out.println("Under shortcut method ");
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(18);
		list1.add(27);
		list1.add(45);
		model.addObject("marks", list1);
		return model;
	}
	
	
}
