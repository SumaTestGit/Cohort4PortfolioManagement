package com.wellsfargo.batch5.pms.dto;

public class Company {
	
	private String companyCode;
	
	private String companyTitle;
	
	private String operations;
	
	private Integer shareCount;
	
	private Double sharePriceInUSD;
	
	private String sector;
	
	private Integer currency;
	
	private Double turnOver;
	
	public Company() {
		
	}

	public Company(String companyCode, String companyTitle, String operations, Integer shareCount,
			Double sharePriceInUSD, String sector, Integer currency, Double turnOver) {
		
		this.companyCode = companyCode;
		this.companyTitle = companyTitle;
		this.operations = operations;
		this.shareCount = shareCount;
		this.sharePriceInUSD = sharePriceInUSD;
		this.sector = sector;
		this.currency = currency;
		this.turnOver = turnOver;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyTitle() {
		return companyTitle;
	}

	public void setCompanyTitle(String companyTitle) {
		this.companyTitle = companyTitle;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public Integer getShareCount() {
		return shareCount;
	}

	public void setShareCount(Integer shareCount) {
		this.shareCount = shareCount;
	}

	public Double getSharePriceInUSD() {
		return sharePriceInUSD;
	}

	public void setSharePriceInUSD(Double sharePriceInUSD) {
		this.sharePriceInUSD = sharePriceInUSD;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public Double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}
	
	
	
	

}
