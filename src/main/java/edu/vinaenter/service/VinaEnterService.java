
package edu.vinaenter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.vinaenter.model.ArPlace;
@Service
public class VinaEnterService {
	 public List<ArPlace> getList(){
		 ArPlace arPlace1 =new ArPlace(1,"VinaEnter-154 Phạm Như Xương", "12/02/2013", 500);
		 ArPlace arPlace2 =new ArPlace(2,"VinaEnter-52 Ninh Tốn", "13/02/2014", 240);
		 ArPlace arPlace3 =new ArPlace(3,"VinaEnter-5", "14/02/2015", 300);
		 ArPlace arPlace4 =new ArPlace(4,"VinaEnter-263 Tiểu La", "15/02/2017", 280);
		List<ArPlace> arPlaceList= new ArrayList<>();
		arPlaceList.add(arPlace1);
		arPlaceList.add(arPlace2);
		arPlaceList.add(arPlace3);
		arPlaceList.add(arPlace4);
		
		return arPlaceList;
		 
	 }

}
