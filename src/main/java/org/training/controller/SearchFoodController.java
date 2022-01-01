package org.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.Food;
import org.training.service.FoodService;
import org.training.service.UserService;
import org.training.service.searchService;

@RestController
public class SearchFoodController {
	@Autowired
	private UserService userService;
	@Autowired
	private FoodService foodService;
	@Autowired
	private searchService searchService;
	
	@GetMapping("/searchFood")
	public ModelAndView searchFoodPage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("searchFood");
		return modelAndView;
	}
	
	
	//search details of hotel
	@PostMapping("/searchFood")
	public ModelAndView searchFoodDetails(ModelAndView modelandview, ModelMap models, @RequestParam String type) {
		//Hotel hotel;
		List<Food> food1 = searchService.searchFood(type);
		System.out.println(food1);
		if(food1!=null)
		{
			models.addAttribute("names",true);
			models.addAttribute("foodname",food1);
			//request.setAttribute("names", hotel);
			modelandview.addObject("foodname", food1);
			modelandview.setViewName("searchFood");
			return modelandview;
		}
		else
		{
			models.addAttribute("error", "no types");
			modelandview.setViewName("searchFood");
			return modelandview;
		}
		
	}
}
