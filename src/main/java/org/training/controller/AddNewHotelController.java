package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.Food;
import org.training.entity.Hotel;
import org.training.entity.Transport;
import org.training.service.FoodService;
import org.training.service.HotelService;
import org.training.service.TransportService;
import org.training.service.UserService;

@RestController
public class AddNewHotelController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private HotelService hotelService;

	@Autowired
	private FoodService foodService;
	

	@Autowired
	private TransportService transportService;

	@GetMapping("/adminDashboard")
	public ModelAndView addNewHotelPage() {
		
		return new ModelAndView("adminDashboard");
	}
	
	@GetMapping("/addHotel")
	public ModelAndView addHotelPage(ModelAndView modelAndView, Hotel hotel) {
		modelAndView.addObject("hotel", hotel);
		modelAndView.setViewName("addHotel");
		return modelAndView;
	}
	
	
	//Adding details of new hotel by admin
	@PostMapping("/addHotel")
	public ModelAndView addHotelDetails(ModelAndView modelandview, @ModelAttribute Hotel hotel, @RequestParam String hotelname, ModelMap models) {
		
		System.out.println("hotelname: " + hotel.getHotelname());
		//save new hotel details
		boolean status = hotelService.saveHotel(hotel, hotelname);
		if(status==true)
		{
				models.addAttribute("erroradd", "Hotel With same name exists");
				modelandview.setViewName("addHotel");
		}
		else
		{
				
				modelandview.setViewName("addHotel");
		}
		return modelandview;
		
	}
	
	
	@GetMapping("/addFood")
	public ModelAndView addFoodPage(ModelAndView modelAndView, Food food) {
		modelAndView.addObject("food", food);
		modelAndView.setViewName("addFood");
		return modelAndView;
	}
	
	
	//Adding details of new hotel by admin
	@PostMapping("/addFood")
	public ModelAndView addFoodDetails(ModelAndView modelandview, @ModelAttribute Food food, @RequestParam String foodname, ModelMap models) {
		
		System.out.println("foodname: " + food.getFoodname());
		//save new hotel details
		boolean status = foodService.saveHotel(food, foodname);
		if(status==true)
		{
				models.addAttribute("erroradd", "Item already exists");
				modelandview.setViewName("addFood");
		}
		else
		{
				
				modelandview.setViewName("addFood");
		}
		return modelandview;
		
	}
	
	@GetMapping("/addTransport")
	public ModelAndView addTransportPage(ModelAndView modelAndView, Transport transport) {
		modelAndView.addObject("transport", transport);
		modelAndView.setViewName("addTransport");
		return modelAndView;
	}
	
	
	//Adding details of new hotel by admin
	@PostMapping("/addTransport")
	public ModelAndView addTransportDetails(ModelAndView modelandview, @ModelAttribute Transport transport, @RequestParam String vname, ModelMap models) {
		
		System.out.println("foodname: " + transport.getVname());
		//save new hotel details
		boolean status = transportService.saveTransport(transport, vname);
		if(status==true)
		{
				models.addAttribute("erroradd", "Item already exists");
				modelandview.setViewName("addTransport");
		}
		else
		{
				
				modelandview.setViewName("addTransport");
		}
		return modelandview;
		
	}
	

}
