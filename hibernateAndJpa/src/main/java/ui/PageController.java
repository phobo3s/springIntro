package ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	
	@GetMapping("/mainPage")
	public String mainPage() {
		return "mainPage.html";
	}
	
	
}
