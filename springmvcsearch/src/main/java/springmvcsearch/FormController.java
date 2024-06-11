package springmvcsearch;

import java.text.Normalizer.Form;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm()

	{
		return "complex_form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	/*
	 * public String formHandler(@RequestParam("name") String name
	 * , @RequestParam("id") Long id)
	 */
	public String formHandler(@ModelAttribute("student") Student student, BindingResult bindingresult) 
	{
		/*
		BindingResult: This will help us in getting the errors from from if any.
		e.g. In ID feild , we have to enter numbers only , bcoz they will be converted to Long later when saved from form
		and submitted from Form.
		and if we given any string then it'll be non-convertable , therefore BindingResult will handle this
        */
		 if(bindingresult.hasErrors()) 
		 { 
			 return "complex_form"; 
		 }
		 
		System.out.println("Student : " + student);
		System.out.println("address : " + student.getAddress());
		System.out.println("name : " + student.getName());
		System.out.println("ID is : " + student.getId());

		return "success";
	}

}
