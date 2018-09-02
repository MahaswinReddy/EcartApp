package io.java.dto;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Customer {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="customer_id")    
private int id;	
private String name;
@OneToMany
//@JoinColumn(name="orderId")
//private Orders orders;
private Collection<Orders> orders= new HashSet<>();
public Collection<Orders> getOrders() {
	return orders;
}
public void setOrders(Collection<Orders> orders) {
	this.orders = orders;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
/*public Orders getOrders() {
	return orders;
}
public void setOrders(Orders orders) {
	this.orders = orders;
}*/
}
