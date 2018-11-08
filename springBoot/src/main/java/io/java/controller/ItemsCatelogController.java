package io.java.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.dto.ItemsCatelogDTO;
import io.java.service.ItemsCatelogService;

@RestController
@RequestMapping(value="/itemsCatelog")
public class ItemsCatelogController {
@Autowired
private ItemsCatelogService itemsCatelogService;
//@GtMapping=@RequestMapping + method=RequestMethod.GET
@GetMapping("/items")
public List<ItemsCatelogDTO> getAllItems()
{
	return itemsCatelogService.getAllItems();
}
@GetMapping("/items/{id}")
public ItemsCatelogDTO getItem(@PathVariable int id)
{
	return itemsCatelogService.getItem(id);
}
//@PostMapping=@RequestMapping + method=RequestMethod.POST
@PostMapping(value="/additem")
public void addItem(@RequestBody ItemsCatelogDTO icObj){
	itemsCatelogService.addItem(icObj);		
}
//@PutMapping=@RequestMapping + method=RequestMethod.PUT
@PutMapping(value="/updateItem/{id}")
public void updateItem(@RequestBody ItemsCatelogDTO icObj,@PathVariable int id){
	itemsCatelogService.updateItem(icObj,id);		
}
@DeleteMapping(value="/deleteItem/{id}")
public void updateItem(@PathVariable int id){
	itemsCatelogService.deleteItem(id);		
}
@RequestMapping(value="/hello")
public String hello(){
	return "Hello Maha";		
}
@RequestMapping(value="/arryas")
public String[] testArrayEquals(){
	String strArr[] = {"Mahi","Sneha","Pravee"};
	return strArr;		
}

}
