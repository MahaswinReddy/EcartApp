package io.java.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Orders")
public class Orders {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="order_id") 
	private int orderId;
    @Column(name="price",nullable=true,columnDefinition = "double default 0.0")
	private double price;
	//private Date date;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
