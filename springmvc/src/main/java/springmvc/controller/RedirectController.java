package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	/*
	 * 3 ways to redirect:     1. HttpServletResponse(old one i.e. used in servlet concept)     2. redirect prefix(recommended)     3.Redirect view(recommended)
	 */
	
	
	/*
	//1)HttpServletResponse
	@RequestMapping("/one")
	public String one(HttpServletResponse res)
	{
		try {
			System.out.println("under HttpServletResponse");
			res.sendRedirect("http://www.google.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
		
	}
	*/
	
	
	
	//2)redirect prefix
	@RequestMapping("/one")
	public String one()
	{
		System.out.println("this is first controller");
		return "redirect:/enjoy";
	}
	
	
	/*
	//3) Redirect view
	@RequestMapping("/one")
	public RedirectView one()
	{
		RedirectView redirectview=new RedirectView();
		//redirectview.setUrl("enjoy");
		redirectview.setUrl("https://www.google.com");
		System.out.println("this is first oneeeee controller");
		return redirectview;
	}
	*/
	
	@RequestMapping("/enjoy")
	public String second()
	{
		System.out.println("This is enjoy");
		return "contact";
	}

}
