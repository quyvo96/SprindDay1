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
@RequestMapping("tinh-tong")
public class TinhTongController {
	@Autowired
	private NewsService newsService;
	
	@GetMapping("index")
	public String index(ModelMap model) {

		return "tinhtong/index";
	}
	
	@PostMapping("index")
	public String postIndex(ModelMap model, HttpServletRequest request) {
		String number = request.getParameter("number");
		int sum = 0;
		try {
			for(String n:number.split(",")) {
				int num = Integer.parseInt(n);
				sum = sum +num;
			}
		}catch (Exception e) {
			// TODO: handle exception
			String error = "cần nhập dãy số";
			model.addAttribute("error", error);
			return "tinhtong/index";
			
		}
		model.addAttribute("sum", sum);
		return "tinhtong/index";
	}
}