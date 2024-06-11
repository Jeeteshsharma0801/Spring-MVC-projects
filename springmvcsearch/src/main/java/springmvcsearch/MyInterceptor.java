package springmvcsearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//public class MyInterceptor implements HandlerInterceptor {
	// if we are implementing , therefore its an interface , therefore need to define all the mthds.
	//if wants to use only the ones which we wants  , then will extends an HandlerInterceptorAdaptor class
	
public class MyInterceptor extends HandlerInterceptorAdapter {

	
	//Pre-Interceptor
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String name=request.getParameter("user");
		
		if(name.startsWith("a"))
		{
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid name , Name should not starts with a</h1>");
			System.out.println("in pre interceptor");
			return false;
		}
		
		System.out.println("This is pre handler");
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("under post handler");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("under after completion");
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
	
	

}
