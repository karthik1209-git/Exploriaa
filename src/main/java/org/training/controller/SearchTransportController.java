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
import org.training.entity.Transport;
import org.training.service.FoodService;
import org.training.service.TransportService;
import org.training.service.UserService;
import org.training.service.searchService;

@RestController
public class SearchTransportController {
	@Autowired
	private UserService userService;
	@Autowired
	private TransportService transportService;
	@Autowired
	private searchService searchService;
	
	@GetMapping("/searchTransport")
	public ModelAndView searchFoodPage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("searchTransport");
		return modelAndView;
	}
	
	
	//search details of hotel
	@PostMapping("/searchTransport")
	public ModelAndView searchFoodDetails(ModelAndView modelandview, ModelMap models, @RequestParam String type) {
		//Hotel hotel;
		List<Transport> transport = searchService.searchTransport(type);
		System.out.println(transport);
		if(transport!=null)
		{
			models.addAttribute("names",true);
			models.addAttribute("vname",transport);
			//request.setAttribute("names", hotel);
			modelandview.addObject("vname", transport);
			modelandview.setViewName("searchTransport");
			return modelandview;
		}
		else
		{
			models.addAttribute("error", "no types");
			modelandview.setViewName("searchTransport");
			return modelandview;
		}
		
	}
}
