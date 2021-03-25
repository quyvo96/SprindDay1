package edu.vinaenter.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.vinaenter.model.News;
import edu.vinaenter.service.NewsService;

@SuppressWarnings("unused")
@Controller
@RequestMapping("cauchao")
public class CauChaoController {
	@Autowired
	private NewsService newsService;
	
	@GetMapping("index")
	public String index(ModelMap model) {

		return "cauchao/index";
	}
	
	@PostMapping("index")
	public String postIndex(ModelMap model, HttpServletRequest request) {
		String name = request.getParameter("name");
		String abc ="123";
		
		model.addAttribute("name", name);
		model.addAttribute("abc", abc);
		return "cauchao/index";
	}


}