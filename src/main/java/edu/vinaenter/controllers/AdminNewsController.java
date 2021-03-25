package edu.vinaenter.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.vinaenter.model.News;
import edu.vinaenter.service.NewsService;

@SuppressWarnings("unused")
@Controller
@RequestMapping("admin")
public class AdminNewsController {
	@Autowired
	private NewsService newsService;
	
	@GetMapping("index")
	public String index(ModelMap model) {
		List<News> newsList=newsService.getList();
		model.addAttribute("newsList", newsList);
		return "admin/index";
	}
	@GetMapping("add")
	public String add() {
	
		return "admin/add";
	}
}