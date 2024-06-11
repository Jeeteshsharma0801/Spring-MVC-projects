package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
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

}
