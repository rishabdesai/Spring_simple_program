package pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	//controller method to show initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "enter-your-name";
	}
	
	
	// controller method to process the HTML form 
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "greet-the-user";
	}
}
