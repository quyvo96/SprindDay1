package edu.vinaenter.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.vinaenter.model.ArPlace;
import edu.vinaenter.model.News;
import edu.vinaenter.service.NewsService;
import edu.vinaenter.service.VinaEnterService;

@SuppressWarnings("unused")
@Controller
@RequestMapping("vina-enter")
public class VinaEnterController {
	@Autowired
	private VinaEnterService vinaService;
	
	@GetMapping("index")
	public String index(ModelMap model) {
		List<ArPlace> arPlaceList = vinaService.getList();
		model.addAttribute("arPlaceList", arPlaceList);
		return "vinaenter/index";
	}
	@PostMapping("add")
	public String add() {
	
		return "vinaenter/index";
	}
}