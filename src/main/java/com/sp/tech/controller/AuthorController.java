package com.sp.tech.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sp.tech.model.Author;
import com.sp.tech.service.AuthorService;
import com.sp.tech.validator.AuthorValidator;

@Controller
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
    
	@GetMapping
	public String authorForm(Model model) {
		model.addAttribute("author", new Author());
		return "authorForm";
	}

	@PostMapping
	public String saveAuthor(@Valid @ModelAttribute Author author, BindingResult result) {
		if (result.hasErrors()) {
			return "authorForm";
		}
		authorService.saveAuthor(author);
		return "redirect:/author/all";
	}
	
	@GetMapping("/all")
	public String showAllAuthor(Model model) {
	 model.addAttribute("authors", authorService.findAllAuthor());
	 return "authors";
	}
	
	//@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new AuthorValidator());
	}

}
