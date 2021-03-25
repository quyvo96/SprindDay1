package edu.vinaenter.controllers;

import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.vinaenter.model.News;

@SuppressWarnings("unused")
@Controller

public class IndexController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index(Model model) {
		
		String username = "Quoc";
		String fullname="Le Van Quoc";
		model.addAttribute("username", username);
		model.addAttribute("fullname", fullname);
		//set obj
		News news =new News();
		news.setId(1);
		news.setTitle("Trúng số");
		news=null;
		model.addAttribute("news", news);
		
		return "index";
	}

}
