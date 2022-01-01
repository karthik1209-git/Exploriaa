package org.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.training.entity.Food;
import org.training.entity.Transport;
import org.training.repository.FoodRepository;
import org.training.repository.TransportRepository;
@Component
public class TransportService {


	@Autowired
	private TransportRepository transportRepository;
	
	//Adding new Hotel
	public boolean saveTransport(Transport transport, String type) {
		if(transportRepository.findById(type).isPresent())
		{
			return true;
		}
		else
		{
			transportRepository.save(transport);
			return false;
		}
		
	}
	
	//update Hotel details
	public boolean updateTransport(Transport transport, String vname) {
		if(transportRepository.findById(vname)!=null)
		{
			transportRepository.delete(transport);
			transportRepository.save(transport);
			return true;
		}
		else
		{
			return false;
		}
	}
}
