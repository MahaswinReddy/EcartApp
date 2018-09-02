package io.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.dto.ItemsCatelogDTO;
import io.java.repository.ItemsCatelogRepository;
@Service
public class ItemsCatelogService {
	@Autowired
	private ItemsCatelogRepository itemsCatelogRepository;
	
	
	
	public List<ItemsCatelogDTO> getAllItems(){
		List<ItemsCatelogDTO> itemsList = new ArrayList<>();
		 itemsCatelogRepository.findAll().forEach(itemsList::add);
		//return itemsList;
		return itemsList;
	}
	public ItemsCatelogDTO getItem(int id) {
		return itemsCatelogRepository.findById(id).get();
		//List<ItemsCatelogDTO> itemsList = new ArrayList<>();
		//return itemsList.stream().filter(p->p.getItemId()==id).findFirst().get();
	}
	//public getItem(int id)
	public void addItem(ItemsCatelogDTO icdtoObj) {
		//itemsList.add(icdtoObj);
		itemsCatelogRepository.save(icdtoObj);
	}
	public void updateItem(ItemsCatelogDTO icObj,int id) {
		/*List<ItemsCatelogDTO> itemsList = new ArrayList<>();
		for(int i=0;i<itemsList.size();i++) {
			if( itemsList.get(i).getItemId() == id)
				itemsList.set(id, icObj);				
		}*/
		itemsCatelogRepository.save(icObj);
	}
	
	public void deleteItem(int id) {
		//List<ItemsCatelogDTO> itemsList = new ArrayList<>();
		//itemsList.removeIf(p->p.getItemId()== id);
		itemsCatelogRepository.deleteById(id);
	}

}
