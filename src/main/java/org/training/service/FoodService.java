package org.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.training.entity.Food;
import org.training.repository.FoodRepository;

@Component
public class FoodService {
	@Autowired
	private FoodRepository foodRepository;
	
	//Adding new Hotel
	public boolean saveHotel(Food food, String foodname) {
		if(foodRepository.findById(foodname).isPresent())
		{
			return true;
		}
		else
		{
			foodRepository.save(food);
			return false;
		}
		
	}
	
	//update Hotel details
	public boolean updateHotel(Food food, String foodname) {
		if(foodRepository.findById(foodname)!=null)
		{
			foodRepository.delete(food);
			foodRepository.save(food);
			return true;
		}
		else
		{
			return false;
		}
	}
}
