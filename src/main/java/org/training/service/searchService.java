package org.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.entity.Food;
import org.training.entity.Hotel;
import org.training.entity.Transport;
import org.training.repository.FoodRepository;
import org.training.repository.HotelRepository;
import org.training.repository.TransportRepository;

@Service
public class searchService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Autowired
	private FoodRepository foodRepository;
	

	@Autowired
	private TransportRepository transportRepository;
	
	//search hotel details
	public List<Hotel> searchHotel(String rating) {
		
		
			return  hotelRepository.findByRating(rating);
		
		
	}


	public List<Food> searchFood(String type) {
		// TODO Auto-generated method stub
		return foodRepository.findByType(type);
	}


	public List<Transport> searchTransport(String type) {
		// TODO Auto-generated method stub
		return transportRepository.findByType(type);
	}
}
