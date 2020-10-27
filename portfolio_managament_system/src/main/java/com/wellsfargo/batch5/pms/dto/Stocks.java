package com.wellsfargo.batch5.pms.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Stocks {
	
	private Integer companyCode;
	
	private String stockExchange;
	
	private Double currentPrice;
	
	private LocalDate Date;
	
	private LocalTime Time;
	
	public Stocks() {
		
	}

	public Stocks(Integer companyCode, String stockExchange, Double currentPrice, LocalDate date, LocalTime time) {
		super();
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		Date = date;
		Time = time;
	}

	public Integer getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Integer companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public LocalTime getTime() {
		return Time;
	}

	public void setTime(LocalTime time) {
		Time = time;
	}
	
	

}
