package edu.vinaenter.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import edu.vinaenter.model.News;
@Service
public class NewsService {
	 public List<News> getList(){
		 News news=new News(1,"Tin tá»©c 1");
			News news2=new News(2,"Tin tá»©c 2");
			News news3=new News(3,"Tin tá»©c 3");
			List<News> newsList= new ArrayList<>();
			newsList.add(news);
			newsList.add(news2);
			newsList.add(news3);
		
		return newsList;
		 
	 }

}