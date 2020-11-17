package com.samuel.vitorio.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1,"Waiting Paymente"),
	PAID(2,"Paid"),
	SHIPPED(3,"Shipped"),
	DELIVERED(4,"Delivered"),
	CANCELED(5,"Canceled");
	
	private int code;
	private String description;
	
	private OrderStatus(int code, String description){
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescricao() {
		return description;
	}
	
	public static OrderStatus toEnum(int code) {
		for(OrderStatus x : OrderStatus.values()){
			if(x.getCode() == code) return x;
		}
		throw new IllegalArgumentException("Enum doesn't exist");
	}
	
	
	
}
