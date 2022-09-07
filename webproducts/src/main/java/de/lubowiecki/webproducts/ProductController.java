package de.lubowiecki.webproducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired // Spring instanziert das Objekt und weist es automatisch zu
	ProductRepository repo;
	
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("products", repo.findAll());
		return "index";
	}
	
	@RequestMapping("/new")
	public String productForm(Model model) {
		return "form";
	}
	
	@RequestMapping("/save")
	public String save(Product p) {
		repo.save(p);
		return "redirect:/";
	}
}
