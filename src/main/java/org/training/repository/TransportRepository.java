package org.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.training.entity.Food;
import org.training.entity.Transport;

@Component
public interface TransportRepository extends JpaRepository<Transport, String>{
	List<Transport> findByType(String type);
}
