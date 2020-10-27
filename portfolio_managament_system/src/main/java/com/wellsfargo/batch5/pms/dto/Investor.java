package com.wellsfargo.batch5.pms.dto;

import java.time.LocalDate;

public class Investor {
	
	private Integer investerId;
	
	private String fisrtName;
	
	private String lastName;
	
	private String investorPAN;
	
	private String investorAddress;
	
	private LocalDate investorDOB;
	
	private String transType;
	
	private Double commission;
	
	private Double amountInvested;
	
	private Double balanceAmount;
	
	public Investor() {
		
	}

	public Investor(Integer investerId, String fisrtName, String lastName, String investorPAN, String investorAddress,
			LocalDate investorDOB, String transType, Double commission, Double amountInvested, Double balanceAmount) {
		
		this.investerId = investerId;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.investorPAN = investorPAN;
		this.investorAddress = investorAddress;
		this.investorDOB = investorDOB;
		this.transType = transType;
		this.commission = commission;
		this.amountInvested = amountInvested;
		this.balanceAmount = balanceAmount;
	}

	public Integer getInvesterId() {
		return investerId;
	}

	public void setInvesterId(Integer investerId) {
		this.investerId = investerId;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInvestorPAN() {
		return investorPAN;
	}

	public void setInvestorPAN(String investorPAN) {
		this.investorPAN = investorPAN;
	}

	public String getInvestorAddress() {
		return investorAddress;
	}

	public void setInvestorAddress(String investorAddress) {
		this.investorAddress = investorAddress;
	}

	public LocalDate getInvestorDOB() {
		return investorDOB;
	}

	public void setInvestorDOB(LocalDate investorDOB) {
		this.investorDOB = investorDOB;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(Double amountInvested) {
		this.amountInvested = amountInvested;
	}

	public Double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(Double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	
	
	
	
	
	
	

}
