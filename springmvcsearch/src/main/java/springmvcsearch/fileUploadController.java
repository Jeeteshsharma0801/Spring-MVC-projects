package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class fileUploadController {
	
	@RequestMapping("/fileUploadform") 
	public String showUploadForm()
	{
		return "fileUploadform";
	}
	
	
	//will upload any image by using the CommonsMultipartFile .
	@RequestMapping(value="/uploadimage" , method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file , HttpSession session , Model m)
	{
		System.out.println("under File upload handler controller !!!!");
		System.out.println("size: "+file.getSize()+" , contentType: "+file.getContentType()+" , originalFileName : "+file.getOriginalFilename()+" . name: "+file.getName()+" , originalFileName : "+file.getOriginalFilename());
		
		//the file data will be stored in this array data
		byte [] fileData=file.getBytes();
		
		//now will have to save this data to any server location , i.e. will save this data using httpsession
		String path=session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		
		System.out.println("path : "+path);
		
		
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(fileData);
			fos.close();
			System.out.println("File uploaded successfully through FileOutputStream");
			m.addAttribute("msg", "uploaded successfully !!!! ");
			m.addAttribute("filename", file.getOriginalFilename());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in uploading file through FileOutputStream");
			m.addAttribute("msg", "uploading error !!!! ");
		}
		
		return "fileSuccess";
	}

}
