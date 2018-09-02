package io.java.repository;

import org.springframework.data.repository.CrudRepository;

import io.java.dto.ItemsCatelogDTO;

public interface ItemsCatelogRepository extends CrudRepository<ItemsCatelogDTO,Integer> {
	

}
