package pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create student object
		Student theStudent = new Student();

		// add student object in to model
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
			
		System.out.println("First name :  "+theStudent.getFirstName());
		System.out.println("Last name :  "+theStudent.getLastName());
		
		
		return "student-confirmation";
	}

}
