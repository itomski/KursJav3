package de.lubowiecki.webproducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		model.addAttribute("product", new Product());
		return "form";
	}
	
	@RequestMapping("/save")
	public String save(Product p) {
		repo.save(p);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		Product p = repo.findById(id).orElse(new Product());
		model.addAttribute("product", p);
		return "form";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/";
	}
}
