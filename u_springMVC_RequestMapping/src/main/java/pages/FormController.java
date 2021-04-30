package pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {

	//controller method to show initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "form-to-enter-name";
	}
	
	

}
