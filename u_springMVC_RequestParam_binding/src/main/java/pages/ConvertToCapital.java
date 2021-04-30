package pages;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertToCapital {

	@RequestMapping("/capitalLetters")
	public String toCapital(HttpServletRequest request, Model model) {
		//read request parameters from the form
		String theName = request.getParameter("name");
		
		//convert to capital letters
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hello ---> "+theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		
		return "greet-in-capital-letters";
	}
	
	
	@RequestMapping("/capitalLettersUsingRequestParams")
	public String capitalLettersUsingRequestParams(@RequestParam("name") String theName, Model model) {
		
		
		//below step is not requited as above method takes care of request parameter
		//String theName = request.getParameter("name");
		
		//convert to capital letters
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hello ---> "+theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		
		return "greet-in-capital-letters";
	}
	
	
}
