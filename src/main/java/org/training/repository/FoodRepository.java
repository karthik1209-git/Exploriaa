package org.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.training.entity.Food;
import org.training.service.FoodService;

@Component
public interface FoodRepository extends JpaRepository<Food, String>{

	/*Hotel findAll(String rating);*/
	List<Food> findByType(String type);

}
